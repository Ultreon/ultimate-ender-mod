package com.ultreon.mods.tuem.client;

import dev.architectury.event.events.client.ClientLifecycleEvent;
import net.minecraft.client.Minecraft;

public class UltimateEnderModClient {
    private static UltimateEnderModClient instance;

    public static UltimateEnderModClient getInstance() {
        return instance;
    }

    @SuppressWarnings("ConstantConditions")
    public UltimateEnderModClient() {
        instance = this;
    }

    public void init() {
        ClientLifecycleEvent.CLIENT_SETUP.register(this::setup);
    }

    private void setup(final Minecraft client) {
        if (client == null) {
            return;
        }
    }
}
