package com.strangerws.dnd.info.impl.converter;

import com.strangerws.dnd.info.api.consts.DndSource;
import com.strangerws.dnd.info.api.converter.Converter;
import com.strangerws.dnd.info.api.entity.card.BaseCard;
import com.strangerws.dnd.info.api.entity.card.HtmlCard;

/***
 * An abstract class that adds basic support for card conversion
 * @param <S> BaseCard child class to convert
 */
public abstract class AbstractCardConverter<S extends BaseCard> implements Converter<S, HtmlCard> {

    /**
     * These consts are for work with string search and read
     */
    protected static final Integer STRING_NOT_EXISTS = -1;
    protected static final Integer STRING_START_INDEX = 0;
    protected static final Integer STRING_OFFSET = 2;
    protected static final String COMMA_SEPARATOR = ", ";
    protected static final String BRACKET_OPEN = "(";


    protected static final String SOURCE_STRING = "Источник: ";
    protected static final String DESCRIPTION_STRING = "Описание";

    /**
     * Method for getting raw parameter string from params tag
     *
     * @param htmlCard card from site to be converted
     * @param paramName parameter to extract
     * @return raw parameter string for converting into specified card
     */
    protected String extractFromParamList(HtmlCard htmlCard, String paramName){
        return htmlCard.getParams().stream()
                .filter(param -> param.startsWith(paramName))
                .findFirst()
                .map(param -> param.substring(paramName.length()))
                .orElse(null);
    }


    protected DndSource getSource(String source){
        return DndSource.getByName(source);
    }
}
