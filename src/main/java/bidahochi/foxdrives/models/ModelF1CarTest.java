//FMT-Marker FVTM-1.5
package bidahochi.foxdrives.models;

import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.FDTurboList;
import fexcraft.tmt_slim.ModelRendererTurbo;
import fexcraft.tmt_slim.Vec3f;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.7.5 &copy; 2024 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ModelF1CarTest extends RollingStockModel {

	public ModelF1CarTest(){
		super();
		textureX = 256;
		textureY = 256;
		addToCreators("broscolotos");
		//
		FDTurboList group0 = new FDTurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 156, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0.0625f, 0, -1.875f, 0.0625f, 0, -1.875f, 0.0625f, 0, 0, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f, 0, -0.125f, 0.0625f)
			.setRotationPoint(2.625f, 5.6875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 63, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 1, 1, 4, null)
			.setRotationPoint(0, -4, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 15, 64, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 0, 1.5f, 1).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(4)
			.setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(0, -5, 0).setRotationAngle(0, 0, 0)
		);
		groups.add(group0);
		//
		FDTurboList clipboard = new FDTurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 38, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, -2, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.8125f, 7, -5.1875f).setRotationAngle(-2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 22, textureX, textureY)
			.addShapeBox(-3, -3, -3, 6, 1, 3, 0, -1.5f, 0, 0.125f, -1.5f, 0, 0.125f, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(17.8125f, 7, -5.1875f).setRotationAngle(-2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 41, textureX, textureY)
			.addShapeBox(-3, -1.5f, -3, 1, 3, 3, 0, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(17.8125f, 7, -5.1875f).setRotationAngle(-2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 22, textureX, textureY)
			.addShapeBox(-3, 1.5f, -3, 6, 1, 3, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -1.5f, 0.5f, 0.125f, -1.5f, 0.5f, 0.125f, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0)
			.setRotationPoint(17.8125f, 7, -5.1875f).setRotationAngle(-2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 41, textureX, textureY)
			.addShapeBox(1.5f, -1.5f, -3, 1, 3, 3, 0, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(17.8125f, 7, -5.1875f).setRotationAngle(-2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 33, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, -2.875f, 6, 6, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, -3, 0, -3, -3, 0, -3, -3, 0, 0, -3, 0)
			.setRotationPoint(17.8125f, 7, -5.1875f).setRotationAngle(-2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 38, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.8125f, 7, 5.25f).setRotationAngle(2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 22, textureX, textureY)
			.addShapeBox(-3, -3, 0, 6, 1, 3, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0.125f, -1.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f)
			.setRotationPoint(17.8125f, 7, 5.25f).setRotationAngle(2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 41, textureX, textureY)
			.addShapeBox(-3, -1.5f, 0, 1, 3, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(17.8125f, 7, 5.25f).setRotationAngle(2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 21, textureX, textureY)
			.addShapeBox(-3, 1.5f, 0, 6, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0.125f, -1.5f, 0.5f, 0.125f)
			.setRotationPoint(17.8125f, 7, 5.25f).setRotationAngle(2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 41, textureX, textureY)
			.addShapeBox(1.5f, -1.5f, 0, 1, 3, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(17.8125f, 7, 5.25f).setRotationAngle(2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 33, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 2.875f, 6, 6, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, -3, 0, -3, -3, 0, -3, -3, 0, 0, -3, 0)
			.setRotationPoint(17.8125f, 7, 5.25f).setRotationAngle(2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 38, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, 7, -7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 18, textureX, textureY)
			.addShapeBox(-3, -3, 0, 6, 1, 3, 0, -1.5f, 0, 0.125f, -1.5f, 0, 0.125f, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-14.5f, 7, -8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 41, textureX, textureY)
			.addShapeBox(-3, -1.5f, 0, 1, 3, 3, 0, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, 7, -8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 14, textureX, textureY)
			.addShapeBox(-3, 1.5f, 0, 6, 1, 3, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, -1.5f, 0.5f, 0.125f, -1.5f, 0.5f, 0.125f, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0)
			.setRotationPoint(-14.5f, 7, -8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 40, textureX, textureY)
			.addShapeBox(1.5f, -1.5f, 0, 1, 3, 3, 0, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0.5f, 0, 0.125f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, 7, -8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 33, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, -1.5f, 6, 6, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, -3, 0, -3, -3, 0, -3, -3, 0, 0, -3, 0)
			.setRotationPoint(-14.5f, 7, -6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 36, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 6, textureX, textureY)
			.addShapeBox(-3, -3, 0, 6, 1, 3, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0.125f, -1.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.125f, 0, 0.5f, 0.125f)
			.setRotationPoint(-14.5f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 40, textureX, textureY)
			.addShapeBox(-3, -1.5f, 0, 1, 3, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-14.5f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 5, textureX, textureY)
			.addShapeBox(-3, 1.5f, 0, 6, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0.125f, -1.5f, 0.5f, 0.125f)
			.setRotationPoint(-14.5f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 32, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, 0.875f, 6, 6, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, -3, 0, -3, -3, 0, -3, -3, 0, 0, -3, 0)
			.setRotationPoint(-14.5f, 7, 7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.375f, 0, 0, 1, 0.6875f, 0, -1.375f, 0.6875f, 0, 0, -0.6875f, 0, -0.375f, -0.6875f, 0, 1, -1.375f, 0, -1.375f, -1.375f, 0)
			.setRotationPoint(18.0625f, 7.125f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 40, textureX, textureY)
			.addShapeBox(1.5f, -1.5f, 0, 1, 3, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-14.5f, 7, 5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.375f, 0, 0, 0, 0, 0, -1.375f, 0.3125f, 0, 1, 0.3125f, 0, -0.375f, -0.6875f, 0, 0, -0.6875f, 0, -1.375f, -1, 0, 1, -1, 0)
			.setRotationPoint(16.4375f, 6.6875f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.5f, 0, 0, 0.4375f, 0.6875f, 0, -0.9375f, 0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.6875f, 0, 0.4375f, -1.375f, 0, -0.9375f, -1.375f, 0)
			.setRotationPoint(18.25f, 6, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.3125f, 0, 0, 0, 0, 0, -2.375f, 0.375f, 0, 2.0625f, 0.375f, 0, -0.3125f, -0.625f, 0, 0, -0.625f, 0, -2.375f, -1, 0, 2.0625f, -1, 0)
			.setRotationPoint(16.5f, 5.625f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.1875f, 0, -0.3125f, 0.1875f, 0, -0.3125f, 0.1875f, -0.8125f, 0, 0.1875f, -0.8125f)
			.setRotationPoint(17.5f, 6.4375f, -5.1875f).setRotationAngle(-2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.375f, 0, 0, 0, 0, 0, 0.3125f, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.375f, -0.625f, 0, 0, -0.625f, 0, 0.3125f, -0.8125f, 0, -0.6875f, -0.8125f, 0)
			.setRotationPoint(17.0625f, 6.625f, -5.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -1.375f, 0.6875f, 0, 1, 0.6875f, 0, -0.375f, 0, 0, 0, 0, 0, -1.375f, -1.375f, 0, 1, -1.375f, 0, -0.375f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(18.0625f, 7.125f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 1, 0.3125f, 0, -1.375f, 0.3125f, 0, 0, 0, 0, -0.375f, 0, 0, 1, -1, 0, -1.375f, -1, 0, 0, -0.6875f, 0, -0.375f, -0.6875f, 0)
			.setRotationPoint(16.4375f, 6.6875f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.9375f, 0.6875f, 0, 0.4375f, 0.6875f, 0, -0.5f, 0, 0, 0, 0, 0, -0.9375f, -1.375f, 0, 0.4375f, -1.375f, 0, -0.5f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(18.25f, 6, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 2.0625f, 0.375f, 0, -2.375f, 0.375f, 0, 0, 0, 0, -0.3125f, 0, 0, 2.0625f, -1, 0, -2.375f, -1, 0, 0, -0.625f, 0, -0.3125f, -0.625f, 0)
			.setRotationPoint(16.5f, 5.625f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.6875f, 0.1875f, 0, 0.3125f, 0.1875f, 0, 0, 0, 0, -0.375f, 0, 0, -0.6875f, -0.8125f, 0, 0.3125f, -0.8125f, 0, 0, -0.625f, 0, -0.375f, -0.625f, 0)
			.setRotationPoint(17.0625f, 6.625f, 1.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8125f, -0.3125f, 0, -0.8125f, -0.3125f, 0, 0, 0, 0, 0, 0, 0.1875f, -0.8125f, -0.3125f, 0.1875f, -0.8125f, -0.3125f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(17.5f, 6.4375f, 4.25f).setRotationAngle(2, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0, 0, -0.1875f, 0.40625f, -3.75f, -0.0625f, 0.40625f, -3.75f, -0.0625f, 0, 0, -0.1875f, -0.59375f, 0.3125f, -0.1875f, 0.59375f, 1.9375f, -0.0625f, 0.59375f, 1.9375f, -0.0625f, -0.59375f, 0.3125f, -0.1875f)
			.setRotationPoint(17.125f, 4.15625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamed")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, -0.1875f, -1, 0, -0.1875f, -1, 0, -0.1875f, 0, 0, -0.1875f, 0, 0.3125f, -0.1875f, -0.40625f, 0.3125f, -0.1875f, -0.40625f, 0.3125f, -0.1875f, 0, 0.3125f, -0.1875f)
			.setRotationPoint(17.125f, 4.15625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 3, 3, 0, 0, 0.25f, 0.9375f, 0.4375f, 0, -0.1875f, 0.4375f, 0, -0.1875f, 0, 0.25f, 0.9375f, 0, 0, 0.9375f, 0.4375f, 0.3125f, -0.1875f, 0.4375f, 0.3125f, -0.1875f, 0, 0, 0.9375f)
			.setRotationPoint(7.6875f, 4.15625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.6875f, 0, 0.3125f, -0.3125f, 0, 0.3125f, 0, 0, 0, 0.375f, 0, 0, 0.6875f, -0.75f, 0.3125f, -0.3125f, -0.75f, 0.3125f, 0, -0.75f, 0, 0.375f, -0.75f, 0)
			.setRotationPoint(26.40625f, 9.1875f, -2).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.375f, 0, 0, 0, 0, 0, -0.3125f, 0, 0.3125f, 0.6875f, 0, 0.3125f, 0.375f, -0.75f, 0, 0, -0.75f, 0, -0.3125f, -0.75f, 0.3125f, 0.6875f, -0.75f, 0.3125f)
			.setRotationPoint(26.40625f, 9.1875f, 0).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 1, 0, 0.21875f, -1.21875f, 0, 0.21875f, 0, 0, 0, 0.375f, 0, 0, 1, -0.75f, 0.21875f, -1.21875f, -0.75f, 0.21875f, 0, -0.75f, 0, 0.375f, -0.75f, 0)
			.setRotationPoint(26.09375f, 9.1875f, -8.3125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0.375f, 0, 0, 0, 0, 0, -1.21875f, 0, 0.21875f, 1, 0, 0.21875f, 0.375f, -0.75f, 0, 0, -0.75f, 0, -1.21875f, -0.75f, 0.21875f, 1, -0.75f, 0.21875f)
			.setRotationPoint(26.09375f, 9.1875f, 2.3125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.09375f, 0, 0, 0, 0, 0, 0.09375f, -0.001f, -0.1875f, -0.1875f, 0, -0.1875f, 0.09375f, -0.75f, 0, 0, -0.75f, 0, 0.09375f, -0.751f, -0.1875f, -0.1875f, -0.75f, -0.1875f)
			.setRotationPoint(22.09375f, 9.1875f, -8.53125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.1875f, 0, -0.1875f, 0.09375f, -0.001f, -0.1875f, 0, 0, 0, 0.09375f, 0, 0, -0.1875f, -0.75f, -0.1875f, 0.09375f, -0.751f, -0.1875f, 0, -0.75f, 0, 0.09375f, -0.75f, 0)
			.setRotationPoint(22.09375f, 9.1875f, 7.53125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, -0.28125f, 0, 0, -0.1875f, 0, -0.75f, -0.28125f, 0, -0.75f, 0, 0, 0, -0.28125f, 0, 0, -0.1875f, 0, -0.75f, -0.28125f, 0, -0.75f)
			.setRotationPoint(22.21875f, 7.1875f, -7.96875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.28125f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.28125f, 0, 0, 0, 0, 0, -0.28125f, 0, -0.75f, -0.1875f, 0, -0.75f, -0.28125f, 0, 0, 0, 0, 0)
			.setRotationPoint(22.21875f, 7.1875f, 6.96875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.53125f, -0.75f, 0, -0.875f, -0.75f, 0, 0.03125f, -0.75f, -0.25f, -0.65625f, -0.75f, -0.25f, -0.3125f, 0, 0, 0, 0, 0, 1.625f, 0, 0.40625f, -2.25f, 0, 0.40625f)
			.setRotationPoint(24.875f, 8.1875f, -7.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.09375f, -0.75f, 0, -0.40625f, -0.75f, 0, 0.34375f, -0.75f, -0.71875f, -1, -0.75f, -0.71875f, -0.34375f, 0, 0, 0, 0, 0, 0.90625f, 0, -0.25f, -1.53125f, 0, -0.25f)
			.setRotationPoint(24, 7.9375f, -7.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.125f, -0.71875f, 0, -0.4375f, -0.71875f, 0, 0.1875f, -0.71875f, -0.21875f, -0.84375f, -0.71875f, -0.21875f, -0.3125f, 0, 0, 0, 0, 0, 0.75f, 0, 0.28125f, -1.40625f, 0, 0.28125f)
			.setRotationPoint(23.59375f, 7.6875f, -7.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.65625f, -0.0625f, 0, -0.96875f, -0.0625f, 0, 0.625f, -1, -0.21875f, -1.28125f, -1, -0.21875f, -0.3125f, 0, 0, 0, 0, 0, 0.625f, 0, -0.21875f, -1.28125f, 0, -0.21875f)
			.setRotationPoint(23.15625f, 7.40625f, -7.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.65625f, -0.75f, -0.25f, 0.03125f, -0.75f, -0.25f, -0.875f, -0.75f, 0, 0.53125f, -0.75f, 0, -2.25f, 0, 0.40625f, 1.625f, 0, 0.40625f, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(24.875f, 8.1875f, 2.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -1, -0.75f, -0.71875f, 0.34375f, -0.75f, -0.71875f, -0.40625f, -0.75f, 0, 0.09375f, -0.75f, 0, -1.53125f, 0, -0.25f, 0.90625f, 0, -0.25f, 0, 0, 0, -0.34375f, 0, 0)
			.setRotationPoint(24, 7.9375f, 2.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.84375f, -0.71875f, -0.21875f, 0.1875f, -0.71875f, -0.21875f, -0.4375f, -0.71875f, 0, 0.125f, -0.71875f, 0, -1.40625f, 0, 0.28125f, 0.75f, 0, 0.28125f, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(23.59375f, 7.6875f, 3.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -1.28125f, -1, -0.21875f, 0.625f, -1, -0.21875f, -0.96875f, -0.0625f, 0, 0.65625f, -0.0625f, 0, -1.28125f, 0, -0.21875f, 0.625f, 0, -0.21875f, 0, 0, 0, -0.3125f, 0, 0)
			.setRotationPoint(23.15625f, 7.40625f, 3.71875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.3125f, 0, 0.40625f, 0, 0, 0.40625f, 0, -0.8125f, 0, 0.3125f, -0.8125f, 0, -0.75f, 0, 0.46875f, -0.75f, 0, 0.46875f, -0.75f, -0.8125f, 0, -0.75f, -0.8125f)
			.setRotationPoint(24.25f, 8.9375f, -1.375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.3125f, -0.8125f, 0.40625f, 0, -0.8125f, 0.40625f, 0, 0, 0, 0.3125f, 0, 0, -0.75f, -0.8125f, 0.46875f, -0.75f, -0.8125f, 0.46875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(24.25f, 8.9375f, 0.375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.125f, 0, -0.28125f, 0, 0, -0.28125f, 0, 0, 0, -0.125f, 0, 0, -0.625f, 0, -0.28125f, -0.5f, 0, -0.28125f, -0.5f, 0, 0, -0.625f, 0)
			.setRotationPoint(20.75f, 6.46875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.28125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.28125f, 0, 0, -0.28125f, -0.5f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.28125f, -0.5f, 0)
			.setRotationPoint(21.1875f, 6.46875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.53125f, 0, -0.4375f, -0.53125f, 0, -0.4375f, -0.53125f, -0.65625f, 0, -0.53125f, -0.65625f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.65625f, 0, 0, -0.65625f)
			.setRotationPoint(8.71875f, 2.96875f, -2.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.75f, -0.0625f, -0.4375f, -0.75f, -0.125f, -0.4375f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.0625f, -0.4375f, 0, -0.125f, -0.4375f, 0, 0, 0, 0, 0)
			.setRotationPoint(8.71875f, 2.75f, -5.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, -0.0625f, -0.4375f, -0.625f, -0.125f, -0.4375f, -0.625f, 0.28125f, 0, -0.625f, 0.21875f, 0, 0, -0.0625f, -0.4375f, 0, -0.125f, -0.4375f, 0, 0.28125f, 0, 0, 0.21875f)
			.setRotationPoint(8.71875f, 2.5f, -5.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.0625f, -0.8125f, -0.375f, -0.0625f, -0.8125f, -0.375f, 0.21875f, 0, -0.375f, 0.21875f, 0, 0, -0.0625f, -0.8125f, 0, -0.0625f, -0.8125f, 0, 0.21875f, 0, 0, 0.21875f)
			.setRotationPoint(8.53125f, 2.75f, -5.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.53125f, -0.65625f, -0.4375f, -0.53125f, -0.65625f, -0.4375f, -0.53125f, 0, 0, -0.53125f, 0, 0, 0, -0.65625f, -0.4375f, 0, -0.65625f, -0.4375f, 0, 0, 0, 0, 0)
			.setRotationPoint(8.71875f, 2.96875f, 1.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.75f, 0, -0.4375f, -0.75f, 0, -0.4375f, -0.75f, -0.125f, 0, -0.75f, -0.0625f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.125f, 0, 0, -0.0625f)
			.setRotationPoint(8.71875f, 2.75f, 2.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, 0.21875f, -0.4375f, -0.625f, 0.28125f, -0.4375f, -0.625f, -0.125f, 0, -0.625f, -0.0625f, 0, 0, 0.21875f, -0.4375f, 0, 0.28125f, -0.4375f, 0, -0.125f, 0, 0, -0.0625f)
			.setRotationPoint(8.71875f, 2.5f, 4.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0.21875f, -0.8125f, -0.375f, 0.21875f, -0.8125f, -0.375f, -0.0625f, 0, -0.375f, -0.0625f, 0, 0, 0.21875f, -0.8125f, 0, 0.21875f, -0.8125f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(8.53125f, 2.75f, 4.15625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 14, 0, 0, 0, -0.0625f, 0.4375f, -0.625f, -0.0625f, 0.4375f, -0.625f, -0.0625f, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0.4375f, 0.125f, -0.0625f, 0.4375f, 0.125f, -0.0625f, 0, -0.5f, -0.0625f)
			.setRotationPoint(-11.09375f, 7.96875f, -7).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, -0.0625f, 0.0625f, -0.0625f, -2.8125f, 0.0625f, -0.0625f, -2.8125f, 0, 0, -0.0625f, 0, -0.5f, -0.0625f, 0.0625f, -0.4375f, -2.8125f, 0.0625f, -0.4375f, -2.8125f, 0, -0.5f, -0.0625f)
			.setRotationPoint(8.34375f, 8.59375f, -7).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, 0, 0, -0.3125f, -0.40625f, -0.0625f, -2.0625f, -0.40625f, -0.0625f, -2.0625f, 0, 0, -0.3125f, 0, -0.5f, -0.3125f, -0.40625f, -0.4375f, -2.0625f, -0.40625f, -0.4375f, -2.0625f, 0, -0.5f, -0.3125f)
			.setRotationPoint(10.40625f, 8.65625f, -4.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 3, 0, 0, 0, 0.0625f, -0.1875f, 0, 0.0625f, -0.1875f, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.4375f, 0.0625f, -0.1875f, -0.4375f, 0.0625f, -0.1875f, -0.4375f, 0.0625f, 0, -0.4375f, 0.0625f)
			.setRotationPoint(7.3125f, 7.15625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0, 0, -2.28125f, 0.125f, 0, -2.28125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.40625f, -0.28125f, 0.125f, -0.40625f, -0.28125f, 0.125f, -0.40625f, 0, 0, -0.40625f, 0)
			.setRotationPoint(2.625f, 3.9375f, -5.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0, 0, -0.28125f, 0.125f, 0, -0.28125f, 0.125f, 0, 0, 0, 0, 0, 0, -0.40625f, -0.375f, 0.125f, -0.40625f, -0.375f, 0.125f, -0.40625f, 0, 0, -0.40625f, 0)
			.setRotationPoint(2.625f, 5.53125f, -5.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0, 0, 0, 0, 0, 0.28125f, -0.1875f, 0.125f, 0.4375f, -0.1875f, 0.125f, 0.4375f, 0, 0, 0.28125f, 0)
			.setRotationPoint(2.625f, 7.125f, -5.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -2.28125f, 0, 0, -2.28125f, 0, -0.40625f, 0, 0.125f, -0.40625f, 0, 0.125f, -0.40625f, -0.28125f, 0, -0.40625f, -0.28125f)
			.setRotationPoint(2.625f, 3.9375f, 1.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.28125f, 0, 0, -0.28125f, 0, -0.40625f, 0, 0.125f, -0.40625f, 0, 0.125f, -0.40625f, -0.375f, 0, -0.40625f, -0.375f)
			.setRotationPoint(2.625f, 5.53125f, 1.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.375f, 0, 0, -0.375f, 0, 0.28125f, 0, 0.125f, 0.4375f, 0, 0.125f, 0.4375f, -0.1875f, 0, 0.28125f, -0.1875f)
			.setRotationPoint(2.625f, 7.125f, 1.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -0.15625f, -1, 0, -0.15625f, -0.40625f, 0, 0, 0, 0, 0, 0, -0.40625f, -0.25f, -1, -0.40625f, -0.25f, -0.40625f, -0.40625f, 0, 0, -0.40625f, 0)
			.setRotationPoint(6.75f, 5.53125f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -1, 0, -0.25f, -0.40625f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.0625f, -1, 0.4375f, -0.0625f, -0.40625f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(6.75f, 7.125f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.40625f, 0, 0, -1, 0, -0.15625f, 0, 0, -0.15625f, 0, -0.40625f, 0, -0.40625f, -0.40625f, 0, -1, -0.40625f, -0.25f, 0, -0.40625f, -0.25f)
			.setRotationPoint(6.75f, 5.53125f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.40625f, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0.4375f, 0, -0.40625f, 0.4375f, 0, -1, 0.4375f, -0.0625f, 0, 0.4375f, -0.0625f)
			.setRotationPoint(6.75f, 7.125f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, -0.40625f, 0, 0, -0.40625f, 0, -0.125f, 0, 0, -0.125f, 0, 0.0625f, 0, -0.40625f, 0.0625f, 0, -0.40625f, 0.0625f, -0.125f, 0, 0.0625f, -0.125f)
			.setRotationPoint(6.75f, 5.53125f, -2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0.21875f, -0.0625f, -0.0625f, 0.25f, -0.0625f, -0.0625f, 0.25f, -0.0625f, 0, 0.21875f, -0.0625f, 0, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f, 0, -0.0625f, 0, 0, -0.0625f)
			.setRotationPoint(6.75f, 4.15625f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -2.15625f, -1, 0, -2.15625f, -0.40625f, 0, 0, 0, 0, 0, 0, -0.40625f, -0.15625f, -1, -0.40625f, -0.15625f, -0.40625f, -0.40625f, 0, 0, -0.40625f, 0)
			.setRotationPoint(6.75f, 3.9375f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.40625f, 0, 0, -1, 0, -2.15625f, 0, 0, -2.15625f, 0, -0.40625f, 0, -0.40625f, -0.40625f, 0, -1, -0.40625f, -0.15625f, 0, -0.40625f, -0.15625f)
			.setRotationPoint(6.75f, 3.9375f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 11, 0, 0, 0, -2.78125f, 0.15625f, 0, -2.21875f, 0.15625f, 0, -2.21875f, 0, 0, -2.78125f, 0, -0.375f, -1.125f, 0.15625f, -0.40625f, -0.21875f, 0.15625f, -0.40625f, -0.21875f, 0, -0.375f, -1.125f)
			.setRotationPoint(-1.53125f, 3.9375f, -5.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 11, 0, 0, -0.03125f, -1.125f, 0.15625f, 0, -0.21875f, 0.15625f, 0, -0.21875f, 0, -0.03125f, -1.125f, 0, -0.375f, -1.21875f, 0.15625f, -0.40625f, -0.3125f, 0.15625f, -0.40625f, -0.3125f, 0, -0.375f, -1.21875f)
			.setRotationPoint(-1.53125f, 5.53125f, -5.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 11, 0, 0, -0.03125f, -1.21875f, 0.15625f, 0, -0.3125f, 0.15625f, 0, -0.3125f, 0, -0.03125f, -1.21875f, 0, 0.21875f, -1.03125f, 0.15625f, 0.28125f, -0.125f, 0.15625f, 0.28125f, -0.125f, 0, 0.21875f, -1.03125f)
			.setRotationPoint(-1.53125f, 7.125f, -5.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.84375f, 0.25f, -0.34375f, -0.84375f, 0.25f, -0.34375f, -0.84375f, 0, 0, -0.84375f, 0, 0, 0, 0.25f, -0.34375f, 0, 0.25f, -0.34375f, 0, 0, 0, 0, 0)
			.setRotationPoint(6.8125f, 2.9375f, -4.84375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.84375f, 0, -0.34375f, -0.84375f, 0, -0.34375f, -0.84375f, 0.25f, 0, -0.84375f, 0.25f, 0, 0, 0, -0.34375f, 0, 0, -0.34375f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(6.8125f, 2.9375f, 1.84375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, -0.65625f, -0.8125f, -0.28125f, -0.65625f, -0.8125f, -0.28125f, -0.65625f, 0, 0, -0.65625f, 0, 0, 0, -0.8125f, -0.28125f, 0, -0.8125f, -0.28125f, 0, 0, 0, 0, 0)
			.setRotationPoint(6.8125f, 3.40625f, -6.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.8125f, 0, -0.28125f, -0.8125f, 0, 0.71875f, -0.8125f, 0, -1, -0.8125f, 0, 0, 0, 0, -0.28125f, 0, 0, 0.71875f, 0, 0, -1, 0, 0)
			.setRotationPoint(6.8125f, 5.34375f, -5.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, -0.65625f, 0, -0.28125f, -0.65625f, 0, -0.28125f, -0.65625f, -0.8125f, 0, -0.65625f, -0.8125f, 0, 0, 0, -0.28125f, 0, 0, -0.28125f, 0, -0.8125f, 0, 0, -0.8125f)
			.setRotationPoint(6.8125f, 3.40625f, 5.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -1, -0.8125f, 0, 0.71875f, -0.8125f, 0, -0.28125f, -0.8125f, 0, 0, -0.8125f, 0, -1, 0, 0, 0.71875f, 0, 0, -0.28125f, 0, 0, 0, 0, 0)
			.setRotationPoint(6.8125f, 5.34375f, 2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.1875f, 0.1875f, 0.375f, 0, 0.15625f, 0, 2, 0.09375f, 0.375f, -1.59375f, 0.125f, 0.375f, 0.21875f, 0, 0.375f, -0.0625f, 0, 0, 1.96875f, 0.0625f, 0.375f, -1.5625f, 0, 0.375f)
			.setRotationPoint(9.46875f, 6.6875f, -4).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 1.125f, 0, -0.1875f, -1.53125f, 0, -0.28125f, 0, -0.03125f, 0.375f, 0.1875f, 0, 0, 1.15625f, 0.09375f, -0.1875f, -1.5625f, 0.125f, -0.28125f, -0.0625f, 0.1875f, 0.375f, 0.21875f, 0.125f, 0)
			.setRotationPoint(9.46875f, 6.5f, -6.375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.59375f, 0.125f, 0.375f, 2, 0.09375f, 0.375f, 0, 0.15625f, 0, 0.1875f, 0.1875f, 0.375f, -1.5625f, 0, 0.375f, 1.96875f, 0.0625f, 0.375f, -0.0625f, 0, 0, 0.21875f, 0, 0.375f)
			.setRotationPoint(9.46875f, 6.6875f, 3).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0.1875f, 0, 0, 0, -0.03125f, 0.375f, -1.53125f, 0, -0.28125f, 1.125f, 0, -0.1875f, 0.21875f, 0.125f, 0, -0.0625f, 0.1875f, 0.375f, -1.5625f, 0.125f, -0.28125f, 1.15625f, 0.09375f, -0.1875f)
			.setRotationPoint(9.46875f, 6.5f, 4.375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 9, 0, 0.3125f, 0, -2.3125f, 0, 0, -1.78125f, 0, 0, -1.78125f, 0.3125f, 0, -2.3125f, 0.3125f, -0.40625f, -1, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0.3125f, -0.40625f, -1)
			.setRotationPoint(-5.53125f, 3.9375f, -4.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 9, 0, 0.3125f, 0.03125f, -1, 0, 0, -0.125f, 0, 0, -0.125f, 0.3125f, 0.03125f, -1, 0.3125f, -0.40625f, -1.0625f, 0, -0.40625f, -0.21875f, 0, -0.40625f, -0.21875f, 0.3125f, -0.40625f, -1.0625f)
			.setRotationPoint(-5.53125f, 5.5625f, -4.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 9, 0, 0.3125f, 0, -1.0625f, 0, 0, -0.21875f, 0, 0, -0.21875f, 0.3125f, 0, -1.0625f, 0.3125f, 0, -0.90625f, 0, 0.1875f, -0.03125f, 0, 0.1875f, -0.03125f, 0.3125f, 0, -0.90625f)
			.setRotationPoint(-5.53125f, 7.15625f, -4.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, -1.59375f, 0.375f, 0, -1.3125f, 0.375f, 0, -1.3125f, 0, 0, -1.59375f, 0, -0.40625f, -0.40625f, 0.375f, -0.40625f, 0, 0.375f, -0.40625f, 0, 0, -0.40625f, -0.40625f)
			.setRotationPoint(-8.21875f, 3.9375f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, -0.40625f, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, -0.40625f, 0, -0.375f, -0.46875f, 0.375f, -0.375f, -0.0625f, 0.375f, -0.375f, -0.0625f, 0, -0.375f, -0.46875f)
			.setRotationPoint(-8.21875f, 5.53125f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, -0.46875f, 0.375f, 0, -0.0625f, 0.375f, 0, -0.0625f, 0, 0, -0.46875f, 0, -0.0625f, -0.34375f, 0.375f, 0, 0.09375f, 0.375f, 0, 0.09375f, 0, -0.0625f, -0.34375f)
			.setRotationPoint(-8.21875f, 7.15625f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 7, 0, 0, 0, -1.90625f, -0.125f, 0, -1.59375f, -0.125f, 0, -1.59375f, 0, 0, -1.90625f, 0, -0.40625f, -0.90625f, -0.125f, -0.40625f, -0.40625f, -0.125f, -0.40625f, -0.40625f, 0, -0.40625f, -0.90625f)
			.setRotationPoint(-11.09375f, 3.9375f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 7, 0, 0, 0, -0.90625f, -0.125f, 0, -0.40625f, -0.125f, 0, -0.40625f, 0, 0, -0.90625f, 0, -0.375f, -0.96875f, -0.125f, -0.375f, -0.46875f, -0.125f, -0.375f, -0.46875f, 0, -0.375f, -0.96875f)
			.setRotationPoint(-11.09375f, 5.53125f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, -0.96875f, -0.125f, 0, -0.46875f, -0.125f, 0, -0.46875f, 0, 0, -0.96875f, 0, -0.1875f, -0.875f, -0.125f, -0.0625f, -0.34375f, -0.125f, -0.0625f, -0.34375f, 0, -0.1875f, -0.875f)
			.setRotationPoint(-11.09375f, 7.15625f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 9, 0, 0, 0, -0.03125f, -0.21875f, -0.0625f, -0.0625f, -0.21875f, -0.0625f, 0.5f, 0, 0, 0.53125f, 0, -0.5f, -0.03125f, -0.21875f, -0.4375f, -0.0625f, -0.21875f, -0.4375f, 0.5f, 0, -0.5f, 0.53125f)
			.setRotationPoint(-13.875f, 7.90625f, -4.78125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0.1875f, -0.03125f, 0, 0.1875f, -0.03125f, 0.5f, 0, 0, 0.5f, 0, -0.34375f, 0, 0.1875f, -0.46875f, 0, 0.1875f, -0.46875f, 0.5f, 0, -0.34375f, 0.5f)
			.setRotationPoint(-15.0625f, 7.875f, -4.75f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0.34375f, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, 0, 0.34375f, 0.5f, 0, -0.25f, 0, -0.125f, -0.34375f, 0, -0.125f, -0.34375f, 0.5f, 0, -0.25f, 0.5f)
			.setRotationPoint(-15.9375f, 7.875f, -4.75f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0.34375f, 0, 0.3125f, 0.15625f, 0, 0.3125f, 0.15625f, 0.5f, 0, 0.34375f, 0.5f, 0, -0.0625f, 0, 0.3125f, -0.0625f, 0, 0.3125f, -0.0625f, 0.5f, 0, -0.0625f, 0.5f)
			.setRotationPoint(-17.25f, 7.6875f, -4.75f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -1.1875f, -0.21875f, 0, -0.90625f, -0.21875f, 0, -0.90625f, 0, 0, -1.1875f, 0, -0.40625f, -0.40625f, -0.21875f, -0.40625f, 0.09375f, -0.21875f, -0.40625f, 0.09375f, 0, -0.40625f, -0.40625f)
			.setRotationPoint(-13.875f, 3.9375f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 5, 0, 0, 0, -0.40625f, -0.21875f, 0, 0.09375f, -0.21875f, 0, 0.09375f, 0, 0, -0.40625f, 0, -0.375f, -0.4375f, -0.21875f, -0.375f, 0.03125f, -0.21875f, -0.375f, 0.03125f, 0, -0.375f, -0.4375f)
			.setRotationPoint(-13.875f, 5.53125f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, -0.4375f, -0.21875f, 0, 0.03125f, -0.21875f, 0, 0.03125f, 0, 0, -0.4375f, 0, -0.25f, -0.375f, -0.21875f, -0.1875f, 0.125f, -0.21875f, -0.1875f, 0.125f, 0, -0.25f, -0.375f)
			.setRotationPoint(-13.875f, 7.15625f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f)
			.setRotationPoint(-18.75f, 5.65625f, -0.6875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 26, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 3, 1, 1, 0, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f)
			.setRotationPoint(-16.1875f, 5.4375f, -0.6875f).setRotationAngle(45, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 20, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 3, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-16.1875f, 5.21875f, 0).setRotationAngle(45, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 19, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 3, 1, 1, 0, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f, 0, -0.28125f, -0.28125f)
			.setRotationPoint(-16.1875f, 5.4375f, 0.6875f).setRotationAngle(45, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0, -0.34375f, -0.34375f, 0.25f, -0.34375f, -0.34375f, 0.25f, -0.34375f, -0.34375f, 0.25f, -0.34375f, -0.34375f, 0.25f, -0.34375f)
			.setRotationPoint(-15.125f, 2.8125f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.34375f, -0.4375f, 0, -0.34375f, -0.4375f, 0, -0.34375f, -0.25f, 0, -0.34375f, -0.34375f, -0.5625f, -0.34375f, -0.34375f, -0.5625f, -0.34375f, -0.34375f, -0.5625f, -0.34375f, -0.34375f, -0.5625f, -0.34375f)
			.setRotationPoint(-15.125f, 2.375f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.34375f, -0.4375f, -0.34375f, -0.34375f, -0.65625f, -0.34375f, -0.34375f, -0.65625f, -0.34375f, -0.34375f, -0.4375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.34375f)
			.setRotationPoint(-15.21875f, 1.71875f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.28125f, -0.5f, -0.34375f, -0.15625f, -0.3125f, -0.34375f, -0.15625f, -0.3125f, -0.34375f, -0.28125f, -0.5f, -0.34375f, -0.34375f, -0.34375f, -0.34375f, -0.15625f, -0.46875f, -0.34375f, -0.15625f, -0.46875f, -0.34375f, -0.34375f, -0.34375f, -0.34375f)
			.setRotationPoint(-15.71875f, 1.84375f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, -0.1875f, 0.0625f, 0, -0.1875f, 0.0625f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.8125f, -0.1875f, 0.0625f, -0.8125f, -0.1875f, 0.0625f, -0.8125f, -0.1875f, 0, -0.8125f, -0.1875f)
			.setRotationPoint(-16.46875f, 2.46875f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, -0.1875f, -0.625f, 0.125f, -0.1875f, -0.625f, 0.125f, -0.1875f, 0, 0, -0.1875f, 0, -0.8125f, -0.1875f, -0.625f, -0.9375f, -0.1875f, -0.625f, -0.9375f, -0.1875f, 0, -0.8125f, -0.1875f)
			.setRotationPoint(-15.40625f, 2.46875f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0.625f, -0.1875f, 0.0625f, 0, -0.1875f, 0.0625f, 0, -0.1875f, 0, 0.625f, -0.1875f, 0, -1.4375f, -0.1875f, 0.0625f, -0.8125f, -0.1875f, 0.0625f, -0.8125f, -0.1875f, 0, -1.4375f, -0.1875f)
			.setRotationPoint(-17.53125f, 2.46875f, -3.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, -0.03125f, 0, 0, -0.03125f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.3125f, 0, -0.03125f, 0.3125f, 0, -0.03125f, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f)
			.setRotationPoint(-17.8125f, 1.65625f, -3.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.34375f, 0, 0, 0.34375f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0.46875f, 0, 0.34375f, 0.46875f, 0, 0.34375f, 0.46875f, -0.8125f, 0, 0.46875f, -0.8125f)
			.setRotationPoint(-19.15625f, 2.5f, -3.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.8125f, -0.03125f, 0, -0.8125f, -0.03125f, 0, 0, 0, 0, 0, 0, 0.3125f, -0.8125f, -0.03125f, 0.3125f, -0.8125f, -0.03125f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-17.8125f, 1.65625f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.8125f, 0.34375f, 0, -0.8125f, 0.34375f, 0, 0, 0, 0, 0, 0, 0.46875f, -0.8125f, 0.34375f, 0.46875f, -0.8125f, 0.34375f, 0.46875f, 0, 0, 0.46875f, 0)
			.setRotationPoint(-19.15625f, 2.5f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.28125f, -0.84375f, 0.3125f, -0.28125f, -0.84375f, 0.3125f, -0.28125f, -0.03125f, 0, -0.28125f, -0.03125f)
			.setRotationPoint(-19.15625f, 3.96875f, -3.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 1.03125f, 0, 0, 0.09375f, 0, 0, 0.09375f, 0, -0.875f, 1.03125f, 0, -0.875f, 0, 0.40625f, 0, 0.09375f, 0.40625f, 0, 0.09375f, 0.40625f, -0.875f, 0, 0.40625f, -0.875f)
			.setRotationPoint(-17.9375f, 4.6875f, -2.59375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 1.03125f, 0, -0.875f, 0.09375f, 0, -0.875f, 0.09375f, 0, 0, 1.03125f, 0, 0, 0, 0.40625f, -0.875f, 0.09375f, 0.40625f, -0.875f, 0.09375f, 0.40625f, 0, 0, 0.40625f, 0)
			.setRotationPoint(-17.9375f, 4.6875f, 1.59375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.8125f, 0.3125f, 0, -0.8125f, 0.3125f, 0, 0, 0, 0, 0, 0, -0.28125f, -0.03125f, 0.3125f, -0.28125f, -0.03125f, 0.3125f, -0.28125f, -0.84375f, 0, -0.28125f, -0.84375f)
			.setRotationPoint(-19.15625f, 3.96875f, 2.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.03125f, -0.25f, 0, -0.03125f, -0.25f, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.6875f, -0.03125f, -0.25f, -0.6875f, -0.03125f, -0.25f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-17.40625f, 5.21875f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, -0.1875f, -0.25f, -0.5f, -0.1875f, -0.25f, 0, -0.03125f, 0, 0, -0.03125f, 0, -0.1875f, -0.1875f, -0.25f, -0.1875f, -0.1875f, -0.25f, -0.6875f, -0.03125f, 0, -0.6875f, -0.03125f)
			.setRotationPoint(-17.40625f, 5.21875f, 0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, -0.09375f, 0.25f, -0.3125f, -0.09375f, 0.25f, -0.3125f, 0, 0, -0.3125f, 0, 1.3125f, 0, -0.09375f, 0.78125f, 0, -0.09375f, 0.78125f, 0, 0, 1.3125f, 0, 0)
			.setRotationPoint(0.90625f, 2.9375f, -2.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.3125f, 0, 0.25f, -0.3125f, 0, 0.25f, -0.3125f, -0.09375f, 0, -0.3125f, -0.09375f, 1.3125f, 0, 0, 0.78125f, 0, 0, 0.78125f, 0, -0.09375f, 1.3125f, 0, -0.09375f)
			.setRotationPoint(0.90625f, 2.9375f, 1.5625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 2, 0, 0, -0.8125f, 0, 0.5f, -0.8125f, 0.65625f, 0.5f, -0.8125f, 0.46875f, 0, -0.8125f, -0.1875f, 0, 0, 0, 0.5f, 0, 0.65625f, 0.5f, 0, 0.46875f, 0, 0, -0.1875f)
			.setRotationPoint(-13.875f, 2.9375f, -0.90625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.03125f, 0.03125f, 0.02f, 0, 0.03125f, -0.78125f, 0, 0.03125f, -0.78125f, 0.03125f, 0.03125f, 0.02f, 0.03125f, 0, 0.02f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0.03125f, 0, 0.02f)
			.setRotationPoint(1.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0.03125f, 0, -0.59375f, -0.25f, 0, -0.53125f, -0.25f, 0, -0.53125f, 0.03125f, 0, -0.59375f, 0.03125f, 0.09375f, 0.0625f, -0.25f, 0.03125f, 0.52f, -0.25f, 0.03125f, 0.52f, 0.03125f, 0.09375f, 0.0625f)
			.setRotationPoint(-2.15625f, 0.6875f, -1).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0.125f, -0.15625f, -0.5f, 0, -0.03125f, -0.4375f, 0, -0.03125f, -0.4375f, 0.125f, -0.15625f, -0.5f, 0.125f, 0, -0.213f, 0, 0, -0.129f, 0, 0, -0.129f, 0.125f, 0, -0.213f)
			.setRotationPoint(-4.1875f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.09375f, -0.875f, -0.71875f, 0, -0.75f, -0.71875f, 0, -0.75f, -0.71875f, 0.09375f, -0.875f, -0.71875f, 0.09375f, 0, -0.09375f, 0, 0, -0.01f, 0, 0, -0.01f, 0.09375f, 0, -0.09375f)
			.setRotationPoint(-13.78125f, 2.75f, -1).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, -0.75f, -1.21875f, 0.46875f, -0.15625f, -0.5f, 0.46875f, -0.15625f, -0.5f, 0, -0.75f, -1.21875f, 0, 0, -0.51f, 0.46875f, 0, -0.213f, 0.46875f, 0, -0.213f, 0, 0, -0.51f)
			.setRotationPoint(-11.78125f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0.03125f, -0.03125f, -0.4375f, -0.25f, 0.03125f, 0.02f, -0.25f, 0.03125f, 0.02f, 0.03125f, -0.03125f, -0.4375f, 0.03125f, 0, -0.129f, -0.25f, 0, 0.02f, -0.25f, 0, 0.02f, 0.03125f, 0, -0.129f)
			.setRotationPoint(-2.15625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.40625f, -0.625f, 0.125f, 0, -0.59375f, 0.125f, 0, -0.59375f, 0, -0.40625f, -0.625f, 0, 0.21875f, 0, 0.125f, 0.09375f, 0.0625f, 0.125f, 0.09375f, 0.0625f, 0, 0.21875f, 0)
			.setRotationPoint(-4.3125f, 0.6875f, -1).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 3, 0, 0, -2.59375f, -1.21875f, 0.46875f, -0.1875f, -1.125f, 0.46875f, -0.1875f, -1.125f, 0, -2.59375f, -1.21875f, 0, 0.59375f, -1.21875f, 0.46875f, 0, -0.5f, 0.46875f, 0, -0.5f, 0, 0.59375f, -1.21875f)
			.setRotationPoint(-11.78125f, 0.90625f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0.0625f, -0.40625f, 0.4375f, 0, -0.40625f, 0.4375f, 0, -0.40625f, 0, 0.0625f, -0.40625f, 0, 0.3125f, -0.40625f, 0.4375f, 0.3125f, -0.40625f, 0.4375f, 0.3125f, -0.40625f, 0, 0.3125f, -0.40625f)
			.setRotationPoint(-7.625f, 0.6875f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, -2.21875f, -0.4375f, 0.21875f, -0.9375f, -0.40625f, 0.21875f, -0.9375f, -0.40625f, 0, -2.21875f, -0.4375f, 0, 1.3125f, -0.4375f, 0.21875f, 0.3125f, -0.40625f, 0.21875f, 0.3125f, -0.40625f, 0, 1.3125f, -0.4375f)
			.setRotationPoint(-13.84375f, 0.6875f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.53125f, -0.5f, 0, -0.53125f, -0.5f, 0, -0.53125f, 0, 0, -0.53125f, 0, 0.40625f, 0.197f, -0.5f, 0.40625f, 0.197f, -0.5f, 0.40625f, 0.197f, 0, 0.40625f, 0.197f)
			.setRotationPoint(1.59375f, 0.6875f, -1).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.53125f, -0.65625f, -0.25f, -0.21875f, -0.65625f, -0.25f, -0.21875f, -0.65625f, -0.25f, 0.53125f, -0.65625f, -0.25f, 0.375f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.375f, 0, -0.25f)
			.setRotationPoint(0.59375f, -0.3125f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3125f, -0.65625f, -0.03125f, 0, -0.65625f, 0, 0, -0.65625f, 0.5625f, 0.3125f, -0.65625f, 0.53125f, 0.3125f, 0, -0.03125f, 0, 0, 0, 0, 0, 0.5625f, 0.3125f, 0, 0.53125f)
			.setRotationPoint(0.375f, -0.65625f, -0.78125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.3125f, 0.0625f)
			.setRotationPoint(0.609375f, 0.6875f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.375f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.3125f, 0.0625f, -0.21875f, -0.375f, 0.0625f)
			.setRotationPoint(0.046875f, 0.6875f, -1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 2.25f, 0, 0.0625f, 2.25f, 0, 0.0625f, 0, 0, 0.0625f)
			.setRotationPoint(2.625f, 7.5625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.40625f, 0, 0, -0.40625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.65625f, 0, 0.0625f, -0.65625f, 0, 0.0625f, -0.65625f, -0.75f, 0, -0.65625f, -0.75f)
			.setRotationPoint(9.25f, 3.6875f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.75f, 0, 0, -0.75f, -0.90625f, -0.15625f, 0, 1.03125f, -0.15625f, 0, 1.03125f, -0.15625f, -0.75f, -0.90625f, -0.15625f, -0.75f)
			.setRotationPoint(8.8125f, 2.84375f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.75f, 0, 0, -0.75f, -0.34375f, -0.65625f, 0, 0.0625f, -0.65625f, 0, 0.0625f, -0.65625f, -0.75f, -0.34375f, -0.65625f, -0.75f)
			.setRotationPoint(7.8125f, 2.5f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.40625f, -0.5625f, 0.125f, 0, -0.625f, 0.125f, 0, -0.625f, 0.125f, 0.40625f, -0.5625f, 0.125f, 0.40625f, 0.0625f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.40625f, 0.0625f, 0.125f)
			.setRotationPoint(8.0625f, 1.46875f, -0.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.15625f, -1, 0, 0.15625f, -1, 0, -0.59375f, 0, 0, -0.59375f, 0, -0.59375f, 0, -0.5625f, -0.59375f, 0, -0.5625f, -0.59375f, -0.75f, 0, -0.59375f, -0.75f)
			.setRotationPoint(9.0625f, 2.09375f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.65625f, 0, 0, -0.65625f, 0, 0, -0.65625f, -0.75f, 0, -0.65625f, -0.75f)
			.setRotationPoint(8.0625f, 2.15625f, -0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.78125f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, -0.5f, 0.40625f, -0.5625f, -0.5f, 0.78125f, 0.09375f, 0, -0.625f, 0, 0, 0, 0, -0.5f, 0.40625f, 0.0625f, -0.5f)
			.setRotationPoint(8.0625f, 1.46875f, -1.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.03125f, -0.6875f, 0, -0.75f, -0.6875f, 0, 0, -0.625f, -0.5f, 0.15625f, -0.625f, -0.5f, 1.03125f, 0.15625f, 0, -0.75f, 0.0625f, 0, 0, 0, -0.5f, 0.15625f, 0.09375f, -0.5f)
			.setRotationPoint(7.4375f, 1.46875f, -1.625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.71875f, -0.03125f, -0.75f, -0.71875f, -0.09375f, 0.28125f, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0, 0.09375f, -0.03125f, -0.75f, 0.09375f, -0.09375f, 0.28125f, 0, -0.5f, 0, 0.09375f, -0.5f)
			.setRotationPoint(6.40625f, 1.53125f, -2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.84375f, -0.03125f, 0, -0.71875f, -0.03125f, 0, -0.625f, -0.5f, 0, -0.84375f, -0.5f, 0, 0.3125f, -0.03125f, 0, 0.09375f, -0.03125f, 0, 0.09375f, -0.5f, 0, 0.3125f, -0.5f)
			.setRotationPoint(5.40625f, 1.53125f, -2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.84375f, -0.03125f, 0.125f, -0.4375f, -0.03125f, 0.125f, -0.4375f, -0.5f, 0, -0.84375f, -0.5f, 0, 0.3125f, -0.03125f, 0.125f, -0.09375f, -0.03125f, 0.1875f, -0.09375f, -0.5f, 0, 0.3125f, -0.5f)
			.setRotationPoint(3.28125f, 1.9375f, -2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, -0.03125f, -0.125f, -0.53125f, -0.03125f, -0.125f, -0.53125f, -0.5f, 0, -1, -0.5f, 0, 0, -0.03125f, -0.125f, 0, -0.03125f, -0.125f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(1.40625f, 2.25f, -2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.40625f, -0.5625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, -0.625f, 0, 0.78125f, -0.625f, 0, 0.40625f, 0.0625f, -0.5f, 0, 0, -0.5f, -0.625f, 0, 0, 0.78125f, 0.09375f, 0)
			.setRotationPoint(8.0625f, 1.46875f, 0.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.15625f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.75f, -0.6875f, 0, 1.03125f, -0.6875f, 0, 0.15625f, 0.09375f, -0.5f, 0, 0, -0.5f, -0.75f, 0.0625f, 0, 1.03125f, 0.15625f, 0)
			.setRotationPoint(7.4375f, 1.46875f, 0.625f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, -0.5f, 0.28125f, -0.625f, -0.5f, -0.75f, -0.71875f, -0.09375f, 0, -0.71875f, -0.03125f, 0, 0.09375f, -0.5f, 0.28125f, 0, -0.5f, -0.75f, 0.09375f, -0.09375f, 0, 0.09375f, -0.03125f)
			.setRotationPoint(6.40625f, 1.53125f, 1.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.84375f, -0.5f, 0, -0.625f, -0.5f, 0, -0.71875f, -0.03125f, 0, -0.84375f, -0.03125f, 0, 0.3125f, -0.5f, 0, 0.09375f, -0.5f, 0, 0.09375f, -0.03125f, 0, 0.3125f, -0.03125f)
			.setRotationPoint(5.40625f, 1.53125f, 1.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.84375f, -0.5f, 0.125f, -0.4375f, -0.5f, 0.125f, -0.4375f, -0.03125f, 0, -0.84375f, -0.03125f, 0, 0.3125f, -0.5f, 0.1875f, -0.09375f, -0.5f, 0.125f, -0.09375f, -0.03125f, 0, 0.3125f, -0.03125f)
			.setRotationPoint(3.28125f, 1.9375f, 1.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, -0.5f, -0.125f, -0.53125f, -0.5f, -0.125f, -0.53125f, -0.03125f, 0, -1, -0.03125f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.03125f, 0, 0, -0.03125f)
			.setRotationPoint(1.40625f, 2.25f, 1.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.9375f, -0.15625f, -0.78125f, -0.9375f, -0.15625f, -0.78125f, -0.9375f, -0.15625f, 0, -0.9375f, -0.15625f, 0, 0, -0.15625f, -0.78125f, 0, -0.15625f, -0.78125f, 0, -0.15625f, 0, 0, -0.15625f)
			.setRotationPoint(-13.8125f, 2.3125f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, -0.15625f, -0.78125f, -0.8125f, -0.15625f, -0.78125f, -0.8125f, -0.625f, 0, -0.8125f, -0.625f, 0, 0, -0.15625f, -0.78125f, 0, -0.15625f, -0.78125f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-13.8125f, 2.5f, -2.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8125f, -0.625f, -0.78125f, -0.8125f, -0.625f, -0.78125f, -0.8125f, -0.15625f, 0, -0.8125f, -0.15625f, 0, 0, -0.625f, -0.78125f, 0, -0.625f, -0.78125f, 0, -0.15625f, 0, 0, -0.15625f)
			.setRotationPoint(-13.8125f, 2.5f, 1.5f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.75f, -0.25f, -0.4375f, -0.71875f, -0.25f, 0.625f, -0.59375f, 0, -1.03125f, -0.59375f, 0, 0, 0, -0.25f, -0.4375f, 0, -0.25f, 0.625f, -0.15625f, 0, -1.03125f, -0.15625f, 0)
			.setRotationPoint(-16.15625f, 5.15625f, 0.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -1.03125f, -0.59375f, 0, 0.625f, -0.59375f, 0, -0.4375f, -0.71875f, -0.25f, 0, -0.75f, -0.25f, -1.03125f, -0.15625f, 0, 0.625f, -0.15625f, 0, -0.4375f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-16.15625f, 5.15625f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5625f, -0.28125f, 0, -0.5625f, -0.28125f, 0, 0, 0, 0, 0, 0, 0.15625f, -0.5625f, -0.28125f, 0.15625f, -0.5625f, -0.28125f, 0.15625f, 0, 0, 0.15625f, 0)
			.setRotationPoint(-14.84375f, 6.4375f, 4.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, -0.125f, 0, 0, -0.125f, 0, -0.4375f, 0, -0.0625f, -0.4375f, 0, -0.0625f, -0.4375f, -0.125f, 0, -0.4375f, -0.125f)
			.setRotationPoint(-14.6875f, 6.5f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.28125f, 0, 0, -0.28125f, 0, -0.5625f, 0, 0, -0.5625f, 0, 0.15625f, 0, -0.28125f, 0.15625f, 0, -0.28125f, 0.15625f, -0.5625f, 0, 0.15625f, -0.5625f)
			.setRotationPoint(-14.84375f, 6.4375f, -5.4375f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.09375f, 0, 0, 0, 0, 0, -2.15625f, -0.59375f, 0.1875f, 2.09375f, -0.59375f, 0.1875f, -0.09375f, -0.625f, 0, 0, -0.625f, 0, -2.15625f, -0.03125f, 0.1875f, 2.09375f, -0.03125f, 0.1875f)
			.setRotationPoint(-12.59375f, 5.375f, 2.25f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 2.09375f, -0.59375f, 0.1875f, -2.15625f, -0.59375f, 0.1875f, 0, 0, 0, -0.09375f, 0, 0, 2.09375f, -0.03125f, 0.1875f, -2.15625f, -0.03125f, 0.1875f, 0, -0.625f, 0, -0.09375f, -0.625f, 0)
			.setRotationPoint(-12.59375f, 5.375f, -5.25f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.34375f, 0, 0, 0, 0, 0, -0.78125f, 0, 0.3125f, 0.4375f, 0, 0.3125f, -0.34375f, -0.59375f, 0, 0, -0.59375f, 0, -0.78125f, -0.59375f, 0.3125f, 0.4375f, -0.59375f, 0.3125f)
			.setRotationPoint(-13.78125f, 6.5625f, 2.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.4375f, 0, 0.3125f, -0.78125f, 0, 0.3125f, 0, 0, 0, -0.34375f, 0, 0, 0.4375f, -0.59375f, 0.3125f, -0.78125f, -0.59375f, 0.3125f, 0, -0.59375f, 0, -0.34375f, -0.59375f, 0)
			.setRotationPoint(-13.78125f, 6.5625f, -5.125f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -1.96875f, 1.75f, 0, -1.96875f, -2.625f, 0, 0, -0.875f, 0, -0.875f, 0, 0, 1.09375f, 1.75f, 0, 1.09375f, -2.625f, 0, -0.875f, -0.875f)
			.setRotationPoint(-12.84375f, 5.90625f, 3.96875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.875f, 0, -1.96875f, -2.625f, 0, -1.96875f, 1.75f, 0, 0, 0, 0, -0.875f, -0.875f, 0, 1.09375f, -2.625f, 0, 1.09375f, 1.75f, 0, -0.875f, 0)
			.setRotationPoint(-12.84375f, 5.90625f, -4.96875f).setRotationAngle(0, 0, 0).setName("waunnamedcp")
		);
		groups.add(clipboard);
		//
	}

}
