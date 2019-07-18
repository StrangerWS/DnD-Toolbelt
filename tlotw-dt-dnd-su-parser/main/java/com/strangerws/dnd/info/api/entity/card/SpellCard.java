package com.strangerws.dnd.info.api.entity.card;

import com.strangerws.dnd.info.api.consts.DndClass;
import com.strangerws.dnd.info.api.consts.DndSource;
import com.strangerws.dnd.info.api.entity.spell.CastTime;
import com.strangerws.dnd.info.api.entity.spell.Components;
import com.strangerws.dnd.info.api.entity.spell.Distance;
import com.strangerws.dnd.info.api.entity.spell.Durability;
import java.util.List;

public class SpellCard extends BaseCard {

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

    private SpellCard(Integer id, String name) {
        super(id, name);
    }

    public SpellCard(Integer id, String name, String level, String school,
            CastTime castTime, Distance distance,
            Components components, Durability durability, List<DndClass> classes, DndSource source,
            String description, String onHigherLevels) {
        super(id, name);
        this.level = level;
        this.school = school;
        this.castTime = castTime;
        this.distance = distance;
        this.components = components;
        this.durability = durability;
        this.classes = classes;
        this.source = source;
        this.description = description;
        this.onHigherLevels = onHigherLevels;
    }

    public SpellCard(BaseCard card, SpellCardBuilder spellCardBuilder) {
        super(card.getId(), card.getName());
        this.level = spellCardBuilder.getLevel();
        this.school = spellCardBuilder.getSchool();
        this.castTime = spellCardBuilder.getCastTime();
        this.distance = spellCardBuilder.getDistance();
        this.components = spellCardBuilder.getComponents();
        this.durability = spellCardBuilder.getDurability();
        this.classes = spellCardBuilder.getClasses();
        this.source = spellCardBuilder.getSource();
        this.description = spellCardBuilder.getDescription();
        this.onHigherLevels = spellCardBuilder.getOnHigherLevels();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public CastTime getCastTime() {
        return castTime;
    }

    public void setCastTime(CastTime castTime) {
        this.castTime = castTime;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    public Durability getDurability() {
        return durability;
    }

    public void setDurability(Durability durability) {
        this.durability = durability;
    }

    public List<DndClass> getClasses() {
        return classes;
    }

    public SpellCard setClasses(List<DndClass> classes) {
        this.classes = classes;
        return this;
    }

    public DndSource getSource() {
        return source;
    }

    public SpellCard setSource(DndSource source) {
        this.source = source;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOnHigherLevels() {
        return onHigherLevels;
    }

    public void setOnHigherLevels(String onHigherLevels) {
        this.onHigherLevels = onHigherLevels;
    }
}
