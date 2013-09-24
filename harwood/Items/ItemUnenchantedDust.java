package Mod.Harwood.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import Mod.Harwood.Blocks.Blocks;
import Mod.Harwood.Common.Common;

public class ItemUnenchantedDust extends ItemIconRegister{

	public ItemUnenchantedDust(int iD) {
		super(iD);
		this.setCreativeTab(Common.HarwoodGeneric);
	}
	
	
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		
        if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            int i1 = par3World.getBlockId(par4, par5, par6);
            int enchanter = Blocks.Enchanter.blockID;
            float currentxp = par2EntityPlayer.experienceLevel;

			if ( i1 == enchanter && currentxp >= 1)
            {
				par3World.playSoundAtEntity(par2EntityPlayer, "mob.chicken.plop", 0.5F, 0.1F / (itemRand.nextFloat() * 0.4F + 0.8F));
				par2EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.DustofEnchantment));
                --par1ItemStack.stackSize;
                par2EntityPlayer.addExperienceLevel(-1);
                
                
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}