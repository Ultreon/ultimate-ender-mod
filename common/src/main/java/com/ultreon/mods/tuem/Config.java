package com.ultreon.mods.tuem;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();


    static {

    }

    @ExpectPlatform
    public static void register(Object context) {

    }

    public static ForgeConfigSpec build() {
        return CLIENT_BUILDER.build();
    }
}
