package net.diamonddev.matsig.item;

import net.diamonddev.matsig.MaterialsIGuessMod;
import net.diamonddev.matsig.item.custom.ModAxeItem;
import net.diamonddev.matsig.item.custom.ModHoeItem;
import net.diamonddev.matsig.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.MATSIG_MATS)));

    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroup.MATSIG_MATS)));

    public static final Item ORICHALCUM = registerItem("orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroup.MATSIG_MATS)));

    public static final Item ENDERISM = registerItem("enderism",
            new Item(new FabricItemSettings().group(ModItemGroup.MATSIG_MATS)));

    public static  final Item RAW_TURMARINE_ALLOY = registerItem("raw_turmarine_alloy",
            new Item(new FabricItemSettings().group(ModItemGroup.MATSIG_MATS)));

    public static final Item TURMARINE = registerItem("turmarine",
            new Item(new FabricItemSettings().group(ModItemGroup.MATSIG_MATS)));

    public static final Item OBSIDIORITE = registerItem("obsidiorite",
            new Item(new FabricItemSettings().group(ModItemGroup.MATSIG_MATS)));



    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 3, -2f,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_TOOLS)));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 0, -1f,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_TOOLS)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterial.RUBY, 2, -1f,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_TOOLS)));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModAxeItem(ModToolMaterial.RUBY, 5, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_TOOLS)));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoeItem(ModToolMaterial.RUBY, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_TOOLS)));



    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_ARMOR)));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_ARMOR)));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_ARMOR)));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MATSIG_ARMOR)));







    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MaterialsIGuessMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MaterialsIGuessMod.MOD_ID);
    }
}
