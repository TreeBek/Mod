package Mod.Harwood.Crafting;

import Mod.Harwood.Blocks.Blocks;
import Mod.Harwood.Items.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class HarwoodRecipesFurnace {

	public static void Main(){
		
		GameRegistry.addSmelting(Blocks.HardenedWood.blockID, new ItemStack(Items.HarCoal, 1), 0.3F);
		
	}
	
}
