package com.ultreon.mods.tuem.forge;

import com.ultreon.mods.tuem.Config;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigImpl {
    public static void registerCommon(Object context) {
        if (context instanceof ModLoadingContext ctx) {
            ctx.registerConfig(ModConfig.Type.COMMON, Config.Common.build());
        }
    }

    public static void registerClient(Object context) {
        if (context instanceof ModLoadingContext ctx) {
            ctx.registerConfig(ModConfig.Type.CLIENT, Config.Client.build());
        }
    }

    public static void registerServer(Object context) {
        if (context instanceof ModLoadingContext ctx) {
            ctx.registerConfig(ModConfig.Type.SERVER, Config.Server.build());
        }
    }
}
