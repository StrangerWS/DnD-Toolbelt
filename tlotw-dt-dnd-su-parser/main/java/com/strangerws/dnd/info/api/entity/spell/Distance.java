package com.strangerws.dnd.info.api.entity.spell;

public class Distance {

    private String range;
    private String area;

    public Distance(String range, String area) {
        this.range = range;
        this.area = area;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
