package com.nbrichau.vanillaextension.trapdoors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class RedstoneLampTrapdoor extends TrapDoorBlock {

	public static final BooleanProperty LIT = BlockStateProperties.LIT;

	public RedstoneLampTrapdoor(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.FALSE));
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return super.getStateForPlacement(context).setValue(LIT, context.getLevel().hasNeighborSignal(context.getClickedPos()));
	}

	@Override
	public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		super.neighborChanged(state, worldIn, pos, blockIn, fromPos, isMoving);

		if (!worldIn.isClientSide) {
			boolean flag = state.getValue(LIT);
			if (flag != worldIn.hasNeighborSignal(pos)) {
				if (flag) {
					worldIn.getBlockTicks().scheduleTick(pos, this, 4);
				} else {
					worldIn.setBlock(pos, state.cycle(LIT), 2);
				}
			}

		}
	}

	@Override
	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
		if (state.getValue(LIT) && !worldIn.hasNeighborSignal(pos)) {
			worldIn.setBlock(pos, state.cycle(LIT), 2);
		}

	}

	@Override
	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(LIT);
	}
}
