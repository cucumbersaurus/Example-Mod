package com.cucumbersaurus.cucumbermod.items

import com.cucumbersaurus.cucumbermod.CucumberMod
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import java.util.*

abstract class ModItem(settings:Settings): Item(settings) {

    abstract val id:ModItems
    init {
        Registry.register(Registries.ITEM, Identifier(CucumberMod.MOD_ID, id.name.lowercase(Locale.getDefault())), this)
        ModItemDictionary[id] = this
    }
}