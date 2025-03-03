package com.cucumbersaurus.cucumbermod.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.FoodComponent
import net.minecraft.item.ItemGroups
import net.minecraft.item.Items

class CucumberPickle:ModItem(FabricItemSettings().food(FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build())) {
    override val id: ModItems
    get() = ModItems.CUCUMBER_PICKLE

    init {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
            .register(ItemGroupEvents.ModifyEntries { content: FabricItemGroupEntries ->
                content.addAfter(
                    Items.BEETROOT_SEEDS,
                    this
                )
            })
    }
}