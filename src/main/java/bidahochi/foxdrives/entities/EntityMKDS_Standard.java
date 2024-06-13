package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.models.ModelRedmund1972;
import bidahochi.foxdrives.models.Modelmkds_standard;
import fexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityMKDS_Standard extends EntityCarChest {

    public EntityMKDS_Standard(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityMKDS_Standard(World p_i1685_1_) {
        super(p_i1685_1_);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new Modelmkds_standard();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/mkds_standard_mr", "textures/mkds_standard_lr"};
    }

    @Override
    public CarType type(){
        return CarType.MKDS_Standard;
    }


}
