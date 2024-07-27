//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Workday_1980
// Model Creator: Bida
// Created on: 19.01.2024 - 17:02:34
// Last changed on: 19.01.2024 - 17:02:34

package bidahochi.foxdrives.models; //Path where the model is located

import fexcraft.tmt_slim.ModelConverter;
import fexcraft.tmt_slim.ModelRendererTurbo;

public class ModelWorkday_1980 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelWorkday_1980() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[149];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY, "wheel front"); // Box 136 Wheel1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "wheel front"); // Box 9 Wheel1
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY, "wheel front"); // Box 12 Wheel1
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY, "wheel front"); // Box 17 Wheel1
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY, "wheel front"); // Box 136 Wheel2
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY, "wheel front"); // Box 9 Wheel2
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY, "wheel front"); // Box 12 Wheel2
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY, "wheel front"); // Box 17 Wheel2
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY, "wheel"); // Box 136 Wheel3
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY, "wheel"); // Box 9 Wheel3
		bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY, "wheel"); // Box 12 Wheel3
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY, "wheel"); // Box 17 Wheel3
		bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY, "wheel"); // Box 136 Wheel4
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY, "wheel"); // Box 9 Wheel4
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY, "wheel"); // Box 12 Wheel4
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23 axle
		bodyModel[17] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 23 axle
		bodyModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 24 regulah bed
		bodyModel[23] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 25 regulah bed
		bodyModel[24] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 26 regulah bed
		bodyModel[25] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 27 regulah bed
		bodyModel[26] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 28 regulah bed
		bodyModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 30 regulah bed
		bodyModel[29] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 41
		bodyModel[33] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 43 regulah bed
		bodyModel[34] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 44 regulah bed
		bodyModel[35] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 45 regulah bed
		bodyModel[36] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 47
		bodyModel[38] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
		bodyModel[39] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 49
		bodyModel[40] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 50
		bodyModel[41] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 346
		bodyModel[42] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 352
		bodyModel[43] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 54
		bodyModel[45] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 55
		bodyModel[46] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 56
		bodyModel[47] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 57
		bodyModel[48] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 58
		bodyModel[49] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 59
		bodyModel[50] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 60
		bodyModel[51] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 61
		bodyModel[52] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 70 door swing left
		bodyModel[55] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 72 door swing right
		bodyModel[56] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 73 door swing left
		bodyModel[57] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 74 door swing right
		bodyModel[58] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 75 regulah bed
		bodyModel[59] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 165 driveline
		bodyModel[63] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 83 boy this geometry sure is exhausting
		bodyModel[64] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 84 boy this geometry sure is exhausting
		bodyModel[65] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 85 boy this geometry sure is exhausting
		bodyModel[66] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 226 steeringwhool
		bodyModel[67] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 227
		bodyModel[68] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 88 regulah bed
		bodyModel[69] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 89 regulah bed
		bodyModel[70] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 90 regulah bed
		bodyModel[71] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 91 regulah bed
		bodyModel[72] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 92 regulah bed
		bodyModel[73] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 93 regulah bed
		bodyModel[74] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 94 regulah bed
		bodyModel[75] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 95 tailgate swing -90 z
		bodyModel[76] = new ModelRendererTurbo(this, 25, 17, textureX, textureY, "glow"); // Box 96 taillight
		bodyModel[77] = new ModelRendererTurbo(this, 65, 17, textureX, textureY, "glow"); // Box 97 taillight
		bodyModel[78] = new ModelRendererTurbo(this, 25, 9, textureX, textureY, "glow"); // Box 98 turnlight R
		bodyModel[79] = new ModelRendererTurbo(this, 73, 9, textureX, textureY, "glow"); // Box 99 turnlight L
		bodyModel[80] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 100 hitch ball
		bodyModel[81] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 101 hitch
		bodyModel[82] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 102
		bodyModel[83] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 103
		bodyModel[84] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 104
		bodyModel[85] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 183 plate
		bodyModel[86] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 106 plate
		bodyModel[87] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 106 regulah bed
		bodyModel[88] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 107 regulah bed
		bodyModel[89] = new ModelRendererTurbo(this, 41, 65, textureX, textureY, "glow"); // Box 59 headlight
		bodyModel[90] = new ModelRendererTurbo(this, 1, 33, textureX, textureY, "glow"); // Box 201 turnlight R
		bodyModel[91] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 114
		bodyModel[92] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 115
		bodyModel[93] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 116
		bodyModel[94] = new ModelRendererTurbo(this, 153, 65, textureX, textureY, "glow"); // Box 59 headlight
		bodyModel[95] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 179
		bodyModel[96] = new ModelRendererTurbo(this, 209, 33, textureX, textureY, "glow"); // Box 201 turnlight L
		bodyModel[97] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 121
		bodyModel[98] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 122
		bodyModel[99] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 123
		bodyModel[100] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 124
		bodyModel[101] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 128
		bodyModel[102] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 129
		bodyModel[103] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 130
		bodyModel[104] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 131
		bodyModel[105] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 132
		bodyModel[106] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 133
		bodyModel[107] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 134
		bodyModel[108] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 135
		bodyModel[109] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 136
		bodyModel[110] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 137
		bodyModel[111] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 138
		bodyModel[112] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 139
		bodyModel[113] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 140
		bodyModel[114] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 141
		bodyModel[115] = new ModelRendererTurbo(this, 57, 81, textureX, textureY, "glow"); // Box 142 front orangelight
		bodyModel[116] = new ModelRendererTurbo(this, 57, 89, textureX, textureY, "glow"); // Box 143 front orangelight
		bodyModel[117] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 144
		bodyModel[118] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 145
		bodyModel[119] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 146
		bodyModel[120] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 147
		bodyModel[121] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 148
		bodyModel[122] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 149
		bodyModel[123] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 73 door swing left
		bodyModel[124] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 74 door swing right
		bodyModel[125] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 152
		bodyModel[126] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 153
		bodyModel[127] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 154
		bodyModel[128] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 155
		bodyModel[129] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 156
		bodyModel[130] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 157
		bodyModel[131] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 158
		bodyModel[132] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 159
		bodyModel[133] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 160
		bodyModel[134] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 161
		bodyModel[135] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 162
		bodyModel[136] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 163
		bodyModel[137] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 164 frame bit
		bodyModel[138] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 165 frame bit
		bodyModel[139] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 166 boy this geometry sure is exhausting
		bodyModel[140] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 167 frame bit
		bodyModel[141] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 168 fueltank
		bodyModel[142] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 169 frame bit
		bodyModel[143] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 170 frame bit
		bodyModel[144] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 194 regulah bed
		bodyModel[145] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 195 emblem
		bodyModel[146] = new ModelRendererTurbo(this, 13, 119, textureX, textureY); // Box 149
		bodyModel[147] = new ModelRendererTurbo(this, 3, 117, textureX, textureY); // Box 150
		bodyModel[148] = new ModelRendererTurbo(this, 2, 103, textureX, textureY); // Box 151

		bodyModel[0].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel1
		bodyModel[0].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[1].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[1].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[2].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[2].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[3].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel1
		bodyModel[3].setRotationPoint(-13.5F, 7F, -8F);

		bodyModel[4].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel2
		bodyModel[4].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[5].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[5].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[6].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[6].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[7].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel2
		bodyModel[7].setRotationPoint(-13.5F, 7F, 8F);

		bodyModel[8].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel3
		bodyModel[8].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[9].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel3
		bodyModel[9].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[10].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel3
		bodyModel[10].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[11].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel3
		bodyModel[11].setRotationPoint(12.5F, 7F, -8F);

		bodyModel[12].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel4
		bodyModel[12].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[13].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel4
		bodyModel[13].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[14].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel4
		bodyModel[14].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[15].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel4
		bodyModel[15].setRotationPoint(12.5F, 7F, 8F);

		bodyModel[16].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[16].setRotationPoint(-13.5F, 7F, 0F);

		bodyModel[17].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[17].setRotationPoint(12.5F, 7F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[18].setRotationPoint(-18F, 5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-11F, 3F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 22
		bodyModel[20].setRotationPoint(-10F, 5F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		bodyModel[21].setRotationPoint(-9F, 5F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 24 regulah bed
		bodyModel[22].setRotationPoint(15F, 3F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 25 regulah bed
		bodyModel[23].setRotationPoint(16F, 5F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26 regulah bed
		bodyModel[24].setRotationPoint(8F, 5F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 27 regulah bed
		bodyModel[25].setRotationPoint(8F, 3F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28 regulah bed
		bodyModel[26].setRotationPoint(17F, 5F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(-18F, 3F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 30 regulah bed
		bodyModel[28].setRotationPoint(8.5F, 5F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 31
		bodyModel[29].setRotationPoint(-20.75F, 5F, -8F);

		bodyModel[30].addBox(0F, 0F, 0F, 9, 3, 18, 0F); // Box 34
		bodyModel[30].setRotationPoint(-18F, 0F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -2F, 1F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 1F, 1F, 0F); // Box 39
		bodyModel[31].setRotationPoint(-19F, -2F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 1F, 0F); // Box 41
		bodyModel[32].setRotationPoint(-19F, -2F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 43 regulah bed
		bodyModel[33].setRotationPoint(15F, 3F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 44 regulah bed
		bodyModel[34].setRotationPoint(8F, 3F, 6F);

		bodyModel[35].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 45 regulah bed
		bodyModel[35].setRotationPoint(8F, 3F, -6F);

		bodyModel[36].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 46
		bodyModel[36].setRotationPoint(8F, 3F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[37].setRotationPoint(22.75F, 5F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Box 48
		bodyModel[38].setRotationPoint(-9F, -1F, -8F);

		bodyModel[39].addBox(0F, 0F, 0F, 9, 3, 2, 0F); // Box 49
		bodyModel[39].setRotationPoint(-9F, 2F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[40].setRotationPoint(-9F, 0F, -1F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 346
		bodyModel[41].setRotationPoint(-5F, 2F, -7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 352
		bodyModel[42].setRotationPoint(-1F, -3F, -7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 53
		bodyModel[43].setRotationPoint(-1F, -3F, 1.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 54
		bodyModel[44].setRotationPoint(-5F, 2F, 1.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 55
		bodyModel[45].setRotationPoint(-4F, 3F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 56
		bodyModel[46].setRotationPoint(-9F, 0F, -9F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 57
		bodyModel[47].setRotationPoint(-9F, 0F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[48].setRotationPoint(-1F, -7F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[49].setRotationPoint(-1F, -7F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[50].setRotationPoint(-10.5F, -7F, -4F);

		bodyModel[51].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 61
		bodyModel[51].setRotationPoint(-6F, -8F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.55F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.55F, 0F, 0F); // Box 63
		bodyModel[52].setRotationPoint(-7F, -7F, 8F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 12, 16, 0F); // Box 66
		bodyModel[53].setRotationPoint(0F, -7F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, -0.5F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70 door swing left
		bodyModel[54].setRotationPoint(-8F, -1F, -8.5F);

		bodyModel[55].addShapeBox(0F, 0F, -0.5F, 7, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72 door swing right
		bodyModel[55].setRotationPoint(-8F, -1F, 8.5F);

		bodyModel[56].addShapeBox(2F, 0F, -0.5F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 73 door swing left
		bodyModel[56].setRotationPoint(-8F, -7F, -8.5F);

		bodyModel[57].addShapeBox(2F, 0F, -0.5F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 74 door swing right
		bodyModel[57].setRotationPoint(-8F, -7F, 8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 75 regulah bed
		bodyModel[58].setRotationPoint(9F, 2F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 76
		bodyModel[59].setRotationPoint(9F, 2F, 5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 79
		bodyModel[60].setRotationPoint(22F, 5F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 80
		bodyModel[61].setRotationPoint(22F, 5F, -7F);

		bodyModel[62].addShapeBox(-1F, -1F, -7F, 24, 2, 2, 0F,0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 165 driveline
		bodyModel[62].setRotationPoint(-11.75F, 7F, 5F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 83 boy this geometry sure is exhausting
		bodyModel[63].setRotationPoint(19.5F, 7F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 84 boy this geometry sure is exhausting
		bodyModel[64].setRotationPoint(13.5F, 7F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 85 boy this geometry sure is exhausting
		bodyModel[65].setRotationPoint(18.5F, 7F, -5F);

		bodyModel[66].addShapeBox(0F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[66].setRotationPoint(-6.49F, -0.75F, -5F);
		bodyModel[66].rotateAngleZ = 0.29670597F;

		bodyModel[67].addBox(-1F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 227
		bodyModel[67].setRotationPoint(-6.5F, -0.75F, -5F);
		bodyModel[67].rotateAngleZ = 0.29670597F;

		bodyModel[68].addBox(0F, 0F, 0F, 1, 6, 16, 0F); // Box 88 regulah bed
		bodyModel[68].setRotationPoint(1F, -1F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 89 regulah bed
		bodyModel[69].setRotationPoint(1F, 3F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 90 regulah bed
		bodyModel[70].setRotationPoint(17F, 3F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 91 regulah bed
		bodyModel[71].setRotationPoint(17F, 3F, 8F);

		bodyModel[72].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 92 regulah bed
		bodyModel[72].setRotationPoint(1F, 3F, 8F);

		bodyModel[73].addBox(0F, 0F, 0F, 21, 3, 1, 0F); // Box 93 regulah bed
		bodyModel[73].setRotationPoint(1F, 0F, -9F);

		bodyModel[74].addBox(0F, 0F, 0F, 21, 3, 1, 0F); // Box 94 regulah bed
		bodyModel[74].setRotationPoint(1F, 0F, 8F);

		bodyModel[75].addShapeBox(-1F, -6F, 0F, 1, 6, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 95 tailgate swing -90 z
		bodyModel[75].setRotationPoint(22F, 5F, -8F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 96 taillight
		bodyModel[76].setRotationPoint(22.01F, 0F, -9F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 97 taillight
		bodyModel[77].setRotationPoint(22.01F, 0F, 8F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 98 turnlight R
		bodyModel[78].setRotationPoint(22.01F, 2F, 8F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 1, 1, 0F); // Box 99 turnlight L
		bodyModel[79].setRotationPoint(22.01F, 2F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 100 hitch ball
		bodyModel[80].setRotationPoint(23.5F, 5.5F, -0.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 101 hitch
		bodyModel[81].setRotationPoint(20.5F, 6.5F, -0.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[82].setRotationPoint(-8.5F, -2.75F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 103
		bodyModel[83].setRotationPoint(-8.5F, -2.75F, 9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104
		bodyModel[84].setRotationPoint(-13F, -10F, 8.5F);

		bodyModel[85].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183 plate
		bodyModel[85].setRotationPoint(23.26F, 8F, 2.5F);

		bodyModel[86].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 106 plate
		bodyModel[86].setRotationPoint(-20.26F, 8F, 2F);
		bodyModel[86].rotateAngleY = -3.14159265F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106 regulah bed
		bodyModel[87].setRotationPoint(1F, -1F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107 regulah bed
		bodyModel[88].setRotationPoint(1F, -1F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 59 headlight
		bodyModel[89].setRotationPoint(-20F, 1F, 5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201 turnlight R
		bodyModel[90].setRotationPoint(-19.01F, 0.5F, 8.01F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[91].setRotationPoint(-20F, 0F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 115
		bodyModel[92].setRotationPoint(-20F, 0F, 4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, -2F, 1F, 1F, 1F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 116
		bodyModel[93].setRotationPoint(-19F, -2F, 4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 59 headlight
		bodyModel[94].setRotationPoint(-20F, 1F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 179
		bodyModel[95].setRotationPoint(-20F, 0F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 201 turnlight L
		bodyModel[96].setRotationPoint(-19.01F, 0.5F, -9.01F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		bodyModel[97].setRotationPoint(-20F, 0F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 122
		bodyModel[98].setRotationPoint(-20F, 0F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 123
		bodyModel[99].setRotationPoint(-20F, 5F, -9F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 124
		bodyModel[100].setRotationPoint(-19F, 0F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[101].setRotationPoint(-20F, 0F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F); // Box 129
		bodyModel[102].setRotationPoint(-20F, 0F, 4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[103].setRotationPoint(-19.75F, 1F, -4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		bodyModel[104].setRotationPoint(-19.75F, 2F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[105].setRotationPoint(-20F, 3F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 133
		bodyModel[106].setRotationPoint(-20F, 3F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, -0.5F, 0F); // Box 134
		bodyModel[107].setRotationPoint(-20F, 3F, 4F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 135
		bodyModel[108].setRotationPoint(-19.5F, 0.45F, -4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Box 136
		bodyModel[109].setRotationPoint(-20F, 3F, 4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[110].setRotationPoint(-20F, 3F, -8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[111].setRotationPoint(-20F, 3F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,1F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 139
		bodyModel[112].setRotationPoint(-18F, 4F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 18, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[113].setRotationPoint(-19F, 3F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[114].setRotationPoint(-18.75F, 3F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 142 front orangelight
		bodyModel[115].setRotationPoint(-20.01F, 4F, 4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 143 front orangelight
		bodyModel[116].setRotationPoint(-20.01F, 4F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[117].setRotationPoint(-10F, -7F, -9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 145
		bodyModel[118].setRotationPoint(-10F, -7F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 146
		bodyModel[119].setRotationPoint(-19.7F, 0F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[120].setRotationPoint(-7.5F, -8F, -4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 148
		bodyModel[121].setRotationPoint(-6F, -8F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[122].setRotationPoint(-6F, -8F, 8F);

		bodyModel[123].addShapeBox(0F, 0F, -0.5F, 2, 6, 1, 0F,-2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 73 door swing left
		bodyModel[123].setRotationPoint(-8F, -7F, -8.5F);

		bodyModel[124].addShapeBox(0F, 0F, -0.5F, 2, 6, 1, 0F,-2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 74 door swing right
		bodyModel[124].setRotationPoint(-8F, -7F, 8.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[125].setRotationPoint(-7.5F, -8F, 4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 153
		bodyModel[126].setRotationPoint(-10.5F, -7F, 4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-3.5F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[127].setRotationPoint(-10.5F, -7F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[128].setRotationPoint(-7.5F, -8F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[129].setRotationPoint(-6F, -8F, 4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[130].setRotationPoint(-6F, -8F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[131].setRotationPoint(-9F, -1F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[132].setRotationPoint(-9F, -1F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.55F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.55F, 0F, 0F); // Box 160
		bodyModel[133].setRotationPoint(-7F, -7F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 161
		bodyModel[134].setRotationPoint(0F, 5F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 162
		bodyModel[135].setRotationPoint(0F, 5F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 163
		bodyModel[136].setRotationPoint(0F, 5F, -8F);

		bodyModel[137].addBox(0F, 0F, 0F, 39, 1, 1, 0F); // Box 164 frame bit
		bodyModel[137].setRotationPoint(-18F, 6.25F, 4F);

		bodyModel[138].addBox(0F, 0F, 0F, 39, 1, 1, 0F); // Box 165 frame bit
		bodyModel[138].setRotationPoint(-18F, 6.25F, -5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166 boy this geometry sure is exhausting
		bodyModel[139].setRotationPoint(-10.5F, 7F, -3F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167 frame bit
		bodyModel[140].setRotationPoint(21F, 6.25F, -7F);

		bodyModel[141].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 168 fueltank
		bodyModel[141].setRotationPoint(-3F, 6F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 169 frame bit
		bodyModel[142].setRotationPoint(11F, 5.25F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 170 frame bit
		bodyModel[143].setRotationPoint(11F, 5.25F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 7, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 194 regulah bed
		bodyModel[144].setRotationPoint(1F, 5F, -9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 195 emblem
		bodyModel[145].setRotationPoint(-19.76F, 1.5F, -1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[146].setRotationPoint(-9F, -2F, -8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[147].setRotationPoint(-9F, -2F, 3F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 151
		bodyModel[148].setRotationPoint(-9F, -2F, -3F);
	}
}