package com.strangerws.dnd.info.api.parser;

import com.strangerws.dnd.info.api.entity.card.HtmlCard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.util.ParserException;

public abstract class DungeonSuParser {

    protected List<HtmlCard> parse(String url)
            throws ParserException {
        List<HtmlCard> cards = new ArrayList<>();

        NodeFilter cardsFilter = (NodeFilter) node -> node.getText().contains("card-wrapper");
        NodeFilter titleFilter = (NodeFilter) node -> node.getText().contains("item-link");
        NodeFilter paramsFilter = (NodeFilter) node -> node.getText().contains("params");

        Parser parser = new Parser();
        parser.setURL(url);
        for (Node node : parser.parse(cardsFilter).toNodeArray()) {
            String title = node
                    .getChildren()
                    .extractAllNodesThatMatch(titleFilter, true)
                    .elementAt(0)
                    .toPlainTextString();

            List<String> params = Arrays
                    .stream(node
                            .getChildren()
                            .extractAllNodesThatMatch(paramsFilter, true)
                            .elementAt(0)
                            .getChildren()
                            .toNodeArray())
                    .map(Node::toPlainTextString)
                    .collect(Collectors.toList());

            System.out.println(params);

            cards.add(new HtmlCard(0, title, params));
        }
        return cards;
    }
}
