/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorsbutminecraft.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.doorsbutminecraft.item.VitaminsItem;
import net.mcreator.doorsbutminecraft.DoorsButMinecraftMod;

import java.util.function.Function;

public class DoorsButMinecraftModItems {
	public static Item VITAMINS;

	public static void load() {
		VITAMINS = register("vitamins", VitaminsItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DoorsButMinecraftMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}