//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: JMC Cruisegoer
// Model Creator: bida
// Created on: 15.02.2024 - 14:18:38
// Last changed on: 15.02.2024 - 14:18:38

package bidahochi.foxdrives.models; //Path where the model is located


import bidahochi.foxdrives.util.BoxName;
import fexcraft.tmt_slim.ModelConverter;
import fexcraft.tmt_slim.ModelRendererTurbo;

public class ModelCruisegoer extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelCruisegoer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[59];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "wheel front"); // Box 136 Wheel1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 59, textureX, textureY, "wheel front"); // Box 9 Wheel1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "wheel front"); // Box 12 Wheel1
		bodyModel[3] = new ModelRendererTurbo(this, 19, 57, textureX, textureY, "wheel front"); // Box 17 Wheel1
		bodyModel[4] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "wheel front"); // Box 136 Wheel2
		bodyModel[5] = new ModelRendererTurbo(this, 1, 59, textureX, textureY, "wheel front"); // Box 9 Wheel2
		bodyModel[6] = new ModelRendererTurbo(this, 1, 47, textureX, textureY, "wheel front"); // Box 12 Wheel2
		bodyModel[7] = new ModelRendererTurbo(this, 19, 57, textureX, textureY, "wheel front"); // Box 17 Wheel2
		bodyModel[8] = new ModelRendererTurbo(this, 45, 28, textureX, textureY); // Box 23 axle 1-2
		bodyModel[9] = new ModelRendererTurbo(this, 10, 51, textureX, textureY, "wheel"); // Box 136 Wheel3
		bodyModel[10] = new ModelRendererTurbo(this, 10, 59, textureX, textureY, "wheel"); // Box 9 Wheel3
		bodyModel[11] = new ModelRendererTurbo(this, 10, 47, textureX, textureY, "wheel"); // Box 12 Wheel3
		bodyModel[12] = new ModelRendererTurbo(this, 19, 50, textureX, textureY, "wheel"); // Box 17 Wheel3
		bodyModel[13] = new ModelRendererTurbo(this, 10, 51, textureX, textureY, "wheel"); // Box 136 Wheel4
		bodyModel[14] = new ModelRendererTurbo(this, 10, 59, textureX, textureY, "wheel"); // Box 9 Wheel4
		bodyModel[15] = new ModelRendererTurbo(this, 10, 47, textureX, textureY, "wheel"); // Box 12 Wheel4
		bodyModel[16] = new ModelRendererTurbo(this, 19, 50, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[17] = new ModelRendererTurbo(this, 3, 28, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 32, 54, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 73, 54, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 74, 41, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 73, 14, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 78, 29, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 52, 19, textureX, textureY); // Box 70 door swing left
		bodyModel[26] = new ModelRendererTurbo(this, 52, 10, textureX, textureY); // Box 72 door swing right
		bodyModel[27] = new ModelRendererTurbo(this, 45, 1, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 1, 28, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 3, 20, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 3, 20, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 115, 10, textureX, textureY, BoxName.headLight); // Box 39 headlight
		bodyModel[33] = new ModelRendererTurbo(this, 115, 10, textureX, textureY, BoxName.headLight); // Box 40 headlight
		bodyModel[34] = new ModelRendererTurbo(this, 115, 17, textureX, textureY, BoxName.rightTurnLight); // Box 41 turnlight r
		bodyModel[35] = new ModelRendererTurbo(this, 115, 17, textureX, textureY, BoxName.leftTurnLight); // Box 42 turnlight l
		bodyModel[36] = new ModelRendererTurbo(this, 51, 35, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 120, 25, textureX, textureY, BoxName.brakeLight); // Box 46 taillight
		bodyModel[38] = new ModelRendererTurbo(this, 120, 25, textureX, textureY, BoxName.brakeLight); // Box 47 taillight
		bodyModel[39] = new ModelRendererTurbo(this, 119, 28, textureX, textureY); // Box 195 emblem
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 85, 6, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 85, 6, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 21, 39, textureX, textureY); // Box 226 steeringwhool
		bodyModel[45] = new ModelRendererTurbo(this, 23, 41, textureX, textureY); // Box 227
		bodyModel[46] = new ModelRendererTurbo(this, 35, 41, textureX, textureY); // Box 56
		bodyModel[47] = new ModelRendererTurbo(this, 35, 41, textureX, textureY); // Box 57
		bodyModel[48] = new ModelRendererTurbo(this, 19, 5, textureX, textureY); // Box 60
		bodyModel[49] = new ModelRendererTurbo(this, 89, 3, textureX, textureY); // Box 402
		bodyModel[50] = new ModelRendererTurbo(this, 32, 44, textureX, textureY); // Box 403
		bodyModel[51] = new ModelRendererTurbo(this, 78, 25, textureX, textureY); // Box 404
		bodyModel[52] = new ModelRendererTurbo(this, 78, 33, textureX, textureY); // Box 405
		bodyModel[53] = new ModelRendererTurbo(this, 78, 37, textureX, textureY); // Box 406
		bodyModel[54] = new ModelRendererTurbo(this, 19, 5, textureX, textureY); // Box 407
		bodyModel[55] = new ModelRendererTurbo(this, 45, 28, textureX, textureY); // Box 23 axle 3-4
		bodyModel[56] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 183 plate
		bodyModel[57] = new ModelRendererTurbo(this, 1, 34, textureX, textureY); // Box 410
		bodyModel[58] = new ModelRendererTurbo(this, 51, 33, textureX, textureY); // Box 411

		bodyModel[0].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel1
		bodyModel[0].setRotationPoint(-9.5F, 7F, -7.75F);

		bodyModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[1].setRotationPoint(-9.5F, 7F, -7.75F);

		bodyModel[2].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[2].setRotationPoint(-9.5F, 7F, -7.75F);

		bodyModel[3].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel1
		bodyModel[3].setRotationPoint(-9.5F, 7F, -7.75F);

		bodyModel[4].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel2
		bodyModel[4].setRotationPoint(-9.5F, 7F, 7.75F);

		bodyModel[5].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[5].setRotationPoint(-9.5F, 7F, 7.75F);

		bodyModel[6].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[6].setRotationPoint(-9.5F, 7F, 7.75F);

		bodyModel[7].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel2
		bodyModel[7].setRotationPoint(-9.5F, 7F, 7.75F);

		bodyModel[8].addShapeBox(0F, -1F, -1F, 14, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 23 axle 1-2
		bodyModel[8].setRotationPoint(-9.5F, 7F, -7F);
		bodyModel[8].rotateAngleY = 1.57079633F;

		bodyModel[9].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel3
		bodyModel[9].setRotationPoint(10.5F, 7F, -7.75F);

		bodyModel[10].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel3
		bodyModel[10].setRotationPoint(10.5F, 7F, -7.75F);

		bodyModel[11].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel3
		bodyModel[11].setRotationPoint(10.5F, 7F, -7.75F);

		bodyModel[12].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel3
		bodyModel[12].setRotationPoint(10.5F, 7F, -7.75F);

		bodyModel[13].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel4
		bodyModel[13].setRotationPoint(10.5F, 7F, 7.75F);

		bodyModel[14].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel4
		bodyModel[14].setRotationPoint(10.5F, 7F, 7.75F);

		bodyModel[15].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel4
		bodyModel[15].setRotationPoint(10.5F, 7F, 7.75F);

		bodyModel[16].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel4
		bodyModel[16].setRotationPoint(10.5F, 7F, 7.75F);

		bodyModel[17].addBox(0F, 0F, -5F, 18, 7, 5, 0F); // Box 19
		bodyModel[17].setRotationPoint(-18F, 0.5F, -9F);
		bodyModel[17].rotateAngleY = 1.57079633F;

		bodyModel[18].addBox(0F, 0F, -7F, 18, 3, 7, 0F); // Box 20
		bodyModel[18].setRotationPoint(-13F, 0.5F, -9F);
		bodyModel[18].rotateAngleY = 1.57079633F;

		bodyModel[19].addBox(0F, 0F, -2F, 18, 7, 2, 0F); // Box 21
		bodyModel[19].setRotationPoint(-6F, 0.5F, -9F);
		bodyModel[19].rotateAngleY = 1.57079633F;

		bodyModel[20].addBox(0F, 0F, -7F, 18, 3, 7, 0F); // Box 23
		bodyModel[20].setRotationPoint(7F, 0.5F, -9F);
		bodyModel[20].rotateAngleY = 1.57079633F;

		bodyModel[21].addBox(0F, 0F, -6F, 18, 7, 6, 0F); // Box 24
		bodyModel[21].setRotationPoint(14F, 0.5F, -9F);
		bodyModel[21].rotateAngleY = 1.57079633F;

		bodyModel[22].addBox(0F, 0F, -9F, 16, 1, 9, 0F); // Box 25
		bodyModel[22].setRotationPoint(-4F, 6.5F, -8F);
		bodyModel[22].rotateAngleY = 1.57079633F;

		bodyModel[23].addShapeBox(0F, 0F, -2F, 18, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-13F, 3.5F, -9F);
		bodyModel[23].rotateAngleY = 1.57079633F;

		bodyModel[24].addShapeBox(-18F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[24].setRotationPoint(-19F, 6.5F, -9F);
		bodyModel[24].rotateAngleY = -1.57079633F;

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70 door swing left
		bodyModel[25].setRotationPoint(-4F, 0.5F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, -0.5F, 9, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72 door swing right
		bodyModel[26].setRotationPoint(-4F, 0.5F, 8.5F);

		bodyModel[27].addShapeBox(0F, 0F, -1F, 17, 7, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(-6F, -6.5F, -8.5F);
		bodyModel[27].rotateAngleY = 1.57079633F;

		bodyModel[28].addShapeBox(-1F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[28].setRotationPoint(-5F, -2F, 9F);
		bodyModel[28].rotateAngleX = 0.2443461F;

		bodyModel[29].addShapeBox(-1F, 0F, -2F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 36
		bodyModel[29].setRotationPoint(-5F, -2F, -9F);
		bodyModel[29].rotateAngleX = -0.2443461F;

		bodyModel[30].addBox(-0.1F, 0.75F, -1F, 0, 1, 2, 0F); // Box 37
		bodyModel[30].setRotationPoint(-5F, -2F, -9F);
		bodyModel[30].rotateAngleX = -0.2443461F;

		bodyModel[31].addBox(-0.1F, 0.75F, -1F, 0, 1, 2, 0F); // Box 38
		bodyModel[31].setRotationPoint(-5F, -2F, 9F);
		bodyModel[31].rotateAngleX = 0.2443461F;

		bodyModel[32].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 39 headlight
		bodyModel[32].setRotationPoint(-18.01F, 2F, -8.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 40 headlight
		bodyModel[33].setRotationPoint(-18.01F, 2F, 4.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 41 turnlight r
		bodyModel[34].setRotationPoint(-18.01F, 4.5F, 4.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 42 turnlight l
		bodyModel[35].setRotationPoint(-18.01F, 4.5F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 43
		bodyModel[36].setRotationPoint(-18.1F, 2.5F, -4F);
		bodyModel[36].rotateAngleY = 1.57079633F;

		bodyModel[37].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 46 taillight
		bodyModel[37].setRotationPoint(19.1F, 1F, -8.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 47 taillight
		bodyModel[38].setRotationPoint(19.1F, 1F, 6.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 195 emblem
		bodyModel[39].setRotationPoint(-18.01F, 0.75F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[40].setRotationPoint(2F, -2.5F, -7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[41].setRotationPoint(2F, -2.5F, 0.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 51
		bodyModel[42].setRotationPoint(-3F, 5.5F, -7.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 6, 1, 7, 0F); // Box 52
		bodyModel[43].setRotationPoint(-3F, 5.5F, 0.5F);

		bodyModel[44].addShapeBox(0F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[44].setRotationPoint(-3.25F, 0.5F, -5F);
		bodyModel[44].rotateAngleZ = 0.29670597F;

		bodyModel[45].addBox(-2F, -0.5F, -0.5F, 2, 1, 1, 0F); // Box 227
		bodyModel[45].setRotationPoint(-3.26F, 0.5F, -5F);
		bodyModel[45].rotateAngleZ = 0.29670597F;

		bodyModel[46].addBox(0F, 0F, 0F, 7, 2, 0, 0F); // Box 56
		bodyModel[46].setRotationPoint(7F, 3.5F, -9.01F);

		bodyModel[47].addBox(0F, 0F, 0F, 7, 2, 0, 0F); // Box 57
		bodyModel[47].setRotationPoint(7F, 3.5F, 9.01F);

		bodyModel[48].addBox(0F, 0F, -7F, 9, 4, 7, 0F); // Box 60
		bodyModel[48].setRotationPoint(7F, 3.5F, -4F);
		bodyModel[48].rotateAngleY = 1.57079633F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[49].setRotationPoint(21F, 6.5F, -9F);
		bodyModel[49].rotateAngleY = 1.57079633F;

		bodyModel[50].addBox(0F, 0F, -2F, 18, 7, 2, 0F); // Box 403
		bodyModel[50].setRotationPoint(5F, 0.5F, -9F);
		bodyModel[50].rotateAngleY = 1.57079633F;

		bodyModel[51].addShapeBox(-18F, 0F, -2F, 18, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 404
		bodyModel[51].setRotationPoint(-6F, 3.5F, -9F);
		bodyModel[51].rotateAngleY = -1.57079633F;

		bodyModel[52].addShapeBox(0F, 0F, -2F, 18, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 405
		bodyModel[52].setRotationPoint(7F, 3.5F, -9F);
		bodyModel[52].rotateAngleY = 1.57079633F;

		bodyModel[53].addShapeBox(-18F, 0F, -2F, 18, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 406
		bodyModel[53].setRotationPoint(14F, 3.5F, -9F);
		bodyModel[53].rotateAngleY = -1.57079633F;

		bodyModel[54].addBox(0F, 0F, -7F, 9, 4, 7, 0F); // Box 407
		bodyModel[54].setRotationPoint(-13F, 3.5F, -4F);
		bodyModel[54].rotateAngleY = 1.57079633F;

		bodyModel[55].addShapeBox(0F, -1F, -1F, 14, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 23 axle 3-4
		bodyModel[55].setRotationPoint(10.5F, 7F, -7F);
		bodyModel[55].rotateAngleY = 1.57079633F;

		bodyModel[56].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183 plate
		bodyModel[56].setRotationPoint(20.51F, 8.5F, -2F);

		bodyModel[57].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 410
		bodyModel[57].setRotationPoint(-18.51F, 8.5F, -2F);

		bodyModel[58].addBox(0F, 0F, 0F, 8, 0, 1, 0F); // Box 411
		bodyModel[58].setRotationPoint(-17F, 0.49F, -0.5F);
	}
}