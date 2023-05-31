package com.ultreon.mods.tuem.fabric;

import com.ultreon.mods.tuem.Config;
import com.ultreon.mods.tuem.UltimateEnderMod;
import net.fabricmc.api.DedicatedServerModInitializer;

public class UltimateEnderModServerFabric implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        UltimateEnderMod main = new UltimateEnderMod();
        main.init();

        Config.register(null);
    }
}
