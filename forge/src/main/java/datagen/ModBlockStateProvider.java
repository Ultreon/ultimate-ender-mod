package datagen;

import com.ultreon.mods.tuem.UltimateEnderMod;
import com.ultreon.mods.tuem.init.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, UltimateEnderMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.ENDERIUM_BLOCK.get(), models().cubeAll("enderium_block", modLoc("block/enderium_block")));
        simpleBlockWithItem(ModBlocks.MUTATED_ENDERIUM_BLOCK.get(), models().cubeAll("mutated_enderium_block", modLoc("block/mutated_enderium_block")));
    }
}
