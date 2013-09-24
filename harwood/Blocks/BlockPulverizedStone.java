package Mod.Harwood.Blocks;

import java.util.Random;

import Mod.Harwood.Common.Common;
import Mod.Harwood.Items.Items;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockPulverizedStone extends BlockIconRegister{

	public BlockPulverizedStone(int iD, Material material) {
		super(iD, material);
		this.setCreativeTab(Common.HarwoodGeneric);
	}
	
	 public int idDropped(int par1, Random par2Random, int par3)
	    {
	        return Items.UnenchantedDust.itemID;
	    }

	    public int quantityDroppedWithBonus(int par1, Random par2Random)
	    {
	        return this.quantityDropped(par2Random) + par2Random.nextInt(par1 + 1);
	    }

	    public int quantityDropped(Random par1Random)
	    {
	        return 2 + par1Random.nextInt(2);
	    }


}
