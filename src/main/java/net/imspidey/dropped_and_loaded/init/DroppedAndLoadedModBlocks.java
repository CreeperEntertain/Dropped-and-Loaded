/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.imspidey.dropped_and_loaded.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.imspidey.dropped_and_loaded.block.*;
import net.imspidey.dropped_and_loaded.DroppedAndLoadedMod;

public class DroppedAndLoadedModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DroppedAndLoadedMod.MODID);
	public static final DeferredBlock<Block> MOURNING_IRIS;
	public static final DeferredBlock<Block> PALE_PUMPKIN_BLOCK;
	public static final DeferredBlock<Block> CARVED_PALE_PUMPKIN_BLOCK;
	public static final DeferredBlock<Block> PALE_JACK_O_LANTERN_BLOCK;
	public static final DeferredBlock<Block> SOUL_PALE_JACK_O_LANTERN_BLOCK;
	public static final DeferredBlock<Block> COPPER_PALE_JACK_O_LANTERN_BLOCK;
	public static final DeferredBlock<Block> SCULK_GROWTHS;
	public static final DeferredBlock<Block> PUTRID_OSSEOUS_BLOCK;
	public static final DeferredBlock<Block> FRAIL_PUTRID_OSSEOUS_BLOCK;
	public static final DeferredBlock<Block> OVERGROWN_SCULK_GROWTHS;
	public static final DeferredBlock<Block> RESIN_BLOCK_STAIRS;
	public static final DeferredBlock<Block> RESIN_BLOCK_SLAB;
	public static final DeferredBlock<Block> RESIN_BLOCK_WALL;
	public static final DeferredBlock<Block> SCULK_JAW;
	static {
		MOURNING_IRIS = REGISTRY.register("mourning_iris", MourningIrisBlock::new);
		PALE_PUMPKIN_BLOCK = REGISTRY.register("pale_pumpkin_block", PalePumpkinBlockBlock::new);
		CARVED_PALE_PUMPKIN_BLOCK = REGISTRY.register("carved_pale_pumpkin_block", CarvedPalePumpkinBlockBlock::new);
		PALE_JACK_O_LANTERN_BLOCK = REGISTRY.register("pale_jack_o_lantern_block", PaleJackOLanternBlockBlock::new);
		SOUL_PALE_JACK_O_LANTERN_BLOCK = REGISTRY.register("soul_pale_jack_o_lantern_block", SoulPaleJackOLanternBlockBlock::new);
		COPPER_PALE_JACK_O_LANTERN_BLOCK = REGISTRY.register("copper_pale_jack_o_lantern_block", CopperPaleJackOLanternBlockBlock::new);
		SCULK_GROWTHS = REGISTRY.register("sculk_growths", SculkGrowthsBlock::new);
		PUTRID_OSSEOUS_BLOCK = REGISTRY.register("putrid_osseous_block", PutridOsseousBlockBlock::new);
		FRAIL_PUTRID_OSSEOUS_BLOCK = REGISTRY.register("frail_putrid_osseous_block", FrailPutridOsseousBlockBlock::new);
		OVERGROWN_SCULK_GROWTHS = REGISTRY.register("overgrown_sculk_growths", OvergrownSculkGrowthsBlock::new);
		RESIN_BLOCK_STAIRS = REGISTRY.register("resin_block_stairs", ResinBlockStairsBlock::new);
		RESIN_BLOCK_SLAB = REGISTRY.register("resin_block_slab", ResinBlockSlabBlock::new);
		RESIN_BLOCK_WALL = REGISTRY.register("resin_block_wall", ResinBlockWallBlock::new);
		SCULK_JAW = REGISTRY.register("sculk_jaw", SculkJawBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}