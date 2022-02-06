package net.diamonddev.matsig;

import net.diamonddev.matsig.block.ModBlocks;
import net.diamonddev.matsig.item.ModItems;
import net.diamonddev.matsig.world.MatsigOreGen;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaterialsIGuessMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "matsig";
	public static final Logger LOGGER = LogManager.getLogger("MATSIG");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		MatsigOreGen.init();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		MaterialsIGuessMod.LOGGER.info("\'Materials, I Guess\' is loaded. Have Fun with extra materials!");
	}
}
