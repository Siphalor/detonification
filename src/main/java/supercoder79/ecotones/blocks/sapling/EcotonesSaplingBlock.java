package supercoder79.ecotones.blocks.sapling;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;

public class EcotonesSaplingBlock extends SaplingBlock {
	public EcotonesSaplingBlock(SaplingGenerator generator) {
		super(generator, FabricBlockSettings.of(Material.PLANT).collidable(false).ticksRandomly().hardness(0.0F).sounds(BlockSoundGroup.GRASS));
	}
}
