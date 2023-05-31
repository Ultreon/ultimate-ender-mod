package com.ultreon.mods.tuem.fabric;

import com.ultreon.mods.tuem.Config;
import com.ultreon.mods.tuem.UltimateEnderMod;
import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigImpl {
    public static void register(Object context) {
        ForgeConfigRegistry.INSTANCE.register(UltimateEnderMod.MOD_ID, ModConfig.Type.CLIENT, Config.build());
    }
}
