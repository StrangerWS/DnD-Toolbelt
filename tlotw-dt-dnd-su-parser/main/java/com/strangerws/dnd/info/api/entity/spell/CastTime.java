package com.strangerws.dnd.info.api.entity.spell;

public class CastTime {

    private String castTime;
    private Boolean isRitual;

    public CastTime(String castTime, Boolean isRitual) {
        this.castTime = castTime;
        this.isRitual = isRitual;
    }

    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    public Boolean getRitual() {
        return isRitual;
    }

    public void setRitual(Boolean ritual) {
        isRitual = ritual;
    }
}
