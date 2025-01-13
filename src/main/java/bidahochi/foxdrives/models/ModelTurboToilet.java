//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: wall mounter shitter
// Model Creator: bida
// Created on: 07.07.2024 - 19:51:49
// Last changed on: 07.07.2024 - 19:51:49

package bidahochi.foxdrives.models; //Path where the model is located


import bidahochi.foxdrives.util.BoxName;
import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelTurboToilet extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelTurboToilet() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[105];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 20
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 34
		bodyModel[19] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 41
		bodyModel[26] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 42
		bodyModel[27] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 27, 34, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 30, 32, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 30, 39, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 58
		bodyModel[47] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 120
		bodyModel[51] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 121
		bodyModel[52] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 122
		bodyModel[53] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 123
		bodyModel[54] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 125
		bodyModel[55] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 126
		bodyModel[56] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 127
		bodyModel[57] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 128
		bodyModel[58] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 129
		bodyModel[59] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 130
		bodyModel[60] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 131
		bodyModel[61] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 132
		bodyModel[62] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 133
		bodyModel[63] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 134
		bodyModel[64] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 178
		bodyModel[65] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 79
		bodyModel[66] = new ModelRendererTurbo(this, 48, 53, textureX, textureY); // Box 82
		bodyModel[67] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 60, 47, textureX, textureY); // Box 84
		bodyModel[69] = new ModelRendererTurbo(this, 60, 44, textureX, textureY); // Box 85
		bodyModel[70] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 79
		bodyModel[71] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 80
		bodyModel[72] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 81
		bodyModel[73] = new ModelRendererTurbo(this, 30, 57, textureX, textureY); // Box 82
		bodyModel[74] = new ModelRendererTurbo(this, 63, 59, textureX, textureY); // Box 83
		bodyModel[75] = new ModelRendererTurbo(this, 107, 58, textureX, textureY); // Box 84
		bodyModel[76] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 83
		bodyModel[77] = new ModelRendererTurbo(this, 108, 54, textureX, textureY); // Box 100
		bodyModel[78] = new ModelRendererTurbo(this, 76, 56, textureX, textureY); // Box 101
		bodyModel[79] = new ModelRendererTurbo(this, 76, 52, textureX, textureY); // Box 102
		bodyModel[80] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 103
		bodyModel[81] = new ModelRendererTurbo(this, 87, 56, textureX, textureY); // Box 104
		bodyModel[82] = new ModelRendererTurbo(this, 87, 60, textureX, textureY); // Box 105
		bodyModel[83] = new ModelRendererTurbo(this, 76, 60, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 107
		bodyModel[85] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 108
		bodyModel[86] = new ModelRendererTurbo(this, 43, 57, textureX, textureY); // Box 109
		bodyModel[87] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 110
		bodyModel[88] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 112
		bodyModel[89] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 114
		bodyModel[90] = new ModelRendererTurbo(this, 72, 47, textureX, textureY); // Box 116
		bodyModel[91] = new ModelRendererTurbo(this, 57, 50, textureX, textureY); // Box 117
		bodyModel[92] = new ModelRendererTurbo(this, 103, 55, textureX, textureY); // Box 118
		bodyModel[93] = new ModelRendererTurbo(this, 87, 47, textureX, textureY, BoxName.brakeLight); // Box 119 taillight
		bodyModel[94] = new ModelRendererTurbo(this, 92, 50, textureX, textureY, BoxName.brakeLight); // Box 120 taillight
		bodyModel[95] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 121
		bodyModel[96] = new ModelRendererTurbo(this, 87, 50, textureX, textureY, BoxName.brakeLight); // Box 122 taillight
		bodyModel[97] = new ModelRendererTurbo(this, 92, 53, textureX, textureY, BoxName.brakeLight); // Box 123 taillight
		bodyModel[98] = new ModelRendererTurbo(this, 87, 53, textureX, textureY, BoxName.headLight); // Box 125 headlight
		bodyModel[99] = new ModelRendererTurbo(this, 80, 49, textureX, textureY, BoxName.headLight); // Box 126 headlight
		bodyModel[100] = new ModelRendererTurbo(this, 80, 44, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 98, 60, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 98, 57, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 73, 44, textureX, textureY); // Box 104

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[0].setRotationPoint(-9.5F, 2.5F, -2F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, 0F, -0.625F, 1.5F, 0F, -1F, 0F, 0F, 0F, -0.125F, 0F, 0F, -2F, 0F, -0.5F, 1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(-9.5F, 2.5F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F); // Box 18
		bodyModel[2].setRotationPoint(-7F, 2.5F, 3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 0F, -0.625F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Box 19
		bodyModel[3].setRotationPoint(-7F, 2.5F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[4].setRotationPoint(-3F, 2.5F, -4.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.125F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, -2F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, -2F, 0F, -0.5F); // Box 21
		bodyModel[5].setRotationPoint(-9.5F, 2.5F, 2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[6].setRotationPoint(-3F, 2.5F, 3.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[7].setRotationPoint(0F, 2.5F, -3.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 24
		bodyModel[8].setRotationPoint(-3F, 2.5F, -3.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[9].setRotationPoint(-3F, 2.5F, 2.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F); // Box 26
		bodyModel[10].setRotationPoint(-1F, 2.5F, -3.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[11].setRotationPoint(-1F, 2.5F, 0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 0F, 0F); // Box 28
		bodyModel[12].setRotationPoint(-9.5F, 4.5F, -2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[13].setRotationPoint(2F, 4.5F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, -1.125F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, -0.5F, 0F, 1F); // Box 30
		bodyModel[14].setRotationPoint(-7F, 4.5F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -1.125F); // Box 31
		bodyModel[15].setRotationPoint(-7F, 4.5F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, 0F, -0.5F, 1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.125F, 2F, 0F, -2F, 1.5F, 0F, 1F, -1.5F, 0F, 0F); // Box 32
		bodyModel[16].setRotationPoint(-9.5F, 4.5F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, -2F, 0F, -0.5F, -1.5F, 0F, 0F, 1.5F, 0F, 1F, 2F, 0F, -2F, -3F, 0F, -1.125F); // Box 33
		bodyModel[17].setRotationPoint(-9.5F, 4.5F, 2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[18].setRotationPoint(2F, 8.5F, -1.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.625F, -0.5F, 0F, 1F, 0F, 0F, 0.75F); // Box 35
		bodyModel[19].setRotationPoint(-3F, 4.5F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, -0.5F, 0F, 1F, -0.5F, 0F, -0.625F, 0F, 0F, -0.25F); // Box 36
		bodyModel[20].setRotationPoint(-3F, 4.5F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 1.5F, 0F, -1F, 1.5F, 0F, 1F, -1.5F, 0F, 0F, -3F, 0F, -0.625F, 2F, 0F, -2F); // Box 37
		bodyModel[21].setRotationPoint(1.5F, 4.5F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.5F, 0F, -1F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -3F, 0F, -0.625F, -1.5F, 0F, 0F, 1.5F, 0F, 1F); // Box 38
		bodyModel[22].setRotationPoint(1.5F, 4.5F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, -1F); // Box 39
		bodyModel[23].setRotationPoint(1.5F, 4.5F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(1F, 4.5F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[25].setRotationPoint(-6.5F, 6.5F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[26].setRotationPoint(-5.5F, 6.5F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 43
		bodyModel[27].setRotationPoint(-5.5F, 6.5F, 2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[28].setRotationPoint(-3F, 7.5F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[29].setRotationPoint(-6.5F, 1.5F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -1.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 1.5F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F); // Box 46
		bodyModel[30].setRotationPoint(-9.5F, 1.5F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 47
		bodyModel[31].setRotationPoint(-6.5F, 1.5F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.75F, -0.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F); // Box 48
		bodyModel[32].setRotationPoint(-9.5F, 1.5F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -1F); // Box 49
		bodyModel[33].setRotationPoint(-3.5F, 1.5F, -4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 50
		bodyModel[34].setRotationPoint(-3.5F, 1.5F, 2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[35].setRotationPoint(-1F, 1.5F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -1.5F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, -1F); // Box 52
		bodyModel[36].setRotationPoint(-1F, 1.5F, 2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -1F, -1.5F, -0.5F, 0.5F, -0.25F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -1.5F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[37].setRotationPoint(-1F, 1.5F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 54
		bodyModel[38].setRotationPoint(1F, -4.5F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 55
		bodyModel[39].setRotationPoint(1F, -5F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F, -0.125F, -0.125F, 0.125F); // Box 56
		bodyModel[40].setRotationPoint(1.5F, -3.5F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F); // Box 57
		bodyModel[41].setRotationPoint(1F, -2.5F, 0F);
		bodyModel[41].rotateAngleX = 1.57079633F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 58
		bodyModel[42].setRotationPoint(2.63F, -2.5F, 2F);
		bodyModel[42].rotateAngleX = 1.57079633F;

		bodyModel[43].addBox(0F, 0F, 0F, 9, 0, 4, 0F); // Box 59
		bodyModel[43].setRotationPoint(-9F, 4.5F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 0, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F); // Box 60
		bodyModel[44].setRotationPoint(-8F, 4.5F, 2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(-8F, 4.5F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 58
		bodyModel[46].setRotationPoint(3.63F, -2.5F, 2F);
		bodyModel[46].rotateAngleX = 1.57079633F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(3F, 2.5F, -3.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(3F, 2.5F, 3.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(3F, 2.5F, -4.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 4, 5, 0F); // Box 120
		bodyModel[50].setRotationPoint(4.5F, -1.5F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[51].setRotationPoint(8.5F, -1.5F, -2.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 122
		bodyModel[52].setRotationPoint(3.5F, -1.5F, -2.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 123
		bodyModel[53].setRotationPoint(6F, -0.5F, -3.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 125
		bodyModel[54].setRotationPoint(6F, -0.5F, -3.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 126
		bodyModel[55].setRotationPoint(8F, -1.5F, -2F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 127
		bodyModel[56].setRotationPoint(8F, -1.5F, 1F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[57].setRotationPoint(8F, -1.5F, -0.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 129
		bodyModel[58].setRotationPoint(4F, -1.5F, 1F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 130
		bodyModel[59].setRotationPoint(4F, -1.5F, -0.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 131
		bodyModel[60].setRotationPoint(4F, -1.5F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[61].setRotationPoint(4.5F, -2.5F, -2.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		bodyModel[62].setRotationPoint(6F, -2.5F, -1.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[63].setRotationPoint(6F, -2.5F, 0.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 3, 0, 0F); // Box 178
		bodyModel[64].setRotationPoint(9F, -2.5F, -2.75F);
		bodyModel[64].rotateAngleX = 0.20943951F;
		bodyModel[64].rotateAngleZ = -0.43633231F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -0.375F, 0F, 0F, -0.375F); // Box 79
		bodyModel[65].setRotationPoint(5.63F, -0.25F, 2F);
		bodyModel[65].rotateAngleX = 1.57079633F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[66].setRotationPoint(8F, 4.5F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[67].setRotationPoint(8F, 8.5F, -1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 84
		bodyModel[68].setRotationPoint(3F, 4.5F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 85
		bodyModel[69].setRotationPoint(3F, 4.5F, -3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 79
		bodyModel[70].setRotationPoint(3.5F, 9F, -6F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 80
		bodyModel[71].setRotationPoint(3.5F, 7F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[72].setRotationPoint(3.5F, 5F, -6F);

		bodyModel[73].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 82
		bodyModel[73].setRotationPoint(3.5F, 7F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[74].setRotationPoint(3.5F, 5F, 4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 84
		bodyModel[75].setRotationPoint(3.5F, 9F, 4F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 83
		bodyModel[76].setRotationPoint(5F, 7.5F, -6.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 100
		bodyModel[77].setRotationPoint(-6.5F, 7.75F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[78].setRotationPoint(-6.5F, 6.75F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 102
		bodyModel[79].setRotationPoint(-6.5F, 9.25F, -6F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 1, 13, 0F); // Box 103
		bodyModel[80].setRotationPoint(-5.5F, 8F, -6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[81].setRotationPoint(-6.5F, 6.75F, 4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 105
		bodyModel[82].setRotationPoint(-6.5F, 7.75F, 4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 106
		bodyModel[83].setRotationPoint(-6.5F, 9.25F, 4F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 107
		bodyModel[84].setRotationPoint(-5.5F, 7F, -0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[85].setRotationPoint(-6.5F, 3.25F, -6.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 109
		bodyModel[86].setRotationPoint(-6.5F, -1.75F, -6.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[87].setRotationPoint(-6.5F, -2.75F, -6.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 112
		bodyModel[88].setRotationPoint(-6.5F, -1.75F, 5.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 114
		bodyModel[89].setRotationPoint(-6.5F, 3.25F, 3.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[90].setRotationPoint(-6.5F, -2.75F, 3.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 5, 5, 3, 0F); // Box 117
		bodyModel[91].setRotationPoint(3F, 3.75F, -1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 118
		bodyModel[92].setRotationPoint(7F, 0.5F, -3.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 119 taillight
		bodyModel[93].setRotationPoint(8.5F, 3F, -4F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 120 taillight
		bodyModel[94].setRotationPoint(8.5F, 3F, 3F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 121
		bodyModel[95].setRotationPoint(8.25F, 3F, -2F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 122 taillight
		bodyModel[96].setRotationPoint(8.5F, 4.5F, 2.75F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 123 taillight
		bodyModel[97].setRotationPoint(8.5F, 4.5F, -3.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125 headlight
		bodyModel[98].setRotationPoint(-8.5F, 4.5F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 126 headlight
		bodyModel[99].setRotationPoint(-8.5F, 4.5F, 3F);

		bodyModel[100].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 100
		bodyModel[100].setRotationPoint(8.25F, 6.5F, 1.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 101
		bodyModel[101].setRotationPoint(-6.5F, -0.75F, 5.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 2, 0, 0F); // Box 102
		bodyModel[102].setRotationPoint(-5.25F, -0.75F, 6.75F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 103
		bodyModel[103].setRotationPoint(-3.25F, 0.25F, 6.75F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 104
		bodyModel[104].setRotationPoint(8.25F, 6.5F, -2.5F);
	}
}