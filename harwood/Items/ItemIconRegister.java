package Mod.Harwood.Items;

import Mod.Harwood.Common.Common;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIconRegister extends Item {

	public ItemIconRegister(int iD) {
		super(iD);
		this.setCreativeTab(Common.HarwoodGeneric);
		
		}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		
		this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + (this.getUnlocalizedName().substring(5)));
		
	}

}

