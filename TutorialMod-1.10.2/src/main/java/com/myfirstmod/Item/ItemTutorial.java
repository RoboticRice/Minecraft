package com.myfirstmod.Item;

import com.myfirstmod.lib.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTutorial extends Item
{
	private final String name = "tutorialItem";
	
	public ItemTutorial()
	{
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.MISC);
	}
	
	public String getName()
	{
		return name;
	}
}