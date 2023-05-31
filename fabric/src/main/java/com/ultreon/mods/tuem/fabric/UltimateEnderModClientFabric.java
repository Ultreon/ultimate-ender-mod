package com.ultreon.mods.tuem.fabric;

import com.ultreon.mods.tuem.client.UltimateEnderModClient;
import net.fabricmc.api.ClientModInitializer;

public class UltimateEnderModClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        UltimateEnderModClient main = new UltimateEnderModClient();
        main.init();
    }
}
