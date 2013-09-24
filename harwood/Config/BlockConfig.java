package Mod.Harwood.Config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class BlockConfig {

	public static int HardwoodId;
	public static int HardwoodDoorId;
	public static int EnchanterId;
	public static int PulverizedStone;
	
	public static int id = 700;
	
	public static void initConfig(FMLPreInitializationEvent event) {
			File file = new File(event.getModConfigurationDirectory(), "Harwood Mod Blocks.cfg");
			Configuration config = new Configuration(file);

			config.load();
			
			HardwoodId = config.getBlock("HardwoodId",id++ - 256).getInt();
			HardwoodDoorId = config.getBlock("HardwoodDoorId",id++ - 256).getInt();
			EnchanterId = config.getBlock("EnchanterId",id++ - 256).getInt();
			PulverizedStone = config.getBlock("PulverizedStone",id++ - 256).getInt();

			
			config.save();
	}
}
