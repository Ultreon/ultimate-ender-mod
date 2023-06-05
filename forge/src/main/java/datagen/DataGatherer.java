package datagen;

import com.ultreon.mods.tuem.UltimateEnderMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = UltimateEnderMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGatherer {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        dataGenerator.addProvider(true, new ModBlockStateProvider(packOutput, existingFileHelper));
        dataGenerator.addProvider(true, new ModEnglishTranslationProvider(packOutput));
        dataGenerator.addProvider(true, new ModItemModelProvider(packOutput, existingFileHelper));
        ModBlockTagProvider blockTagProvider = new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        dataGenerator.addProvider(true, blockTagProvider);
        dataGenerator.addProvider(true, new ModItemTagProvider(packOutput, lookupProvider, blockTagProvider.contentsGetter(), existingFileHelper));
        dataGenerator.addProvider(true, new ModRecipesProvider(packOutput));
        dataGenerator.addProvider(true, new ModLootTablesProvider(packOutput));

        dataGenerator.addProvider(true, new ModWorldgenProvider(packOutput, lookupProvider));
    }
}
