package com.cucumbersaurus.cucumbermod.items

import com.cucumbersaurus.cucumbermod.blocks.ModBlockDictionary
import com.cucumbersaurus.cucumbermod.blocks.ModBlocks
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.block.Blocks
import net.minecraft.item.ItemGroups
import net.minecraft.item.ItemUsageContext
import net.minecraft.item.Items
import net.minecraft.util.ActionResult

class CucumberSeed:ModItem(FabricItemSettings()) {

    override val id: ModItems
        get() = ModItems.CUCUMBER_SEED

    init {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
            .register(ItemGroupEvents.ModifyEntries { content: FabricItemGroupEntries ->
                content.addAfter(
                    Items.BEETROOT_SEEDS,
                    this
                )
            })
    }

    override fun useOnBlock(context: ItemUsageContext): ActionResult {
        if(context.player!=null && context.world.getBlockState(context.blockPos).block == Blocks.FARMLAND && context.world.canSetBlock(context.blockPos)) {
            context.world.setBlockState(
                context.blockPos.add(0, 1, 0),
                ModBlockDictionary[ModBlocks.CUCUMBER_CROP_BLOCK]!!.defaultState
            )
            context.player!!.mainHandStack.count -= 1
        }
        return super.useOnBlock(context)
    }
}