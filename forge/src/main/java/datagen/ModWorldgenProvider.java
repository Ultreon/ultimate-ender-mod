package datagen;

import com.google.common.collect.ImmutableList;
import com.ultreon.mods.tuem.UltimateEnderMod;
import com.ultreon.mods.tuem.init.ModBlocks;
import com.ultreon.mods.tuem.worldgen.WorldGenKeys;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldgenProvider extends DatapackBuiltinEntriesProvider {
    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);

    public ModWorldgenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(UltimateEnderMod.MOD_ID));
    }

    private static class ModConfiguredFeatures {
        private static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
            var stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
            var deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
            var targetBlockStates = ImmutableList.of(
                    OreConfiguration.target(stoneReplaceables, ModBlocks.ENDERIUM_ORE.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ENDERIUM_ORE.get().defaultBlockState())
            );

            register(context, WorldGenKeys.CONFIGURED_ENDERIUM_ORE_OVERWORLD, Feature.ORE, new OreConfiguration(
                    targetBlockStates,
                    6, //Vein size
                    0 //Chance to discard if exposed to air (0-1)
            ));
        }

        private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
                BootstapContext<ConfiguredFeature<?, ?>> context,
                ResourceKey<ConfiguredFeature<?, ?>> key,
                F feature,
                FC configuration
        ) {
            context.register(key, new ConfiguredFeature<>(feature, configuration));
        }
    }

    private static class ModPlacedFeatures {
        private static void bootstrap(BootstapContext<PlacedFeature> context) {
            var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

            register(
                    context,
                    WorldGenKeys.PLACED_ENDERIUM_ORE_OVERWORLD,
                    configuredFeatures.getOrThrow(WorldGenKeys.CONFIGURED_ENDERIUM_ORE_OVERWORLD),
                    rareOrePlacement(
                            50, //will place if: random.nextFloat() < 1.0f / chance
                            //therefore the larger the number the lower the chance of the ore spawning
                            HeightRangePlacement.triangle( //I think this means the higher the Y the bigger chances of it spawning or the exact opposite, not sure
                                    VerticalAnchor.BOTTOM,
                                    VerticalAnchor.aboveBottom(65) //This is pretty arbitrary, maybe will change
                            )
                    )
            );
        }

        private static List<PlacementModifier> orePlacement(PlacementModifier arg, PlacementModifier heightRange) {
            return List.of(arg, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
        }

        private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
            return orePlacement(CountPlacement.of(count), heightRange);
        }

        private static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier heightRange) {
            return orePlacement(RarityFilter.onAverageOnceEvery(chance), heightRange);
        }

        private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configured, List<PlacementModifier> placementModifiers) {
            context.register(key, new PlacedFeature(configured, placementModifiers));
        }
    }
}
