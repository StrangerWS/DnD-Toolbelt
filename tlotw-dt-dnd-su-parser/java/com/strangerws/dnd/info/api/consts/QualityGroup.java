package com.strangerws.dnd.info.api.consts;

import java.util.HashMap;
import java.util.Map;

public enum QualityGroup {

    COMMON("Обычный","Common", 1),
    UNCOMMON("Необычный","Uncommon", 1),
    RARE("Редкий","Rare", 1),
    VERY_RARE("Очень редкий","Very rare", 1),
    LEGENDARY("Легендарный","Legendary", 1),
    VARIES("Качество варьируется","Varies",6);

    private static final Map<String, QualityGroup> QUALITY_GROUP_BY_RUS_NAME = new HashMap<>();

    static {
        for (QualityGroup group : QualityGroup.values()){
            QUALITY_GROUP_BY_RUS_NAME.put(group.rusName, group);
        }
    }

    private String rusName;
    private String engName;
    private Integer order;

    QualityGroup(String rusName, String engName, Integer order) {
        this.rusName = rusName;
        this.engName = engName;
        this.order = order;
    }

    public static QualityGroup getByRusName(String rusName) {
        return QUALITY_GROUP_BY_RUS_NAME.get(rusName);
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
