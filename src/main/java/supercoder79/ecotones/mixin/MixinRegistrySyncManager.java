package supercoder79.ecotones.mixin;

import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry;
import net.minecraft.nbt.CompoundTag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import supercoder79.ecotones.Detonification;

@Mixin(
		value = RegistrySyncManager.class,
		remap = false
)
public class MixinRegistrySyncManager {
	@Inject(
			method = "apply",
			at = @At(
					value = "RETURN"
			)
	)
	private static void onApplied(CompoundTag tag, RemappableRegistry.RemapMode remapMode, CallbackInfoReturnable<CompoundTag> callbackInfoReturnable) {
		CompoundTag mainTag = tag.getCompound("registries");

		if (mainTag.contains("minecraft:biome", 10)) {
			CompoundTag biomes = mainTag.getCompound("minecraft:biome");

			for (String id : biomes.getKeys()) {
				if (id.startsWith("ecotones:")) {
					Detonification.ECOTONES_BIOME_IDS.put(biomes.getInt(id), id);
				}
			}
		}
	}
}
