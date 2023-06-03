package com.ultreon.mods.tuem.init;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ArmorMaterials implements ArmorMaterial {
    ENDERIUM(
            Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.HELMET, 13);
                map.put(ArmorItem.Type.CHESTPLATE, 16);
                map.put(ArmorItem.Type.LEGGINGS, 14);
                map.put(ArmorItem.Type.BOOTS, 11);
            }),
            Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 12);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.BOOTS, 4);
            }),
            22,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.of(ModItems.ENDERIUM_INGOT.get()),
            "enderium",
            3.5f,
            0.1f
    ),
    MUTATED_ENDERIUM(
            Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.HELMET, 13);
                map.put(ArmorItem.Type.CHESTPLATE, 16);
                map.put(ArmorItem.Type.LEGGINGS, 14);
                map.put(ArmorItem.Type.BOOTS, 11);
            }),
            Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 14);
                map.put(ArmorItem.Type.LEGGINGS, 10);
                map.put(ArmorItem.Type.BOOTS, 5);
            }),
            22,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ModItems.MUTATED_ENDERIUM_INGOT.get()),
            "mutated_enderium",
            4f,
            0.25f
    );

    private final EnumMap<ArmorItem.Type, Integer> durabilityForType;
    private final EnumMap<ArmorItem.Type, Integer> defenseForType;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairIngredient; //This is a supplier because some registry items may not exist when this is loaded
    private final String name;
    private final float toughness, knockbackResistance;

    ArmorMaterials(EnumMap<ArmorItem.Type, Integer> durabilityForType, EnumMap<ArmorItem.Type, Integer> defenseForType, int enchantmentValue, SoundEvent equipSound, Supplier<Ingredient> repairIngredient, String name, float toughness, float knockbackResistance) {
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
        return durabilityForType.get(type);
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return defenseForType.get(type);
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
