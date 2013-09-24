package Mod.Harwood.Items;

import Mod.Harwood.Blocks.Blocks;
import Mod.Harwood.Config.ItemConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	//ToolMaterials
	public static EnumToolMaterial toolHarwood = EnumHelper.addToolMaterial("Harwood", 2, 375, 7.0F, 2.0F, 28);
	public static EnumToolMaterial toolDiamondHarwood = EnumHelper.addToolMaterial("DiamondHarwood",3, 2341, 9.0F, 3.0F, 20);
	public static EnumToolMaterial toolStoneHammer = EnumHelper.addToolMaterial("StoneHammer",0, 16, 1.0F, 0.0F, 0);

	//ArmorMaterials
	public static EnumArmorMaterial HarwoodArmor = EnumHelper.addArmorMaterial("Harwood", 15, new int[]{2, 7, 6, 2}, 26); 
	public static EnumArmorMaterial DiamondHarwoodArmor = EnumHelper.addArmorMaterial("DiamondHarwood", 33, new int[]{3, 7, 7, 3}, 30);
	
	//ItemsDec
	public static Item HarCoal;
	public static Item HarIron;
	public static Item HarDiamond;
	public static Item HarwoodDoorItem;
	public static Item HarwoodPickaxe;
	public static Item HarwoodSword;
	public static Item HarwoodShovel;
	public static Item HarwoodAxe;
	public static Item HarwoodHoe;
	public static Item HarwoodHelmet;
	public static Item HarwoodChest;
	public static Item HarwoodLegs;
	public static Item HarwoodBoots;
	public static Item DiamondHarwoodPickaxe;
	public static Item DiamondHarwoodSword;
	public static Item DiamondHarwoodShovel;
	public static Item DiamondHarwoodAxe;
	public static Item DiamondHarwoodHoe;	
	public static Item DiamondHarwoodHelmet;
	public static Item DiamondHarwoodChest;
	public static Item DiamondHarwoodLegs;
	public static Item DiamondHarwoodBoots;
	public static Item DustofEnchantment;
	public static Item UnenchantedDust;
	public static Item StoneHammer;
	
	public static void Main(){
		
		//Generic
		HarCoal = new ItemHarCoal(ItemConfig.HarCoalId).setUnlocalizedName("HarCoal");
			LanguageRegistry.addName(HarCoal, "Harwood Charcoal");
		
		HarIron = new ItemIronHar(ItemConfig.HarIronId).setUnlocalizedName("IronHar");
			LanguageRegistry.addName(HarIron, "Iron Harwood");
		
		HarDiamond = new ItemDiamondHar(ItemConfig.HarDiamondId).setUnlocalizedName("DiamondHar");
			LanguageRegistry.addName(HarDiamond, "Diamond Harwood");
			
		HarwoodDoorItem = new ItemHarwoodDoor(ItemConfig.HarwoodDoorItemId,Blocks.HarwoodDoor).setUnlocalizedName("HarwoodDoorItem");
			LanguageRegistry.addName(HarwoodDoorItem, "Harwood Door");		
		
		DustofEnchantment = new ItemEnchantment(ItemConfig.DustofEnchantmentId).setUnlocalizedName("Enchatment_Dust");
			LanguageRegistry.addName(DustofEnchantment, "Dust of Enchantment");
			
		UnenchantedDust = new ItemUnenchantedDust(ItemConfig.UnenchantedDustId).setUnlocalizedName("Unenchanted_Dust");
			LanguageRegistry.addName(UnenchantedDust, "Unenchanted Dust");
			
		StoneHammer = new ItemStoneHammer(ItemConfig.StoneHammerId, 1, toolStoneHammer,new Block[]{}).setUnlocalizedName("StoneHammer");
			LanguageRegistry.addName(StoneHammer, "Stone Hammer");
			
		//HarwoodTools
		HarwoodPickaxe = new ItemHarwoodPickaxe(ItemConfig.HarwoodPickaxeId, toolHarwood).setUnlocalizedName("HarwoodPick");
			LanguageRegistry.addName(HarwoodPickaxe, "Iron Harwood Pickaxe");
		
		HarwoodShovel = new ItemHarwoodShovel(ItemConfig.HarwoodShovelId, toolHarwood).setUnlocalizedName("HarwoodShovel");
			LanguageRegistry.addName(HarwoodShovel, "Iron Harwood Shovel");
		
		HarwoodSword = new ItemHarwoodSword(ItemConfig.HarwoodSwordId, toolHarwood).setUnlocalizedName("HarwoodSword");
			LanguageRegistry.addName(HarwoodSword, "Iron Harwood Sword");
		
		HarwoodAxe = new ItemHarwoodAxe(ItemConfig.HarwoodAxeId, toolHarwood).setUnlocalizedName("HarwoodAxe");
			LanguageRegistry.addName(HarwoodAxe, "Iron Harwood Axe");
		
		HarwoodHoe = new ItemHarwoodHoe(ItemConfig.HarwoodHoeId, toolHarwood).setUnlocalizedName("HarwoodHoe");
			LanguageRegistry.addName(HarwoodHoe, "Iron Harwood Hoe");
			
			
			
		//DiamondHarwoodTools
		DiamondHarwoodPickaxe = new ItemDiamondHarwoodPickaxe(ItemConfig.DiamondHarwoodPickaxeId, toolDiamondHarwood).setUnlocalizedName("DiamondHarwoodPick");
			LanguageRegistry.addName(DiamondHarwoodPickaxe, "Diamond Harwood Pickaxe");
				
		DiamondHarwoodShovel = new ItemDiamondHarwoodShovel(ItemConfig.DiamondHarwoodShovelId, toolDiamondHarwood).setUnlocalizedName("DiamondHarwoodShovel");
			LanguageRegistry.addName(DiamondHarwoodShovel, "Diamond Harwood Shovel");
			
		DiamondHarwoodSword = new ItemDiamondHarwoodSword(ItemConfig.DiamondHarwoodSwordId, toolDiamondHarwood).setUnlocalizedName("DiamondHarwoodSword");
			LanguageRegistry.addName(DiamondHarwoodSword, "Diamond Harwood Sword");
				
		DiamondHarwoodAxe = new ItemDiamondHarwoodAxe(ItemConfig.DiamondHarwoodAxeId, toolDiamondHarwood).setUnlocalizedName("DiamondHarwoodAxe");
			LanguageRegistry.addName(DiamondHarwoodAxe, "Diamond Harwood Axe");
				
		DiamondHarwoodHoe = new ItemDiamondHarwoodHoe(ItemConfig.DiamondHarwoodHoeId, toolDiamondHarwood).setUnlocalizedName("DiamondHarwoodHoe");
			LanguageRegistry.addName(DiamondHarwoodHoe, "Diamond Harwood Hoe");


	    	
	    //Harwood Armor
		HarwoodHelmet = new IronHarwoodArmor(ItemConfig.HarwoodHelmetId, HarwoodArmor, 1, 0, "Harwood").setUnlocalizedName("HarwoodHelmet");
			LanguageRegistry.addName(HarwoodHelmet, "Harwood Helmet");
				
		HarwoodChest = new IronHarwoodArmor(ItemConfig.HarwoodChestId, HarwoodArmor, 0, 1, "Harwood").setUnlocalizedName("HarwoodPlate");
		    LanguageRegistry.addName(HarwoodChest, "Harwood Chestplate");
		    	
		HarwoodLegs = new IronHarwoodArmor(ItemConfig.HarwoodLegsId, HarwoodArmor, 0, 2, "Harwood").setUnlocalizedName("HarwoodLeggings");
		    LanguageRegistry.addName(HarwoodLegs, "Harwood Leggings");
		    	
		HarwoodBoots = new IronHarwoodArmor(ItemConfig.HarwoodBootsId,HarwoodArmor, 0, 3, "Harwood").setUnlocalizedName("HarwoodBoots");
			LanguageRegistry.addName(HarwoodBoots, "Harwood Boots");	
			
			
			
		//Diamond Harwood Armor	
		DiamondHarwoodHelmet = new DiamondHarwoodArmor(ItemConfig.DiamondHarwoodHelmetId, DiamondHarwoodArmor, 1, 0, "DiamondHarwood").setUnlocalizedName("DiamondHarwoodHelmet");
			LanguageRegistry.addName(DiamondHarwoodHelmet, "Diamond Harwood Helmet");
				
		DiamondHarwoodChest = new DiamondHarwoodArmor(ItemConfig.DiamondHarwoodChestId, DiamondHarwoodArmor, 0, 1, "DiamondHarwood").setUnlocalizedName("DiamondHarwoodPlate");
		    LanguageRegistry.addName(DiamondHarwoodChest, "Diamond Harwood Chestplate");
		    	
		DiamondHarwoodLegs = new DiamondHarwoodArmor(ItemConfig.DiamondHarwoodLegsId, DiamondHarwoodArmor, 0, 2, "DiamondHarwood").setUnlocalizedName("DiamondHarwoodLeggings");
		    LanguageRegistry.addName(DiamondHarwoodLegs, "Diamond Harwood Leggings");
		    	
		DiamondHarwoodBoots = new DiamondHarwoodArmor(ItemConfig.DiamondHarwoodBootsId,DiamondHarwoodArmor, 0, 3, "DiamondHarwood").setUnlocalizedName("DiamondHarwoodBoots");
			LanguageRegistry.addName(DiamondHarwoodBoots, "Diamond Harwood Boots");			
	    	
	
	}

}
