package com.cucumbersaurus.cucumbermod.blocks.crops

import com.cucumbersaurus.cucumbermod.CucumberMod
import com.cucumbersaurus.cucumbermod.blocks.ModBlockDictionary
import com.cucumbersaurus.cucumbermod.blocks.ModBlocks
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.block.Block
import net.minecraft.block.CropBlock
import net.minecraft.client.render.RenderLayer
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import java.util.*

abstract class ModCropBlock(settings: Settings):CropBlock(settings) {

    abstract val id: ModBlocks
    init {
        Registry.register(Registries.BLOCK, Identifier(CucumberMod.MOD_ID, id.name.lowercase(Locale.getDefault())), this)
        ModBlockDictionary[id] = this
    }

    fun initializeClient(){
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlockDictionary[id] as Block)
    }
}