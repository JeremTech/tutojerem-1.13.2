package fr.jeremtech.tutojerem.init;

import fr.jeremtech.tutojerem.TutoJerem;
import fr.jeremtech.tutojerem.items.VegetalPowderItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = TutoJerem.MOD_ID, bus =  Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{
    @ObjectHolder(TutoJerem.MOD_ID + ":vegetal_powder")
    public static final VegetalPowderItem VEGETAL_POWDER = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e)
    {
        e.getRegistry().register(new VegetalPowderItem(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("vegetal_powder"));
    }
}