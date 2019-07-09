package com.strangerws.gen.api.consts;

public enum ЧастьИмени {
    ИМЯ_ПЕРВАЯ_ЧАСТЬ("nameFirst", 1),
    ИМЯ_ПОСЛЕДНЯЯ_ЧАСТЬ("nameLast", 2),
    SURNAME_FIRST_PART("surnameFirst", 3),
    SURNAME_LAST_PART("surnameLast", 4);

    String код;
    Integer номер;

    public String получитьКод() {
        return код;
    }

    public Integer получитьНомер() {
        return номер;
    }

    ЧастьИмени(String код, Integer номер){
        this.код = код;
        this.номер = номер;
    }
}
