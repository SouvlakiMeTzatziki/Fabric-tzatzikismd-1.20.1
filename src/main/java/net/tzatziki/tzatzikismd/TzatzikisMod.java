package net.tzatziki.tzatzikismd;

import net.fabricmc.api.ModInitializer;

import net.tzatziki.tzatzikismd.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TzatzikisMod implements ModInitializer {
    public static final String MOD_ID = "tzatzikismd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}