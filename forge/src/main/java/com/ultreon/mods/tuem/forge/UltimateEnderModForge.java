package com.ultreon.mods.tuem.forge;

import com.ultreon.mods.tuem.Config;
import com.ultreon.mods.tuem.UltimateEnderMod;
import com.ultreon.mods.tuem.client.UltimateEnderModClient;
import com.ultreon.mods.tuem.client.UltimateEnderModServer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(UltimateEnderMod.MOD_ID)
public class UltimateEnderModForge {
    public UltimateEnderModForge() {
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            UltimateEnderModClient main = new UltimateEnderModClient();
            main.init();
        });

        DistExecutor.unsafeRunWhenOn(Dist.DEDICATED_SERVER, () -> () -> {
            UltimateEnderModServer main = new UltimateEnderModServer();
            main.init();
        });

        UltimateEnderMod main = new UltimateEnderMod();
        main.init();

        ModLoadingContext ctx = ModLoadingContext.get();
        Config.register(ctx);
    }
}
