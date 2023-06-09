package com.ultreon.mods.tuem.init;

import com.ultreon.mods.tuem.UltimateEnderMod;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class ModItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(UltimateEnderMod.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> ENDERIUM_INGOT = register("enderium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<BlockItem> ENDERIUM_BLOCK = register("enderium_block", () -> new BlockItem(ModBlocks.ENDERIUM_BLOCK.get(), new Item.Properties()));

    public static final RegistrySupplier<ArmorItem> ENDERIUM_HELMET = register("enderium_helmet", () -> new ArmorItem(ArmorMaterials.ENDERIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> ENDERIUM_CHESTPLATE = register("enderium_chestplate", () -> new ArmorItem(ArmorMaterials.ENDERIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> ENDERIUM_LEGGINGS = register("enderium_leggings", () -> new ArmorItem(ArmorMaterials.ENDERIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> ENDERIUM_BOOTS = register("enderium_boots", () -> new ArmorItem(ArmorMaterials.ENDERIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistrySupplier<PickaxeItem> ENDERIUM_PICKAXE = register("enderium_pickaxe", () -> new PickaxeItem(ModToolTiers.ENDERIUM, 1, -2.8f, new Item.Properties()));
    public static final RegistrySupplier<SwordItem> ENDERIUM_SWORD = register("enderium_sword", () -> new SwordItem(ModToolTiers.ENDERIUM, 4, -2.4f, new Item.Properties()));
    public static final RegistrySupplier<AxeItem> ENDERIUM_AXE = register("enderium_axe", () -> new AxeItem(ModToolTiers.ENDERIUM, 7.5f, -3.0f, new Item.Properties()));
    public static final RegistrySupplier<ShovelItem> ENDERIUM_SHOVEL = register("enderium_shovel", () -> new ShovelItem(ModToolTiers.ENDERIUM, 2.25f, -3.0f, new Item.Properties()));
    public static final RegistrySupplier<HoeItem> ENDERIUM_HOE = register("enderium_hoe", () -> new HoeItem(ModToolTiers.ENDERIUM, -4, 0, new Item.Properties()));
    public static final RegistrySupplier<BlockItem> ENDERIUM_ORE = register("enderium_ore", () -> new BlockItem(ModBlocks.ENDERIUM_ORE.get(), new Item.Properties()));
    public static final RegistrySupplier<BlockItem> DEEPSLATE_ENDERIUM_ORE = register("deepslate_enderium_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_ENDERIUM_ORE.get(), new Item.Properties()));

    public static final RegistrySupplier<Item> MUTATED_ENDERIUM_INGOT = register("mutated_enderium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistrySupplier<BlockItem> MUTATED_ENDERIUM_BLOCK = register("mutated_enderium_block", () -> new BlockItem(ModBlocks.MUTATED_ENDERIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> MUTATED_ENDERIUM_HELMET = register("mutated_enderium_helmet", () -> new ArmorItem(ArmorMaterials.MUTATED_ENDERIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> MUTATED_ENDERIUM_CHESTPLATE = register("mutated_enderium_chestplate", () -> new ArmorItem(ArmorMaterials.MUTATED_ENDERIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> MUTATED_ENDERIUM_LEGGINGS = register("mutated_enderium_leggings", () -> new ArmorItem(ArmorMaterials.MUTATED_ENDERIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistrySupplier<ArmorItem> MUTATED_ENDERIUM_BOOTS = register("mutated_enderium_boots", () -> new ArmorItem(ArmorMaterials.MUTATED_ENDERIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistrySupplier<PickaxeItem> MUTATED_ENDERIUM_PICKAXE = register("mutated_enderium_pickaxe", () -> new PickaxeItem(ModToolTiers.MUTATED_ENDERIUM, 1, -2.8f, new Item.Properties()));
    public static final RegistrySupplier<SwordItem> MUTATED_ENDERIUM_SWORD = register("mutated_enderium_sword", () -> new SwordItem(ModToolTiers.MUTATED_ENDERIUM, 4, -2.4f, new Item.Properties()));
    public static final RegistrySupplier<AxeItem> MUTATED_ENDERIUM_AXE = register("mutated_enderium_axe", () -> new AxeItem(ModToolTiers.MUTATED_ENDERIUM, 7.5f, -3.0f, new Item.Properties()));
    public static final RegistrySupplier<ShovelItem> MUTATED_ENDERIUM_SHOVEL = register("mutated_enderium_shovel", () -> new ShovelItem(ModToolTiers.MUTATED_ENDERIUM, 2.25f, -3.0f, new Item.Properties()));
    public static final RegistrySupplier<HoeItem> MUTATED_ENDERIUM_HOE = register("mutated_enderium_hoe", () -> new HoeItem(ModToolTiers.MUTATED_ENDERIUM, -4, 0, new Item.Properties()));

    private static <I extends Item> RegistrySupplier<I> register(String name, Supplier<I> supplier) {
        RegistrySupplier<I> registrySupplier = ITEMS.register(name, supplier);
        CreativeTabRegistry.append(UltimateEnderMod.MOD_TAB, registrySupplier);
        return registrySupplier;
    }

    public static void register() {
        ITEMS.register();
    }
}
