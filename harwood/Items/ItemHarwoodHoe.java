package Mod.Harwood.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import Mod.Harwood.Common.Common;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHarwoodHoe extends ItemHoe {

	public ItemHarwoodHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(Common.HarwoodTools);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		
		this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + (this.getUnlocalizedName().substring(5)));
		
	}

}
