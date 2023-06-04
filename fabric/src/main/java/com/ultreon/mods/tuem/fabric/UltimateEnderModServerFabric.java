package com.ultreon.mods.tuem.fabric;

import com.ultreon.mods.tuem.Config;
import com.ultreon.mods.tuem.server.UltimateEnderModServer;
import net.fabricmc.api.DedicatedServerModInitializer;

public class UltimateEnderModServerFabric implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        UltimateEnderModServer main = new UltimateEnderModServer();
        main.init();

        Config.registerServer(null);
    }
}
