package net.mcreator.doorsbutminecraft.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.doorsbutminecraft.procedures.VitaminsPlayerFinishesUsingItemProcedure;

public class VitaminsItem extends Item {
	public VitaminsItem(Item.Properties properties) {
		super(properties.stacksTo(3).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).alwaysEdible().build()));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		VitaminsPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}