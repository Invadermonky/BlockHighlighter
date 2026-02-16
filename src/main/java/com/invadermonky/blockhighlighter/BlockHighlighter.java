package com.invadermonky.blockhighlighter;

import com.invadermonky.blockhighlighter.config.ConfigTags;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = BlockHighlighter.MOD_ID,
        name = BlockHighlighter.MOD_NAME,
        version = BlockHighlighter.MOD_VERSION,
        dependencies = BlockHighlighter.DEPENDENCIES,
        clientSideOnly = true
)
public class BlockHighlighter {
    public static final String MOD_ID = Tags.MOD_ID;
    public static final String MOD_NAME = Tags.MOD_NAME;
    public static final String MOD_VERSION = Tags.VERSION;
    public static final String DEPENDENCIES = "required-after:mixinbooter";

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ConfigTags.syncConfig();
    }
}
