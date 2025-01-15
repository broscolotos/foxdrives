package bidahochi.foxdrives.entities.vehicles;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.EntityCarChest;
import bidahochi.foxdrives.models.ModelWorkday_1980;
import fexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityWorkday1980 extends EntityCarChest {

    public EntityWorkday1980(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityWorkday1980(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Factory Blank");
        textureDescriptionMap.put(1, "Factory Silver W/ Black Stripe");
        textureDescriptionMap.put(2, "Factory Moss Green");
        textureDescriptionMap.put(3, "Bida's Truc");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelWorkday_1980();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/workday/workday_1980_blank", "textures/workday/workday_1980_greyblack", "textures/workday/workday_1980_moss", "textures/workday/workday_1980_bida"};
    }

    @Override
    public CarType type(){
        return CarType.WORKDAY_1980;
    }

}
