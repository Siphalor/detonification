package supercoder79.ecotones.mixin;

import com.google.common.collect.ImmutableMap;
import net.minecraft.datafixer.fix.BiomesFix;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Map;

@Mixin(BiomesFix.class)
public class MixinBiomesFix {
	@Mutable
	@Shadow @Final public static Map<String, String> RENAMED_BIOMES;

	@Inject(
			method = "<clinit>()V",
			at = @At(
					value = "RETURN"
			),
			locals = LocalCapture.PRINT
	)
	private static void onBuildFixerMap(CallbackInfo callbackInfo) {
		ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.<String, String>builder().putAll(RENAMED_BIOMES);
		putBiomes(mapBuilder, "desert", "desert", "desert_hills", "desert_hills");
		putBiomes(mapBuilder, "scrubland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(mapBuilder, "steppe", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(mapBuilder, "tropical_grassland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(mapBuilder, "lush_savannah", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(mapBuilder, "dry_forest", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(mapBuilder, "lush_forest", "forest", "wooded_hills", "wooded_hills");
		putBiomes(mapBuilder, "tropical_rainforest", "jungle", "jungle_hills", "modified_jungle");

		putBiomes(mapBuilder, "swamp", "swamp", "swamp", "swamp_hills");

		putBiomes(mapBuilder, "cool_desert", "desert", "desert_hills", "desert_hills");
		putBiomes(mapBuilder, "cool_scrubland", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(mapBuilder, "cool_steppe", "savanna", "savanna_plateau", "shattered_savanna");
		putBiomes(mapBuilder, "prairie", "plains", "plains", "plains");
		putBiomes(mapBuilder, "lichen_woodland", "taiga", "taiga_hills", "taiga_mountains");
		putBiomes(mapBuilder, "spruce_forest", "snowy_taiga", "snowy_taiga_hills", "snowy_taiga_mountains");
		putBiomes(mapBuilder, "temperate_forest", "jungle_edge", "jungle_edge", "modified_jungle_edge");

		putBiome(mapBuilder, "beach", "beach");

		putBiome(mapBuilder, "river", "river");

		putBiome(mapBuilder, "volcanic_biome", "plains");
		putBiome(mapBuilder, "supervolcanic_biome", "sunflower_plains");
		putBiome(mapBuilder, "hot_springs", "warm_ocean");
		putBiome(mapBuilder, "blessed_springs", "warm_ocean");

		putBiome(mapBuilder, "oasis", "warm_ocean");
		putBiome(mapBuilder, "the_pits_edge", "stone_shore");
		putBiome(mapBuilder, "the_pits", "stone_shore");
		putBiome(mapBuilder, "green_spires", "swamp_hills");
		putBiome(mapBuilder, "uluru", "badlands_plateau");

		putBiome(mapBuilder, "wateland", "forest");
		putBiome(mapBuilder, "wateland_thicket", "forest");
		putBiome(mapBuilder, "wateland_flats", "forest");
		putBiome(mapBuilder, "wateland_hills", "wooded_hills");
		putBiome(mapBuilder, "wateland_shrub", "forest");
		putBiome(mapBuilder, "wateland_depths", "wooded_hills");

		putBiome(mapBuilder, "hazel_grove", "forest");
		putBiome(mapBuilder, "hazel_grove_clearing", "forest");
		putBiome(mapBuilder, "hazel_grove_hilly", "wooded_hills");
		putBiome(mapBuilder, "hazel_grove_hilly_clearing", "wooded_hills");

		putBiome(mapBuilder, "pine_peaks", "giant_spruce_taiga_hills");

		putBiomes(mapBuilder, "flower_prairie", "sunflower_plains", "flower_forest", "flower_forest");

		putBiome(mapBuilder, "woodland_thicket", "forest");
		putBiome(mapBuilder, "woodland_clearing", "forest");
		putBiome(mapBuilder, "woodland_hilly", "wooded_hills");
		putBiome(mapBuilder, "woodland_clearing_hilly", "wooded_hills");

		putBiome(mapBuilder, "clover_fields", "taiga");
		putBiome(mapBuilder, "clover_thicket", "taiga");
		putBiome(mapBuilder, "clover_flats", "taiga");
		putBiome(mapBuilder, "clover_hills", "taiga_hills");
		putBiome(mapBuilder, "clover_shrubs", "taiga");

		putBiome(mapBuilder, "poplar_forest", "forest");
		putBiome(mapBuilder, "poplar_forest_clearing", "forest");
		putBiome(mapBuilder, "poplar_forest_thicket", "forest");
		putBiome(mapBuilder, "poplar_forest_flats", "forest");
		putBiome(mapBuilder, "poplar_forest_hills", "wooded_hills");
		putBiome(mapBuilder, "poplar_forest_shrubs", "forest");
		putBiome(mapBuilder, "poplar_forest_oak", "forest");
		putBiome(mapBuilder, "poplar_forest_birch", "birch_forest");

		putBiomes(mapBuilder, "temperate_grasslands", "plains", "plains", "plains");

		putBiomes(mapBuilder, "birch_forest", "tall_birch_forest", "tall_birch_forest_hills", "tall_birch_forest_hills");

		putBiome(mapBuilder, "flooded_savannah", "savanna");

		putBiomes(mapBuilder, "dead_spruce_forest", "taiga", "taiga_hills", "taiga_mountains");
		putBiome(mapBuilder, "dead_spruce_forest_clearing", "taiga");

		putBiomes(mapBuilder, "palm_forest", "jungle_edge", "modified_jungle_edge", "modified_jungle_edge");

		putBiomes(mapBuilder, "moor", "swamp", "swamp", "swamp_hills");

		putBiome(mapBuilder, "aspen_foothills", "birch_forest");
		putBiome(mapBuilder, "aspen_foothills_clearing", "birch_forest");
		putBiome(mapBuilder, "aspen_hills", "birch_forest");
		putBiome(mapBuilder, "aspen_mountains", "birch_forest");

		putBiomes(mapBuilder, "lush_desert", "desert", "desert_hills", "desert_hills");

		putBiomes(mapBuilder, "dry_steppe", "savanna", "savanna_plateau", "shattered_savanna");

		putBiomes(mapBuilder, "dry_savanna", "savanna", "savanna_plateau", "shattered_savanna");
		putBiome(mapBuilder, "dry_savanna_thicket", "savanna");

		putBiomes(mapBuilder, "fertile_valley", "forest", "forest", "forest");
		putBiome(mapBuilder, "fertile_valley_clearing", "forest");
		putBiome(mapBuilder, "fertile_valley_thicket", "forest");

		putBiomes(mapBuilder, "bluebell_wood", "forest", "forest", "forest");
		putBiome(mapBuilder, "bluebell_wood_clearing", "forest");
		putBiome(mapBuilder, "bluebell_wood_thicket", "forest");

		putBiomes(mapBuilder, "spruce_marsh", "taiga", "taiga_hills", "taiga_mountains");
		putBiome(mapBuilder, "spruce_marsh_thicket", "giant_spruce_taiga");

		putBiome(mapBuilder, "mangrove_swamp", "swamp");

		putBiome(mapBuilder, "rose_field", "plains");

		RENAMED_BIOMES = mapBuilder.build();
	}

	@Unique
	private static void putBiomes(ImmutableMap.Builder<String, String> mapBuilder, String biome, String alternative, String alternativeHilly, String alternativeMountainous) {
		mapBuilder.put("ecotones:" + biome, "minecraft:" + alternative);
		mapBuilder.put("ecotones:" + biome + "_hilly", "minecraft:" + alternativeHilly);
		mapBuilder.put("ecotones:" + biome + "_mountainous", "minecraft:" + alternativeMountainous);
	}

	@Unique
	private static void putBiome(ImmutableMap.Builder<String, String> mapBuilder, String biome, String alternative) {
		mapBuilder.put("ecotones:" + biome, "minecraft:" + alternative);
	}
}
