package com.nbrichau.vanillaextension.walls;

import com.nbrichau.vanillaextension.init.WallInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class CoarseDirtWall extends WallBlock {
	public CoarseDirtWall(Properties properties) {
		super(properties);
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if (!worldIn.isRemote()) {
			if (player.getHeldItem(handIn).getToolTypes().contains(ToolType.HOE)) {
				BlockState bs = WallInit.dirt_wall.getDefaultState().with(UP, state.get(UP)).with(WALL_HEIGHT_NORTH, state.get(WALL_HEIGHT_NORTH)).with(WALL_HEIGHT_EAST, state.get(WALL_HEIGHT_EAST)).with(WALL_HEIGHT_SOUTH, state.get(WALL_HEIGHT_SOUTH)).with(WALL_HEIGHT_WEST, state.get(WALL_HEIGHT_WEST)).with(WATERLOGGED, state.get(WATERLOGGED));
				worldIn.setBlockState(pos, bs, 11);
				worldIn.playSound(null,pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F,1.0F);
				player.getHeldItem(handIn).damageItem(1, player, item->item.sendBreakAnimation(handIn));
				return ActionResultType.SUCCESS;
			}
		}
		return ActionResultType.PASS;
	}
}
