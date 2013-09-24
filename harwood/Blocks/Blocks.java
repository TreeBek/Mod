package Mod.Harwood.Blocks;

import Mod.Harwood.Common.Common;
import Mod.Harwood.Config.BlockConfig;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

public class Blocks {
	
	//Blocksdec
	public static Block HardenedWood;
	public static Block HarwoodDoor;
	public static Block Enchanter;
	public static Block PulverizedStone;
 	
		public static void Main(){
			
			//Blocks
			HardenedWood = new BlockHardenedWood(BlockConfig.HardwoodId, Material.wood).setUnlocalizedName("Hardwood").setHardness(4.0F).setResistance(10.0F);
				GameRegistry.registerBlock(HardenedWood, Common.modid + HardenedWood.getUnlocalizedName().substring(5));
					LanguageRegistry.addName(HardenedWood, "Hardwood");
			
			HarwoodDoor = new BlockHarwoodDoor(BlockConfig.HardwoodDoorId, Material.wood).setUnlocalizedName("HarwoodDoor").setHardness(4.0F);
				GameRegistry.registerBlock(HarwoodDoor, Common.modid + HarwoodDoor.getUnlocalizedName().substring(5));
					LanguageRegistry.addName(HarwoodDoor, "Hardwood Door");
					
			Enchanter = new BlockEnchanter(BlockConfig.EnchanterId).setUnlocalizedName("Enchanter").setHardness(4.0F).setResistance(15.0F);
				GameRegistry.registerBlock(Enchanter, Common.modid + Enchanter.getUnlocalizedName().substring(5));
					LanguageRegistry.addName(Enchanter, "Enchanter");
					
			PulverizedStone = new BlockPulverizedStone(BlockConfig.PulverizedStone, Material.rock).setUnlocalizedName("PulverizedStone").setHardness(1.0F);
				GameRegistry.registerBlock(PulverizedStone, Common.modid + PulverizedStone.getUnlocalizedName().substring(5));
					LanguageRegistry.addName(PulverizedStone, "Pulverized Stone");
								
			//Blocks Harvest Levels
			MinecraftForge.setBlockHarvestLevel(HarwoodDoor, "axe", 1);
			MinecraftForge.setBlockHarvestLevel(Enchanter, "pickaxe", 1);
					
	}

}
