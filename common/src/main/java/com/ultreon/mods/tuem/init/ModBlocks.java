package com.ultreon.mods.tuem.init;

import com.ultreon.mods.tuem.UltimateEnderMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

public class ModBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(UltimateEnderMod.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> ENDERIUM_BLOCK = register("enderium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(35f, 500f).sound(SoundType.METAL)));
    public static final RegistrySupplier<Block> MUTATED_ENDERIUM_BLOCK = register("mutated_enderium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(50.0F, 1200.0F).sound(SoundType.NETHERITE_BLOCK)));

    @SuppressWarnings("SameParameterValue")
    private static <I extends Block> RegistrySupplier<I> register(String name, Supplier<I> supplier) {
        return BLOCKS.register(name, supplier);
    }

    public static void register() {
        BLOCKS.register();
    }
}
