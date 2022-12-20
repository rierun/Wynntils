/*
 * Copyright © Wynntils 2022.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.wynn.model.map;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public enum TerritoryDefenseFilterType {
    DEFAULT(""),
    HIGHER(" and higher"),
    LOWER(" and lower");

    private final String asString;

    TerritoryDefenseFilterType(String asString) {
        this.asString = asString;
    }

    public Component asComponent() {
        return Component.literal(asString).withStyle(ChatFormatting.WHITE);
    }
}