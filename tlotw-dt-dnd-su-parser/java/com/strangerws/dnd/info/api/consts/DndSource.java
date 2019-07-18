package com.strangerws.dnd.info.api.consts;

import java.util.HashMap;
import java.util.Map;

public enum DndSource {
    PHB("«Player's handbook»", 1),
    DMG("«Dungeon master's guide»", 2);

    private static Map<String, DndSource> SOURCE_BY_NAME = new HashMap<>();

    static {
        for (DndSource source : DndSource.values()){
            SOURCE_BY_NAME.put(source.name, source);
        }
    }

    private String name;
    private Integer order;

    DndSource(String name, Integer order) {
        this.name = name;
        this.order = order;
    }

    public static DndSource getByName(String name){
        return SOURCE_BY_NAME.get(name);
    }

    public String getName() {
        return name;
    }

    public Integer getOrder() {
        return order;
    }
}
