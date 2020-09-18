package supercoder79.ecotones.fix;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import supercoder79.ecotones.Detonification;

import java.util.Optional;
import java.util.stream.IntStream;

public class EcotonesBiomesFix extends DataFix {

	public EcotonesBiomesFix(Schema outputSchema, boolean changesType) {
		super(outputSchema, changesType);
	}


	@Override
	protected TypeRewriteRule makeRule() {
		Type<?> type = getInputSchema().getType(TypeReferences.CHUNK);
		OpticFinder<?> level = type.findField("Level");
		return fixTypeEverywhereTyped("Ecotone biome id fix", type, (typed) -> {
			return typed.updateTyped(level, (typedx) -> {
				return typedx.update(DSL.remainderFinder(), dynamic -> {
					Optional<IntStream> biomes = dynamic.get("Biomes").asIntStreamOpt().result();
					if (!biomes.isPresent()) {
						return dynamic;
					} else {
						Registry<Biome> biomeRegistry = BuiltinRegistries.BIOME;
						return dynamic.set("Biomes", dynamic.createIntList(biomes.get().map(i -> {
							String alt = Detonification.ECOTONES_BIOME_IDS.get(i);
							if (alt != null) {
								return biomeRegistry.getRawId(biomeRegistry.get(Detonification.BIOME_RENAMES.get(alt)));
							}
							return i;
						})));
					}
				});
			});
		});
	}
}
