package Mod.Harwood.Blocks;

import java.util.Random;

import Mod.Harwood.*;
import Mod.Harwood.Common.Common;
import Mod.Harwood.Items.Items;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHarwoodDoor extends BlockDoor
{
public Item placerItem = Items.HarwoodDoorItem;
public Icon topDoorIcon;
public Icon[] flippedIcons = new Icon[2];

public BlockHarwoodDoor(int par1, Material par2Material)
    {
    super(par1, par2Material);
    float f = 0.5F;
    float f1 = 1.0F;
    this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    this.setStepSound(soundWoodFootstep);
    }

public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
{
  if (par5 == 1 || par5 == 0)
  {
   return this.blockIcon;
  }
  int meta = getFullMetadata(par1IBlockAccess, par2, par3, par4);
  boolean flag = (meta & 4) != 0;
  int halfMeta = meta & 3;
  boolean flipped = false;

  if (flag)
    {
    if (halfMeta == 0 && par5 == 2) flipped = !flipped;
    else if (halfMeta == 1 && par5 == 5) flipped = !flipped;
    else if (halfMeta == 2 && par5 == 3) flipped = !flipped;
    else if (halfMeta == 3 && par5 == 4) flipped = !flipped;
    }
    else
    {
    if (halfMeta == 0 && par5 == 5) flipped = !flipped;
    else if (halfMeta == 1 && par5 == 3) flipped = !flipped;
    else if (halfMeta == 2 && par5 == 4) flipped = !flipped;
    else if (halfMeta == 3 && par5 == 2)flipped = !flipped;
    if ((meta & 16) != 0)flipped = !flipped;
    }

  if (flipped) return flippedIcons[(meta & 8) != 0 ? 1 : 0];
  else return (meta & 8) != 0 ? this.topDoorIcon : this.blockIcon;
}

public Icon getIcon(int par1, int par2)
{
  return this.blockIcon;
}

@Override
public int idDropped(int par1, Random par2Random, int par3)
{
    return (par1 & 8) != 0 ? 0 : (Items.HarwoodDoorItem.itemID);
}

public void registerIcons(IconRegister iconRegister)
{
  this.blockIcon = iconRegister.registerIcon(Common.modid + ":" +this.getUnlocalizedName().substring(5)+"_lower");
  this.topDoorIcon = iconRegister.registerIcon(Common.modid + ":" +this.getUnlocalizedName().substring(5)+"_upper");
  this.flippedIcons[0] = new IconFlipped(blockIcon, true, false);
  this.flippedIcons[1] = new IconFlipped(topDoorIcon, true, false);
}

@SideOnly(Side.CLIENT)
public int idPicked(World par1World, int par2, int par3, int par4)
{
    return Items.HarwoodDoorItem.itemID;
    }
}