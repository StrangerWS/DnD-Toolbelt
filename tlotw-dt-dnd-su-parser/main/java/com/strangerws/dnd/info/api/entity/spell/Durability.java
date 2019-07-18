package com.strangerws.dnd.info.api.entity.spell;

public class Durability {

    private String time;
    private Boolean isConcentrated;

    public Durability(String time, Boolean isConcentrated) {
        this.time = time;
        this.isConcentrated = isConcentrated;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getConcentrated() {
        return isConcentrated;
    }

    public void setConcentrated(Boolean concentrated) {
        isConcentrated = concentrated;
    }
}
