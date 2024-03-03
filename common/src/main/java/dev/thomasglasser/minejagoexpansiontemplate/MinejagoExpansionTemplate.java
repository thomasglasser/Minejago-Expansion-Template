package dev.thomasglasser.minejagoexpansiontemplate;

import dev.thomasglasser.tommylib.api.platform.TommyLibServices;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinejagoExpansionTemplate
{
    public static final String MOD_ID = "minejagoexpansiontemplate";
    public static final String MOD_NAME = "Minejago Expansion: Template";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        LOGGER.info("Initializing {} for {} in a {} environment...", MOD_NAME, TommyLibServices.PLATFORM.getPlatformName(), TommyLibServices.PLATFORM.getEnvironmentName());
    }

    public static ResourceLocation modLoc(String s)
    {
        return new ResourceLocation(MOD_ID, s);
    }
}