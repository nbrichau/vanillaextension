package com.nbrichau.vanillaextension;

import com.nbrichau.vanillaextension.init.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("vanillaextension")
public class VanillaExtension {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "vanillaextension";

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

	public VanillaExtension() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::doClientStuff);
		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(StairsInit.grass_block_stairs.get(), RenderType.cutoutMipped());
		RenderTypeLookup.setRenderLayer(StairsInit.oak_leaves_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.spruce_leaves_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.birch_leaves_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.jungle_leaves_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.acacia_leaves_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.dark_oak_leaves_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.spawner_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.ice_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.soul_sand_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.white_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.orange_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.magenta_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.light_blue_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.yellow_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.lime_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.pink_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.gray_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.light_gray_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.cyan_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.purple_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.blue_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.brown_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.green_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.red_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.black_stained_glass_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.oak_trapdoor_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.spruce_trapdoor_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.birch_trapdoor_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.jungle_trapdoor_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.acacia_trapdoor_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.dark_oak_trapdoor_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.iron_bars_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.vine_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.slime_block_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.iron_trapdoor_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.sea_lantern_stairs.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(StairsInit.honey_block_stairs.get(), RenderType.translucent());

		RenderTypeLookup.setRenderLayer(SlabInit.grass_block_slab.get(), RenderType.cutoutMipped());
		RenderTypeLookup.setRenderLayer(SlabInit.oak_leaves_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.spruce_leaves_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.birch_leaves_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.jungle_leaves_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.acacia_leaves_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.dark_oak_leaves_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.spawner_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.ice_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.soul_sand_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.white_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.orange_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.magenta_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.light_blue_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.yellow_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.lime_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.pink_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.gray_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.light_gray_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.cyan_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.purple_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.blue_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.brown_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.green_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.red_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.black_stained_glass_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.oak_trapdoor_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.spruce_trapdoor_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.birch_trapdoor_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.jungle_trapdoor_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.acacia_trapdoor_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.dark_oak_trapdoor_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.iron_bars_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.vine_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.slime_block_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.iron_trapdoor_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.sea_lantern_slab.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(SlabInit.honey_block_slab.get(), RenderType.translucent());

		RenderTypeLookup.setRenderLayer(FenceInit.grass_block_fence.get(), RenderType.cutoutMipped());
		RenderTypeLookup.setRenderLayer(FenceInit.oak_leaves_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.spruce_leaves_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.birch_leaves_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.jungle_leaves_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.acacia_leaves_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.dark_oak_leaves_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.spawner_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.ice_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.soul_sand_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.white_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.orange_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.magenta_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.light_blue_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.yellow_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.lime_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.pink_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.gray_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.light_gray_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.cyan_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.purple_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.blue_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.brown_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.green_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.red_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.black_stained_glass_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.oak_trapdoor_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.spruce_trapdoor_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.birch_trapdoor_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.jungle_trapdoor_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.acacia_trapdoor_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.dark_oak_trapdoor_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.iron_bars_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.vine_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.slime_block_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.iron_trapdoor_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.sea_lantern_fence.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(FenceInit.honey_block_fence.get(), RenderType.translucent());

		RenderTypeLookup.setRenderLayer(WallInit.grass_block_wall.get(), RenderType.cutoutMipped());
		RenderTypeLookup.setRenderLayer(WallInit.oak_leaves_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.spruce_leaves_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.birch_leaves_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.jungle_leaves_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.acacia_leaves_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.dark_oak_leaves_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.spawner_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.ice_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.soul_sand_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.white_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.orange_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.magenta_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.light_blue_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.yellow_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.lime_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.pink_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.gray_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.light_gray_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.cyan_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.purple_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.blue_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.brown_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.green_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.red_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.black_stained_glass_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.oak_trapdoor_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.spruce_trapdoor_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.birch_trapdoor_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.jungle_trapdoor_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.acacia_trapdoor_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.dark_oak_trapdoor_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.iron_bars_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.vine_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.slime_block_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.iron_trapdoor_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.sea_lantern_wall.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(WallInit.honey_block_wall.get(), RenderType.translucent());

		RenderTypeLookup.setRenderLayer(TrapdoorInit.grass_block_trapdoor.get(), RenderType.cutoutMipped());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.oak_leaves_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.spruce_leaves_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.birch_leaves_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.jungle_leaves_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.acacia_leaves_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.dark_oak_leaves_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.spawner_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.ice_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.soul_sand_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.white_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.orange_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.magenta_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.light_blue_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.yellow_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.lime_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.pink_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.gray_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.light_gray_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.cyan_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.purple_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.blue_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.brown_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.green_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.red_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.black_stained_glass_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.iron_bars_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.vine_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.slime_block_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.sea_lantern_trapdoor.get(), RenderType.translucent());
		RenderTypeLookup.setRenderLayer(TrapdoorInit.honey_block_trapdoor.get(), RenderType.translucent());

		Minecraft.getInstance().getBlockColors().register((a, r, g, b) -> r != null && g != null ? BiomeColors.getAverageGrassColor(r, g) : GrassColors.get(0.5D, 1.0D), StairsInit.grass_block_stairs.get(), SlabInit.grass_block_slab.get(), FenceInit.grass_block_fence.get(), WallInit.grass_block_wall.get(), TrapdoorInit.grass_block_trapdoor.get());
		Minecraft.getInstance().getBlockColors().register((a, r, g, b) -> FoliageColors.getEvergreenColor(), StairsInit.spruce_leaves_stairs.get(), SlabInit.spruce_leaves_slab.get(), FenceInit.spruce_leaves_fence.get(), WallInit.spruce_leaves_wall.get(), TrapdoorInit.spruce_leaves_trapdoor.get());
		Minecraft.getInstance().getBlockColors().register((a, r, g, b) -> FoliageColors.getBirchColor(), StairsInit.birch_leaves_stairs.get(), SlabInit.birch_leaves_slab.get(), FenceInit.birch_leaves_fence.get(), WallInit.birch_leaves_wall.get(), TrapdoorInit.birch_leaves_trapdoor.get());
		Minecraft.getInstance().getBlockColors().register((a, r, g, b) -> r != null && g != null ? BiomeColors.getAverageFoliageColor(r, g) : FoliageColors.getDefaultColor(), StairsInit.oak_leaves_stairs.get(), SlabInit.oak_leaves_slab.get(), FenceInit.oak_leaves_fence.get(), WallInit.oak_leaves_wall.get(), TrapdoorInit.oak_leaves_trapdoor.get(),
				StairsInit.jungle_leaves_stairs.get(), SlabInit.jungle_leaves_slab.get(), FenceInit.jungle_leaves_fence.get(), WallInit.jungle_leaves_wall.get(), TrapdoorInit.jungle_leaves_trapdoor.get(),
				StairsInit.acacia_leaves_stairs.get(), SlabInit.acacia_leaves_slab.get(), FenceInit.acacia_leaves_fence.get(), WallInit.acacia_leaves_wall.get(), TrapdoorInit.acacia_leaves_trapdoor.get(),
				StairsInit.dark_oak_leaves_stairs.get(), SlabInit.dark_oak_leaves_slab.get(), FenceInit.dark_oak_leaves_fence.get(), WallInit.dark_oak_leaves_wall.get(), TrapdoorInit.dark_oak_leaves_trapdoor.get(),
				StairsInit.vine_stairs.get(), SlabInit.vine_slab.get(), FenceInit.vine_fence.get(), WallInit.vine_wall.get(), TrapdoorInit.vine_trapdoor.get());

		Minecraft.getInstance().getItemColors().register((blockItem, tintIndexIn) -> {
					BlockState blockstate = ((BlockItem) blockItem.getItem()).getBlock().defaultBlockState();
					return Minecraft.getInstance().getBlockColors().getColor(blockstate, null, null, tintIndexIn);
				}, StairsInit.grass_block_stairs.get(), SlabInit.grass_block_slab.get(), FenceInit.grass_block_fence.get(), WallInit.grass_block_wall.get(), TrapdoorInit.grass_block_trapdoor.get(),
				StairsInit.vine_stairs.get(), SlabInit.vine_slab.get(), FenceInit.vine_fence.get(), WallInit.vine_wall.get(), TrapdoorInit.vine_trapdoor.get(),
				StairsInit.oak_leaves_stairs.get(), SlabInit.oak_leaves_slab.get(), FenceInit.oak_leaves_fence.get(), WallInit.oak_leaves_wall.get(), TrapdoorInit.oak_leaves_trapdoor.get(),
				StairsInit.spruce_leaves_stairs.get(), SlabInit.spruce_leaves_slab.get(), FenceInit.spruce_leaves_fence.get(), WallInit.spruce_leaves_wall.get(), TrapdoorInit.spruce_leaves_trapdoor.get(),
				StairsInit.birch_leaves_stairs.get(), SlabInit.birch_leaves_slab.get(), FenceInit.birch_leaves_fence.get(), WallInit.birch_leaves_wall.get(), TrapdoorInit.birch_leaves_trapdoor.get(),
				StairsInit.jungle_leaves_stairs.get(), SlabInit.jungle_leaves_slab.get(), FenceInit.jungle_leaves_fence.get(), WallInit.jungle_leaves_wall.get(), TrapdoorInit.jungle_leaves_trapdoor.get(),
				StairsInit.acacia_leaves_stairs.get(), SlabInit.acacia_leaves_slab.get(), FenceInit.acacia_leaves_fence.get(), WallInit.acacia_leaves_wall.get(), TrapdoorInit.acacia_leaves_trapdoor.get(),
				StairsInit.dark_oak_leaves_stairs.get(), SlabInit.dark_oak_leaves_slab.get(), FenceInit.dark_oak_leaves_fence.get(), WallInit.dark_oak_leaves_wall.get(), TrapdoorInit.dark_oak_leaves_trapdoor.get());

	}

	public static class VanillaExtensionItemGroup extends ItemGroup {
		public static final VanillaExtensionItemGroup instance = new VanillaExtensionItemGroup(ItemGroup.TABS.length, "vanillaextensiontab");

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Blocks.STRUCTURE_BLOCK);
		}

		private VanillaExtensionItemGroup(int index, String label) {
			super(index, label);
		}
	}
}
