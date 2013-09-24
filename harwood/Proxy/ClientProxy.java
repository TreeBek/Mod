package Mod.Harwood.Proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenderThings(){ 
		
		
	}
	public int addArmor(String armor){
			return RenderingRegistry.addNewArmourRendererPrefix(armor);
		
	}
}