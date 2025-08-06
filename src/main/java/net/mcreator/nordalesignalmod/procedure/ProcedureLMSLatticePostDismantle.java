package net.mcreator.nordalesignalmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.nordalesignalmod.block.BlockLMSSignalLatticeTopAccessory;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalLatticeTop;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalLatticePostMid;
import net.mcreator.nordalesignalmod.block.BlockLMSSignalLatticeBackplateMid;
import net.mcreator.nordalesignalmod.block.BlockLMSGantryRightLattice;
import net.mcreator.nordalesignalmod.block.BlockLMSGantryRight;
import net.mcreator.nordalesignalmod.block.BlockLMSGantryLeftLattice;
import net.mcreator.nordalesignalmod.block.BlockLMSGantryLeft;
import net.mcreator.nordalesignalmod.block.BlockLMSGantryCentreLattice;
import net.mcreator.nordalesignalmod.block.BlockLMSGantryCentre;
import net.mcreator.nordalesignalmod.ElementsNordalesignalmodMod;

import java.util.Map;

@ElementsNordalesignalmodMod.ModElement.Tag
public class ProcedureLMSLatticePostDismantle extends ElementsNordalesignalmodMod.ModElement {
	public ProcedureLMSLatticePostDismantle(ElementsNordalesignalmodMod instance) {
		super(instance, 59);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LMSLatticePostDismantle!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LMSLatticePostDismantle!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LMSLatticePostDismantle!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LMSLatticePostDismantle!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLMSSignalLatticePostMid.block.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				IBlockState _bs = BlockLMSSignalLatticeTop.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLMSGantryCentreLattice.block
				.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				IBlockState _bs = BlockLMSGantryCentre.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLMSGantryLeftLattice.block
				.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				IBlockState _bs = BlockLMSGantryLeft.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLMSGantryRightLattice.block
				.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				IBlockState _bs = BlockLMSGantryRight.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLMSSignalLatticeBackplateMid.block
				.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				IBlockState _bs = BlockLMSSignalLatticeTopAccessory.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		}
	}
}
