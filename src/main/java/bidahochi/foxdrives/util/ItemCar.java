package bidahochi.foxdrives.util;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCar extends Item {
    /**the class for the entity*/
    private final CarType transport;


    /**the main constructor.
     * @param cart the class for the entity*/
    public ItemCar(CarType cart, String MODID, CreativeTabs tabs) {
        super();
        transport=cart;
        setTextureName(MODID+":transports/"+getUnlocalizedName());
        setCreativeTab(tabs);
    }
    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer playerEntity, World worldObj, int posX, int posY, int posZ, int blockSide, float pointToRayX, float pointToRayY, float pointToRayZ) {
        if(worldObj.isRemote){
            return true;
        }
        try {
            EntityCar ent = transport.clazz.getConstructor(World.class, double.class, double.class, double.class)
                    .newInstance(worldObj, posX + 0.5D, posY+1, posZ + 0.5D);
            ent.rotationYaw = playerEntity.rotationYaw;
            ent.getDataWatcher().updateObject(21, ent.rotationYaw);
            worldObj.spawnEntityInWorld(ent);
            if (!playerEntity.capabilities.isCreativeMode) {
                itemStack.stackSize--;
                if (itemStack.stackSize <= 0) {
                    itemStack = null;
                }
            }
            return true;
        } catch (Exception ignored){ignored.printStackTrace();}
        return true;
    }

}
