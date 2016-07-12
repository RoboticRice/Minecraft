package com.myfirstmod.Main;

import com.myfirstmod.Blocks.BlockTutorial;
import com.myfirstmod.Blocks.ItemBlockTutorial;
import com.myfirstmod.Item.ItemTutorial;
import com.myfirstmod.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MainRegistry {
	
	public static Block tutorialBlock;
	
	public static ItemBlock iBlock;
	
    public static Item tutorialItem;
        
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//blocks
    	tutorialBlock = new BlockTutorial();
		GameRegistry.register(tutorialBlock.setRegistryName(Reference.MODID + "_" + "tutorialBlock"));
		iBlock = new ItemBlock(tutorialBlock);
		GameRegistry.register(iBlock.setRegistryName(tutorialBlock.getRegistryName()));
    	
    	//items
    	tutorialItem = new ItemTutorial();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//register renders
    	if(event.getSide() == Side.CLIENT)
    	{
	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	    
	    	//blocks
	    	renderItem.getItemModelMesher().register(Item.getItemFromBlock(tutorialBlock), 0, new ModelResourceLocation(Reference.MODID + ":" + ((BlockTutorial) tutorialBlock).getName(), "inventory"));
	    
	    	//items
	    	renderItem.getItemModelMesher().register(tutorialItem, 0, new ModelResourceLocation(Reference.MODID + ":" + ((ItemTutorial) tutorialItem).getName(), "inventory"));
    	}
    }
}
