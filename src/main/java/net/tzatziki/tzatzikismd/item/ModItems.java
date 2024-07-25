package net.tzatziki.tzatzikismd.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tzatziki.tzatzikismd.TzatzikisMod;

public class ModItems {

    public static final Item WILD_GARLIC = registerItem("wild_garlic", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(WILD_GARLIC);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TzatzikisMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        TzatzikisMod.LOGGER.info("Registering Mod Items for " + TzatzikisMod.MOD_ID + ".");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
