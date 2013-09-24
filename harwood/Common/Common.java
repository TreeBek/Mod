package Mod.Harwood.Common;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import Mod.Harwood.Blocks.Blocks;
import Mod.Harwood.Crafting.HarwoodRecipesBench;
import Mod.Harwood.Crafting.HarwoodRecipesFurnace;
import Mod.Harwood.Items.Items;
import Mod.Harwood.Proxy.CommonProxy;

@Mod(modid = Common.modid, name = "Harwood Mod", version = "2.0" )
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Common {
	
	public static final String modid = "HarwoodMod";
	

	@SidedProxy(clientSide = "Mod.Harwood.Proxy.ClientProxy", serverSide = "Mod.Harwood.Proxy.CommonProxy" ) 
	public static CommonProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	
        proxy.preInit(event);
    }
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.Harwood Generic", "Harwood Generic");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Harwood Tools and Armor", "Harwood Tools and Armor");
		
		proxy.registerRenderThings();
	
		Blocks.Main();
		Items.Main();
		HarwoodRecipesBench.Main();
	    HarwoodRecipesFurnace.Main();
		
			}
	
	public static CreativeTabs HarwoodGeneric = new CreativeTabs("Harwood Generic") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Blocks.HardenedWood, 1, 0);
        }
	};
        
    public static CreativeTabs HarwoodTools = new CreativeTabs("Harwood Tools and Armor") {
         public ItemStack getIconItemStack() {
                return new ItemStack(Items.DiamondHarwoodPickaxe, 1, 0);
         }
	};
}
