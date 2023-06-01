package datagen;

import com.ultreon.mods.tuem.init.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;

import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider {
    public ModRecipesProvider(PackOutput packOutput) {
        super(packOutput);
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
    }
}
