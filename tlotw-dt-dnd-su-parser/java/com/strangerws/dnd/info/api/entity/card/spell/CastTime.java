package com.strangerws.dnd.info.api.entity.card.spell;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class CastTime {

    private String castTime;
    private Boolean isRitual;

    public CastTime(String castTime, Boolean isRitual) {
        this.castTime = castTime;
        this.isRitual = isRitual;
    }

    @NotNull
    public String getCastTime() {
        return castTime;
    }

    public void setCastTime(String castTime) {
        this.castTime = castTime;
    }

    @Nullable
    public Boolean getRitual() {
        return isRitual;
    }

    public void setRitual(Boolean ritual) {
        isRitual = ritual;
    }

    @Override
    public String toString() {
        return "CastTime{" +
                "castTime='" + castTime + '\'' +
                ", isRitual=" + isRitual +
                '}';
    }
}
