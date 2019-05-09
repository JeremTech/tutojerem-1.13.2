package fr.jeremtech.tutojerem;

import fr.jeremtech.tutojerem.world.OreGeneration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TutoJerem.MOD_ID)
public class TutoJerem
{
    public static final String MOD_ID = "tutojerem";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public TutoJerem()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    private void setup(final FMLCommonSetupEvent e)
    {
        LOGGER.info("TutoJerem setup");
        OreGeneration.setupOreGeneration();
    }

    private void clientSetup(final FMLClientSetupEvent e)
    {
        LOGGER.info("TutoJerem client setup");
    }

    private void serverSetup(final FMLDedicatedServerSetupEvent e)
    {
        LOGGER.info("TutoJerem server setup");
    }
}
