package com.ultreon.mods.tuem;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

    @ExpectPlatform
    public static void registerCommon(Object context) {

    }

    @ExpectPlatform
    public static void registerClient(Object context) {

    }

    @ExpectPlatform
    public static void registerServer(Object context) {

    }

    public static class Client {
        static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();


        public static ForgeConfigSpec build() {
            return CLIENT_BUILDER.build();
        }
    }

    public static class Common {
        static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        public static ForgeConfigSpec build() {
            return COMMON_BUILDER.build();
        }
    }

    public static class Server {
        static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();

        public static ForgeConfigSpec build() {
            return SERVER_BUILDER.build();
        }
    }
}
