package com.strangerws.dnd.info.api.entity.card.item;

import com.strangerws.dnd.info.api.consts.ItemType;
import com.sun.istack.internal.Nullable;

public class Type {

    private ItemType itemType;
    private String description;

    public Type(ItemType itemType, String description) {
        this.itemType = itemType;
        this.description = description;
    }

    @Nullable
    public ItemType getItemType() {
        return itemType;
    }

    public Type setItemType(ItemType itemType) {
        this.itemType = itemType;
        return this;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public Type setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "Type{" +
                "itemType=" + itemType +
                ", description='" + description + '\'' +
                '}';
    }
}
