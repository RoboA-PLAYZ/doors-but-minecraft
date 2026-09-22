/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doorsbutminecraft.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class DoorsButMinecraftModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(tabData -> {
			tabData.accept(DoorsButMinecraftModItems.VITAMINS);
		});
	}
}