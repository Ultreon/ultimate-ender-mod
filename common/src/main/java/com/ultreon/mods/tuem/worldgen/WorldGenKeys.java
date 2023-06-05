package com.ultreon.mods.tuem.worldgen;

import com.ultreon.mods.tuem.UltimateEnderMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class WorldGenKeys {
    public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_ENDERIUM_ORE_OVERWORLD = registerKey(Registries.CONFIGURED_FEATURE, "enderium_ore_overworld");
    public static final ResourceKey<PlacedFeature> PLACED_ENDERIUM_ORE_OVERWORLD = registerKey(Registries.PLACED_FEATURE, "enderium_ore_overworld");

    private static <T> ResourceKey<T> registerKey(ResourceKey<? extends Registry<T>> registryKey, String id) {
        return ResourceKey.create(registryKey, new ResourceLocation(UltimateEnderMod.MOD_ID, id));
    }
}
