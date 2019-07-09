package com.strangerws.gen.api.consts;

import java.util.HashMap;
import java.util.Map;

public enum Раса {
    ЧЕЛОВЕК("human", 1),
    ЭЛЬФ("elf", 2);

    private static final Map<Integer, Раса> RACE_MAP = new HashMap<>();

    static {
        for (Раса раса : values()){
            RACE_MAP.put(раса.number, раса);
        }
    }

    private String code;
    private Integer number;

    public String получитьКод() {
        return code;
    }

    public Integer getNumber() {
        return number;
    }

    Раса(String code, Integer number) {
        this.code = code;
        this.number = number;
    }

    public static Раса получитьПоНомеру(Integer number){
        return RACE_MAP.get(number);
    }
}
