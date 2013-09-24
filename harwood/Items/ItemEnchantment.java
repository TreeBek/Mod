package Mod.Harwood.Items;

import Mod.Harwood.Blocks.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnchantment extends ItemIconRegister {

	public ItemEnchantment(int par1) {
		super(par1);
		
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		
        if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            int i1 = par3World.getBlockId(par4, par5, par6);
            int enchanter = Blocks.Enchanter.blockID;
           
			if ( i1 == enchanter)
            {
				par3World.playSoundAtEntity(par2EntityPlayer, "mob.chicken.plop", 0.5F, 0.1F / (itemRand.nextFloat() * 0.4F + 0.8F));
                --par1ItemStack.stackSize;
                par2EntityPlayer.addExperienceLevel(1);
                
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
