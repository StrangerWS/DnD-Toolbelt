package com.strangerws.dnd.info.api.converter;

public interface Converter<S, T> {
    S convert(T bean);
}
