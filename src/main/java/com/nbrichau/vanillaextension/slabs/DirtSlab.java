package com.nbrichau.vanillaextension.slabs;

import com.nbrichau.vanillaextension.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.function.Supplier;

public class DirtSlab extends SlabBlock {
	public DirtSlab(Properties properties) {
		super(properties);
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if (!worldIn.isRemote()) {
			if (player.getHeldItem(handIn).getToolTypes().contains(ToolType.HOE)) {
				BlockState bs = BlockInit.farmland_slab.getDefaultState().with(TYPE, state.get(TYPE)).with(WATERLOGGED, state.get(WATERLOGGED));
				worldIn.setBlockState(pos, bs);
				worldIn.playSound(null,pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F,1.0F);
				player.getHeldItem(handIn).damageItem(1, player, item->item.sendBreakAnimation(handIn));
				return ActionResultType.SUCCESS;
			}
		}
		return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
	}
}