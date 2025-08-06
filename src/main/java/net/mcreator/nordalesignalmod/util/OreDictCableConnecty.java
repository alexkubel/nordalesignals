
package net.mcreator.nordalesignalmod.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.nordalesignalmod.block.BlockShuntSignalOn;
import net.mcreator.nordalesignalmod.block.BlockShuntSignalOff;
import net.mcreator.nordalesignalmod.block.BlockSLJRShuntSignalGreen;
import net.mcreator.nordalesignalmod.block.BlockSLJRShuntSignalDanger;
import net.mcreator.nordalesignalmod.block.BlockPointsMotorOn;
import net.mcreator.nordalesignalmod.block.BlockPointsMotorOff;
import net.mcreator.nordalesignalmod.block.BlockPointsLeverOn;
import net.mcreator.nordalesignalmod.block.BlockPointsLeverOff;
import net.mcreator.nordalesignalmod.ElementsNordalesignalmodMod;

@ElementsNordalesignalmodMod.ModElement.Tag
public class OreDictCableConnecty extends ElementsNordalesignalmodMod.ModElement {
	public OreDictCableConnecty(ElementsNordalesignalmodMod instance) {
		super(instance, 5);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockShuntSignalOff.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockShuntSignalOn.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsMotorOff.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsMotorOn.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockShuntSignalOff.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockShuntSignalOn.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsMotorOff.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsMotorOn.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsLeverOff.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsLeverOn.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockSLJRShuntSignalDanger.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockSLJRShuntSignalGreen.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockShuntSignalOn.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsMotorOff.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsMotorOn.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsLeverOff.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockPointsLeverOn.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockSLJRShuntSignalDanger.block, (int) (1)));
		OreDictionary.registerOre("cable_connecty", new ItemStack(BlockSLJRShuntSignalGreen.block, (int) (1)));
	}
}
