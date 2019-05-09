package fr.jeremtech.tutojerem.world;

import fr.jeremtech.tutojerem.init.ModBlocks;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.CompositeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MinableConfig;
import net.minecraft.world.gen.placement.CountRange;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{
    public static void setupOreGeneration()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if(biome == Biomes.WARM_OCEAN || biome == Biomes.LUKEWARM_OCEAN)
            {
                CountRangeConfig aquamarine_ore_config = new CountRangeConfig(50, 5, 5, 70);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new CompositeFeature<>(Feature.MINABLE, new MinableConfig(MinableConfig.IS_ROCK, ModBlocks.AQUAMARINE_ORE.getDefaultState(), 8), new CountRange(), aquamarine_ore_config));
            }
        }
    }
}
