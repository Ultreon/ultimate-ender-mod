package com.ultreon.mods.tuem.fabric;

import com.ultreon.mods.tuem.Config;
import com.ultreon.mods.tuem.UltimateEnderMod;
import net.fabricmc.api.ModInitializer;

public class UltimateEnderModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        UltimateEnderMod main = new UltimateEnderMod();
        main.init();

        Config.register(null);
    }
}
