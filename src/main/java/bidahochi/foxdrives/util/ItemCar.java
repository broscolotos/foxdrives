package bidahochi.foxdrives.util;

import bidahochi.foxdrives.entities.EntityCar;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCar extends Item {
    /**the class for the entity*/
    private final Class<? extends EntityCar> transport;


    /**the main constructor.
     * @param cart the class for the entity*/
    public ItemCar(Class<? extends EntityCar> cart, String MODID, CreativeTabs tabs) {
        super();
        setUnlocalizedName(cart.getName().replace(" ",""));
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
            worldObj.spawnEntityInWorld(transport.getConstructor(World.class, double.class, double.class, double.class)
                    .newInstance(worldObj, posX + 0.5D, posY+1, posZ + 0.5D));
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
