package com.strangerws.dnd.info.api.entity.card.builder;

import com.strangerws.dnd.info.api.consts.DndSource;
import com.strangerws.dnd.info.api.entity.card.BaseCard;
import com.strangerws.dnd.info.api.entity.card.ItemCard;
import com.strangerws.dnd.info.api.entity.card.item.Quality;
import com.strangerws.dnd.info.api.entity.card.item.Type;

public class ItemCardBuilder {

    private Type type;
    private Quality quality;
    private DndSource source;
    private String description;

    public Type getType() {
        return type;
    }

    public ItemCardBuilder setType(Type type) {
        this.type = type;
        return this;
    }

    public Quality getQuality() {
        return quality;
    }

    public ItemCardBuilder setQuality(Quality quality) {
        this.quality = quality;
        return this;
    }

    public DndSource getSource() {
        return source;
    }

    public ItemCardBuilder setSource(DndSource source) {
        this.source = source;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemCardBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public ItemCard build(BaseCard baseCard){
        return new ItemCard(baseCard, this);
    }
}
