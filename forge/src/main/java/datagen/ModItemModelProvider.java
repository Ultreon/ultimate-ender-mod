package datagen;

import com.ultreon.mods.tuem.UltimateEnderMod;
import com.ultreon.mods.tuem.init.ModItems;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UltimateEnderMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simple(ModItems.MUTATED_ENDERIUM_INGOT);
        simple(ModItems.MUTATED_ENDERIUM_BOOTS);
        simple(ModItems.MUTATED_ENDERIUM_LEGGINGS);
        simple(ModItems.MUTATED_ENDERIUM_CHESTPLATE);
        simple(ModItems.MUTATED_ENDERIUM_HELMET);
        handheld(ModItems.MUTATED_ENDERIUM_SWORD);
        handheld(ModItems.MUTATED_ENDERIUM_PICKAXE);
        handheld(ModItems.MUTATED_ENDERIUM_AXE);
        handheld(ModItems.MUTATED_ENDERIUM_SHOVEL);
        handheld(ModItems.MUTATED_ENDERIUM_HOE);
    }

    private <T extends Item> void simple(RegistrySupplier<T> item) {
        singleTexture(item.getId().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/" + item.getId().getPath()));
    }

    private <T extends Item> void handheld(RegistrySupplier<T> item) {
        singleTexture(item.getId().getPath(), mcLoc("item/handheld"), "layer0", modLoc("item/" + item.getId().getPath()));
    }
}
