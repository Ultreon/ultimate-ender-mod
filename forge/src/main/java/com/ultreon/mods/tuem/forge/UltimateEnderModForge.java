package com.ultreon.mods.tuem.forge;

import com.ultreon.mods.tuem.Config;
import com.ultreon.mods.tuem.UltimateEnderMod;
import com.ultreon.mods.tuem.client.UltimateEnderModClient;
import com.ultreon.mods.tuem.server.UltimateEnderModServer;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UltimateEnderMod.MOD_ID)
public class UltimateEnderModForge {
    public UltimateEnderModForge() {
        EventBuses.registerModEventBus(UltimateEnderMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            UltimateEnderModClient main = new UltimateEnderModClient();
            main.init();

            Config.registerClient(ModLoadingContext.get());
        });

        DistExecutor.unsafeRunWhenOn(Dist.DEDICATED_SERVER, () -> () -> {
            UltimateEnderModServer main = new UltimateEnderModServer();
            main.init();

            Config.registerServer(ModLoadingContext.get());
        });

        UltimateEnderMod main = new UltimateEnderMod();
        main.init();

        ModLoadingContext ctx = ModLoadingContext.get();
        Config.registerCommon(ctx);
    }
}
