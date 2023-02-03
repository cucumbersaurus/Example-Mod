package com.cucumbersaurus.cucumbermod.items

import net.minecraft.item.Item

object ModItemDictionary {

    private val itemDictionary = HashMap<String, Item>()

    operator fun get(key: String): Item? {
        return itemDictionary[key]
    }

    operator fun get(key: ModItems): Item? {
        return itemDictionary[key.name]
    }

    operator fun set(key: String, value: Item){
        itemDictionary[key] = value
    }

    operator fun set(key: ModItems, value: Item){
        itemDictionary[key.name] = value
    }

}