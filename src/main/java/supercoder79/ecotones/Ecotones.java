package supercoder79.ecotones;

import net.fabricmc.api.ModInitializer;
import supercoder79.ecotones.blocks.EcotonesBlocks;
import supercoder79.ecotones.client.sound.Sounds;
import supercoder79.ecotones.items.EcotonesItems;

public class Ecotones implements ModInitializer {

	@Override
	public void onInitialize() {
		Sounds.init();

        EcotonesBlocks.init();
		EcotonesItems.init();
	}
}
