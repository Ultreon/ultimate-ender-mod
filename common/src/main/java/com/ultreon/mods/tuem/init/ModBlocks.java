package com.ultreon.mods.tuem.init;

import com.ultreon.mods.tuem.UltimateEnderMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(UltimateEnderMod.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> MUTATED_ENDERIUM_BLOCK = register("mutated_enderium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));
    public static final RegistrySupplier<Block> MUTATED_ENDERIUM_ORE = register("mutated_enderium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    @SuppressWarnings("SameParameterValue")
    private static <I extends Block> RegistrySupplier<I> register(String name, Supplier<I> supplier) {
        return BLOCKS.register(name, supplier);
    }

    public static void register() {
        BLOCKS.register();
    }
}
