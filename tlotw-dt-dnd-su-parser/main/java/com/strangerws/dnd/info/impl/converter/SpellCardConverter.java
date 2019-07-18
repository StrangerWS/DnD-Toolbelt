package com.strangerws.dnd.info.impl.converter;

import com.strangerws.dnd.info.api.entity.card.HtmlCard;
import com.strangerws.dnd.info.api.entity.card.SpellCard;
import com.strangerws.dnd.info.api.entity.card.SpellCardBuilder;
import com.strangerws.dnd.info.api.entity.spell.CastTime;
import com.strangerws.dnd.info.api.entity.spell.Components;
import com.strangerws.dnd.info.api.entity.spell.Distance;
import com.strangerws.dnd.info.api.entity.spell.Durability;
import javafx.util.Pair;

public class SpellCardConverter extends AbstractCardConverter<SpellCard> {

    private static final String LEVEL_STRING = "Уровень: ";
    private static final String SCHOOL_STRING = "Школа: ";
    private static final String CAST_TIME_STRING = "Время накладывания: ";
    private static final String DISTANCE_STRING = "Дистанция: ";
    private static final String COMPONENTS_STRING = "Компоненты: ";
    private static final String DURABILITY_STRING = "Длительность: ";
    private static final String CLASSES_STRING = "Классы: ";
    private static final String SOURCE_STRING = "Источник: ";
    private static final String DESCRIPTION_STRING = "Описание";

    private static final String ON_HIGHER_LEVELS = "На больших уровнях";
    private static final String RITUAL_STRING = "(ритуал)";
    private static final String CONCENTRATION_STRING = "Концентрация";
    private static final String MATERIAL_COMPONENT_IS_CONSUMABLE = "расходуем";

    @Override
    public SpellCard convert(HtmlCard htmlCard){
        return convertToSpell(htmlCard);
    }

    private SpellCard convertToSpell(HtmlCard htmlCard) {
        String spellLevel = extractFromParamList(htmlCard, LEVEL_STRING);
        String spellSchool = extractFromParamList(htmlCard, SCHOOL_STRING);
        CastTime spellCastTime = getCastTime(extractFromParamList(htmlCard, CAST_TIME_STRING));
        Distance spellDistance = getDistance(extractFromParamList(htmlCard, DISTANCE_STRING));
        Components spellComponents = getComponents(
                extractFromParamList(htmlCard, COMPONENTS_STRING));
        Durability spellDurability = getDurability(extractFromParamList(htmlCard, DURABILITY_STRING));
        Pair<String, String> fullDescription = getFullDescription(htmlCard);

        return new SpellCardBuilder()
                .setLevel(spellLevel)
                .setSchool(spellSchool)
                .setCastTime(spellCastTime)
                .setDistance(spellDistance)
                .setComponents(spellComponents)
                .setDurability(spellDurability)
                .setDescription(fullDescription.getKey())
                .setOnHigherLevels(fullDescription.getValue())
                .build(htmlCard);
    }

    private CastTime getCastTime(String castTimeString) {
        Boolean isRitual = castTimeString.contains(RITUAL_STRING);
        String castTime = isRitual
                ? castTimeString.substring(0, castTimeString.indexOf(RITUAL_STRING)).trim()
                : castTimeString;
        return new CastTime(castTime, isRitual);
    }

    private Distance getDistance(String distance) {
        String[] distanceProperties = distance.split(",");
        String range = distanceProperties[0];
        String area = distanceProperties.length > 1
                ? distanceProperties[1]
                : null;

        return new Distance(range, area);
    }

    private Components getComponents(String components) {
        Boolean verbalExists = components.contains("В,") || components.endsWith("В");
        Boolean somaticExists = components.contains("С,") || components.endsWith("С");

        Integer materialComponentIndex = components.indexOf("М, ");

        String material = materialComponentIndex > STRING_NOT_EXISTS
                ? components.substring(materialComponentIndex)
                : null;
        Boolean materialConsumed = components.contains(MATERIAL_COMPONENT_IS_CONSUMABLE);

        return new Components(verbalExists, somaticExists, material, materialConsumed);
    }

    private Durability getDurability(String durability){
        Boolean isConcentrated = durability.contains(CONCENTRATION_STRING);

        String time = isConcentrated
                ? durability.substring(CONCENTRATION_STRING.length() + STRING_OFFSET)
                : durability;

        return new Durability(time, isConcentrated);
    }

    private Pair<String, String> getFullDescription(HtmlCard htmlCard) {
        String description = null;
        String onHigherLevels = null;

        String fullDescription = extractFromParamList(htmlCard, DESCRIPTION_STRING);

        int onHigherLevelsEntryIndex = fullDescription.indexOf(ON_HIGHER_LEVELS);

        if (onHigherLevelsEntryIndex > STRING_NOT_EXISTS) {
            description = fullDescription.substring(STRING_START_INDEX, onHigherLevelsEntryIndex);
            onHigherLevels = fullDescription.substring(
                    onHigherLevelsEntryIndex + ON_HIGHER_LEVELS.length() + STRING_OFFSET);
        } else {
            description = fullDescription;
        }

        return new Pair<>(description, onHigherLevels);
    }
}
