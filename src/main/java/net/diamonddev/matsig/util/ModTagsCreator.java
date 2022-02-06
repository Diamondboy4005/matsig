package net.diamonddev.matsig.util;

import net.diamonddev.matsig.MaterialsIGuessMod;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTagsCreator {

    public static class Blocks {


        private static Tag<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(MaterialsIGuessMod.MOD_ID, name));
        }

        private static Tag<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }
    }


    public static class Items {

        public static final Tag<Item> GEMS = createCommonTag("gems");
        public static final Tag<Item> RUBIES = createCommonTag("rubies");


            private static Tag<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(MaterialsIGuessMod.MOD_ID, name));
        }

        private static Tag<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }
    }
}
