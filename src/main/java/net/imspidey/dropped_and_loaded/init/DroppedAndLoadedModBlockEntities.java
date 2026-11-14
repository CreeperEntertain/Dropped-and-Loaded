/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.imspidey.dropped_and_loaded.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.imspidey.dropped_and_loaded.block.entity.SculkJawBlockEntity;
import net.imspidey.dropped_and_loaded.DroppedAndLoadedMod;

@EventBusSubscriber
public class DroppedAndLoadedModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, DroppedAndLoadedMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SculkJawBlockEntity>> SCULK_JAW = register("sculk_jaw", DroppedAndLoadedModBlocks.SCULK_JAW, SculkJawBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SCULK_JAW.get(), SidedInvWrapper::new);
	}
}