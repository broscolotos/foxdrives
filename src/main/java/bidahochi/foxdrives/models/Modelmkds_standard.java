//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MKDS_Standard
// Model Creator: 
// Created on: 13.06.2024 - 09:57:57
// Last changed on: 13.06.2024 - 09:57:57

package bidahochi.foxdrives.models; //Path where the model is located

import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class Modelmkds_standard extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public Modelmkds_standard() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 352
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 12
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 226 steeringwhool
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 227
		bodyModel[19] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 17, 9, textureX, textureY, "wheel front"); // Box 32 Wheel 1
		bodyModel[23] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 42
		bodyModel[26] = new ModelRendererTurbo(this, 97, 25, textureX, textureY, "wheel"); // Box 11 Wheel 3
		bodyModel[27] = new ModelRendererTurbo(this, 89, 17, textureX, textureY, "wheel"); // Box 15 Wheel 3
		bodyModel[28] = new ModelRendererTurbo(this, 113, 25, textureX, textureY, "wheel"); // Box 17 Wheel 3
		bodyModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, "wheel"); // Box 46 Wheel 4
		bodyModel[30] = new ModelRendererTurbo(this, 17, 33, textureX, textureY, "wheel"); // Box 47 Wheel 4
		bodyModel[31] = new ModelRendererTurbo(this, 105, 33, textureX, textureY, "wheel"); // Box 48 Wheel 4
		bodyModel[32] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 54
		bodyModel[33] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 55
		bodyModel[34] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 56
		bodyModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 57
		bodyModel[36] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 58
		bodyModel[37] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 59
		bodyModel[38] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 60
		bodyModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 61
		bodyModel[40] = new ModelRendererTurbo(this, 22, 49, textureX, textureY, "wheel front"); // Box 62 Wheel 1
		bodyModel[41] = new ModelRendererTurbo(this, 45, 56, textureX, textureY, "wheel"); // Box 64 Wheel 3
		bodyModel[42] = new ModelRendererTurbo(this, 45, 56, textureX, textureY, "wheel"); // Box 65 Wheel 4
		bodyModel[43] = new ModelRendererTurbo(this, 4, 60, textureX, textureY); // Box 66
		bodyModel[44] = new ModelRendererTurbo(this, 9, 41, textureX, textureY, "wheel front"); // Box 67 Wheel 1
		bodyModel[45] = new ModelRendererTurbo(this, 25, 41, textureX, textureY, "wheel front"); // Box 68 Wheel 1
		bodyModel[46] = new ModelRendererTurbo(this, 17, 9, textureX, textureY, "wheel front"); // Box 69 Wheel 2
		bodyModel[47] = new ModelRendererTurbo(this, 25, 41, textureX, textureY, "wheel front"); // Box 70 Wheel 2
		bodyModel[48] = new ModelRendererTurbo(this, 9, 41, textureX, textureY, "wheel front"); // Box 71 Wheel 2
		bodyModel[49] = new ModelRendererTurbo(this, 22, 49, textureX, textureY, "wheel front"); // Box 72 Wheel 2

		bodyModel[0].addShapeBox(0F, -4F, 0F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[0].setRotationPoint(1F, 7.5F, -2.5F);
		bodyModel[0].rotateAngleZ = -0.15707963F;

		bodyModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 11
		bodyModel[1].setRotationPoint(-6F, 6.5F, -3.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[2].setRotationPoint(-9F, 6.5F, -2.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 13
		bodyModel[3].setRotationPoint(-12F, 6.5F, -2.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[4].setRotationPoint(-12F, 3.5F, -2.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -3F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[5].setRotationPoint(-12F, 3.5F, -3.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -2F, 0F); // Box 16
		bodyModel[6].setRotationPoint(-12F, 6.5F, -3.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[7].setRotationPoint(-9F, 6.5F, -3.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F); // Box 18
		bodyModel[8].setRotationPoint(-12F, 3.5F, 2.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, -2F, -1F); // Box 19
		bodyModel[9].setRotationPoint(-12F, 6.5F, 2.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 20
		bodyModel[10].setRotationPoint(-9F, 6.5F, 2.5F);

		bodyModel[11].addShapeBox(0F, -0.5F, -0.5F, 19, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 21
		bodyModel[11].setRotationPoint(-13F, 8.55F, -3.25F);
		bodyModel[11].rotateAngleX = 0.78539816F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[12].setRotationPoint(5F, 6.5F, -3.5F);

		bodyModel[13].addShapeBox(0F, -0.5F, -0.5F, 19, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 23
		bodyModel[13].setRotationPoint(-13F, 8.55F, 3.25F);
		bodyModel[13].rotateAngleX = 0.78539816F;

		bodyModel[14].addShapeBox(0F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 24
		bodyModel[14].setRotationPoint(5.8F, 8.5F, 3.25F);
		bodyModel[14].rotateAngleX = 0.78539816F;
		bodyModel[14].rotateAngleY = -0.62831853F;
		bodyModel[14].rotateAngleZ = 0.9250245F;

		bodyModel[15].addShapeBox(0F, -0.5F, -0.5F, 4, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 25
		bodyModel[15].setRotationPoint(5.8F, 8.5F, -3.25F);
		bodyModel[15].rotateAngleX = 0.78539816F;
		bodyModel[15].rotateAngleY = 0.62831853F;
		bodyModel[15].rotateAngleZ = 0.9250245F;

		bodyModel[16].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 5, 0F,-0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F); // Box 26
		bodyModel[16].setRotationPoint(7.5F, 5.5F, -2F);
		bodyModel[16].rotateAngleZ = 0.78539816F;

		bodyModel[17].addShapeBox(0F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.75F, -1.75F, 0F, -1.75F, -1.75F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F); // Box 226 steeringwhool
		bodyModel[17].setRotationPoint(-6.24F, 3.75F, 0F);
		bodyModel[17].rotateAngleZ = 0.40142573F;

		bodyModel[18].addShapeBox(-1F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 227
		bodyModel[18].setRotationPoint(-6.25F, 3.75F, 0F);
		bodyModel[18].rotateAngleZ = 0.40142573F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 29
		bodyModel[19].setRotationPoint(-15F, 8F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, 0F, 0F, 0.75F, 0.75F, -2F, -0.5F, -1F, 2F, 1F, -1F, -1.5F, -1F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 2F, 1F, 0F, -1.5F); // Box 30
		bodyModel[20].setRotationPoint(-14F, 8F, 4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,1F, -1F, -1.5F, -0.5F, -1F, 2F, 0.75F, 0.75F, -2F, -1F, 0F, 0F, 1F, 0F, -1.5F, -0.5F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(-14F, 8F, -6F);

		bodyModel[22].addShapeBox(-0.5F, -1.5F, -2.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 32 Wheel 1
		bodyModel[22].setRotationPoint(-7.5F, 8.5F, -4.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 34
		bodyModel[23].setRotationPoint(-8F, 8F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F); // Box 37
		bodyModel[24].setRotationPoint(2F, 7F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F); // Box 42
		bodyModel[25].setRotationPoint(-5.5F, 9F, -7F);
		bodyModel[25].rotateAngleX = 1.06465084F;
		bodyModel[25].rotateAngleY = -0.15707963F;

		bodyModel[26].addBox(-1F, -2.5F, -1F, 2, 5, 3, 0F); // Box 11 Wheel 3
		bodyModel[26].setRotationPoint(2.5F, 7.5F, -7F);

		bodyModel[27].addShapeBox(-2.5F, -1F, -1F, 2, 2, 3, 0F,0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 15 Wheel 3
		bodyModel[27].setRotationPoint(2.5F, 7.5F, -7F);

		bodyModel[28].addShapeBox(0.5F, -1F, -1F, 2, 2, 3, 0F,-0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F); // Box 17 Wheel 3
		bodyModel[28].setRotationPoint(2.5F, 7.5F, -7F);

		bodyModel[29].addBox(-1F, -2.5F, 1F, 2, 5, 3, 0F); // Box 46 Wheel 4
		bodyModel[29].setRotationPoint(2.5F, 7.5F, 4F);

		bodyModel[30].addShapeBox(-2.5F, -1F, 1F, 2, 2, 3, 0F,0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 47 Wheel 4
		bodyModel[30].setRotationPoint(2.5F, 7.5F, 4F);

		bodyModel[31].addShapeBox(0.5F, -1F, 1F, 2, 2, 3, 0F,-0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F); // Box 48 Wheel 4
		bodyModel[31].setRotationPoint(2.5F, 7.5F, 4F);

		bodyModel[32].addShapeBox(0F, 0F, -3F, 5, 0, 3, 0F,-0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[32].setRotationPoint(-5.5F, 9F, 7F);
		bodyModel[32].rotateAngleX = -1.06465084F;
		bodyModel[32].rotateAngleY = 0.15707963F;

		bodyModel[33].addShapeBox(0F, -4F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 55
		bodyModel[33].setRotationPoint(3F, 5F, -4.5F);
		bodyModel[33].rotateAngleZ = -0.45378561F;

		bodyModel[34].addShapeBox(0.5F, 0F, 1.5F, 1, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[34].setRotationPoint(3F, 5F, -4.5F);
		bodyModel[34].rotateAngleZ = -0.45378561F;

		bodyModel[35].addShapeBox(0F, -4F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 57
		bodyModel[35].setRotationPoint(3F, 5F, 2.5F);
		bodyModel[35].rotateAngleZ = -0.45378561F;

		bodyModel[36].addShapeBox(0.5F, -5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[36].setRotationPoint(3F, 5F, -4.5F);
		bodyModel[36].rotateAngleZ = -0.45378561F;

		bodyModel[37].addShapeBox(0.5F, -5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[37].setRotationPoint(3F, 5F, 3.5F);
		bodyModel[37].rotateAngleZ = -0.45378561F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 0, 13, 0F,0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 60
		bodyModel[38].setRotationPoint(-5F, 8.5F, -6.5F);
		bodyModel[38].rotateAngleZ = 0.6981317F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 0, 13, 0F,0F, 0F, 0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.5F); // Box 61
		bodyModel[39].setRotationPoint(-3.1F, 8.5F, -6.5F);
		bodyModel[39].rotateAngleZ = 0.6981317F;

		bodyModel[40].addShapeBox(-1.5F, -1.5F, -2.51F, 6, 6, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 62 Wheel 1
		bodyModel[40].setRotationPoint(-7.5F, 8.5F, -4.5F);

		bodyModel[41].addBox(-2.5F, -2.5F, -1.01F, 5, 5, 0, 0F); // Box 64 Wheel 3
		bodyModel[41].setRotationPoint(2.5F, 7.5F, -7F);

		bodyModel[42].addBox(-2.5F, -2.5F, 1.01F, 5, 5, 0, 0F); // Box 65 Wheel 4
		bodyModel[42].setRotationPoint(2.5F, 7.5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 10, 10, 0F,-4.5F, -2F, 0F, 4.5F, -2F, 0F, 4.5F, -2F, -5F, -4.5F, -2F, -5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, -5F, 0F, -5F, -5F); // Box 66
		bodyModel[43].setRotationPoint(-12F, 1.49F, -2.5F);

		bodyModel[44].addShapeBox(-1.5F, -0.5F, -2.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 67 Wheel 1
		bodyModel[44].setRotationPoint(-7.5F, 8.5F, -4.5F);

		bodyModel[45].addShapeBox(0.5F, -0.5F, -2.5F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 68 Wheel 1
		bodyModel[45].setRotationPoint(-7.5F, 8.5F, -4.5F);

		bodyModel[46].addShapeBox(-0.5F, -1.5F, -0.5F, 1, 3, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69 Wheel 2
		bodyModel[46].setRotationPoint(-7.5F, 8.5F, 4.5F);

		bodyModel[47].addShapeBox(0.5F, -0.5F, -0.5F, 1, 1, 3, 0F,0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 70 Wheel 2
		bodyModel[47].setRotationPoint(-7.5F, 8.5F, 4.5F);

		bodyModel[48].addShapeBox(-1.5F, -0.5F, -0.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 71 Wheel 2
		bodyModel[48].setRotationPoint(-7.5F, 8.5F, 4.5F);

		bodyModel[49].addShapeBox(-1.5F, -1.5F, 2.51F, 6, 6, 0, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 72 Wheel 2
		bodyModel[49].setRotationPoint(-7.5F, 8.5F, 4.5F);
	}
}