package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.io.File;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class ConfigHandler {
    public static float SPEED_MULTIPLIER;
    public static boolean DO_WRAP_ANIMATION;

    public static void init(File configFile) {
        Configuration cf = new Configuration(configFile);

        try {
            cf.load();
            /* General */
            Property SPEED_MULTIPLIER_PROP = cf.get(CATEGORY_GENERAL, "SPEED_MULTIPLIER", 1.0);
            SPEED_MULTIPLIER_PROP.comment = "This is a value to modify the maximum speed of every vehicle in the mod. Default value is 1.0.";
            SPEED_MULTIPLIER = (float) SPEED_MULTIPLIER_PROP.getDouble();
            Property DO_WRAP_ANIMATION_PROP = cf.get(CATEGORY_GENERAL, "DO_WRAP_ANIMATION", true);
            DO_WRAP_ANIMATION_PROP.comment = "This value sets whether the Car Wrap GUI menu will animate the models by default.";
            DO_WRAP_ANIMATION = DO_WRAP_ANIMATION_PROP.getBoolean();

        } catch (Exception e) {
            FoxDrives.fdLog.fatal("FoxDrives had a problem loading its configuration\n" + e);
        }
        finally {
            if (cf.hasChanged()) {
                cf.save();
            }
        }
    }
}
