package bidahochi.foxdrives.entities.vehicles;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.EntityCarChest;
import bidahochi.foxdrives.models.ModelCruisegoer;
import fexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityCruisegoer extends EntityCarChest {

    public EntityCruisegoer(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityCruisegoer(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Factory White");
        textureDescriptionMap.put(1, "Ordinary Life");
        textureDescriptionMap.put(2, "");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelCruisegoer();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/cruisegoer/jmc_cruisegoer_white", "textures/cruisegoer/jmc_cruisegoer_cyan"};
    }

    @Override
    public CarType type(){
        return CarType.CRUISEGOER;
    }

}
