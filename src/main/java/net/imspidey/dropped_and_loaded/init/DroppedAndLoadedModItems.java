/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.imspidey.dropped_and_loaded.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.imspidey.dropped_and_loaded.DroppedAndLoadedMod;

public class DroppedAndLoadedModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DroppedAndLoadedMod.MODID);
	public static final DeferredItem<Item> MOURNING_IRIS;
	public static final DeferredItem<Item> PALE_PUMPKIN_BLOCK;
	public static final DeferredItem<Item> CARVED_PALE_PUMPKIN_BLOCK;
	public static final DeferredItem<Item> PALE_JACK_O_LANTERN_BLOCK;
	public static final DeferredItem<Item> SOUL_PALE_JACK_O_LANTERN_BLOCK;
	public static final DeferredItem<Item> COPPER_PALE_JACK_O_LANTERN_BLOCK;
	public static final DeferredItem<Item> SCULK_GROWTHS;
	public static final DeferredItem<Item> PUTRID_OSSEOUS_BLOCK;
	public static final DeferredItem<Item> FRAIL_PUTRID_OSSEOUS_BLOCK;
	public static final DeferredItem<Item> OVERGROWN_SCULK_GROWTHS;
	public static final DeferredItem<Item> RESIN_BLOCK_STAIRS;
	public static final DeferredItem<Item> RESIN_BLOCK_SLAB;
	public static final DeferredItem<Item> RESIN_BLOCK_WALL;
	public static final DeferredItem<Item> SCULK_JAW;
	static {
		MOURNING_IRIS = doubleBlock(DroppedAndLoadedModBlocks.MOURNING_IRIS);
		PALE_PUMPKIN_BLOCK = block(DroppedAndLoadedModBlocks.PALE_PUMPKIN_BLOCK);
		CARVED_PALE_PUMPKIN_BLOCK = block(DroppedAndLoadedModBlocks.CARVED_PALE_PUMPKIN_BLOCK);
		PALE_JACK_O_LANTERN_BLOCK = block(DroppedAndLoadedModBlocks.PALE_JACK_O_LANTERN_BLOCK);
		SOUL_PALE_JACK_O_LANTERN_BLOCK = block(DroppedAndLoadedModBlocks.SOUL_PALE_JACK_O_LANTERN_BLOCK);
		COPPER_PALE_JACK_O_LANTERN_BLOCK = block(DroppedAndLoadedModBlocks.COPPER_PALE_JACK_O_LANTERN_BLOCK);
		SCULK_GROWTHS = block(DroppedAndLoadedModBlocks.SCULK_GROWTHS);
		PUTRID_OSSEOUS_BLOCK = block(DroppedAndLoadedModBlocks.PUTRID_OSSEOUS_BLOCK);
		FRAIL_PUTRID_OSSEOUS_BLOCK = block(DroppedAndLoadedModBlocks.FRAIL_PUTRID_OSSEOUS_BLOCK);
		OVERGROWN_SCULK_GROWTHS = doubleBlock(DroppedAndLoadedModBlocks.OVERGROWN_SCULK_GROWTHS);
		RESIN_BLOCK_STAIRS = block(DroppedAndLoadedModBlocks.RESIN_BLOCK_STAIRS);
		RESIN_BLOCK_SLAB = block(DroppedAndLoadedModBlocks.RESIN_BLOCK_SLAB);
		RESIN_BLOCK_WALL = block(DroppedAndLoadedModBlocks.RESIN_BLOCK_WALL);
		SCULK_JAW = block(DroppedAndLoadedModBlocks.SCULK_JAW);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}
}