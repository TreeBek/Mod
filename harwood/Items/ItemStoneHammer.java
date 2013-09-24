package Mod.Harwood.Items;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import Mod.Harwood.Blocks.Blocks;
import Mod.Harwood.Common.Common;

public class ItemStoneHammer extends ItemTool{

protected ItemStoneHammer(int par1, float par2, EnumToolMaterial par3EnumToolMaterial, Block[] par4ArrayOfBlock) {
		super(par1, par2, par3EnumToolMaterial, par4ArrayOfBlock);
		this.setCreativeTab(Common.HarwoodTools);
		this.bFull3D = true;
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		
		int i1 = par3World.getBlockId(par4, par5, par6);
		int Stone = Block.stone.blockID;
		
		if(i1 == Stone || i1 == Stone + 3){
		
		int Dustycobble = Blocks.PulverizedStone.blockID;
		par3World.setBlock(par4, par5, par6, Dustycobble);
        par3World.playSoundAtEntity(par2EntityPlayer, "dig.stone", 1.0F, 0.5F / (itemRand.nextFloat() * 0.4F + 0.8F));
        par1ItemStack.damageItem(1, par2EntityPlayer);
        
        return true;
		}else{
			return false;
		}
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		
		this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + (this.getUnlocalizedName().substring(5)));
		
	}	
}
