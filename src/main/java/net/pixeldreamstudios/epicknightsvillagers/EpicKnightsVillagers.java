package net.pixeldreamstudios.epicknightsvillagers;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EpicKnightsVillagers implements ModInitializer {
	public static final String MOD_ID = "epicknightsvillagers";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello from " + MOD_ID + "!");
		LOGGER.info("Loading EpicKnightsVillagers data pack for " + MOD_ID);
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			ResourceManagerHelper.registerBuiltinResourcePack(
					ResourceLocation.fromNamespaceAndPath(MOD_ID,"knightllagers"),
					modContainer,
					ResourcePackActivationType.ALWAYS_ENABLED
			);
		});
	}}
