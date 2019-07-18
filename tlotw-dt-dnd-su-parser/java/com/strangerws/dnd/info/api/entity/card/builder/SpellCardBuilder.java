package com.strangerws.dnd.info.api.entity.card.builder;

import com.strangerws.dnd.info.api.consts.DndClass;
import com.strangerws.dnd.info.api.consts.DndSource;
import com.strangerws.dnd.info.api.entity.card.BaseCard;
import com.strangerws.dnd.info.api.entity.card.SpellCard;
import com.strangerws.dnd.info.api.entity.card.spell.CastTime;
import com.strangerws.dnd.info.api.entity.card.spell.Components;
import com.strangerws.dnd.info.api.entity.card.spell.Distance;
import com.strangerws.dnd.info.api.entity.card.spell.Durability;
import java.util.List;

public class SpellCardBuilder {

    private String level;
    private String school;
    private CastTime castTime;
    private Distance distance;
    private Components components;
    private Durability durability;
    private List<DndClass> classes;
    private DndSource source;
    private String description;
    private String onHigherLevels;

    public String getLevel() {
        return level;
    }

    public SpellCardBuilder setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getSchool() {
        return school;
    }

    public SpellCardBuilder setSchool(String school) {
        this.school = school;
        return this;
    }

    public CastTime getCastTime() {
        return castTime;
    }

    public SpellCardBuilder setCastTime(CastTime castTime) {
        this.castTime = castTime;
        return this;
    }

    public Distance getDistance() {
        return distance;
    }

    public SpellCardBuilder setDistance(Distance distance) {
        this.distance = distance;
        return this;
    }

    public Components getComponents() {
        return components;
    }

    public SpellCardBuilder setComponents(
            Components components) {
        this.components = components;
        return this;
    }

    public Durability getDurability() {
        return durability;
    }

    public SpellCardBuilder setDurability(
            Durability durability) {
        this.durability = durability;
        return this;
    }

    public List<DndClass> getClasses() {
        return classes;
    }

    public SpellCardBuilder setClasses(
            List<DndClass> classes) {
        this.classes = classes;
        return this;
    }

    public DndSource getSource() {
        return source;
    }

    public SpellCardBuilder setSource(DndSource source) {
        this.source = source;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SpellCardBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getOnHigherLevels() {
        return onHigherLevels;
    }

    public SpellCardBuilder setOnHigherLevels(String onHigherLevels) {
        this.onHigherLevels = onHigherLevels;
        return this;
    }


    /**
     * Builds SpellCard entity from BaseCard
     */
    public SpellCard build(BaseCard card){
        return new SpellCard(card,this);
    }
}
