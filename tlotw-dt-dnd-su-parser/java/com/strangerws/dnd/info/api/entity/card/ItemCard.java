package com.strangerws.dnd.info.api.entity.card;

import com.strangerws.dnd.info.api.consts.DndSource;
import com.strangerws.dnd.info.api.entity.card.builder.ItemCardBuilder;
import com.strangerws.dnd.info.api.entity.card.item.Quality;
import com.strangerws.dnd.info.api.entity.card.item.Type;
import com.sun.istack.internal.NotNull;

public class ItemCard extends BaseCard {

    private Type type;
    private Quality quality;
    private DndSource source;
    private String description;

    private ItemCard(Integer id, String name) {
        super(id, name);
    }

    public ItemCard(Integer id, String name, Type type,
            Quality quality, DndSource source, String description) {
        super(id, name);
        this.type = type;
        this.quality = quality;
        this.source = source;
        this.description = description;
    }

    public ItemCard(BaseCard baseCard, ItemCardBuilder builder) {
        super(baseCard.getId(), baseCard.getName());
        this.type = builder.getType();
        this.quality = builder.getQuality();
        this.source = builder.getSource();
        this.description = builder.getDescription();
    }

    @NotNull
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @NotNull
    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @NotNull
    public DndSource getSource() {
        return source;
    }

    public void setSource(DndSource source) {
        this.source = source;
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ItemCard{" +
                "type=" + type +
                ", quality=" + quality +
                ", source=" + source +
                ", description='" + description + '\'' +
                "} " + super.toString();
    }
}
