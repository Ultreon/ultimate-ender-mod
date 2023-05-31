package com.ultreon.mods.tuem;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateEnderMod {
    public static final String MOD_ID = "tuem";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LoggerFactory.getLogger("TUEM");
    private static UltimateEnderMod instance;

    public static UltimateEnderMod getInstance() {
        return instance;
    }

    @SuppressWarnings("ConstantConditions")
    public UltimateEnderMod() {
        instance = this;
    }

    public void init() {

    }

    public String getModId() {
        return MOD_ID;
    }

    public static ResourceLocation res(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    private void setup() {

    }
}
