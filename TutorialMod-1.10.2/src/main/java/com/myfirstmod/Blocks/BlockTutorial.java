package com.myfirstmod.Blocks;

import com.myfirstmod.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockTutorial extends Block
{
	private final String name = "tutorialBlock";
	
	public BlockTutorial()
	{		
		super(Material.ROCK);
//		name = input;
//		GameRegistry.register(setRegistryName(Reference.MODID + "_" + name));
//		GameRegistry.registerBlock(this, name);
//		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.MISC);
	}
	
	public String getName()
	{
		return name;
	}
}