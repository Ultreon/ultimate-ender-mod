package datagen;

import com.ultreon.mods.tuem.UltimateEnderMod;
import com.ultreon.mods.tuem.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTagLookup, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, blockTagLookup, UltimateEnderMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.PICKAXES).add(ModItems.MUTATED_ENDERIUM_PICKAXE.get());
        tag(ItemTags.SWORDS).add(ModItems.MUTATED_ENDERIUM_SWORD.get());
        tag(ItemTags.AXES).add(ModItems.MUTATED_ENDERIUM_AXE.get());
        tag(ItemTags.SHOVELS).add(ModItems.MUTATED_ENDERIUM_SHOVEL.get());
        tag(ItemTags.HOES).add(ModItems.MUTATED_ENDERIUM_HOE.get());
    }
}
