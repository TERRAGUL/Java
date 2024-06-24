package net.ya.mptmod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class NewArmorMaterials implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{11, 16, 15, 13};
    private static final int[] PROTECTION_VALUES = new int[]{2, 5, 3, 1};

    @Override
    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
        return BASE_DURABILITY[equipmentSlot.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
        return PROTECTION_VALUES[equipmentSlot.getIndex()]*7;
    }

    @Override
    public int getEnchantmentValue() {
        return 6;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return "Fl";
    }

    @Override
    public float getToughness() {
        return 7.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.45f;
    }
}