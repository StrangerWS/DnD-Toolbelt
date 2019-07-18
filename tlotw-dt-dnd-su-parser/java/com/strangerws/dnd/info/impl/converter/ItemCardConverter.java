package com.strangerws.dnd.info.impl.converter;

import static com.strangerws.dnd.info.util.StringUtils.removeBrackets;

import com.strangerws.dnd.info.api.consts.DndSource;
import com.strangerws.dnd.info.api.consts.ItemType;
import com.strangerws.dnd.info.api.consts.QualityGroup;
import com.strangerws.dnd.info.api.entity.card.HtmlCard;
import com.strangerws.dnd.info.api.entity.card.ItemCard;
import com.strangerws.dnd.info.api.entity.card.builder.ItemCardBuilder;
import com.strangerws.dnd.info.api.entity.card.item.Quality;
import com.strangerws.dnd.info.api.entity.card.item.Type;
import org.jetbrains.annotations.NotNull;

public class ItemCardConverter extends AbstractCardConverter<ItemCard> {

    private static final String TYPE_STRING = "Тип: ";
    private static final String QUALITY_STRING = "Качество: ";

    private static final String ATTUNEMENT_STRING = "требуется настройка";

    @Override
    @NotNull
    public ItemCard convert(HtmlCard htmlCard) {
        Type itemType = getType(extractFromParamList(htmlCard, TYPE_STRING));
        Quality itemQuality = getQuality(extractFromParamList(htmlCard, QUALITY_STRING));
        DndSource itemSource = getSource(extractFromParamList(htmlCard, SOURCE_STRING));
        String itemDescription = extractFromParamList(htmlCard, DESCRIPTION_STRING);

        return new ItemCardBuilder()
                .setType(itemType)
                .setQuality(itemQuality)
                .setSource(itemSource)
                .setDescription(itemDescription)
                .build(htmlCard);
    }

    @NotNull
    private Type getType(String typeString) {
        Integer bracketIndex = typeString.indexOf(BRACKET_OPEN);

        String type = bracketIndex > STRING_NOT_EXISTS
                ? typeString.substring(STRING_START_INDEX, bracketIndex).trim()
                : typeString;

        String description = bracketIndex > STRING_NOT_EXISTS
                ? removeBrackets(typeString.substring(bracketIndex))
                : null;

        return new Type(ItemType.getByRusName(type), description);
    }

    @NotNull
    private Quality getQuality(String qualityString) {
        Boolean isAttunementRequired = qualityString.toLowerCase().contains(ATTUNEMENT_STRING);
        Integer bracketIndex = qualityString.indexOf(BRACKET_OPEN);

        String quality = bracketIndex > STRING_NOT_EXISTS
                ? qualityString.substring(STRING_START_INDEX, bracketIndex).trim()
                : qualityString;

        String description = bracketIndex > STRING_NOT_EXISTS
                ? removeBrackets(qualityString.substring(bracketIndex))
                : null;

        return new Quality(QualityGroup.getByRusName(quality), description, isAttunementRequired);
    }

}
