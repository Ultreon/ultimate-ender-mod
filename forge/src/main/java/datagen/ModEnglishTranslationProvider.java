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
        add(ModBlocks.MUTATED_ENDERIUM_BLOCK.get(), "Mutated Enderium Block");
        add(ModItems.MUTATED_ENDERIUM_INGOT.get(), "Mutated Enderium Ingot");
        add(ModItems.MUTATED_ENDERIUM_BOOTS.get(), "Mutated Enderium Boots");
        add(ModItems.MUTATED_ENDERIUM_LEGGINGS.get(), "Mutated Enderium Leggings");
        add(ModItems.MUTATED_ENDERIUM_CHESTPLATE.get(), "Mutated Enderium Chestplate");
        add(ModItems.MUTATED_ENDERIUM_HELMET.get(), "Mutated Enderium Helmet");
        add("itemGroup.tuem.creative_tab", "The Ultimate Ender Mod");
        add(ModItems.MUTATED_ENDERIUM_SWORD.get(), "Mutated Enderium Sword");
        add(ModItems.MUTATED_ENDERIUM_AXE.get(), "Mutated Enderium Axe");
        add(ModItems.MUTATED_ENDERIUM_PICKAXE.get(), "Mutated Enderium Pickaxe");
        add(ModItems.MUTATED_ENDERIUM_SHOVEL.get(), "Mutated Enderium Shovel");
        add(ModItems.MUTATED_ENDERIUM_HOE.get(), "Mutated Enderium Hoe");
    }
}
