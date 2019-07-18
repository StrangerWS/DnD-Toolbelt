package com.strangerws.dnd.info.api.consts;

public enum DndSource {
    PHB("«Player's handbook»", 1);

    private String name;
    private Integer order;

    DndSource(String name, Integer order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Integer getOrder() {
        return order;
    }
}
