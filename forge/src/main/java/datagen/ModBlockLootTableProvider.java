package datagen;

import com.google.common.collect.ImmutableList;
import com.ultreon.mods.tuem.init.ModBlocks;
import com.ultreon.mods.tuem.init.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Collections;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider() {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ImmutableList.of(ModBlocks.ENDERIUM_BLOCK.get(), ModBlocks.MUTATED_ENDERIUM_BLOCK.get());
    }

    @Override
    protected void generate() {
        add(ModBlocks.ENDERIUM_BLOCK.get(), createSingleItemTable(ModItems.ENDERIUM_BLOCK.get()));
        add(ModBlocks.MUTATED_ENDERIUM_BLOCK.get(), createSingleItemTable(ModItems.MUTATED_ENDERIUM_BLOCK.get()));
    }
}
