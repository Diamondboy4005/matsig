package net.diamonddev.matsig.world;

import net.diamonddev.matsig.MaterialsIGuessMod;
import net.diamonddev.matsig.block.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class MatsigOreGen {

    // FEATURES

    // OVERWORLD ORE

    public static final ConfiguredFeature<?,?> ORE_RUBY = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.RUBY_ORE.getDefaultState(), 6)).range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(2), YOffset.fixed(40)))).spreadHorizontally().repeat(6);
    public static final ConfiguredFeature<?,?> ORE_RUBY_DEEPSLATE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState(), 6)).range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(2), YOffset.fixed(40)))).spreadHorizontally().repeat(2);



    // KEYS

    public static void init() {

        System.out.println("Registering Mod Ore Generation for mod " + MaterialsIGuessMod.MOD_ID);


        // OVERWORLD ORE

            // Ruby
                RegistryKey<ConfiguredFeature<?, ?>> oreRuby = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MaterialsIGuessMod.MOD_ID, "ore_ruby"));
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRuby.getValue(), ORE_RUBY);
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRuby);

                RegistryKey<ConfiguredFeature<?, ?>> oreRubyDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(MaterialsIGuessMod.MOD_ID, "ore_ruby_deepslate"));
                Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRubyDeepslate.getValue(), ORE_RUBY_DEEPSLATE);
                BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRubyDeepslate);





            // Orichalcum
            //      Overworld & End Ore

            // Enderism
            //      End Ore


            // Obsidiorite
            //      Nether Ore


    }




}
