package supercoder79.ecotones;

import com.google.common.collect.ImmutableMap;
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

import java.util.Map;

public class Detonification implements ModInitializer {
	public static final String MOD_ID = "detonification";
	public static Int2ObjectMap<String> ECOTONES_BIOME_IDS = new Int2ObjectAVLTreeMap<>();
	public static Map<String, Identifier> BIOME_RENAMES = createRenames();

	static {
		createRenames();
	}

	@Override
	public void onInitialize() {
		Sounds.init();

		EcotonesBlocks.init();
		EcotonesItems.init();
	}

	private static Map<String, Identifier> createRenames() {
		ImmutableMap.Builder<String, Identifier> builder = ImmutableMap.builder();

		putBiomes(builder, "desert", "desert", "desert_hills", "desert_hills");
		putBiomes(builder, "scrubland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(builder, "steppe", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(builder, "tropical_grassland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(builder, "lush_savannah", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(builder, "dry_forest", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(builder, "lush_forest", "forest", "wooded_hills", "wooded_hills");
		putBiomes(builder, "tropical_rainforest", "jungle", "jungle_hills", "modified_jungle");

		putBiomes(builder, "swamp", "swamp", "swamp", "swamp_hills");

		putBiomes(builder, "cool_desert", "desert", "desert_hills", "desert_hills");
		putBiomes(builder, "cool_scrubland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(builder, "cool_steppe", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(builder, "prairie", "plains", "plains", "plains");
		putBiomes(builder, "lichen_woodland", "taiga", "taiga_hills", "taiga_mountains");
		putBiomes(builder, "spruce_forest", "snowy_taiga", "snowy_taiga_hills", "snowy_taiga_mountains");
		putBiomes(builder, "temperate_forest", "jungle_edge", "jungle_edge", "modified_jungle_edge");

		putBiome(builder, "beach", "beach");

		putBiome(builder, "river", "river");

		putBiome(builder, "volcanic_biome", "plains");
		putBiome(builder, "supervolcanic_biome", "sunflower_plains");
		putBiome(builder, "hot_springs", "warm_ocean");
		putBiome(builder, "blessed_springs", "warm_ocean");

		putBiome(builder, "oasis", "warm_ocean");
		putBiome(builder, "the_pits_edge", "stone_shore");
		putBiome(builder, "the_pits", "stone_shore");
		putBiome(builder, "green_spires", "swamp_hills");
		putBiome(builder, "uluru", "badlands_plateau");

		putBiome(builder, "wateland", "forest");
		putBiome(builder, "wateland_thicket", "forest");
		putBiome(builder, "wateland_flats", "forest");
		putBiome(builder, "wateland_hills", "wooded_hills");
		putBiome(builder, "wateland_shrub", "forest");
		putBiome(builder, "wateland_depths", "wooded_hills");

		putBiome(builder, "hazel_grove", "forest");
		putBiome(builder, "hazel_grove_clearing", "forest");
		putBiome(builder, "hazel_grove_hilly", "wooded_hills");
		putBiome(builder, "hazel_grove_hilly_clearing", "wooded_hills");

		putBiome(builder, "pine_peaks", "giant_spruce_taiga_hills");

		putBiomes(builder, "flower_prairie", "flower_forest", "flower_forest", "flower_forest");

		putBiome(builder, "woodland_thicket", "forest");
		putBiome(builder, "woodland_clearing", "forest");
		putBiome(builder, "woodland_hilly", "wooded_hills");
		putBiome(builder, "woodland_clearing_hilly", "wooded_hills");

		putBiome(builder, "clover_fields", "taiga");
		putBiome(builder, "clover_thicket", "taiga");
		putBiome(builder, "clover_flats", "taiga");
		putBiome(builder, "clover_hills", "taiga_hills");
		putBiome(builder, "clover_shrubs", "taiga");

		putBiome(builder, "poplar_forest", "forest");
		putBiome(builder, "poplar_forest_clearing", "forest");
		putBiome(builder, "poplar_forest_thicket", "forest");
		putBiome(builder, "poplar_forest_flats", "forest");
		putBiome(builder, "poplar_forest_hills", "wooded_hills");
		putBiome(builder, "poplar_forest_shrubs", "forest");
		putBiome(builder, "poplar_forest_oak", "forest");
		putBiome(builder, "poplar_forest_birch", "birch_forest");

		putBiomes(builder, "temperate_grasslands", "plains", "plains", "plains");

		putBiomes(builder, "birch_forest", "tall_birch_forest", "tall_birch_forest_hills", "tall_birch_forest_hills");

		putBiome(builder, "flooded_savannah", "savanna");

		putBiomes(builder, "dead_spruce_forest", "taiga", "taiga_hills", "taiga_mountains");
		putBiome(builder, "dead_spruce_forest_clearing", "taiga");

		putBiomes(builder, "palm_forest", "jungle_edge", "modified_jungle_edge", "modified_jungle_edge");

		putBiomes(builder, "moor", "swamp", "swamp", "swamp_hills");

		putBiome(builder, "aspen_foothills", "birch_forest");
		putBiome(builder, "aspen_foothills_clearing", "birch_forest");
		putBiome(builder, "aspen_hills", "birch_forest");
		putBiome(builder, "aspen_mountains", "birch_forest");

		putBiomes(builder, "lush_desert", "desert", "desert_hills", "desert_hills");

		putBiomes(builder, "dry_steppe", "savanna", "savanna_plateau", "shattered_savanna");

		putBiomes(builder, "dry_savanna", "savanna", "savanna_plateau", "shattered_savanna");
		putBiome(builder, "dry_savanna_thicket", "savanna");

		putBiomes(builder, "fertile_valley", "forest", "forest", "forest");
		putBiome(builder, "fertile_valley_clearing", "forest");
		putBiome(builder, "fertile_valley_thicket", "forest");

		putBiomes(builder, "bluebell_wood", "forest", "forest", "forest");
		putBiome(builder, "bluebell_wood_clearing", "forest");
		putBiome(builder, "bluebell_wood_thicket", "forest");

		putBiomes(builder, "spruce_marsh", "taiga", "taiga_hills", "taiga_mountains");
		putBiome(builder, "spruce_marsh_thicket", "giant_spruce_taiga");

		putBiome(builder, "mangrove_swamp", "swamp");

		putBiome(builder, "rose_field", "plains");

		return builder.build();
	}

	private static void putBiomes(ImmutableMap.Builder<String, Identifier> builder, String biome, String alternative, String alternativeHilly, String alternativeMountainous) {
		putBiome(builder, biome, alternative);
		putBiome(builder, biome + "_hilly", alternativeHilly);
		putBiome(builder, biome + "_mountainous", alternativeMountainous);
	}

	private static void putBiome(ImmutableMap.Builder<String, Identifier> builder, String biome, String alternative) {
		builder.put("ecotones:" + biome, new Identifier("minecraft", alternative));
	}

	public static class RegistryEntry {
		public final Identifier identifier;

		public RegistryEntry(Identifier identifier) {
			this.identifier = identifier;
		}
	}
}
