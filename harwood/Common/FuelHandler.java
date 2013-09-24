package Mod.Harwood.Common;

import Mod.Harwood.Items.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {

        if (fuel.itemID == Items.HarCoal.itemID)
        {
            return 12800;
        }
        
        else
        {
            return 0;
        }
    }
}
