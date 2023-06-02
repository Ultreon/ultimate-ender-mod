package datagen;

import com.ultreon.mods.tuem.UltimateEnderMod;
import com.ultreon.mods.tuem.init.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider {
    public ModRecipesProvider(PackOutput packOutput) {
        super(packOutput);
    }

    private ResourceLocation modLoc(String id) {
        return new ResourceLocation(UltimateEnderMod.MOD_ID, id);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> writer) {
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, ModItems.MUTATED_ENDERIUM_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.MUTATED_ENDERIUM_INGOT.get())
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_INGOT.get()))
                .save(writer);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, ModItems.MUTATED_ENDERIUM_INGOT.get(), 9)
                .requires(ModItems.MUTATED_ENDERIUM_BLOCK.get())
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_block", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_BLOCK.get()))
                .save(writer);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.COMBAT, ModItems.MUTATED_ENDERIUM_SWORD.get())
                .pattern("!")
                .pattern("!")
                .pattern("#")
                .define('!', ModItems.MUTATED_ENDERIUM_INGOT.get())
                .define('#', Items.STICK)
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_INGOT.get()))
                .save(writer);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.TOOLS, ModItems.MUTATED_ENDERIUM_PICKAXE.get())
                .pattern("!!!")
                .pattern(" # ")
                .pattern(" # ")
                .define('!', ModItems.MUTATED_ENDERIUM_INGOT.get())
                .define('#', Items.STICK)
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_INGOT.get()))
                .save(writer);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.TOOLS, ModItems.MUTATED_ENDERIUM_AXE.get())
                .pattern(" !!")
                .pattern(" #!")
                .pattern(" # ")
                .define('!', ModItems.MUTATED_ENDERIUM_INGOT.get())
                .define('#', Items.STICK)
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_INGOT.get()))
                .save(writer, modLoc("axe1"));
        ShapedRecipeBuilder
                .shaped(RecipeCategory.TOOLS, ModItems.MUTATED_ENDERIUM_AXE.get())
                .pattern("!! ")
                .pattern("!# ")
                .pattern(" # ")
                .define('!', ModItems.MUTATED_ENDERIUM_INGOT.get())
                .define('#', Items.STICK)
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_INGOT.get()))
                .save(writer, modLoc("axe2"));
        ShapedRecipeBuilder
                .shaped(RecipeCategory.TOOLS, ModItems.MUTATED_ENDERIUM_SHOVEL.get())
                .pattern("!")
                .pattern("#")
                .pattern("#")
                .define('!', ModItems.MUTATED_ENDERIUM_INGOT.get())
                .define('#', Items.STICK)
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_INGOT.get()))
                .save(writer);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.TOOLS, ModItems.MUTATED_ENDERIUM_HOE.get())
                .pattern(" !!")
                .pattern(" # ")
                .pattern(" # ")
                .define('!', ModItems.MUTATED_ENDERIUM_INGOT.get())
                .define('#', Items.STICK)
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_INGOT.get()))
                .save(writer, modLoc("hoe1"));
        ShapedRecipeBuilder
                .shaped(RecipeCategory.TOOLS, ModItems.MUTATED_ENDERIUM_HOE.get())
                .pattern("!! ")
                .pattern(" # ")
                .pattern(" # ")
                .define('!', ModItems.MUTATED_ENDERIUM_INGOT.get())
                .define('#', Items.STICK)
                .group("mutated_enderium")
                .unlockedBy("get_mutated_enderium_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.MUTATED_ENDERIUM_INGOT.get()))
                .save(writer, modLoc("hoe2"));
    }
}
