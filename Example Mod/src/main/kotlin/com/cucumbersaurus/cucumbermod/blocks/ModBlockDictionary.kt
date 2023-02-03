package com.cucumbersaurus.cucumbermod.blocks

import net.minecraft.block.Block

object ModBlockDictionary {

    private val blockDictionary = HashMap<String, Block>()

    operator fun get(key: String): Block? {
        return blockDictionary[key]
    }

    operator fun get(key: ModBlocks): Block? {
        return blockDictionary[key.name]
    }

    operator fun set(key: String, value:Block){
        blockDictionary[key] = value
    }

    operator fun set(key: ModBlocks, value:Block){
        blockDictionary[key.name] = value
    }
}