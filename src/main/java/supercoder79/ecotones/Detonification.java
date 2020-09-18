package supercoder79.ecotones;

import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.SimpleRegistry;
import supercoder79.ecotones.blocks.EcotonesBlocks;
import supercoder79.ecotones.client.sound.Sounds;
import supercoder79.ecotones.items.EcotonesItems;

public class Detonification implements ModInitializer {
	public static final String MOD_ID = "detonification";
	public static Int2ObjectMap<String> BIOME_MAP = new Int2ObjectAVLTreeMap<>();
	public static SimpleRegistry<RegistryEntry> BIOME_RENAMES = FabricRegistryBuilder.createSimple(RegistryEntry.class, new Identifier(MOD_ID, "biome_renames"))
			.attribute(RegistryAttribute.PERSISTED)
			.buildAndRegister();

	static {
		createRenames();
	}

	@Override
	public void onInitialize() {
		Sounds.init();

		EcotonesBlocks.init();
		EcotonesItems.init();
	}

	private static void createRenames() {
		putBiomes("desert", "desert", "desert_hills", "desert_hills");
		putBiomes("scrubland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes("steppe", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes("tropical_grassland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes("lush_savannah", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes("dry_forest", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes("lush_forest", "forest", "wooded_hills", "wooded_hills");
		putBiomes("tropical_rainforest", "jungle", "jungle_hills", "modified_jungle");

		putBiomes("swamp", "swamp", "swamp", "swamp_hills");

		putBiomes("cool_desert", "desert", "desert_hills", "desert_hills");
		putBiomes("cool_scrubland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes("cool_steppe", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes("prairie", "plains", "plains", "plains");
		putBiomes("lichen_woodland", "taiga", "taiga_hills", "taiga_mountains");
		putBiomes("spruce_forest", "snowy_taiga", "snowy_taiga_hills", "snowy_taiga_mountains");
		putBiomes("temperate_forest", "jungle_edge", "jungle_edge", "modified_jungle_edge");

		putBiome("beach", "beach");

		putBiome("river", "river");

		putBiome("volcanic_biome", "plains");
		putBiome("supervolcanic_biome", "sunflower_plains");
		putBiome("hot_springs", "warm_ocean");
		putBiome("blessed_springs", "warm_ocean");

		putBiome("oasis", "warm_ocean");
		putBiome("the_pits_edge", "stone_shore");
		putBiome("the_pits", "stone_shore");
		putBiome("green_spires", "swamp_hills");
		putBiome("uluru", "badlands_plateau");

		putBiome("wateland", "forest");
		putBiome("wateland_thicket", "forest");
		putBiome("wateland_flats", "forest");
		putBiome("wateland_hills", "wooded_hills");
		putBiome("wateland_shrub", "forest");
		putBiome("wateland_depths", "wooded_hills");

		putBiome("hazel_grove", "forest");
		putBiome("hazel_grove_clearing", "forest");
		putBiome("hazel_grove_hilly", "wooded_hills");
		putBiome("hazel_grove_hilly_clearing", "wooded_hills");

		putBiome("pine_peaks", "giant_spruce_taiga_hills");

		putBiomes("flower_prairie", "flower_forest", "flower_forest", "flower_forest");

		putBiome("woodland_thicket", "forest");
		putBiome("woodland_clearing", "forest");
		putBiome("woodland_hilly", "wooded_hills");
		putBiome("woodland_clearing_hilly", "wooded_hills");

		putBiome("clover_fields", "taiga");
		putBiome("clover_thicket", "taiga");
		putBiome("clover_flats", "taiga");
		putBiome("clover_hills", "taiga_hills");
		putBiome("clover_shrubs", "taiga");

		putBiome("poplar_forest", "forest");
		putBiome("poplar_forest_clearing", "forest");
		putBiome("poplar_forest_thicket", "forest");
		putBiome("poplar_forest_flats", "forest");
		putBiome("poplar_forest_hills", "wooded_hills");
		putBiome("poplar_forest_shrubs", "forest");
		putBiome("poplar_forest_oak", "forest");
		putBiome("poplar_forest_birch", "birch_forest");

		putBiomes("temperate_grasslands", "plains", "plains", "plains");

		putBiomes("birch_forest", "tall_birch_forest", "tall_birch_forest_hills", "tall_birch_forest_hills");

		putBiome("flooded_savannah", "savanna");

		putBiomes("dead_spruce_forest", "taiga", "taiga_hills", "taiga_mountains");
		putBiome("dead_spruce_forest_clearing", "taiga");

		putBiomes("palm_forest", "jungle_edge", "modified_jungle_edge", "modified_jungle_edge");

		putBiomes("moor", "swamp", "swamp", "swamp_hills");

		putBiome("aspen_foothills", "birch_forest");
		putBiome("aspen_foothills_clearing", "birch_forest");
		putBiome("aspen_hills", "birch_forest");
		putBiome("aspen_mountains", "birch_forest");

		putBiomes("lush_desert", "desert", "desert_hills", "desert_hills");

		putBiomes("dry_steppe", "savanna", "savanna_plateau", "shattered_savanna");

		putBiomes("dry_savanna", "savanna", "savanna_plateau", "shattered_savanna");
		putBiome("dry_savanna_thicket", "savanna");

		putBiomes("fertile_valley", "forest", "forest", "forest");
		putBiome("fertile_valley_clearing", "forest");
		putBiome("fertile_valley_thicket", "forest");

		putBiomes("bluebell_wood", "forest", "forest", "forest");
		putBiome("bluebell_wood_clearing", "forest");
		putBiome("bluebell_wood_thicket", "forest");

		putBiomes("spruce_marsh", "taiga", "taiga_hills", "taiga_mountains");
		putBiome("spruce_marsh_thicket", "giant_spruce_taiga");

		putBiome("mangrove_swamp", "swamp");

		putBiome("rose_field", "plains");
	}

	private static void putBiomes(String biome, String alternative, String alternativeHilly, String alternativeMountainous) {
		putBiome(biome, alternative);
		putBiome(biome + "_hilly", alternativeHilly);
		putBiome(biome + "_mountainous", alternativeMountainous);
	}

	private static void putBiome(String biome, String alternative) {
		Registry.register(BIOME_RENAMES, new Identifier("ecotones", biome), new RegistryEntry(new Identifier("minecraft", alternative)));
	}

	public static class RegistryEntry {
		public final Identifier identifier;

		public RegistryEntry(Identifier identifier) {
			this.identifier = identifier;
		}
	}
}
