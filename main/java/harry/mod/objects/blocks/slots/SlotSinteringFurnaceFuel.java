package harry.mods.tutorialmod.blocks.slots;

import harry.mods.tutorialmod.blocks.tileentity.TileEntitySinteringFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSinteringFurnaceFuel extends Slot
{
	public SlotSinteringFurnaceFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntitySinteringFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}
