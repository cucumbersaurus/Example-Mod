package com.cucumbersaurus.cucumbermod.blocks

import com.cucumbersaurus.cucumbermod.CucumberMod
import net.minecraft.block.Block
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

abstract class ModBlock(settings: Settings): Block(settings) {

    abstract val id:ModBlocks

    init {
        Registry.register(Registries.BLOCK, Identifier(CucumberMod.MOD_ID, id.name.lowercase()), this)
    }
}