package com.cucumbersaurus.cucumbermod.blocks.crops

import com.cucumbersaurus.cucumbermod.blocks.ModBlocks
import com.cucumbersaurus.cucumbermod.items.ModItemDictionary
import com.cucumbersaurus.cucumbermod.items.ModItems
import net.minecraft.block.BlockState
import net.minecraft.block.Material
import net.minecraft.block.ShapeContext
import net.minecraft.item.ItemConvertible
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView


class CucumberCropBlock: ModCropBlock(
    Settings
        .of(Material.PLANT)
        .nonOpaque()
        .noCollision()
        .ticksRandomly()
        .breakInstantly()
        .sounds(BlockSoundGroup.CROP)
) {
    override val id: ModBlocks
        get() = ModBlocks.CUCUMBER_CROP_BLOCK

    override fun getSeedsItem(): ItemConvertible {
        return ModItemDictionary[ModItems.CUCUMBER_SEED]!!
    }

    override fun getOutlineShape(
        state: BlockState,
        world: BlockView,
        pos: BlockPos,
        context: ShapeContext,
    ): VoxelShape {
        return AGE_TO_SHAPE[state.get(this.ageProperty) as Int]
    }

    companion object {
        val AGE_TO_SHAPE = arrayOf<VoxelShape>(
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
            createCuboidShape(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
        )
    }
}