package Mod.Harwood.Proxy;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import Mod.Harwood.Config.BlockConfig;
import Mod.Harwood.Config.ItemConfig;

public class CommonProxy {
	
	public void registerRenderThings(){ 
		
	}
	
	public void preInit(FMLPreInitializationEvent event) {
		BlockConfig.initConfig(event);
		ItemConfig.initConfig(event);
	}
	
	public int addArmor(String string){
		return 0;
	}
 }
	