package com.cucumbersaurus.cucumbermod.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents.ModifyEntries
import net.minecraft.item.FoodComponent
import net.minecraft.item.ItemGroups
import net.minecraft.item.Items


class Cucumber: ModItem(
    FabricItemSettings()
        .food(
            FoodComponent.Builder()
                .hunger(2)
                .saturationModifier(0.2f)
                .build()
        )
){

    init {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
            .register(ModifyEntries { content: FabricItemGroupEntries ->
                content.addAfter(
                    Items.DRIED_KELP,
                    this
                )
            })
    }

    override val id: ModItems
        get() = ModItems.CUCUMBER
}