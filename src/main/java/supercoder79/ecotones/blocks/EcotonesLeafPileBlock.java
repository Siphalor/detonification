package supercoder79.ecotones.blocks;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class EcotonesLeafPileBlock extends Block {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public EcotonesLeafPileBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState down = world.getBlockState(pos.down());
        return down.isOpaque();
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ePos) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighbor) {
        return state.canPlaceAt(world, pos) ? super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighbor) : Blocks.AIR.getDefaultState();
    }
}
