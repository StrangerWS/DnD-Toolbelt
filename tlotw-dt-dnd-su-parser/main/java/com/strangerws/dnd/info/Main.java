package com.strangerws.dnd.info;

import com.strangerws.dnd.info.api.entity.card.SpellCard;
import com.strangerws.dnd.info.impl.parser.SpellParser;
import java.util.List;
import org.htmlparser.util.ParserException;

public class Main {

    public static void main(String[] args) throws ParserException {
        SpellParser spellParser = new SpellParser();
        List<SpellCard> spellCards = spellParser.parse();
    }
}
