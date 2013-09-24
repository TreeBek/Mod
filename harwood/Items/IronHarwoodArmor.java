package Mod.Harwood.Items;

import java.util.List;

import Mod.Harwood.Common.Common;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class IronHarwoodArmor extends ItemArmor
{
 public String armorNamePrefix;
    public IronHarwoodArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
            int par3, int par4, String armornamePrefix)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(Common.HarwoodTools);  
        armorNamePrefix = armornamePrefix;
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
    	if (stack.toString().contains("legs")){
    		
    		return Common.modid + ":" + "textures/armor/" + armorNamePrefix + "_2.png";
    	}
    	
    		if (stack.toString().contains("Leg")){
    			
    			return Common.modid + ":" + "textures/armor/" + armorNamePrefix + "_2.png";
    		
    		}
    		else
    				return Common.modid + ":" + "textures/armor/" + armorNamePrefix + "_1.png";
    
    }
    	@SideOnly(Side.CLIENT)
    	public void registerIcons(IconRegister par1IconRegister){
    		
        this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
        
    	}
    	
    	@Override
    	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
        {
        		boolean isenchanted = par1ItemStack.isItemEnchanted();    			
        		
    			if(isenchanted != true) {
    				
    			int enchantnum =  (itemRand.nextInt(7) + 1);
    			int levelnum = (itemRand.nextInt(2) + 1);
    				
    				switch(enchantnum){
    				
    				case 1: {par1ItemStack.addEnchantment(Enchantment.aquaAffinity, levelnum);} ; break;
    				case 2: {par1ItemStack.addEnchantment(Enchantment.blastProtection, levelnum);} ; break;
    				case 3: {par1ItemStack.addEnchantment(Enchantment.featherFalling, levelnum);} ; break;
    				case 4: {par1ItemStack.addEnchantment(Enchantment.fireProtection, levelnum);} ; break;
    				case 5: {par1ItemStack.addEnchantment(Enchantment.protection, levelnum);} ; break;
    				case 6: {par1ItemStack.addEnchantment(Enchantment.respiration, levelnum);} ;  break;
    				case 7: {par1ItemStack.addEnchantment(Enchantment.thorns, levelnum);} ;  break;
    				case 8: {par1ItemStack.addEnchantment(Enchantment.projectileProtection, levelnum);} ;  break;
    				
    				}	
    			}else {
    				
    			int i = EntityLiving.getArmorPosition(par1ItemStack) - 1;
    			ItemStack itemstack1 = par3EntityPlayer.getCurrentArmor(i);

    	        	if (itemstack1 == null)
    	        	{
    	            par3EntityPlayer.setCurrentItemOrArmor(i + 1, par1ItemStack.copy()); //Forge: Vanilla bug fix associated with fixed setCurrentItemOrArmor indexs for players.
    	            par1ItemStack.stackSize = 0;
    	        	}
    			}
				return par1ItemStack;	
        }
}