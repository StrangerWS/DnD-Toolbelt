package com.strangerws.dnd.info.impl.parser;

import com.strangerws.dnd.info.api.entity.card.HtmlCard;
import com.strangerws.dnd.info.api.entity.card.ItemCard;
import com.strangerws.dnd.info.api.parser.DungeonSuParser;
import com.strangerws.dnd.info.impl.converter.ItemCardConverter;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import java.util.List;
import java.util.stream.Collectors;
import org.htmlparser.util.ParserException;

public class ItemParser extends DungeonSuParser {

    private static final String ITEM_LIST_URL = "http://dungeon.su/items/?search=&type=&quality=&set=&source=101%7C105%7C106%7C109%7C110";

    @Nullable
    public List<ItemCard> parse() throws ParserException {
        return convertToItemCards(parse(ITEM_LIST_URL));
    }

    @NotNull
    private List<ItemCard> convertToItemCards(List<HtmlCard> cards) {
        ItemCardConverter cardConverter = new ItemCardConverter();

        return cards.stream()
                .map(cardConverter::convert)
                .collect(Collectors.toList());
    }
}
