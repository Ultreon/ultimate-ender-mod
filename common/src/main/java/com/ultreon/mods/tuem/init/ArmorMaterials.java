package com.ultreon.mods.tuem.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Function;
import java.util.function.Supplier;

public enum ArmorMaterials implements ArmorMaterial {
    MUTATED_ENDERIUM(
            type -> {
                int[] durabilities = {13, 16, 15, 11};
                return durabilities[type.getSlot().getIndex()] * 55;
            },
            type -> {
                int[] slotProtections = {4, 12, 9, 4};
                return slotProtections[type.getSlot().getIndex()];
            },
            22,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ModItems.MUTATED_ENDERIUM_INGOT.get()),
            "mutated_enderium",
            4.5f,
            0.1f
    );

    private final Function<ArmorItem.Type, Integer> durabilityForType;
    private final Function<ArmorItem.Type, Integer> defenseForType;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairIngredient; //This is a supplier because some registry items may not exist when this is loaded
    private final String name;
    private final float toughness, knockbackResistance;

    ArmorMaterials(Function<ArmorItem.Type, Integer> durabilityForType, Function<ArmorItem.Type, Integer> defenseForType, int enchantmentValue, SoundEvent equipSound, Supplier<Ingredient> repairIngredient, String name, float toughness, float knockbackResistance) {
        this.durabilityForType = durabilityForType;
        this.defenseForType = defenseForType;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.repairIngredient = repairIngredient;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return durabilityForType.apply(type);
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return defenseForType.apply(type);
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
