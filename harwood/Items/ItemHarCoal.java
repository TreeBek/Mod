package Mod.Harwood.Items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Mod.Harwood.Common.Common;
import Mod.Harwood.Common.FuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHarCoal extends ItemIconRegister {
	
	public ItemHarCoal(int iD) {
		super(iD);
		this.setCreativeTab(Common.HarwoodGeneric);
		GameRegistry.registerFuelHandler(new FuelHandler());
	}
	
	/*public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		par3EntityPlayer.rayTrace(1.0D, 1.0F);
        return par1ItemStack;
    }*/
	
	

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		int PlayerDimension = par3EntityPlayer.dimension;
		
		if(PlayerDimension != 0){
			
			par3EntityPlayer.travelToDimension(0);
			return par1ItemStack;
			
		}else return par1ItemStack;
		
    }


}
