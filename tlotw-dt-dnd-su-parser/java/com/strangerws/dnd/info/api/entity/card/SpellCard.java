package com.strangerws.dnd.info.api.entity.card;

import com.strangerws.dnd.info.api.consts.DndClass;
import com.strangerws.dnd.info.api.consts.DndSource;
import com.strangerws.dnd.info.api.entity.card.builder.SpellCardBuilder;
import com.strangerws.dnd.info.api.entity.card.spell.CastTime;
import com.strangerws.dnd.info.api.entity.card.spell.Components;
import com.strangerws.dnd.info.api.entity.card.spell.Distance;
import com.strangerws.dnd.info.api.entity.card.spell.Durability;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
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

    @NotNull
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @NotNull
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @NotNull
    public CastTime getCastTime() {
        return castTime;
    }

    public void setCastTime(CastTime castTime) {
        this.castTime = castTime;
    }

    @NotNull
    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    @NotNull
    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    @NotNull
    public Durability getDurability() {
        return durability;
    }

    public void setDurability(Durability durability) {
        this.durability = durability;
    }

    @NotNull
    public List<DndClass> getClasses() {
        return classes;
    }

    public void setClasses(List<DndClass> classes) {
        this.classes = classes;
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

    @Nullable
    public String getOnHigherLevels() {
        return onHigherLevels;
    }

    public void setOnHigherLevels(String onHigherLevels) {
        this.onHigherLevels = onHigherLevels;
    }

    @Override
    public String toString() {
        return "SpellCard{" +
                "level='" + level + '\'' +
                ", school='" + school + '\'' +
                ", castTime=" + castTime +
                ", distance=" + distance +
                ", components=" + components +
                ", durability=" + durability +
                ", classes=" + classes +
                ", source=" + source +
                ", description='" + description + '\'' +
                ", onHigherLevels='" + onHigherLevels + '\'' +
                "} " + super.toString();
    }
}
