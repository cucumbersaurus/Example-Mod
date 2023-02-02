package com.cucumbersaurus.cucumbermod.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.ItemGroups
import net.minecraft.item.Items

class CucumberSeed:ModItem(FabricItemSettings(), "cucumber_seed") {

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