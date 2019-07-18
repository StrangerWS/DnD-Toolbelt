package com.strangerws.dnd.info.api.consts;

import java.util.HashMap;
import java.util.Map;

public enum DndClass {

    BARBARIAN("Варвар", "Barbarian", 1),
    BARD("Бард", "Bard", 2),
    CLERIC("Жрец", "Cleric", 3),
    DRUID("Друид", "Druid", 4),
    FIGHTER("Воин", "Fighter", 5),
    MONK("Монах", "Monk", 6),
    PALADIN("Паладин", "Paladin", 7),
    RANGER("Следопыт", "Ranger", 8),
    ROGUE("Плут", "Rogue", 9),
    SORCERER("Чародей", "Sorcerer", 10),
    WARLOCK("Колдун", "Warlock", 11),
    WIZARD("Волшебник", "Wizard", 12);

    private static final Map<String, DndClass> CLASS_BY_RUS_NAME = new HashMap<>();

    static {
        for (DndClass dndClass : DndClass.values()){
            CLASS_BY_RUS_NAME.put(dndClass.rusName, dndClass);
        }
    }

    private String rusName;
    private String engName;
    private Integer order;

    DndClass(String rusName, String engName, Integer order) {
        this.rusName = rusName;
        this.engName = engName;
        this.order = order;
    }
    public static DndClass getByRusName(String rusName){
        return CLASS_BY_RUS_NAME.get(rusName);
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
