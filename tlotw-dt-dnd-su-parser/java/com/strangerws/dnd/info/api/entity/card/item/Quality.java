package com.strangerws.dnd.info.api.entity.card.item;

import com.strangerws.dnd.info.api.consts.QualityGroup;
import com.sun.istack.internal.Nullable;

public class Quality {

    private QualityGroup group;
    private String info;
    private Boolean isAttunementRequired;

    public Quality(QualityGroup group, String info, Boolean isAttunementRequired) {
        this.group = group;
        this.info = info;
        this.isAttunementRequired = isAttunementRequired;
    }

    @Nullable
    public QualityGroup getGroup() {
        return group;
    }

    public void setGroup(QualityGroup group) {
        this.group = group;
    }

    @Nullable
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Nullable
    public Boolean getAttunementRequired() {
        return isAttunementRequired;
    }

    public void setAttunementRequired(Boolean attunementRequired) {
        isAttunementRequired = attunementRequired;
    }

    @Override
    public String toString() {
        return "Quality{" +
                "group=" + group +
                ", info='" + info + '\'' +
                ", isAttunementRequired=" + isAttunementRequired +
                '}';
    }
}
