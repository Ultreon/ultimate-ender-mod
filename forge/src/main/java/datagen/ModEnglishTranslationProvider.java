package datagen;

import com.ultreon.mods.tuem.UltimateEnderMod;
import com.ultreon.mods.tuem.init.ModBlocks;
import com.ultreon.mods.tuem.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnglishTranslationProvider extends LanguageProvider {
    public ModEnglishTranslationProvider(PackOutput output) {
        super(output, UltimateEnderMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModBlocks.ENDERIUM_BLOCK.get(), "Enderium Block");
        add(ModItems.ENDERIUM_INGOT.get(), "Enderium Ingot");
        add(ModItems.ENDERIUM_BOOTS.get(), "Enderium Boots");
        add(ModItems.ENDERIUM_LEGGINGS.get(), "Enderium Leggings");
        add(ModItems.ENDERIUM_CHESTPLATE.get(), "Enderium Chestplate");
        add(ModItems.ENDERIUM_HELMET.get(), "Enderium Helmet");
        add(ModItems.ENDERIUM_SWORD.get(), "Enderium Sword");
        add(ModItems.ENDERIUM_AXE.get(), "Enderium Axe");
        add(ModItems.ENDERIUM_PICKAXE.get(), "Enderium Pickaxe");
        add(ModItems.ENDERIUM_SHOVEL.get(), "Enderium Shovel");
        add(ModItems.ENDERIUM_HOE.get(), "Enderium Hoe");

        add(ModBlocks.MUTATED_ENDERIUM_BLOCK.get(), "Mutated Enderium Block");
        add(ModItems.MUTATED_ENDERIUM_INGOT.get(), "Mutated Enderium Ingot");
        add(ModItems.MUTATED_ENDERIUM_BOOTS.get(), "Mutated Enderium Boots");
        add(ModItems.MUTATED_ENDERIUM_LEGGINGS.get(), "Mutated Enderium Leggings");
        add(ModItems.MUTATED_ENDERIUM_CHESTPLATE.get(), "Mutated Enderium Chestplate");
        add(ModItems.MUTATED_ENDERIUM_HELMET.get(), "Mutated Enderium Helmet");
        add(ModItems.MUTATED_ENDERIUM_SWORD.get(), "Mutated Enderium Sword");
        add(ModItems.MUTATED_ENDERIUM_AXE.get(), "Mutated Enderium Axe");
        add(ModItems.MUTATED_ENDERIUM_PICKAXE.get(), "Mutated Enderium Pickaxe");
        add(ModItems.MUTATED_ENDERIUM_SHOVEL.get(), "Mutated Enderium Shovel");
        add(ModItems.MUTATED_ENDERIUM_HOE.get(), "Mutated Enderium Hoe");

        add("itemGroup.tuem.creative_tab", "The Ultimate Ender Mod");
    }
}
