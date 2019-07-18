package com.strangerws.dnd.info.impl.parser;

import com.strangerws.dnd.info.api.entity.card.HtmlCard;
import com.strangerws.dnd.info.api.parser.DungeonSuParser;
import com.strangerws.dnd.info.impl.converter.SpellCardConverter;
import com.strangerws.dnd.info.api.entity.card.SpellCard;
import java.util.List;
import java.util.stream.Collectors;
import org.htmlparser.util.ParserException;

public class SpellParser extends DungeonSuParser {
    private static final String SPELL_LIST_URL = "http://dungeon.su/spells/?search=&level=&school=&class=&concentration=&source=102%7C107%7C108%7C109%7C112";

    public List<SpellCard> parse() throws ParserException {
        return convertToSpellCards(parse(SPELL_LIST_URL));
    }

    private List<SpellCard> convertToSpellCards(List<HtmlCard> cards) {
        SpellCardConverter cardConverter = new SpellCardConverter();

        return cards.stream()
                .map(cardConverter::convert)
                .collect(Collectors.toList());
    }
}
