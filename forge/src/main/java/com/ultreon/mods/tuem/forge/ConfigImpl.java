package com.ultreon.mods.tuem.forge;

import com.ultreon.mods.tuem.Config;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigImpl {
    public static void register(Object context) {
        if (context instanceof ModLoadingContext ctx) {
            ctx.registerConfig(ModConfig.Type.CLIENT, Config.build());
        }
    }
}
