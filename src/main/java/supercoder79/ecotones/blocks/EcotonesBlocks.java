package supercoder79.ecotones.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import supercoder79.ecotones.blocks.sapling.EcotonesSaplingBlock;
import supercoder79.ecotones.blocks.sapling.HazelSaplingGenerator;

public class EcotonesBlocks {
    public static Block PEAT_BLOCK;
    public static Block SHORT_GRASS;
    public static Item SHORT_GRASS_ITEM;
    public static Block REEDS;
    public static Block WILDFLOWERS;
    public static Item WILDFLOWERS_ITEM;
    public static Block SMALL_SHRUB;
    public static Item SMALL_SHRUB_ITEM;
    public static Block GEYSER;
    public static Block COCONUT;
    public static Block HAZEL_LEAVES;
    public static Item HAZEL_LEAVES_ITEM;
    public static Block HAZEL_SAPLING;
    public static Item HAZEL_SAPLING_ITEM;
    public static Block SANDY_GRASS;
    public static Item SANDY_GRASS_ITEM;
    public static Block SURFACE_ROCK;
    public static Item SURFACE_ROCK_ITEM;
    public static Block CLOVER;
    public static Item CLOVER_ITEM;
    public static Block PINECONE;
    public static Item PINECONE_ITEM;
    public static Block DRIED_DIRT;
    public static Item DRIED_DIRT_ITEM;
    public static Block BLUEBELL;
    public static Item BLUEBELL_ITEM;
    public static Block WIDE_FERN;
    public static Item WIDE_FERN_ITEM;
    public static Block SMALL_LILAC;
    public static Item  SMALL_LILAC_ITEM;
    public static Block CYAN_ROSE;
    public static Item  CYAN_ROSE_ITEM;

    public static void init() {
        PEAT_BLOCK = Registry.register(Registry.BLOCK, new Identifier("ecotones", "peat"), new Block(FabricBlockSettings.copyOf(Blocks.DIRT).requiresTool().breakByTool(FabricToolTags.SHOVELS).hardness(1f)));
        Registry.register(Registry.ITEM, new Identifier("ecotones", "peat"), new BlockItem(PEAT_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        SHORT_GRASS = Registry.register(Registry.BLOCK, new Identifier("ecotones", "short_grass"), new EcotonesGrassBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        SHORT_GRASS_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "short_grass"), new BlockItem(SHORT_GRASS, new Item.Settings().group(ItemGroup.DECORATIONS)));

        REEDS = Registry.register(Registry.BLOCK, new Identifier("ecotones", "reeds"), new EcotonesGrassBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        Registry.register(Registry.ITEM, new Identifier("ecotones", "reeds"), new BlockItem(REEDS, new Item.Settings().group(ItemGroup.DECORATIONS)));

        WILDFLOWERS = Registry.register(Registry.BLOCK, new Identifier("ecotones", "wildflowers"), new EcotonesGrassBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        WILDFLOWERS_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "wildflowers"), new BlockItem(WILDFLOWERS, new Item.Settings().group(ItemGroup.DECORATIONS)));

        SMALL_SHRUB = Registry.register(Registry.BLOCK, new Identifier("ecotones", "small_shrub"), new EcotonesGrassBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        SMALL_SHRUB_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "small_shrub"), new BlockItem(SMALL_SHRUB, new Item.Settings().group(ItemGroup.DECORATIONS)));

        GEYSER = Registry.register(Registry.BLOCK, new Identifier("ecotones", "geyser"), new GeyserBlock(FabricBlockSettings.of(Material.STONE).strength(2.5F, 8.0F).ticksRandomly()));
        Registry.register(Registry.ITEM, new Identifier("ecotones", "geyser"), new BlockItem(GEYSER, new Item.Settings().group(ItemGroup.DECORATIONS)));

        COCONUT = Registry.register(Registry.BLOCK, new Identifier("ecotones", "coconut"), new CoconutBlock(FabricBlockSettings.of(Material.PLANT).strength(0.2F, 3.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()));
        HAZEL_LEAVES = Registry.register(Registry.BLOCK, new Identifier("ecotones", "hazel_leaves"), new LeavesBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.2F, 0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque()));
        HAZEL_LEAVES_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "hazel_leaves"), new BlockItem(HAZEL_LEAVES, new Item.Settings().group(ItemGroup.DECORATIONS)));

        HAZEL_SAPLING = Registry.register(Registry.BLOCK, new Identifier("ecotones", "hazel_sapling"), new EcotonesSaplingBlock(new HazelSaplingGenerator()));
        HAZEL_SAPLING_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "hazel_sapling"), new BlockItem(HAZEL_SAPLING, new Item.Settings().group(ItemGroup.DECORATIONS)));

        SANDY_GRASS = Registry.register(Registry.BLOCK, new Identifier("ecotones", "sandy_grass"), new EcotonesSandyGrassBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        SANDY_GRASS_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "sandy_grass"), new BlockItem(SANDY_GRASS, new Item.Settings().group(ItemGroup.DECORATIONS)));

        SURFACE_ROCK = Registry.register(Registry.BLOCK, new Identifier("ecotones", "surface_rock"), new SurfaceRockBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.STONE)));
        SURFACE_ROCK_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "surface_rock"), new BlockItem(SURFACE_ROCK, new Item.Settings().group(ItemGroup.DECORATIONS)));

        CLOVER = Registry.register(Registry.BLOCK, new Identifier("ecotones", "clover"), new EcotonesLeafPileBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        CLOVER_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "clover"), new BlockItem(CLOVER, new Item.Settings().group(ItemGroup.DECORATIONS)));

        PINECONE = Registry.register(Registry.BLOCK, new Identifier("ecotones", "pinecone"), new PineconeBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        PINECONE_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "pinecone"), new BlockItem(PINECONE, new Item.Settings().group(ItemGroup.DECORATIONS)));

        DRIED_DIRT = Registry.register(Registry.BLOCK, new Identifier("ecotones", "dried_dirt"), new Block(FabricBlockSettings.copyOf(Blocks.DIRT).requiresTool().breakByTool(FabricToolTags.PICKAXES).hardness(1f)));
        DRIED_DIRT_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "dried_dirt"), new BlockItem(DRIED_DIRT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        BLUEBELL = Registry.register(Registry.BLOCK, new Identifier("ecotones", "bluebell"), new EcotonesGrassBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        BLUEBELL_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "bluebell"), new BlockItem(BLUEBELL, new Item.Settings().group(ItemGroup.DECORATIONS)));

        WIDE_FERN = Registry.register(Registry.BLOCK, new Identifier("ecotones", "wide_fern"), new EcotonesGrassBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        WIDE_FERN_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "wide_fern"), new BlockItem(WIDE_FERN, new Item.Settings().group(ItemGroup.DECORATIONS)));

        SMALL_LILAC = Registry.register(Registry.BLOCK, new Identifier("ecotones", "small_lilac"), new EcotonesGrassBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        SMALL_LILAC_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "small_lilac"), new BlockItem(SMALL_LILAC, new Item.Settings().group(ItemGroup.DECORATIONS)));

        CYAN_ROSE = Registry.register(Registry.BLOCK, new Identifier("ecotones", "cyan_rose"), new CyanRoseBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).nonOpaque().noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)));
        CYAN_ROSE_ITEM = Registry.register(Registry.ITEM, new Identifier("ecotones", "cyan_rose"), new BlockItem(CYAN_ROSE, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}
