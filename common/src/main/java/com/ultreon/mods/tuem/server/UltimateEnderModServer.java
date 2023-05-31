package com.ultreon.mods.tuem.server;

import dev.architectury.event.events.common.LifecycleEvent;
import net.minecraft.server.MinecraftServer;

public class UltimateEnderModServer {
    private static UltimateEnderModServer instance;

    public static UltimateEnderModServer getInstance() {
        return instance;
    }

    @SuppressWarnings("ConstantConditions")
    public UltimateEnderModServer() {
        instance = this;
    }

    public void init() {
        LifecycleEvent.SETUP.register(this::setup);
        LifecycleEvent.SERVER_STARTING.register(this::starting);
    }

    private void setup() {

    }

    private void starting(MinecraftServer server) {

    }
}
