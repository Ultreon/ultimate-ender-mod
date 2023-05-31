package com.ultreon.mods.tuem.init;

import com.ultreon.mods.tuem.UltimateEnderMod;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(UltimateEnderMod.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> MUTATED_ENDERIUM_INGOT = register("mutated_enderium_ingot", () -> new Item(new Item.Properties()));

    public static final RegistrySupplier<ArmorItem> MUTATED_ENDERIUM_HELMET = register("mutated_enderium_helmet", () -> new ArmorItem(ArmorMaterials.MUTATED_ENDERIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> MUTATED_ENDERIUM_CHESTPLATE = register("mutated_enderium_chestplate", () -> new ArmorItem(ArmorMaterials.MUTATED_ENDERIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> MUTATED_ENDERIUM_LEGGINGS = register("mutated_enderium_leggings", () -> new ArmorItem(ArmorMaterials.MUTATED_ENDERIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> MUTATED_ENDERIUM_BOOTS = register("mutated_enderium_boots", () -> new ArmorItem(ArmorMaterials.MUTATED_ENDERIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    private static <I extends Item> RegistrySupplier<I> register(String name, Supplier<I> supplier) {
        RegistrySupplier<I> registrySupplier = ITEMS.register(name, supplier);
        CreativeTabRegistry.append(UltimateEnderMod.MOD_TAB, registrySupplier);
        return registrySupplier;
    }

    public static void register() {
        ITEMS.register();
    }
}
