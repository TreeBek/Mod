package Mod.Harwood.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import Mod.Harwood.*;
import Mod.Harwood.Common.Common;

public class BlockHardenedWood extends BlockIconRegister{
	
	public BlockHardenedWood(int iD, Material material) {
		super(iD, material);
		this.setCreativeTab(Common.HarwoodGeneric);
		this.setStepSound(soundWoodFootstep);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
        this.blockIcon = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
    }

}
