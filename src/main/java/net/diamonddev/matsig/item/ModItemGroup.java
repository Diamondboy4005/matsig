package net.diamonddev.matsig.item;

import net.diamonddev.matsig.MaterialsIGuessMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup MATSIG_MATS = FabricItemGroupBuilder.build(new Identifier(MaterialsIGuessMod.MOD_ID,
            "matsig_mats"), () -> new ItemStack(ModItems.RUBY));

    public static final ItemGroup MATSIG_TOOLS = FabricItemGroupBuilder.build(new Identifier(MaterialsIGuessMod.MOD_ID,
            "matsig_tools"), () -> new ItemStack(ModItems.RUBY_SWORD));

    public static final ItemGroup MATSIG_ARMOR = FabricItemGroupBuilder.build(new Identifier(MaterialsIGuessMod.MOD_ID,
            "matsig_armor"), () -> new ItemStack(ModItems.RUBY_CHESTPLATE));

}
