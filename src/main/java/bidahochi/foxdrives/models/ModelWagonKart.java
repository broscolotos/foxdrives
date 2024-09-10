//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.12.2017 - 23:03:23
// Last changed on: 12.12.2017 - 23:03:23

package bidahochi.foxdrives.models; //Path where the model is located


import bidahochi.foxdrives.util.BoxName;
import fexcraft.tmt_slim.ModelConverter;
import fexcraft.tmt_slim.ModelRendererTurbo;

public class ModelWagonKart extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelWagonKart() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[81];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 358
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 359
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 360
		bodyModel[3] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 361
		bodyModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 363
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 364
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 365
		bodyModel[7] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 366
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 367
		bodyModel[9] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 368
		bodyModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 369
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 370
		bodyModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 371
		bodyModel[13] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 372
		bodyModel[14] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 382
		bodyModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 383
		bodyModel[16] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 67
		bodyModel[17] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 68
		bodyModel[18] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 69
		bodyModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 79
		bodyModel[20] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 80
		bodyModel[21] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 81
		bodyModel[22] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 82
		bodyModel[23] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 83
		bodyModel[24] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 84
		bodyModel[25] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 85
		bodyModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 86
		bodyModel[27] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 87
		bodyModel[28] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 88
		bodyModel[29] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 89
		bodyModel[30] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 90
		bodyModel[31] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 91
		bodyModel[32] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 92
		bodyModel[33] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 96
		bodyModel[34] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 97
		bodyModel[35] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 98
		bodyModel[36] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 104
		bodyModel[37] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 120
		bodyModel[38] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 121
		bodyModel[39] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 122
		bodyModel[40] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 123
		bodyModel[41] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 124
		bodyModel[42] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 125
		bodyModel[43] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 126
		bodyModel[44] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 127
		bodyModel[45] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 128
		bodyModel[46] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 129
		bodyModel[47] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 130
		bodyModel[48] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 131
		bodyModel[49] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 132
		bodyModel[50] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 133
		bodyModel[51] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 134
		bodyModel[52] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 138
		bodyModel[53] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 139
		bodyModel[54] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 140
		bodyModel[55] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 146
		bodyModel[56] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 153
		bodyModel[57] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 154
		bodyModel[58] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 155
		bodyModel[59] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 157
		bodyModel[60] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 158
		bodyModel[61] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 165
		bodyModel[62] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 166
		bodyModel[63] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 167
		bodyModel[64] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 168
		bodyModel[65] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 171
		bodyModel[66] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 172
		bodyModel[67] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 173
		bodyModel[68] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 174
		bodyModel[69] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 175
		bodyModel[70] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 176
		bodyModel[71] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 177
		bodyModel[72] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 178
		bodyModel[73] = new ModelRendererTurbo(this, 121, 81, textureX, textureY, BoxName.headLight); // Box 79 headlight
		bodyModel[74] = new ModelRendererTurbo(this, 1, 89, textureX, textureY, BoxName.headLight); // Box 80 headlight
		bodyModel[75] = new ModelRendererTurbo(this, 9, 89, textureX, textureY, BoxName.brakeLight); // Box 81 taillight
		bodyModel[76] = new ModelRendererTurbo(this, 17, 89, textureX, textureY, BoxName.brakeLight); // Box 82 taillight
		bodyModel[77] = new ModelRendererTurbo(this, 11, 87, textureX, textureY); // Box 83
		bodyModel[78] = new ModelRendererTurbo(this, 11, 104, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 62, 82, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 86

		bodyModel[0].addBox(0F, 0F, 0F, 22, 1, 14, 0F); // Box 358
		bodyModel[0].setRotationPoint(-9.5F, 4.5F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 22, 5, 1, 0F); // Box 359
		bodyModel[1].setRotationPoint(-9.5F, 0.5F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 22, 5, 1, 0F); // Box 360
		bodyModel[2].setRotationPoint(-9.5F, 0.5F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 361
		bodyModel[3].setRotationPoint(-10.5F, 0.5F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 363
		bodyModel[4].setRotationPoint(12.5F, 0.5F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 364
		bodyModel[5].setRotationPoint(-9.5F, 0.5F, 8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Box 365
		bodyModel[6].setRotationPoint(-10.5F, 0.5F, 8F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 366
		bodyModel[7].setRotationPoint(-11.5F, 0.5F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 367
		bodyModel[8].setRotationPoint(-10.5F, 0.5F, -9F);

		bodyModel[9].addBox(0F, 0F, 0F, 22, 1, 1, 0F); // Box 368
		bodyModel[9].setRotationPoint(-9.5F, 0.5F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 369
		bodyModel[10].setRotationPoint(13.5F, 0.5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 370
		bodyModel[11].setRotationPoint(12.5F, 0.5F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -2F, 0F, 0F, 0F); // Box 371
		bodyModel[12].setRotationPoint(12.5F, 0.5F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 372
		bodyModel[13].setRotationPoint(-3.5F, 4F, -4F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 382
		bodyModel[14].setRotationPoint(-6F, 5F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 383
		bodyModel[15].setRotationPoint(7F, 5F, -1F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 67
		bodyModel[16].setRotationPoint(-7F, 7F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[17].setRotationPoint(-7F, 5F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 69
		bodyModel[18].setRotationPoint(-7F, 9F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 79
		bodyModel[19].setRotationPoint(6F, 9F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 80
		bodyModel[20].setRotationPoint(6F, 7F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[21].setRotationPoint(6F, 5F, -7F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 82
		bodyModel[22].setRotationPoint(6F, 7F, 5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[23].setRotationPoint(6F, 5F, 5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 84
		bodyModel[24].setRotationPoint(6F, 9F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[25].setRotationPoint(-7F, 5F, 5F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 86
		bodyModel[26].setRotationPoint(-7F, 7F, 5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 87
		bodyModel[27].setRotationPoint(-7F, 9F, 5F);

		bodyModel[28].addBox(0F, 0F, 0F, 11, 1, 2, 0F); // Box 88
		bodyModel[28].setRotationPoint(-14F, 6F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[29].setRotationPoint(-7F, 6F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 90
		bodyModel[30].setRotationPoint(-16F, 5.5F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 9, 2, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[31].setRotationPoint(-15.5F, -3.5F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 92
		bodyModel[32].setRotationPoint(-11.5F, -4.5F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[33].setRotationPoint(-10.5F, -6.5F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[34].setRotationPoint(-11F, -5.5F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[35].setRotationPoint(-11F, -5.5F, 1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 104
		bodyModel[36].setRotationPoint(-7F, 6F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 120
		bodyModel[37].setRotationPoint(6F, 0.5F, -2.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[38].setRotationPoint(10F, 0.5F, -2.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 122
		bodyModel[39].setRotationPoint(5F, 0.5F, -2.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 123
		bodyModel[40].setRotationPoint(7.5F, 1.5F, -3.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 124
		bodyModel[41].setRotationPoint(8.5F, 2.5F, -3.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 5, 1, 0F); // Box 125
		bodyModel[42].setRotationPoint(7.5F, 2.5F, -3.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 126
		bodyModel[43].setRotationPoint(9.5F, 0.5F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 127
		bodyModel[44].setRotationPoint(9.5F, 0.5F, 1F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[45].setRotationPoint(9.5F, 0.5F, -0.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 129
		bodyModel[46].setRotationPoint(5.5F, 0.5F, 1F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 130
		bodyModel[47].setRotationPoint(5.5F, 0.5F, -0.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 131
		bodyModel[48].setRotationPoint(5.5F, 0.5F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[49].setRotationPoint(6F, -0.5F, -2.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		bodyModel[50].setRotationPoint(7.5F, -0.5F, -2F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[51].setRotationPoint(7.5F, -0.5F, 1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[52].setRotationPoint(2.5F, -2F, -4F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 139
		bodyModel[53].setRotationPoint(-1.5F, 1F, -5F);

		bodyModel[54].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 140
		bodyModel[54].setRotationPoint(-1.5F, 1F, 4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,-0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[55].setRotationPoint(-9.5F, 4F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 153
		bodyModel[56].setRotationPoint(6F, 4F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 154
		bodyModel[57].setRotationPoint(-10F, 4F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 155
		bodyModel[58].setRotationPoint(-10F, 4F, 2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 157
		bodyModel[59].setRotationPoint(-9.5F, 4F, 5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 158
		bodyModel[60].setRotationPoint(8.5F, -2.5F, 2.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 165
		bodyModel[61].setRotationPoint(-6.5F, 3.75F, 4.75F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 166
		bodyModel[62].setRotationPoint(-6.5F, 3.75F, -5.75F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 167
		bodyModel[63].setRotationPoint(2.25F, 3.75F, 4.75F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 168
		bodyModel[64].setRotationPoint(2.25F, 3.75F, -5.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[65].setRotationPoint(-8.5F, 3.5F, 0.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[66].setRotationPoint(-8.5F, 3.5F, -2.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 173
		bodyModel[67].setRotationPoint(8F, 0.5F, 4.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 174
		bodyModel[68].setRotationPoint(8.5F, 0F, 5F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 175
		bodyModel[69].setRotationPoint(8F, 2.5F, -6.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176
		bodyModel[70].setRotationPoint(10.5F, 2F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 177
		bodyModel[71].setRotationPoint(8.5F, 4F, -5F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 178
		bodyModel[72].setRotationPoint(10.5F, -0.5F, -2.75F);
		bodyModel[72].rotateAngleX = 0.20943951F;
		bodyModel[72].rotateAngleZ = -0.43633231F;

		bodyModel[73].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 79 headlight
		bodyModel[73].setRotationPoint(-11F, 2.5F, -5.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 80 headlight
		bodyModel[74].setRotationPoint(-11F, 2.5F, 3.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 81 taillight
		bodyModel[75].setRotationPoint(13F, 2.5F, -5.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 82 taillight
		bodyModel[76].setRotationPoint(13F, 2.5F, 3.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 83
		bodyModel[77].setRotationPoint(7.5F, 7.5F, -7.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 84
		bodyModel[78].setRotationPoint(-5.5F, 7.5F, -7.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 85
		bodyModel[79].setRotationPoint(7.5F, 1.5F, 5F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 0, 0, 0F); // Box 86
		bodyModel[80].setRotationPoint(7.5F, -10F, 5.5F);
	}
}