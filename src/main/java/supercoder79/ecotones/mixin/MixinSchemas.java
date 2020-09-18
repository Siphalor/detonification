package supercoder79.ecotones.mixin;

import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import net.minecraft.datafixer.Schemas;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import supercoder79.ecotones.fix.EcotonesBiomesFix;

import java.util.function.BiFunction;

@Mixin(Schemas.class)
public class MixinSchemas {
	@Shadow @Final private static BiFunction<Integer, Schema, Schema> EMPTY_IDENTIFIER_NORMALIZE;

	@Inject(method = "build", at = @At("RETURN"))
	private static void onBuild(DataFixerBuilder dataFixerBuilder, CallbackInfo callbackInfo) {
		Schema schema = dataFixerBuilder.addSchema(2568, 1, EMPTY_IDENTIFIER_NORMALIZE);
		dataFixerBuilder.addFixer(new EcotonesBiomesFix(schema, false));
	}
}
