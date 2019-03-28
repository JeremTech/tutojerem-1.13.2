package fr.jeremtech.tutojerem.blocks;

import fr.jeremtech.tutojerem.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class MudBlock extends Block
{
    public MudBlock(Properties pro)
    {
        super(pro);
    }

    @Override
    public IItemProvider getItemDropped(IBlockState p_199769_1_, World p_199769_2_, BlockPos p_199769_3_, int p_199769_4_) {
        return Blocks.DIRT;
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState p_180643_1_) {
        return new ItemStack(ModBlocks.BLOCK_MUD);
    }

    @Override
    public SoundType getSoundType(IBlockState state, IWorldReader world, BlockPos pos, @Nullable Entity entity) {
        return SoundType.GROUND;
    }


}
