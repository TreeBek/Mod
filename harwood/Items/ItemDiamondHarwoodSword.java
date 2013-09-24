package Mod.Harwood.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import Mod.Harwood.Common.Common;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDiamondHarwoodSword extends ItemSword {
	
	public ItemDiamondHarwoodSword(int par1,EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(Common.HarwoodTools);
		}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    		boolean isenchanted = par1ItemStack.isItemEnchanted();    			
    		
			if(isenchanted != true) {
				
			int enchantnum =  (itemRand.nextInt(7) + 1);
			int levelnum = (itemRand.nextInt(2) + 2);
				
				switch(enchantnum){
				
				case 1: {par1ItemStack.addEnchantment(Enchantment.fireAspect, levelnum);}; break;
				case 2: {par1ItemStack.addEnchantment(Enchantment.baneOfArthropods, levelnum);} ; break;
				case 3: {par1ItemStack.addEnchantment(Enchantment.knockback, levelnum);}; break;
				case 4: {par1ItemStack.addEnchantment(Enchantment.looting, levelnum);}; break;
				case 5: {par1ItemStack.addEnchantment(Enchantment.sharpness, levelnum);}; break;
				case 6: {par1ItemStack.addEnchantment(Enchantment.smite, levelnum);};  break;
				}	
			}
			return par1ItemStack;	
	}
			
}
