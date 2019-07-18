package com.strangerws.dnd.info;

import com.strangerws.dnd.info.api.entity.card.ItemCard;
import com.strangerws.dnd.info.api.entity.card.SpellCard;
import com.strangerws.dnd.info.impl.parser.ItemParser;
import com.strangerws.dnd.info.impl.parser.SpellParser;
import java.util.List;
import org.htmlparser.util.ParserException;

public class Main {

    public static void main(String[] args) throws ParserException {
        SpellParser spellParser = new SpellParser();
        ItemParser itemParser = new ItemParser();
        List<SpellCard> spellCards = spellParser.parse();
        List<ItemCard> itemCards = itemParser.parse();

        System.out.println("SPELLS:\n");
        spellCards.forEach(System.out::println);
        System.out.println("\n\nITEMS:\n");
        itemCards.forEach(System.out::println);
    }
}
