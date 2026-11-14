package net.imspidey.dropped_and_loaded.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PalePumpkinBlockBlock extends Block {
	public PalePumpkinBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f).pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.DIDGERIDOO));
	}
}