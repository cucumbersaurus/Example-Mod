package com.cucumbersaurus.cucumbermod.items

import com.cucumbersaurus.cucumbermod.CucumberMod
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

open class ModItem(settings:Settings, name:String): Item(settings) {
    init {
        Registry.register(Registries.ITEM, Identifier(CucumberMod.MOD_ID, name), this)
    }
}