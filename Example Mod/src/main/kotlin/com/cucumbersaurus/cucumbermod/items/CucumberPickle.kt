package com.cucumbersaurus.cucumbermod.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.FoodComponent

class CucumberPickle:ModItem(FabricItemSettings().food(FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build()), "cucumber_pickle") {
}