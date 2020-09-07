package com.nbrichau.vanillaextension.fences;

import com.nbrichau.vanillaextension.init.FenceInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class PumpkinFence extends FenceBlock {

	public PumpkinFence(Properties properties) {
		super(properties);
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		ItemStack itemstack = player.getHeldItem(handIn);
		if (itemstack.getItem() == Items.SHEARS) {
			if (!worldIn.isRemote) {
				Direction direction = hit.getFace();
				Direction direction1 = direction.getAxis() == Direction.Axis.Y ? player.getHorizontalFacing().getOpposite() : direction;
				worldIn.playSound(null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				worldIn.setBlockState(pos, FenceInit.carved_pumpkin_fence.getDefaultState().with(NORTH, state.get(NORTH)).with(EAST, state.get(EAST)).with(SOUTH, state.get(SOUTH)).with(WEST, state.get(WEST)).with(WATERLOGGED, state.get(WATERLOGGED)), 11);
				ItemEntity itementity = new ItemEntity(worldIn, (double) pos.getX() + 0.5D + (double) direction1.getXOffset() * 0.65D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D + (double) direction1.getZOffset() * 0.65D, new ItemStack(Items.PUMPKIN_SEEDS, 4));
				itementity.setMotion(0.05D * (double) direction1.getXOffset() + worldIn.rand.nextDouble() * 0.02D, 0.05D, 0.05D * (double) direction1.getZOffset() + worldIn.rand.nextDouble() * 0.02D);
				worldIn.addEntity(itementity);
				itemstack.damageItem(1, player, (p_220282_1_) -> {
					p_220282_1_.sendBreakAnimation(handIn);
				});
			}
			return ActionResultType.func_233537_a_(worldIn.isRemote);
		} else {
			return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
		}
	}
}
