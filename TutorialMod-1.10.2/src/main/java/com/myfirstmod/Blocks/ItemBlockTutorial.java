package com.myfirstmod.Blocks;

import com.myfirstmod.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBlockTutorial extends ItemBlock {

	public ItemBlockTutorial(Block block) {
		super(block);
		GameRegistry.register(setRegistryName(block.getRegistryName()));
	}

}
