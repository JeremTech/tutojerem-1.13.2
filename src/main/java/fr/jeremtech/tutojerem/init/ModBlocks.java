package fr.jeremtech.tutojerem.init;

import fr.jeremtech.tutojerem.TutoJerem;
import fr.jeremtech.tutojerem.blocks.MudBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TutoJerem.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
    @ObjectHolder(TutoJerem.MOD_ID + ":mud")
    public static final MudBlock BLOCK_MUD = null;

    @SubscribeEvent
    public static void registerBlock(final RegistryEvent.Register<Block> e)
    {
        e.getRegistry().register(new MudBlock(Block.Properties.create(Material.GRASS)).setRegistryName("mud"));
    }

    @SubscribeEvent
    public static void registerItem(final RegistryEvent.Register<Item> e)
    {
        e.getRegistry().register(new ItemBlock(BLOCK_MUD, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(BLOCK_MUD.getRegistryName()));
    }
}
