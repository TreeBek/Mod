package Mod.Harwood.Blocks;

import javax.swing.text.html.HTMLDocument.BlockElement;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.Harwood.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEnchantmentTable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockEnchanter extends BlockEnchantmentTable{
	
	@SideOnly(Side.CLIENT)
    private Icon field_94461_a;
    @SideOnly(Side.CLIENT)
    private Icon field_94460_b;

	protected BlockEnchanter(int par1) {
		super(par1);
		this.setCreativeTab(Common.HarwoodGeneric);
		this.setStepSound(soundWoodFootstep);
		
	}
	
	public TileEntity createNewTileEntity(World par1World)
    {
        return null;
    }
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
		return false;
       
    }
	
	@SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 0 ? this.field_94460_b : (par1 == 1 ? this.field_94461_a : this.blockIcon);
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
        this.blockIcon = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_side");
        this.field_94461_a = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_top");
        this.field_94460_b = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_bottom");
    }

}
