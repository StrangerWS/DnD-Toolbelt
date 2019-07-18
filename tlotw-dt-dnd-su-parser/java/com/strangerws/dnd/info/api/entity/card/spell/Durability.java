package com.strangerws.dnd.info.api.entity.card.spell;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Durability {

    private String time;
    private Boolean isConcentrated;

    public Durability(String time, Boolean isConcentrated) {
        this.time = time;
        this.isConcentrated = isConcentrated;
    }

    @NotNull
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Nullable
    public Boolean getConcentrated() {
        return isConcentrated;
    }

    public void setConcentrated(Boolean concentrated) {
        isConcentrated = concentrated;
    }

    @Override
    public String toString() {
        return "Durability{" +
                "time='" + time + '\'' +
                ", isConcentrated=" + isConcentrated +
                '}';
    }
}
