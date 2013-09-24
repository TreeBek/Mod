package Mod.Harwood.Crafting;

import Mod.Harwood.Blocks.Blocks;
import Mod.Harwood.Items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HarwoodRecipesBench {

	public static void Main() {
		// HardWood
		GameRegistry.addRecipe(new ItemStack(Blocks.HardenedWood),
				new Object[] { "XXX", "XEX", "XXX", 'X', Block.wood, 'E', Items.DustofEnchantment });
		
		GameRegistry.addRecipe(new ItemStack(Items.HarwoodDoorItem),
				new Object[] { "XX", "XX", "XX", 'X', Blocks.HardenedWood});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.Enchanter),
				new Object[] {" B ", "RLR", "LLL", 'L', Block.wood, 'R',Item.redstone, 'B', Items.UnenchantedDust});
		
		GameRegistry.addRecipe(new ItemStack(Items.StoneHammer),
				new Object[] {"CCC", "CSC", " S ", 'S', Item.stick, 'C', Block.cobblestone});

		
		
		// IronHarwood
		GameRegistry.addShapelessRecipe(new ItemStack(Items.HarIron),
				new Object[] { Item.ingotIron,
						new ItemStack(Items.HarCoal) });
		// Diamond Harwood
		GameRegistry.addShapelessRecipe(new ItemStack(Items.HarDiamond),
				new Object[] { Item.diamond,
						new ItemStack(Items.HarIron, 4) });

		// Harwood Tools
		GameRegistry.addRecipe(new ItemStack(Items.HarwoodPickaxe),
				new Object[] { "XXX", " S ", " S ", 'X', Items.HarIron,
						'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Items.HarwoodShovel),
				new Object[] { "X", "S", "S", 'X', Items.HarIron, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Items.HarwoodSword),
				new Object[] { "X", "X", "S", 'X', Items.HarIron, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Items.HarwoodAxe),
				new Object[] { "XX", "SX", "S ", 'X', Items.HarIron,
						'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Items.HarwoodHoe),
				new Object[] { "XX", "S ", "S ", 'X', Items.HarIron,
						'S', Item.stick });

		// Harwood Armor
		GameRegistry
				.addRecipe(new ItemStack(Items.HarwoodHelmet),
						new Object[] { "XXX", "X X", "   ", 'X',
								Items.HarIron, });
		GameRegistry
				.addRecipe(new ItemStack(Items.HarwoodChest),
						new Object[] { "X X", "XXX", "XXX", 'X',
								Items.HarIron, });
		GameRegistry
				.addRecipe(new ItemStack(Items.HarwoodLegs),
						new Object[] { "XXX", "X X", "X X", 'X',
								Items.HarIron, });
		GameRegistry
				.addRecipe(new ItemStack(Items.HarwoodBoots),
						new Object[] { "   ", "X X", "X X", 'X',
								Items.HarIron, });

		// Harwood Tools
		GameRegistry.addRecipe(
				new ItemStack(Items.DiamondHarwoodPickaxe),
				new Object[] { "XXX", " S ", " S ", 'X',
						Items.HarDiamond, 'S', Item.stick });
		GameRegistry.addRecipe(
				new ItemStack(Items.DiamondHarwoodShovel), new Object[] {
						"X", "S", "S", 'X', Items.HarDiamond, 'S',
						Item.stick });
		GameRegistry.addRecipe(new ItemStack(Items.DiamondHarwoodSword),
				new Object[] { "X", "X", "S", 'X', Items.HarDiamond,
						'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Items.DiamondHarwoodAxe),
				new Object[] { "XX", "SX", "S ", 'X', Items.HarDiamond,
						'S', Item.stick });
		GameRegistry.addRecipe(new ItemStack(Items.DiamondHarwoodHoe),
				new Object[] { "XX", "S ", "S ", 'X', Items.HarDiamond,
						'S', Item.stick });

		// Harwood Armor
		GameRegistry.addRecipe(
				new ItemStack(Items.DiamondHarwoodHelmet), new Object[] {
						"XXX", "X X", "   ", 'X', Items.HarDiamond, });
		GameRegistry.addRecipe(new ItemStack(Items.DiamondHarwoodChest),
				new Object[] { "X X", "XXX", "XXX", 'X',
						Items.HarDiamond, });
		GameRegistry.addRecipe(new ItemStack(Items.DiamondHarwoodLegs),
				new Object[] { "XXX", "X X", "X X", 'X',
						Items.HarDiamond, });
		GameRegistry.addRecipe(new ItemStack(Items.DiamondHarwoodBoots),
				new Object[] { "   ", "X X", "X X", 'X',
						Items.HarDiamond, });

	}

}
