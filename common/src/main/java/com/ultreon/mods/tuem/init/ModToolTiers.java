package com.ultreon.mods.tuem.init;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {
    MUTATED_ENDERIUM(5, 4096, 22, 13.5f, 6f, () -> Ingredient.of(ModItems.MUTATED_ENDERIUM_INGOT.get()));

    private final int level, uses, enchantmentValue;
    private final float speed, attackDamage;
    private final Supplier<Ingredient> repairIngredient;

    ModToolTiers(int level, int uses, int enchantmentValue, float speed, float attackDamage, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.enchantmentValue = enchantmentValue;
        this.speed = speed;
        this.attackDamage = attackDamage;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
