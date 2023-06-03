package datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;

public class ModLootTablesProvider extends LootTableProvider {
    public ModLootTablesProvider(PackOutput packOutput) {
        super(packOutput, Collections.emptySet(), List.of(
                new SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)
        ));
    }
}
