package fr.jeremtech.tutojerem.blocks;

import fr.jeremtech.tutojerem.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class AquamarineOreBlock extends Block
{
    public AquamarineOreBlock(Properties properties)
    {
        super(properties);
    }

    /** Change the block drop **/
    @Override
    public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune)
    {
        return ModItems.AQUAMARINE;
    }

    /** Change the block material **/
    @Override
    public Material getMaterial(IBlockState state)
    {
        return Material.ROCK;
    }

    /** Change the block sound **/
    @Override
    public SoundType getSoundType(IBlockState state, IWorldReader world, BlockPos pos, @Nullable Entity entity)
    {
        return SoundType.STONE;
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(this);
    }
}
