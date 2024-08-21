package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.models.ModelWorkday_1980;
import bidahochi.foxdrives.models.ModelWorkday_1980_Utility;
import fexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityWorkday1980Utility extends EntityCarChest {

    public EntityWorkday1980Utility(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityWorkday1980Utility(World p_i1685_1_) {
        super(p_i1685_1_);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelWorkday_1980_Utility();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/workday/workday_1980_utility_blank"};
    }

    @Override
    public CarType type(){
        return CarType.WORKDAY_1980_Utility;
    }

}
