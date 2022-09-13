package bidahochi.foxdrives.util;

import bidahochi.foxdrives.entities.EntityCarChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerCarInventory extends Container {
    private IInventory field_111243_a;
    private EntityCarChest car;

    public ContainerCarInventory(IInventory invPlayer, final EntityCarChest p_i1817_3_) {
        this.field_111243_a = p_i1817_3_;
        this.car = p_i1817_3_;
        byte b0 = 3;
        p_i1817_3_.openInventory();
        int i = (b0 - 4) * 18;
        this.addSlotToContainer(new Slot(p_i1817_3_, 0, 8, 18));

        this.addSlotToContainer(new Slot(p_i1817_3_, 1, 8, 36));
        int j;
        int k;

        for (j = 0; j < b0; ++j) {
            for (k = 0; k < 5; ++k) {
                this.addSlotToContainer(new Slot(p_i1817_3_, 2 + k + j * 5, 80 + k * 18, 18 + j * 18));
            }
        }

        for (j = 0; j < 3; ++j) {
            for (k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(invPlayer, k + j * 9 + 9, 8 + k * 18, 102 + j * 18 + i));
            }
        }

        for (j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(invPlayer, j, 8 + j * 18, 160 + i));
        }
    }

    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return this.field_111243_a.isUseableByPlayer(p_75145_1_) && this.car.isEntityAlive()
                && this.car.getDistanceToEntity(p_75145_1_) < 8.0F;
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ < this.field_111243_a.getSizeInventory()) {
                if (!this.mergeItemStack(itemstack1, this.field_111243_a.getSizeInventory(), this.inventorySlots.size(), true)) {
                    return null;
                }
            }
            else if (this.getSlot(1).isItemValid(itemstack1) && !this.getSlot(1).getHasStack()) {
                if (!this.mergeItemStack(itemstack1, 1, 2, false)) {
                    return null;
                }
            }
            else if (this.getSlot(0).isItemValid(itemstack1)) {
                if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
                    return null;
                }
            }
            else if (this.field_111243_a.getSizeInventory() <= 2 || !this.mergeItemStack(itemstack1, 2, this.field_111243_a.getSizeInventory(), false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    /**
     * Called when the container is closed.
     */
    public void onContainerClosed(EntityPlayer p_75134_1_)
    {
        super.onContainerClosed(p_75134_1_);
        this.field_111243_a.closeInventory();
    }
}
