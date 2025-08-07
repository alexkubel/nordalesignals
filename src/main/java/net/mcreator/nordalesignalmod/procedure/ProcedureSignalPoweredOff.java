package net.mcreator.nordalesignalmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.nordalesignalmod.block.BlockShuntSignalOn;
import net.mcreator.nordalesignalmod.block.BlockShuntSignalOff;
import net.mcreator.nordalesignalmod.block.BlockSLJRShuntSignalGreen;
import net.mcreator.nordalesignalmod.block.BlockSLJRShuntSignalDanger;
import net.mcreator.nordalesignalmod.block.BlockPointsMotorOn;
import net.mcreator.nordalesignalmod.block.BlockPointsMotorOff;
import net.mcreator.nordalesignalmod.block.BlockLNWRMiniLQDanger;
import net.mcreator.nordalesignalmod.block.BlockLNWRMiniLQClear;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQShuntLoopDanger;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQShuntLoopClear;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQMiniDanger;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQMiniClear;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQGoodsDanger;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQGoodsClear;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQDanger;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQClear;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQCallDanger;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalUQCallClear;
import net.mcreator.nordalesignalmod.ElementsNordalesignalmodMod;

import java.util.Map;

@ElementsNordalesignalmodMod.ModElement.Tag
public class ProcedureSignalPoweredOff extends ElementsNordalesignalmodMod.ModElement {
	public ProcedureSignalPoweredOff(ElementsNordalesignalmodMod instance) {
		super(instance, 21);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SignalPoweredOff!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SignalPoweredOff!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SignalPoweredOff!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SignalPoweredOff!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockShuntSignalOn.block.getDefaultState().getBlock())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("nordalesignalmod:pointsmotor")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockShuntSignalOff.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockSLJRShuntSignalGreen.block.getDefaultState()
				.getBlock())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("nordalesignalmod:pointsmotor")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockSLJRShuntSignalDanger.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockPointsMotorOn.block.getDefaultState()
				.getBlock())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("nordalesignalmod:pointsmotor")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockPointsMotorOff.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockPointsMotorOn.block.getDefaultState()
				.getBlock())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("nordalesignalmod:pointsmotor")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockPointsMotorOff.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLMSSignalUQClear.block.getDefaultState()
				.getBlock())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("block.iron_trapdoor.open")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockLMSSignalUQDanger.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLMSSignalUQCallClear.block.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockLMSSignalUQCallDanger.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("block.iron_trapdoor.open")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLMSSignalUQMiniClear.block.getDefaultState()
				.getBlock())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("block.iron_trapdoor.open")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockLMSSignalUQMiniDanger.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLMSSignalUQGoodsClear.block.getDefaultState()
				.getBlock())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("block.iron_trapdoor.open")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockLMSSignalUQGoodsDanger.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLMSSignalUQShuntLoopClear.block
				.getDefaultState().getBlock())) {
			world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
					.getObject(new ResourceLocation("nordalesignalmod:pointsmotor")), SoundCategory.NEUTRAL, (float) 10, (float) 1);
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockLMSSignalUQShuntLoopDanger.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLNWRMiniLQClear.block.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockLNWRMiniLQDanger.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.lever.click")),
					SoundCategory.NEUTRAL, (float) 10, (float) 1);
		}
	}
}
