package com.cucumbersaurus.cucumbermod
import com.cucumbersaurus.cucumbermod.blocks.ModBlockDictionary
import com.cucumbersaurus.cucumbermod.blocks.ModBlocks
import com.cucumbersaurus.cucumbermod.blocks.crops.CucumberCropBlock
import com.cucumbersaurus.cucumbermod.blocks.crops.ModCropBlock
import com.cucumbersaurus.cucumbermod.items.Cucumber
import com.cucumbersaurus.cucumbermod.items.CucumberPickle
import com.cucumbersaurus.cucumbermod.items.CucumberSeed
import com.cucumbersaurus.cucumbermod.items.CustomItem
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
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
        CucumberCropBlock()
    }
}

@Environment(EnvType.CLIENT)
object CucumberModClient: ClientModInitializer{
    override fun onInitializeClient() {
        (ModBlockDictionary[ModBlocks.CUCUMBER_CROP_BLOCK] as ModCropBlock).initializeClient()
    }

}