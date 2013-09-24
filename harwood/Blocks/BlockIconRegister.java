package Mod.Harwood.Blocks;

import Mod.Harwood.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIconRegister extends Block{

	
	public BlockIconRegister(int iD, Material material) {
		super(iD, material);
		this.setCreativeTab(Common.HarwoodGeneric);
		
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		
		this.blockIcon = par1IconRegister.registerIcon(Common.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
}
