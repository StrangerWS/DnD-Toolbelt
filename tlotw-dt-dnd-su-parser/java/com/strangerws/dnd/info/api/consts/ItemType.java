package com.strangerws.dnd.info.api.consts;

import java.util.HashMap;
import java.util.Map;

public enum ItemType {

    WONDROUS_ITEM("Чудесный предмет", "Wondrous item", 1),
    POTION("Зелье", "Potion", 2),
    RING("Кольцо", "Ring", 3),
    SCROLL("Свиток", "Scroll", 4),
    WAND("Волшебная палочка", "Wand", 5),
    ROD("Жезл", "Rod", 6),
    STAFF("Посох", "Staff", 7),
    ARMOR("Доспех", "Armor", 8),
    WEAPON("Оружие", "Weapon", 9);

    private final static Map<String, ItemType> TYPE_BY_RUS_NAME = new HashMap<>();

    static {
        for (ItemType type : ItemType.values()){
            TYPE_BY_RUS_NAME.put(type.rusName, type);
        }
    }

    private String rusName;
    private String engName;
    private Integer order;

    ItemType(String rusName, String engName, Integer order) {
        this.rusName = rusName;
        this.engName = engName;
        this.order = order;
    }

    public static ItemType getByRusName(String rusName){
        return TYPE_BY_RUS_NAME.get(rusName);
    }

    public String getRusName() {
        return rusName;
    }

    public String getEngName() {
        return engName;
    }

    public Integer getOrder() {
        return order;
    }
}
