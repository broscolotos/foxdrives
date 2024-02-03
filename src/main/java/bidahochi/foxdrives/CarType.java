package bidahochi.foxdrives;

import bidahochi.foxdrives.entities.EntityCar;
import bidahochi.foxdrives.util.ItemCar;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.LinkedHashMap;

/**
 * Non-Enum Car Registry
 * replaces the previous EnumCars
 *
 * @author Ferdinand Calo' (FEX___96)
 */
public class CarType {

	public static LinkedHashMap<String, CarType> REGISTRY = new LinkedHashMap<>();
	public final Class<? extends EntityCar> clazz;
	public final String regname;
	private ItemStack[] recipe;
	private Item item;

	public CarType(String id, Class<? extends EntityCar> carclass){
		regname = id;
		clazz = carclass;
		item = new ItemCar(this, FoxDrives.MODID, FoxDrives.tab);
	}

	public static CarType register(String id, Class<? extends EntityCar> clazz){
		if(REGISTRY.containsKey(id)){
			System.out.println("ERROR: CAR with ID '" + id + "' ALREADY exists!");
			FMLCommonHandler.instance().exitJava(1, true);
			return null;
		}
		CarType type = new CarType(id, clazz);
		REGISTRY.put(id, type);
		return type;
	}

	public CarType recipe(ItemStack... stacks){
		recipe = stacks;
		return this;
	}

	public Item getItem(){
		return item;
	}

	public ItemStack[] getRecipe(){
		return recipe;
	}

	public static Item getItemByClass(Class<? extends EntityCar> carclass){
		for(CarType type : REGISTRY.values()){
			if(type.clazz == carclass) return type.item;
		}
		return null;
	}

}
