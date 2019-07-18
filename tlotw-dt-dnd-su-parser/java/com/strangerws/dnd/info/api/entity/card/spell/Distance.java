package com.strangerws.dnd.info.api.entity.card.spell;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Distance {

    private String range;
    private String area;

    public Distance(String range, String area) {
        this.range = range;
        this.area = area;
    }

    @NotNull
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Nullable
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "range='" + range + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
