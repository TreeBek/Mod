package Mod.Harwood.Config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ItemConfig {
	
	public static int HarCoalId;
	public static int HarIronId;
	public static int HarDiamondId;
	public static int UnenchantedDustId;
	public static int DustofEnchantmentId;
	
	public static int HarwoodDoorItemId;
	public static int StoneHammerId;
	
	public static int HarwoodPickaxeId;
	public static int HarwoodSwordId;
	public static int HarwoodShovelId;
	public static int HarwoodAxeId;
	public static int HarwoodHoeId;
	public static int HarwoodHelmetId;
	public static int HarwoodChestId;
	public static int HarwoodLegsId;
	public static int HarwoodBootsId;
	
	public static int DiamondHarwoodPickaxeId;
	public static int DiamondHarwoodSwordId;
	public static int DiamondHarwoodShovelId;
	public static int DiamondHarwoodAxeId;
	public static int DiamondHarwoodHoeId;	
	public static int DiamondHarwoodHelmetId;
	public static int DiamondHarwoodChestId;
	public static int DiamondHarwoodLegsId;
	public static int DiamondHarwoodBootsId;
	
	public static int id = 200;
	
	public static void initConfig(FMLPreInitializationEvent event) {
			File file = new File(event.getModConfigurationDirectory(), "Harwood Mod Items.cfg");
			Configuration config = new Configuration(file);
			
			config.load();
			
			HarCoalId = config.getItem("Harwood Charcoal",id++ - 256).getInt();
			HarIronId = config.getItem("Harwood Iron",id++ - 256).getInt();
			HarDiamondId = config.getItem("Harwood Diamond",id++ - 256).getInt();
			UnenchantedDustId = config.getItem("Unenchanted Dust",id++ - 256).getInt();
			DustofEnchantmentId = config.getItem("Enchanted Dust",id++ - 256).getInt();
			
			HarwoodDoorItemId = config.getItem("Harwood Door",id++ - 256).getInt();
			StoneHammerId = config.getItem("Stone Hammer",id++ - 256).getInt();
			
			HarwoodPickaxeId = config.getItem("Harwood Pickaxe",id++ - 256).getInt();
			HarwoodSwordId = config.getItem("Harwood Sword",id++ - 256).getInt();
			HarwoodShovelId = config.getItem("Harwood Shovel",id++ - 256).getInt();
			HarwoodAxeId = config.getItem("Harwood Axe",id++ - 256).getInt();
			HarwoodHoeId = config.getItem("Harwood Hoe",id++ - 256).getInt();
			HarwoodHelmetId = config.getItem("Harwood Helmet",id++ - 256).getInt();
			HarwoodChestId = config.getItem("Harwood Chest",id++ - 256).getInt();
			HarwoodLegsId = config.getItem("Harwood Legs",id++ - 256).getInt();
			HarwoodBootsId = config.getItem("Harwood Boots",id++ - 256).getInt();
			
			DiamondHarwoodPickaxeId = config.getItem("Diamond Harwood Pickaxe",id++ - 256).getInt();
			DiamondHarwoodSwordId = config.getItem("Diamond Harwood Sword",id++ - 256).getInt();
			DiamondHarwoodShovelId = config.getItem("Diamond Harwood Shovel",id++ - 256).getInt();
			DiamondHarwoodAxeId = config.getItem("Diamond Harwood Axe",id++ - 256).getInt();
			DiamondHarwoodHoeId = config.getItem("Diamond Harwood Hoe",id++ - 256).getInt();
			DiamondHarwoodHelmetId = config.getItem("Diamond Harwood Helmet",id++ - 256).getInt();
			DiamondHarwoodChestId = config.getItem("Diamond Harwood Chest",id++ - 256).getInt();
			DiamondHarwoodLegsId = config.getItem("Diamond Harwood Legs",id++ - 256).getInt();
			DiamondHarwoodBootsId = config.getItem("Diamond Harwood Boots",id++ - 256).getInt();
			
			config.save();
	}

}
