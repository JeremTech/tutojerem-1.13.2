package fr.jeremtech.tutojerem.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FishSandwichItemFood extends ItemFood
{
    public FishSandwichItemFood(int healAmountIn, float saturation, boolean meat, Properties builder)
    {
        super(healAmountIn, saturation, meat, builder);
    }

    @Override
    public int getUseDuration(ItemStack stack)
    {
        return 40;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        super.onFoodEaten(stack, worldIn, player);
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(30), 300));
    }
}
