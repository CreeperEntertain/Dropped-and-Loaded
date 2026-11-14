/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.imspidey.dropped_and_loaded.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.imspidey.dropped_and_loaded.DroppedAndLoadedMod;

@EventBusSubscriber
public class DroppedAndLoadedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DroppedAndLoadedMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DROPPED_AND_LOADED_TAB = REGISTRY.register("dropped_and_loaded_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dropped_and_loaded.dropped_and_loaded_tab")).icon(() -> new ItemStack(Blocks.SCULK)).displayItems((parameters, tabData) -> {
				tabData.accept(DroppedAndLoadedModBlocks.MOURNING_IRIS.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.PALE_PUMPKIN_BLOCK.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.CARVED_PALE_PUMPKIN_BLOCK.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.PALE_JACK_O_LANTERN_BLOCK.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.SOUL_PALE_JACK_O_LANTERN_BLOCK.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.COPPER_PALE_JACK_O_LANTERN_BLOCK.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.SCULK_GROWTHS.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.PUTRID_OSSEOUS_BLOCK.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.FRAIL_PUTRID_OSSEOUS_BLOCK.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.OVERGROWN_SCULK_GROWTHS.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.RESIN_BLOCK_STAIRS.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.RESIN_BLOCK_SLAB.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.RESIN_BLOCK_WALL.get().asItem());
				tabData.accept(DroppedAndLoadedModBlocks.SCULK_JAW.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DroppedAndLoadedModBlocks.MOURNING_IRIS.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.PALE_PUMPKIN_BLOCK.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.CARVED_PALE_PUMPKIN_BLOCK.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.PALE_JACK_O_LANTERN_BLOCK.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.SOUL_PALE_JACK_O_LANTERN_BLOCK.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.COPPER_PALE_JACK_O_LANTERN_BLOCK.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.SCULK_GROWTHS.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.PUTRID_OSSEOUS_BLOCK.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.FRAIL_PUTRID_OSSEOUS_BLOCK.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.OVERGROWN_SCULK_GROWTHS.get().asItem());
			tabData.accept(DroppedAndLoadedModBlocks.SCULK_JAW.get().asItem());
		}
	}
}