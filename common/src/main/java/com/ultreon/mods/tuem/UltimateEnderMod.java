package com.ultreon.mods.tuem;

import com.ultreon.mods.tuem.init.ModBlocks;
import com.ultreon.mods.tuem.init.ModItems;
import com.ultreon.mods.tuem.worldgen.WorldGenKeys;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateEnderMod {
    public static final String MOD_ID = "tuem";
    public static final Logger LOGGER = LoggerFactory.getLogger("TUEM");

    private static UltimateEnderMod instance;

    public static UltimateEnderMod getInstance() {
        return instance;
    }

    public static final CreativeTabRegistry.TabSupplier MOD_TAB = CreativeTabRegistry.create(res("creative_tab"), /*builder ->
            builder.icon(() -> new ItemStack(ModItems.MUTATED_ENDERIUM_INGOT.get()))
            .title(Component.translatable("ultimate_ender_mod.creative_tab"))
            .build()*/ () -> new ItemStack(ModItems.ENDERIUM_INGOT.get()));

    @SuppressWarnings("ConstantConditions")
    public UltimateEnderMod() {
        instance = this;
    }

    public void init() {
        LOGGER.info("Starting Ultimate Ender Mod");
        ModBlocks.register();
        ModItems.register();
        initBiomeModifications();
    }

    private void initBiomeModifications() {
        BiomeModifications.addProperties(context -> context.hasTag(BiomeTags.IS_OVERWORLD),
                (context, properties) -> properties.getGenerationProperties().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, WorldGenKeys.PLACED_ENDERIUM_ORE_OVERWORLD));
    }

    public static ResourceLocation res(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
