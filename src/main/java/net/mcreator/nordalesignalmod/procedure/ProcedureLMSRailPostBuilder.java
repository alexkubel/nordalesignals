package net.mcreator.nordalesignalmod.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.nordalesignalmod.block.BlockLMSRailPostTopBackplate;
import net.mcreator.nordalesignalmod.block.BlockLMSRailPostTop;
import net.mcreator.nordalesignalmod.block.BlockLMSRailPostMidBackplate;
import net.mcreator.nordalesignalmod.block.BlockLMSRailPostMid;
import net.mcreator.nordalesignalmod.ElementsNordalesignalmodMod;

import java.util.Map;

@ElementsNordalesignalmodMod.ModElement.Tag
public class ProcedureLMSRailPostBuilder extends ElementsNordalesignalmodMod.ModElement {
	public ProcedureLMSRailPostBuilder(ElementsNordalesignalmodMod instance) {
		super(instance, 85);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure LMSRailPostBuilder!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure LMSRailPostBuilder!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure LMSRailPostBuilder!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure LMSRailPostBuilder!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("nordalesignalmod:signalplace")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLMSRailPostTop.block.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				IBlockState _bs = BlockLMSRailPostMid.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				world.setBlockState(_bp, _bs, 3);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BlockLMSRailPostTopBackplate.block
				.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				IBlockState _bs = BlockLMSRailPostMidBackplate.block.getDefaultState();
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
