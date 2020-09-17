package supercoder79.ecotones.blocks.sapling;

import net.minecraft.block.Blocks;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import supercoder79.ecotones.blocks.EcotonesBlocks;

import java.util.Random;

public class HazelSaplingGenerator extends SaplingGenerator {
    public static TreeFeatureConfig HAZEL_CONFIG =
            new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()),
                    new SimpleBlockStateProvider(EcotonesBlocks.HAZEL_LEAVES.getDefaultState()),
                    new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 4),
                    new StraightTrunkPlacer(6, 2, 0),
                    new TwoLayersFeatureSize(2, 0, 2))
                    .ignoreVines().build();
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
        return Feature.TREE.configure(HAZEL_CONFIG);
    }
}
