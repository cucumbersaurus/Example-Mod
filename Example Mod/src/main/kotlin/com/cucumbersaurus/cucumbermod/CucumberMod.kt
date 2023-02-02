package com.cucumbersaurus.cucumbermod
import com.cucumbersaurus.cucumbermod.items.Cucumber
import com.cucumbersaurus.cucumbermod.items.CucumberPickle
import com.cucumbersaurus.cucumbermod.items.CucumberSeed
import com.cucumbersaurus.cucumbermod.items.CustomItem
import net.fabricmc.api.ModInitializer


@Suppress("UNUSED")
object CucumberMod: ModInitializer {
    const val MOD_ID = "cucumbermod"
    override fun onInitialize() {

        initializeItems()

        println("Cucumber mod has been initialized.")
    }

    private fun initializeItems(){
        println("initializing items...")
        CustomItem()
        Cucumber()
        CucumberPickle()
        CucumberSeed()
    }
}