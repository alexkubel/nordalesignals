
package net.mcreator.nordalesignalmod.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.nordalesignalmod.block.BlockStandInObject;
import net.mcreator.nordalesignalmod.ElementsNordalesignalmodMod;

@ElementsNordalesignalmodMod.ModElement.Tag
public class TabNordalianSignals extends ElementsNordalesignalmodMod.ModElement {
	public TabNordalianSignals(ElementsNordalesignalmodMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnordalian_signals") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockStandInObject.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
