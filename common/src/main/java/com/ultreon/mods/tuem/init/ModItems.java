package com.ultreon.mods.tuem.init;

import com.ultreon.mods.tuem.UltimateEnderMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(UltimateEnderMod.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MUTATED_ENDERIUM_INGOT = ITEMS.register("mutated_enderium_ingot", () -> new Item(new Item.Properties()));

    public static void register() {
        ITEMS.register();
    }
}
