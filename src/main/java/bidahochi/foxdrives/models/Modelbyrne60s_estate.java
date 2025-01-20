//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.01.2025 - 09:25:40
// Last changed on: 01.01.2025 - 09:25:40

package bidahochi.foxdrives.models; //Path where the model is located

import bidahochi.foxdrives.util.BoxName;
import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class Modelbyrne60s_estate extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public Modelbyrne60s_estate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[260];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 183, 136, textureX, textureY); // Box 308
		bodyModel[1] = new ModelRendererTurbo(this, 166, 138, textureX, textureY); // Box 307
		bodyModel[2] = new ModelRendererTurbo(this, 101, 22, textureX, textureY); // Box 306
		bodyModel[3] = new ModelRendererTurbo(this, 38, 150, textureX, textureY); // Box 305
		bodyModel[4] = new ModelRendererTurbo(this, 8, 150, textureX, textureY); // Box 167 frame bit
		bodyModel[5] = new ModelRendererTurbo(this, 38, 157, textureX, textureY); // Box 152 hirail shit
		bodyModel[6] = new ModelRendererTurbo(this, 38, 157, textureX, textureY); // Box 151 hirail shit
		bodyModel[7] = new ModelRendererTurbo(this, 38, 150, textureX, textureY); // Box 149 hirail shit wheel
		bodyModel[8] = new ModelRendererTurbo(this, 23, 150, textureX, textureY); // Box 148 hirail shit axle
		bodyModel[9] = new ModelRendererTurbo(this, 38, 142, textureX, textureY); // Box 298
		bodyModel[10] = new ModelRendererTurbo(this, 47, 137, textureX, textureY); // Box 152 hirail shit
		bodyModel[11] = new ModelRendererTurbo(this, 47, 137, textureX, textureY); // Box 151 hirail shit
		bodyModel[12] = new ModelRendererTurbo(this, 38, 137, textureX, textureY); // Box 150 hirail shit wheel
		bodyModel[13] = new ModelRendererTurbo(this, 38, 137, textureX, textureY); // Box 149 hirail shit wheel
		bodyModel[14] = new ModelRendererTurbo(this, 23, 136, textureX, textureY); // Box 148 hirail shit axle
		bodyModel[15] = new ModelRendererTurbo(this, 38, 142, textureX, textureY); // Box 146
		bodyModel[16] = new ModelRendererTurbo(this, 0, 129, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 243, 71, textureX, textureY); // Box 289
		bodyModel[18] = new ModelRendererTurbo(this, 238, 71, textureX, textureY); // Box 288
		bodyModel[19] = new ModelRendererTurbo(this, 210, 97, textureX, textureY, BoxName.brakeLight); // Box 286
		bodyModel[20] = new ModelRendererTurbo(this, 238, 63, textureX, textureY, "cull"); // Box cull holder
		bodyModel[21] = new ModelRendererTurbo(this, 229, 66, textureX, textureY); // Box 284
		bodyModel[22] = new ModelRendererTurbo(this, 224, 64, textureX, textureY); // Box 283
		bodyModel[23] = new ModelRendererTurbo(this, 51, 146, textureX, textureY, "cull"); // Box cull roofbar gates
		bodyModel[24] = new ModelRendererTurbo(this, 51, 171, textureX, textureY, "cull"); // Box cull roofbars
		bodyModel[25] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 278
		bodyModel[26] = new ModelRendererTurbo(this, 105, 7, textureX, textureY); // Box 277
		bodyModel[27] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 276
		bodyModel[28] = new ModelRendererTurbo(this, 29, 22, textureX, textureY); // Box 275
		bodyModel[29] = new ModelRendererTurbo(this, 18, 29, textureX, textureY); // Box 274
		bodyModel[30] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 273
		bodyModel[31] = new ModelRendererTurbo(this, 16, 25, textureX, textureY); // Box 272
		bodyModel[32] = new ModelRendererTurbo(this, 118, 101, textureX, textureY); // Box 75
		bodyModel[33] = new ModelRendererTurbo(this, 167, 101, textureX, textureY); // Box 73
		bodyModel[34] = new ModelRendererTurbo(this, 81, 106, textureX, textureY); // Box 271
		bodyModel[35] = new ModelRendererTurbo(this, 81, 106, textureX, textureY); // Box 270
		bodyModel[36] = new ModelRendererTurbo(this, 72, 13, textureX, textureY); // Box exhaust
		bodyModel[37] = new ModelRendererTurbo(this, 72, 16, textureX, textureY); // Box exhaust
		bodyModel[38] = new ModelRendererTurbo(this, 240, -3, textureX, textureY); // Box alt rear plate placememnt
		bodyModel[39] = new ModelRendererTurbo(this, 26, 3, textureX, textureY); // Box 100 im goonna HYITch yuh
		bodyModel[40] = new ModelRendererTurbo(this, 33, 3, textureX, textureY); // Box 100 im goonna HYITch yuh
		bodyModel[41] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Box 100 im goonna HYITch yuh
		bodyModel[42] = new ModelRendererTurbo(this, 247, 98, textureX, textureY, BoxName.rightTurnLight); // Box turnlight R
		bodyModel[43] = new ModelRendererTurbo(this, 247, 85, textureX, textureY, BoxName.leftTurnLight); // Box turnlight L
		bodyModel[44] = new ModelRendererTurbo(this, 215, 97, textureX, textureY, BoxName.brakeLight); // Box 257 taillight
		bodyModel[45] = new ModelRendererTurbo(this, 193, 120, textureX, textureY); // Box 253
		bodyModel[46] = new ModelRendererTurbo(this, 193, 120, textureX, textureY); // Box aftermarket mudflap
		bodyModel[47] = new ModelRendererTurbo(this, 178, 94, textureX, textureY); // Box deluxe rear wheel covers
		bodyModel[48] = new ModelRendererTurbo(this, 129, 94, textureX, textureY); // Box deluxe rear wheel covers
		bodyModel[49] = new ModelRendererTurbo(this, 245, 63, textureX, textureY, "cull"); // Box cull holder
		bodyModel[50] = new ModelRendererTurbo(this, 229, 70, textureX, textureY); // Box 239
		bodyModel[51] = new ModelRendererTurbo(this, 229, 66, textureX, textureY); // Box 238
		bodyModel[52] = new ModelRendererTurbo(this, 224, 64, textureX, textureY); // Box 231
		bodyModel[53] = new ModelRendererTurbo(this, 47, 1, textureX, textureY, BoxName.ditch); // Box 236 foglight alternative
		bodyModel[54] = new ModelRendererTurbo(this, 40, 1, textureX, textureY, BoxName.ditch); // Box 236 foglight alternative
		bodyModel[55] = new ModelRendererTurbo(this, 240, 2, textureX, textureY); // Box 183 plate
		bodyModel[56] = new ModelRendererTurbo(this, 240, 7, textureX, textureY); // Box 106 plate
		bodyModel[57] = new ModelRendererTurbo(this, 40, 6, textureX, textureY, BoxName.ditch); // Box 172 foglight
		bodyModel[58] = new ModelRendererTurbo(this, 47, 6, textureX, textureY, BoxName.ditch); // Box 171 foglight
		bodyModel[59] = new ModelRendererTurbo(this, 9, 114, textureX, textureY, BoxName.leftTurnLight); // Box turnlight L
		bodyModel[60] = new ModelRendererTurbo(this, 9, 110, textureX, textureY, BoxName.rightTurnLight); // Box turnlight R
		bodyModel[61] = new ModelRendererTurbo(this, 1, 46, textureX, textureY); // Box 226
		bodyModel[62] = new ModelRendererTurbo(this, 10, 51, textureX, textureY); // Box 225
		bodyModel[63] = new ModelRendererTurbo(this, 25, 46, textureX, textureY); // Box 224
		bodyModel[64] = new ModelRendererTurbo(this, 34, 51, textureX, textureY); // Box 223
		bodyModel[65] = new ModelRendererTurbo(this, 206, 14, textureX, textureY); // Box tork konvartah
		bodyModel[66] = new ModelRendererTurbo(this, 186, 1, textureX, textureY); // Box driveshaf
		bodyModel[67] = new ModelRendererTurbo(this, 18, 41, textureX, textureY); // Box 220
		bodyModel[68] = new ModelRendererTurbo(this, 78, 20, textureX, textureY); // Box 219
		bodyModel[69] = new ModelRendererTurbo(this, 119, 1, textureX, textureY); // Box 218
		bodyModel[70] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 50
		bodyModel[71] = new ModelRendererTurbo(this, 149, 39, textureX, textureY); // Box 49
		bodyModel[72] = new ModelRendererTurbo(this, 46, 48, textureX, textureY); // Box 227
		bodyModel[73] = new ModelRendererTurbo(this, 49, 46, textureX, textureY); // Box 226 steeringwhool
		bodyModel[74] = new ModelRendererTurbo(this, 104, 45, textureX, textureY); // Box 213
		bodyModel[75] = new ModelRendererTurbo(this, 111, 45, textureX, textureY); // Box 212
		bodyModel[76] = new ModelRendererTurbo(this, 101, 112, textureX, textureY); // Box 211
		bodyModel[77] = new ModelRendererTurbo(this, 98, 117, textureX, textureY); // Box 210
		bodyModel[78] = new ModelRendererTurbo(this, 216, 122, textureX, textureY); // Box chassis
		bodyModel[79] = new ModelRendererTurbo(this, 181, 58, textureX, textureY); // Box 207
		bodyModel[80] = new ModelRendererTurbo(this, 162, 42, textureX, textureY); // Box 206
		bodyModel[81] = new ModelRendererTurbo(this, 185, 6, textureX, textureY); // Box 203
		bodyModel[82] = new ModelRendererTurbo(this, 182, 26, textureX, textureY, "cull"); // Box cull nobodysgonnaseethis
		bodyModel[83] = new ModelRendererTurbo(this, 172, 4, textureX, textureY); // Box spooky engine
		bodyModel[84] = new ModelRendererTurbo(this, 47, 14, textureX, textureY); // Box 199
		bodyModel[85] = new ModelRendererTurbo(this, 40, 14, textureX, textureY); // Box 197
		bodyModel[86] = new ModelRendererTurbo(this, 29, 91, textureX, textureY); // Box 180
		bodyModel[87] = new ModelRendererTurbo(this, 54, 7, textureX, textureY); // Box 177
		bodyModel[88] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 172
		bodyModel[89] = new ModelRendererTurbo(this, 118, 44, textureX, textureY); // Box 169
		bodyModel[90] = new ModelRendererTurbo(this, 125, 44, textureX, textureY); // Box 168
		bodyModel[91] = new ModelRendererTurbo(this, 131, 53, textureX, textureY); // Box 167
		bodyModel[92] = new ModelRendererTurbo(this, 144, 50, textureX, textureY); // Box 166
		bodyModel[93] = new ModelRendererTurbo(this, 131, 50, textureX, textureY); // Box 165
		bodyModel[94] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 164
		bodyModel[95] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 163
		bodyModel[96] = new ModelRendererTurbo(this, 73, 83, textureX, textureY); // Box 162
		bodyModel[97] = new ModelRendererTurbo(this, 120, 77, textureX, textureY); // Box 160
		bodyModel[98] = new ModelRendererTurbo(this, 37, 43, textureX, textureY); // Box 159
		bodyModel[99] = new ModelRendererTurbo(this, 37, 40, textureX, textureY); // Box 158
		bodyModel[100] = new ModelRendererTurbo(this, 77, 63, textureX, textureY); // Box 157
		bodyModel[101] = new ModelRendererTurbo(this, 77, 77, textureX, textureY); // Box 156
		bodyModel[102] = new ModelRendererTurbo(this, 75, 69, textureX, textureY); // Box 155
		bodyModel[103] = new ModelRendererTurbo(this, 131, 56, textureX, textureY); // Box 154
		bodyModel[104] = new ModelRendererTurbo(this, 136, 56, textureX, textureY); // Box 153
		bodyModel[105] = new ModelRendererTurbo(this, 1, 5, textureX, textureY, "cull"); // Box cull backwindow
		bodyModel[106] = new ModelRendererTurbo(this, 141, 56, textureX, textureY); // Box 150
		bodyModel[107] = new ModelRendererTurbo(this, 146, 56, textureX, textureY); // Box 148
		bodyModel[108] = new ModelRendererTurbo(this, 57, 59, textureX, textureY); // Box 147
		bodyModel[109] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 146
		bodyModel[110] = new ModelRendererTurbo(this, 102, 132, textureX, textureY); // Box 145
		bodyModel[111] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Box 144
		bodyModel[112] = new ModelRendererTurbo(this, 57, 79, textureX, textureY); // Box 141
		bodyModel[113] = new ModelRendererTurbo(this, 38, 69, textureX, textureY); // Box 139
		bodyModel[114] = new ModelRendererTurbo(this, 66, 61, textureX, textureY); // Box 138
		bodyModel[115] = new ModelRendererTurbo(this, 99, 50, textureX, textureY); // Box 137
		bodyModel[116] = new ModelRendererTurbo(this, 94, 50, textureX, textureY); // Box 133
		bodyModel[117] = new ModelRendererTurbo(this, 66, 73, textureX, textureY); // Box 131
		bodyModel[118] = new ModelRendererTurbo(this, 77, 112, textureX, textureY); // Box 129
		bodyModel[119] = new ModelRendererTurbo(this, 55, 65, textureX, textureY); // Box 60
		bodyModel[120] = new ModelRendererTurbo(this, 102, 128, textureX, textureY); // Box 122
		bodyModel[121] = new ModelRendererTurbo(this, 41, 92, textureX, textureY); // Box 147
		bodyModel[122] = new ModelRendererTurbo(this, 21, 101, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 40, 88, textureX, textureY); // Box 137
		bodyModel[124] = new ModelRendererTurbo(this, 51, 88, textureX, textureY); // Box 136
		bodyModel[125] = new ModelRendererTurbo(this, 51, 92, textureX, textureY); // Box 133
		bodyModel[126] = new ModelRendererTurbo(this, 2, 110, textureX, textureY); // Box 132
		bodyModel[127] = new ModelRendererTurbo(this, 1, 100, textureX, textureY); // Box 131
		bodyModel[128] = new ModelRendererTurbo(this, 41, 88, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 8, 110, textureX, textureY); // Box 128
		bodyModel[130] = new ModelRendererTurbo(this, 8, 98, textureX, textureY); // Box 127
		bodyModel[131] = new ModelRendererTurbo(this, 2, 114, textureX, textureY); // Box 125
		bodyModel[132] = new ModelRendererTurbo(this, 1, 92, textureX, textureY); // Box 124
		bodyModel[133] = new ModelRendererTurbo(this, 18, 112, textureX, textureY); // Box trad hood
		bodyModel[134] = new ModelRendererTurbo(this, 2, 81, textureX, textureY); // Box 122
		bodyModel[135] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 121
		bodyModel[136] = new ModelRendererTurbo(this, 16, 81, textureX, textureY); // Box 119
		bodyModel[137] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Box 118
		bodyModel[138] = new ModelRendererTurbo(this, 146, 76, textureX, textureY); // Box 117
		bodyModel[139] = new ModelRendererTurbo(this, 146, 63, textureX, textureY); // Box 116
		bodyModel[140] = new ModelRendererTurbo(this, 117, 97, textureX, textureY); // Box 111
		bodyModel[141] = new ModelRendererTurbo(this, 166, 97, textureX, textureY); // Box 109
		bodyModel[142] = new ModelRendererTurbo(this, 1, 122, textureX, textureY); // Box 106
		bodyModel[143] = new ModelRendererTurbo(this, 59, 122, textureX, textureY); // Box 105
		bodyModel[144] = new ModelRendererTurbo(this, 23, 81, textureX, textureY); // Box 102
		bodyModel[145] = new ModelRendererTurbo(this, 1, 85, textureX, textureY, BoxName.headLight); // Box headlight
		bodyModel[146] = new ModelRendererTurbo(this, 10, 85, textureX, textureY, BoxName.headLight); // Box headlight
		bodyModel[147] = new ModelRendererTurbo(this, 15, 91, textureX, textureY); // Box 99
		bodyModel[148] = new ModelRendererTurbo(this, 19, 85, textureX, textureY); // Box 98
		bodyModel[149] = new ModelRendererTurbo(this, 26, 91, textureX, textureY); // Box 97
		bodyModel[150] = new ModelRendererTurbo(this, 30, 85, textureX, textureY); // Box 96
		bodyModel[151] = new ModelRendererTurbo(this, 196, 73, textureX, textureY); // Box 95
		bodyModel[152] = new ModelRendererTurbo(this, 59, 101, textureX, textureY); // Box 94
		bodyModel[153] = new ModelRendererTurbo(this, 70, 101, textureX, textureY); // Box 93
		bodyModel[154] = new ModelRendererTurbo(this, 113, 91, textureX, textureY); // Box 92
		bodyModel[155] = new ModelRendererTurbo(this, 132, 89, textureX, textureY); // Box 91
		bodyModel[156] = new ModelRendererTurbo(this, 100, 91, textureX, textureY); // Box 90
		bodyModel[157] = new ModelRendererTurbo(this, 121, 88, textureX, textureY); // Box 89
		bodyModel[158] = new ModelRendererTurbo(this, 142, 94, textureX, textureY); // Box 88
		bodyModel[159] = new ModelRendererTurbo(this, 112, 85, textureX, textureY); // Box 87
		bodyModel[160] = new ModelRendererTurbo(this, 99, 100, textureX, textureY); // Box 86
		bodyModel[161] = new ModelRendererTurbo(this, 102, 123, textureX, textureY); // Box 85
		bodyModel[162] = new ModelRendererTurbo(this, 143, 89, textureX, textureY); // Box 84
		bodyModel[163] = new ModelRendererTurbo(this, 101, 85, textureX, textureY); // Box 81
		bodyModel[164] = new ModelRendererTurbo(this, 78, 115, textureX, textureY); // Box 80
		bodyModel[165] = new ModelRendererTurbo(this, 59, 117, textureX, textureY); // Box 79
		bodyModel[166] = new ModelRendererTurbo(this, 59, 95, textureX, textureY); // Box 78
		bodyModel[167] = new ModelRendererTurbo(this, 70, 95, textureX, textureY); // Box 77
		bodyModel[168] = new ModelRendererTurbo(this, 217, 77, textureX, textureY); // Box 76
		bodyModel[169] = new ModelRendererTurbo(this, 101, 104, textureX, textureY); // Box 74
		bodyModel[170] = new ModelRendererTurbo(this, 150, 104, textureX, textureY); // Box 72
		bodyModel[171] = new ModelRendererTurbo(this, 162, 91, textureX, textureY); // Box 71
		bodyModel[172] = new ModelRendererTurbo(this, 181, 89, textureX, textureY); // Box 69
		bodyModel[173] = new ModelRendererTurbo(this, 149, 91, textureX, textureY); // Box 68
		bodyModel[174] = new ModelRendererTurbo(this, 170, 88, textureX, textureY); // Box 67
		bodyModel[175] = new ModelRendererTurbo(this, 94, 89, textureX, textureY); // Box 66
		bodyModel[176] = new ModelRendererTurbo(this, 161, 85, textureX, textureY); // Box 65
		bodyModel[177] = new ModelRendererTurbo(this, 148, 100, textureX, textureY); // Box 64
		bodyModel[178] = new ModelRendererTurbo(this, 151, 123, textureX, textureY); // Box 63
		bodyModel[179] = new ModelRendererTurbo(this, 93, 94, textureX, textureY); // Box 62
		bodyModel[180] = new ModelRendererTurbo(this, 150, 112, textureX, textureY); // Box 61
		bodyModel[181] = new ModelRendererTurbo(this, 147, 117, textureX, textureY); // Box 59
		bodyModel[182] = new ModelRendererTurbo(this, 150, 85, textureX, textureY); // Box 58
		bodyModel[183] = new ModelRendererTurbo(this, 78, 108, textureX, textureY); // Box 57
		bodyModel[184] = new ModelRendererTurbo(this, 59, 112, textureX, textureY); // Box 56
		bodyModel[185] = new ModelRendererTurbo(this, 119, 8, textureX, textureY); // Box 55
		bodyModel[186] = new ModelRendererTurbo(this, 225, 106, textureX, textureY); // Box chassis crossmember
		bodyModel[187] = new ModelRendererTurbo(this, 225, 106, textureX, textureY); // Box chassis crossmember
		bodyModel[188] = new ModelRendererTurbo(this, 242, 107, textureX, textureY); // Box chassis
		bodyModel[189] = new ModelRendererTurbo(this, 242, 107, textureX, textureY); // Box chassis
		bodyModel[190] = new ModelRendererTurbo(this, 216, 122, textureX, textureY); // Box chassis
		bodyModel[191] = new ModelRendererTurbo(this, 208, 125, textureX, textureY); // Box chassis
		bodyModel[192] = new ModelRendererTurbo(this, 242, 117, textureX, textureY); // Box chassis
		bodyModel[193] = new ModelRendererTurbo(this, 220, 98, textureX, textureY); // Box chassis crossmember
		bodyModel[194] = new ModelRendererTurbo(this, 242, 117, textureX, textureY); // Box chassis
		bodyModel[195] = new ModelRendererTurbo(this, 214, 108, textureX, textureY); // Box chassis
		bodyModel[196] = new ModelRendererTurbo(this, 242, 114, textureX, textureY); // Box chassis
		bodyModel[197] = new ModelRendererTurbo(this, 242, 114, textureX, textureY); // Box chassis
		bodyModel[198] = new ModelRendererTurbo(this, 229, 115, textureX, textureY); // Box chassis
		bodyModel[199] = new ModelRendererTurbo(this, 231, 103, textureX, textureY); // Box chassis
		bodyModel[200] = new ModelRendererTurbo(this, 229, 112, textureX, textureY); // Box chassis
		bodyModel[201] = new ModelRendererTurbo(this, 208, 125, textureX, textureY); // Box chassis
		bodyModel[202] = new ModelRendererTurbo(this, 231, 103, textureX, textureY); // Box chassis
		bodyModel[203] = new ModelRendererTurbo(this, 242, 111, textureX, textureY); // Box chassis
		bodyModel[204] = new ModelRendererTurbo(this, 229, 115, textureX, textureY); // Box chassis
		bodyModel[205] = new ModelRendererTurbo(this, 229, 115, textureX, textureY); // Box chassis
		bodyModel[206] = new ModelRendererTurbo(this, 231, 103, textureX, textureY); // Box chassis
		bodyModel[207] = new ModelRendererTurbo(this, 229, 112, textureX, textureY); // Box chassis
		bodyModel[208] = new ModelRendererTurbo(this, 231, 100, textureX, textureY); // Box chassis
		bodyModel[209] = new ModelRendererTurbo(this, 231, 103, textureX, textureY); // Box chassis
		bodyModel[210] = new ModelRendererTurbo(this, 229, 115, textureX, textureY); // Box chassis
		bodyModel[211] = new ModelRendererTurbo(this, 242, 111, textureX, textureY); // Box chassis
		bodyModel[212] = new ModelRendererTurbo(this, 231, 100, textureX, textureY); // Box chassis
		bodyModel[213] = new ModelRendererTurbo(this, 1, 64, textureX, textureY); // Box 19
		bodyModel[214] = new ModelRendererTurbo(this, 18, 64, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[215] = new ModelRendererTurbo(this, 18, 69, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[216] = new ModelRendererTurbo(this, 2, 64, textureX, textureY, "wheel"); // Box Wheel4
		bodyModel[217] = new ModelRendererTurbo(this, 18, 59, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[218] = new ModelRendererTurbo(this, 27, 59, textureX, textureY, "wheel"); // Box 12 Wheel 3
		bodyModel[219] = new ModelRendererTurbo(this, 2, 71, textureX, textureY, "wheel"); // Box Wheel3
		bodyModel[220] = new ModelRendererTurbo(this, 27, 64, textureX, textureY, "wheel"); // Box 12 Wheel 3
		bodyModel[221] = new ModelRendererTurbo(this, 27, 69, textureX, textureY, "wheel"); // Box 12 Wheel3
		bodyModel[222] = new ModelRendererTurbo(this, 2, 64, textureX, textureY, "wheel front"); // Box 17 Wheel2
		bodyModel[223] = new ModelRendererTurbo(this, 18, 59, textureX, textureY, "wheel front"); // Box 12 Wheel2
		bodyModel[224] = new ModelRendererTurbo(this, 18, 64, textureX, textureY, "wheel front"); // Box 9 Wheel2
		bodyModel[225] = new ModelRendererTurbo(this, 18, 69, textureX, textureY, "wheel front"); // Box 136 Wheel2
		bodyModel[226] = new ModelRendererTurbo(this, 1, 64, textureX, textureY); // Box 23 axle 1-2
		bodyModel[227] = new ModelRendererTurbo(this, 2, 71, textureX, textureY, "wheel front"); // Box 17 Wheel1
		bodyModel[228] = new ModelRendererTurbo(this, 27, 59, textureX, textureY, "wheel front"); // Box 12 Wheel1
		bodyModel[229] = new ModelRendererTurbo(this, 27, 64, textureX, textureY, "wheel front"); // Box 9 Wheel1
		bodyModel[230] = new ModelRendererTurbo(this, 27, 69, textureX, textureY, "wheel front"); // Box 136 Wheel1
		bodyModel[231] = new ModelRendererTurbo(this, 105, 20, textureX, textureY); // Box 233
		bodyModel[232] = new ModelRendererTurbo(this, 102, 20, textureX, textureY); // Box 234
		bodyModel[233] = new ModelRendererTurbo(this, 108, 20, textureX, textureY); // Box 104
		bodyModel[234] = new ModelRendererTurbo(this, 33, 6, textureX, textureY, BoxName.ditch); // Box 270 foglights adventure
		bodyModel[235] = new ModelRendererTurbo(this, 26, 6, textureX, textureY, BoxName.ditch); // Box 270 foglights adventure
		bodyModel[236] = new ModelRendererTurbo(this, 70, 130, textureX, textureY); // Box 364 prime base
		bodyModel[237] = new ModelRendererTurbo(this, 61, 130, textureX, textureY, BoxName.prime1); // Box 6 PRIME2-1
		bodyModel[238] = new ModelRendererTurbo(this, 61, 130, textureX, textureY, BoxName.prime3); // Box 7 PRIME2-3
		bodyModel[239] = new ModelRendererTurbo(this, 61, 130, textureX, textureY, BoxName.prime2); // Box 8 PRIME2-2
		bodyModel[240] = new ModelRendererTurbo(this, 61, 130, textureX, textureY, BoxName.prime4); // Box 9 PRIME2-4
		bodyModel[241] = new ModelRendererTurbo(this, 52, 164, textureX, textureY); // Box surfboreds
		bodyModel[242] = new ModelRendererTurbo(this, 140, 166, textureX, textureY); // Box surfboreds
		bodyModel[243] = new ModelRendererTurbo(this, 125, 166, textureX, textureY); // Box surfboreds
		bodyModel[244] = new ModelRendererTurbo(this, 9, 164, textureX, textureY); // Box surfboreds
		bodyModel[245] = new ModelRendererTurbo(this, 110, 166, textureX, textureY); // Box surfboreds
		bodyModel[246] = new ModelRendererTurbo(this, 95, 166, textureX, textureY); // Box surfboreds
		bodyModel[247] = new ModelRendererTurbo(this, 113, 149, textureX, textureY); // Box suitcase
		bodyModel[248] = new ModelRendererTurbo(this, 87, 135, textureX, textureY); // Box drink chest
		bodyModel[249] = new ModelRendererTurbo(this, 81, 141, textureX, textureY); // Box drink chest
		bodyModel[250] = new ModelRendererTurbo(this, 113, 139, textureX, textureY); // Box 253
		bodyModel[251] = new ModelRendererTurbo(this, 81, 104, textureX, textureY); // Box woody piece
		bodyModel[252] = new ModelRendererTurbo(this, 81, 104, textureX, textureY); // Box 255
		bodyModel[253] = new ModelRendererTurbo(this, 111, 20, textureX, textureY); // Box 256
		bodyModel[254] = new ModelRendererTurbo(this, 253, 152, textureX, textureY); // Box 144
		bodyModel[255] = new ModelRendererTurbo(this, 253, 152, textureX, textureY); // Box 145
		bodyModel[256] = new ModelRendererTurbo(this, 68, 135, textureX, textureY); // Box 334 commander beacon
		bodyModel[257] = new ModelRendererTurbo(this, 74, 135, textureX, textureY); // Box 335
		bodyModel[258] = new ModelRendererTurbo(this, 148, 144, textureX, textureY); // Box rear seat reversed
		bodyModel[259] = new ModelRendererTurbo(this, 62, 13, textureX, textureY); // Box hirail pipe

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 308
		bodyModel[0].setRotationPoint(15F, 4F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 307
		bodyModel[1].setRotationPoint(19F, 0F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 306
		bodyModel[2].setRotationPoint(22F, 1.5F, -7F);

		bodyModel[3].addShapeBox(0F, 1F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 305
		bodyModel[3].setRotationPoint(23F, 6F, 6F);
		bodyModel[3].rotateAngleZ = -1.25663706F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167 frame bit
		bodyModel[4].setRotationPoint(20.5F, 5.5F, -5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 152 hirail shit
		bodyModel[5].setRotationPoint(22.5F, 6F, 3F);
		bodyModel[5].rotateAngleZ = -0.9424778F;

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 151 hirail shit
		bodyModel[6].setRotationPoint(23F, 6F, -4F);
		bodyModel[6].rotateAngleZ = -1.25663706F;

		bodyModel[7].addShapeBox(0F, 1F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 149 hirail shit wheel
		bodyModel[7].setRotationPoint(23F, 6F, -6F);
		bodyModel[7].rotateAngleZ = -1.25663706F;

		bodyModel[8].addBox(1F, 2F, 0F, 1, 1, 12, 0F); // Box 148 hirail shit axle
		bodyModel[8].setRotationPoint(23F, 6F, -6F);
		bodyModel[8].rotateAngleZ = -1.25663706F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -0.25F, -0.5F, 1F, 0.25F, 0F, 0F, 0F); // Box 298
		bodyModel[9].setRotationPoint(-26F, 5.5F, 3.75F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 152 hirail shit
		bodyModel[10].setRotationPoint(-25.75F, 6.5F, 3F);
		bodyModel[10].rotateAngleZ = 0.4712389F;

		bodyModel[11].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 151 hirail shit
		bodyModel[11].setRotationPoint(-25.75F, 6.5F, -4F);
		bodyModel[11].rotateAngleZ = 0.4712389F;

		bodyModel[12].addShapeBox(0F, 1F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 150 hirail shit wheel
		bodyModel[12].setRotationPoint(-25.75F, 6.5F, 6F);
		bodyModel[12].rotateAngleZ = 0.4712389F;

		bodyModel[13].addShapeBox(0F, 1F, 0F, 4, 4, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 149 hirail shit wheel
		bodyModel[13].setRotationPoint(-25.75F, 6.5F, -6F);
		bodyModel[13].rotateAngleZ = 0.4712389F;

		bodyModel[14].addBox(1F, 2F, 0F, 1, 1, 12, 0F); // Box 148 hirail shit axle
		bodyModel[14].setRotationPoint(-25.75F, 6.5F, -6F);
		bodyModel[14].rotateAngleZ = 0.4712389F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0.25F, -0.5F, 1F, -0.25F, 0F, 0F, 0F); // Box 146
		bodyModel[15].setRotationPoint(-26F, 5.5F, -4.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Box 31
		bodyModel[16].setRotationPoint(-27F, 5.5F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 289
		bodyModel[17].setRotationPoint(25F, 2F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 288
		bodyModel[18].setRotationPoint(25F, 2F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 286
		bodyModel[19].setRotationPoint(25.12F, 2.5F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box cull holder
		bodyModel[20].setRotationPoint(25F, 2F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 284
		bodyModel[21].setRotationPoint(25F, 5F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[22].setRotationPoint(25F, 1.5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 23, 2, 14, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull roofbar gates
		bodyModel[23].setRotationPoint(-3F, -6.55F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 23, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box cull roofbars
		bodyModel[24].setRotationPoint(-3F, -4.55F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 278
		bodyModel[25].setRotationPoint(7F, -3.5F, 7.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 277
		bodyModel[26].setRotationPoint(7F, -3.5F, -7.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[27].setRotationPoint(8F, 3.5F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 17, 1, 14, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[28].setRotationPoint(7F, 3.5F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[29].setRotationPoint(8F, 3.5F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[30].setRotationPoint(9F, 2.5F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 272
		bodyModel[31].setRotationPoint(9F, 2.5F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[32].setRotationPoint(15F, 2.5F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[33].setRotationPoint(15F, 2.5F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[34].setRotationPoint(-17F, 2.5F, 9.01F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[35].setRotationPoint(-17F, 2.5F, -9.01F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box exhaust
		bodyModel[36].setRotationPoint(18F, 7.5F, 2.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box exhaust
		bodyModel[37].setRotationPoint(13F, 5.5F, 2.5F);

		bodyModel[38].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box alt rear plate placememnt
		bodyModel[38].setRotationPoint(25.01F, 5F, 2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 100 im goonna HYITch yuh
		bodyModel[39].setRotationPoint(25.5F, 6.5F, -0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100 im goonna HYITch yuh
		bodyModel[40].setRotationPoint(24F, 5.5F, -0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 100 im goonna HYITch yuh
		bodyModel[41].setRotationPoint(26.5F, 5.5F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box turnlight R
		bodyModel[42].setRotationPoint(24F, 5.9F, 6.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box turnlight L
		bodyModel[43].setRotationPoint(24F, 5.9F, -8.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 257 taillight
		bodyModel[44].setRotationPoint(25.12F, 2.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 253
		bodyModel[45].setRotationPoint(16.5F, 7.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 0, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box aftermarket mudflap
		bodyModel[46].setRotationPoint(16.5F, 7.5F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box deluxe rear wheel covers
		bodyModel[47].setRotationPoint(8F, 3.5F, 9.01F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box deluxe rear wheel covers
		bodyModel[48].setRotationPoint(8F, 3.5F, -9.01F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box cull holder
		bodyModel[49].setRotationPoint(25F, 2F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 239
		bodyModel[50].setRotationPoint(25F, 5F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 238
		bodyModel[51].setRotationPoint(25F, 5F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[52].setRotationPoint(25F, 1.5F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 236 foglight alternative
		bodyModel[53].setRotationPoint(-25.25F, 3.5F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 236 foglight alternative
		bodyModel[54].setRotationPoint(-25.25F, 3.5F, -5F);

		bodyModel[55].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183 plate
		bodyModel[55].setRotationPoint(25F, 7.5F, -2F);

		bodyModel[56].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 106 plate
		bodyModel[56].setRotationPoint(-24.01F, 7.75F, 2F);
		bodyModel[56].rotateAngleY = -3.14159265F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 172 foglight
		bodyModel[57].setRotationPoint(-25.25F, 5.5F, 4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 171 foglight
		bodyModel[58].setRotationPoint(-25.25F, 5.5F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box turnlight L
		bodyModel[59].setRotationPoint(-24F, 7F, -8.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box turnlight R
		bodyModel[60].setRotationPoint(-24F, 7F, 6.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 226
		bodyModel[61].setRotationPoint(-1F, 1F, 1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[62].setRotationPoint(-5F, 5F, 1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 224
		bodyModel[63].setRotationPoint(-1F, 1F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[64].setRotationPoint(-5F, 5F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box tork konvartah
		bodyModel[65].setRotationPoint(-15.5F, 5.5F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box driveshaf
		bodyModel[66].setRotationPoint(-13.5F, 6.5F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 220
		bodyModel[67].setRotationPoint(-1F, 5F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[68].setRotationPoint(3F, 5F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 218
		bodyModel[69].setRotationPoint(7F, 1F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[70].setRotationPoint(-12F, 2F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F); // Box 49
		bodyModel[71].setRotationPoint(-12F, 4F, -1F);

		bodyModel[72].addBox(-7F, -0.5F, -0.5F, 7, 1, 1, 0F); // Box 227
		bodyModel[72].setRotationPoint(-6.5F, 1.25F, -4.5F);
		bodyModel[72].rotateAngleZ = 0.29670597F;

		bodyModel[73].addShapeBox(0F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[73].setRotationPoint(-6.49F, 1.25F, -4.5F);
		bodyModel[73].rotateAngleZ = 0.29670597F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 213
		bodyModel[74].setRotationPoint(-7F, -3.5F, 7.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 5, 0, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 212
		bodyModel[75].setRotationPoint(-7F, -3.5F, -7.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 211
		bodyModel[76].setRotationPoint(-12F, 5.5F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[77].setRotationPoint(-14F, 2.5F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box chassis
		bodyModel[78].setRotationPoint(-10.5F, 7.5F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[79].setRotationPoint(-12F, 5.5F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 17, 1, 14, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[80].setRotationPoint(-10F, 5.5F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[81].setRotationPoint(-14F, 2.5F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box cull nobodysgonnaseethis
		bodyModel[82].setRotationPoint(-23F, 2.5F, -6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box spooky engine
		bodyModel[83].setRotationPoint(-21.5F, 2F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 199
		bodyModel[84].setRotationPoint(-6.5F, 0.25F, 8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 197
		bodyModel[85].setRotationPoint(-6.5F, 0.25F, -10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F); // Box 180
		bodyModel[86].setRotationPoint(-25F, 2.75F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 25, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 177
		bodyModel[87].setRotationPoint(-4F, -3.5F, 7.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 25, 5, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 172
		bodyModel[88].setRotationPoint(-4F, -3.5F, -7.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.25F, 0F, -2F, 0.25F, 0F); // Box 169
		bodyModel[89].setRotationPoint(19F, -3.5F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, 2F, 0.25F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 168
		bodyModel[90].setRotationPoint(19F, -3.5F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.95F, 0F, 0F, -0.75F, -0.2F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F); // Box 167
		bodyModel[91].setRotationPoint(15F, -4.5F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, -1F, 0F, -0.75F, -0.2F, 0F, -0.95F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[92].setRotationPoint(15F, -4.5F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0.8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 0F); // Box 165
		bodyModel[93].setRotationPoint(15F, -4.5F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.75F, 0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 164
		bodyModel[94].setRotationPoint(15F, -4.5F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.75F, -0.8F, 0F, -0.5F, 0.8F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 0F); // Box 163
		bodyModel[95].setRotationPoint(15F, -4.5F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0.8F, 0F, -0.75F, -0.8F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0F); // Box 162
		bodyModel[96].setRotationPoint(15F, -4.5F, 3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, -0.25F, 1F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.25F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F); // Box 160
		bodyModel[97].setRotationPoint(15F, -4.5F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[98].setRotationPoint(-2F, -4.5F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[99].setRotationPoint(-2F, -4.5F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[100].setRotationPoint(-2F, -4.5F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[101].setRotationPoint(-2F, -4.5F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[102].setRotationPoint(-2F, -4.5F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0.25F, 0F, -2F, 0.25F, 0F); // Box 154
		bodyModel[103].setRotationPoint(20F, -3.5F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.25F, 0F, 1.5F, 0.25F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 153
		bodyModel[104].setRotationPoint(20F, -3.5F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box cull backwindow
		bodyModel[105].setRotationPoint(20F, -3.5F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.75F, 0F, -1F, -0.75F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 150
		bodyModel[106].setRotationPoint(-3.5F, -4.5F, 7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F); // Box 148
		bodyModel[107].setRotationPoint(-3.5F, -4.5F, -8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 147
		bodyModel[108].setRotationPoint(-4F, -4.5F, 3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[109].setRotationPoint(16F, 1.5F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 26, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[110].setRotationPoint(-10F, 1.5F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[111].setRotationPoint(16F, 1.5F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 141
		bodyModel[112].setRotationPoint(-4F, -4.5F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 139
		bodyModel[113].setRotationPoint(-4F, -4.5F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 138
		bodyModel[114].setRotationPoint(-10F, -3.5F, 3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 137
		bodyModel[115].setRotationPoint(-8.5F, -3.5F, 7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-4.5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 133
		bodyModel[116].setRotationPoint(-8.5F, -3.5F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,-5.5F, 0F, 0F, 5.5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 131
		bodyModel[117].setRotationPoint(-10F, -3.5F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[118].setRotationPoint(-10F, 1.5F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 60
		bodyModel[119].setRotationPoint(-10F, -3.5F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 26, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[120].setRotationPoint(-10F, 1.5F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 147
		bodyModel[121].setRotationPoint(-25F, 2.75F, 4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(-24F, 5.75F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 137
		bodyModel[123].setRotationPoint(-24F, 5.75F, -4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 136
		bodyModel[124].setRotationPoint(-25.5F, 5.5F, 3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F); // Box 133
		bodyModel[125].setRotationPoint(-25.5F, 5.5F, -4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 132
		bodyModel[126].setRotationPoint(-23.5F, 5.5F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -0.25F, -1F, -0.5F, -0.25F); // Box 131
		bodyModel[127].setRotationPoint(-25F, 5.5F, 4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		bodyModel[128].setRotationPoint(-25F, 2.75F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[129].setRotationPoint(-24F, 4.75F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 127
		bodyModel[130].setRotationPoint(-24F, 1.75F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0.15F, -0.5F, 0F); // Box 125
		bodyModel[131].setRotationPoint(-23.5F, 5.5F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 124
		bodyModel[132].setRotationPoint(-25F, 5.5F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box trad hood
		bodyModel[133].setRotationPoint(-23F, 1.5F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 122
		bodyModel[134].setRotationPoint(-24F, 1.5F, 5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[135].setRotationPoint(-24F, 1.5F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 119
		bodyModel[136].setRotationPoint(-24F, 1.5F, -7F);

		bodyModel[137].addShapeBox(-2F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[137].setRotationPoint(25F, 1.5F, -2F);

		bodyModel[138].addShapeBox(-2F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[138].setRotationPoint(25F, 1.5F, 2F);

		bodyModel[139].addShapeBox(-2F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[139].setRotationPoint(25F, 1.5F, -7F);

		bodyModel[140].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[140].setRotationPoint(25F, 1.5F, 7F);

		bodyModel[141].addShapeBox(-2F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[141].setRotationPoint(25F, 1.5F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[142].setRotationPoint(-23F, 1.5F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[143].setRotationPoint(-23F, 1.5F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 102
		bodyModel[144].setRotationPoint(-24F, 1.5F, -9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box headlight
		bodyModel[145].setRotationPoint(-24.25F, 2.5F, 5.75F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box headlight
		bodyModel[146].setRotationPoint(-24.25F, 2.5F, -8.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 99
		bodyModel[147].setRotationPoint(-24F, 3.5F, 5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 98
		bodyModel[148].setRotationPoint(-24F, 2.5F, 5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[149].setRotationPoint(-24F, 3.5F, -9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[150].setRotationPoint(-24F, 2.5F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[151].setRotationPoint(24F, 2.5F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 94
		bodyModel[152].setRotationPoint(-23F, 3.5F, 6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F); // Box 93
		bodyModel[153].setRotationPoint(-21F, 3.5F, 6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F); // Box 92
		bodyModel[154].setRotationPoint(15F, 5.5F, 6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Box 91
		bodyModel[155].setRotationPoint(10.5F, 3.5F, 6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 0F); // Box 90
		bodyModel[156].setRotationPoint(12.5F, 3.5F, 6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[157].setRotationPoint(8F, 3.5F, 6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 88
		bodyModel[158].setRotationPoint(7F, 7.5F, 6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 87
		bodyModel[159].setRotationPoint(7F, 5.5F, 6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[160].setRotationPoint(8F, 2.5F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		bodyModel[161].setRotationPoint(-12F, 7.5F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 84
		bodyModel[162].setRotationPoint(-13F, 7.5F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0F, -0.25F); // Box 81
		bodyModel[163].setRotationPoint(-14F, 5.5F, 6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 80
		bodyModel[164].setRotationPoint(-17F, 2.5F, 6F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[165].setRotationPoint(-23F, 2.5F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[166].setRotationPoint(-23F, 3.5F, -9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[167].setRotationPoint(-21F, 3.5F, -9F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 76
		bodyModel[168].setRotationPoint(24F, 5.5F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F); // Box 74
		bodyModel[169].setRotationPoint(17F, 5.5F, 8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[170].setRotationPoint(17F, 5.5F, -9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 71
		bodyModel[171].setRotationPoint(15F, 5.5F, -9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Box 69
		bodyModel[172].setRotationPoint(10.5F, 3.5F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.75F, 0F); // Box 68
		bodyModel[173].setRotationPoint(12.5F, 3.5F, -9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[174].setRotationPoint(8F, 3.5F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[175].setRotationPoint(7F, 7.5F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[176].setRotationPoint(7F, 5.5F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[177].setRotationPoint(8F, 2.5F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[178].setRotationPoint(-12F, 7.5F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 62
		bodyModel[179].setRotationPoint(-13F, 7.5F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 19, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[180].setRotationPoint(-12F, 5.5F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 22, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[181].setRotationPoint(-14F, 2.5F, -9F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 58
		bodyModel[182].setRotationPoint(-14F, 5.5F, -9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 57
		bodyModel[183].setRotationPoint(-17F, 2.5F, -9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[184].setRotationPoint(-23F, 2.5F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[185].setRotationPoint(10F, 5.5F, -1.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box chassis crossmember
		bodyModel[186].setRotationPoint(-1.5F, 7F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box chassis crossmember
		bodyModel[187].setRotationPoint(-4.5F, 7F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[188].setRotationPoint(6.5F, 6.5F, 5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[189].setRotationPoint(6.5F, 6.5F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box chassis
		bodyModel[190].setRotationPoint(-10.5F, 7.5F, -8F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,-0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.35F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box chassis
		bodyModel[191].setRotationPoint(-13.5F, 6.5F, -5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 3F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[192].setRotationPoint(-14.5F, 6.5F, 4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box chassis crossmember
		bodyModel[193].setRotationPoint(-22.5F, 6.25F, -4F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, -3F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[194].setRotationPoint(-14.5F, 6.5F, -5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 10, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[195].setRotationPoint(18.5F, 6F, -5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[196].setRotationPoint(14.5F, 6F, -5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[197].setRotationPoint(14.5F, 6F, 4F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box chassis
		bodyModel[198].setRotationPoint(12.5F, 6F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[199].setRotationPoint(10.5F, 4.5F, -5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box chassis
		bodyModel[200].setRotationPoint(8.5F, 6F, -5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.35F, 0.5F, 0F); // Box chassis
		bodyModel[201].setRotationPoint(-13.5F, 6.5F, 4F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[202].setRotationPoint(-18.5F, 5F, 4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[203].setRotationPoint(-21.5F, 6F, 4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box chassis
		bodyModel[204].setRotationPoint(-16.5F, 5.5F, 4F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F); // Box chassis
		bodyModel[205].setRotationPoint(12.5F, 6F, 4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[206].setRotationPoint(10.5F, 4.5F, 4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box chassis
		bodyModel[207].setRotationPoint(8.5F, 6F, 4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[208].setRotationPoint(-23.5F, 6F, 4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[209].setRotationPoint(-18.5F, 5F, -5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box chassis
		bodyModel[210].setRotationPoint(-16.5F, 5.5F, -5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[211].setRotationPoint(-21.5F, 6F, -5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box chassis
		bodyModel[212].setRotationPoint(-23.5F, 6F, -5F);

		bodyModel[213].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 19
		bodyModel[213].setRotationPoint(11.5F, 7F, -7F);

		bodyModel[214].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 17 Wheel4
		bodyModel[214].setRotationPoint(11.5F, 7F, 7.75F);

		bodyModel[215].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 17 Wheel4
		bodyModel[215].setRotationPoint(11.5F, 7F, 7.75F);

		bodyModel[216].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box Wheel4
		bodyModel[216].setRotationPoint(11.5F, 7F, 7.75F);

		bodyModel[217].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 17 Wheel4
		bodyModel[217].setRotationPoint(11.5F, 7F, 7.75F);

		bodyModel[218].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel 3
		bodyModel[218].setRotationPoint(11.5F, 7F, -7.75F);

		bodyModel[219].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box Wheel3
		bodyModel[219].setRotationPoint(11.5F, 7F, -7.75F);

		bodyModel[220].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 12 Wheel 3
		bodyModel[220].setRotationPoint(11.5F, 7F, -7.75F);

		bodyModel[221].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 12 Wheel3
		bodyModel[221].setRotationPoint(11.5F, 7F, -7.75F);

		bodyModel[222].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel2
		bodyModel[222].setRotationPoint(-17.5F, 7F, 7.75F);

		bodyModel[223].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[223].setRotationPoint(-17.5F, 7F, 7.75F);

		bodyModel[224].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[224].setRotationPoint(-17.5F, 7F, 7.75F);

		bodyModel[225].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel2
		bodyModel[225].setRotationPoint(-17.5F, 7F, 7.75F);

		bodyModel[226].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 23 axle 1-2
		bodyModel[226].setRotationPoint(-17.5F, 7F, -7F);

		bodyModel[227].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel1
		bodyModel[227].setRotationPoint(-17.5F, 7F, -7.75F);

		bodyModel[228].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[228].setRotationPoint(-17.5F, 7F, -7.75F);

		bodyModel[229].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[229].setRotationPoint(-17.5F, 7F, -7.75F);

		bodyModel[230].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel1
		bodyModel[230].setRotationPoint(-17.5F, 7F, -7.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 13, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 233
		bodyModel[231].setRotationPoint(23F, -10F, 8.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 13, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 234
		bodyModel[232].setRotationPoint(23F, -10F, -8.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 13, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104
		bodyModel[233].setRotationPoint(-10F, -11F, 8.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 270 foglights adventure
		bodyModel[234].setRotationPoint(-3.5F, -6.5F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 270 foglights adventure
		bodyModel[235].setRotationPoint(-3.5F, -6.5F, 4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[236].setRotationPoint(-1.5F, -5.25F, -1F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME2-1
		bodyModel[237].setRotationPoint(-1.5F, -5.75F, -1F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME2-3
		bodyModel[238].setRotationPoint(-1.5F, -5.75F, -1F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME2-2
		bodyModel[239].setRotationPoint(-1.5F, -5.75F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME2-4
		bodyModel[240].setRotationPoint(-1.5F, -5.75F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box surfboreds
		bodyModel[241].setRotationPoint(1.1F, -5.6F, 2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box surfboreds
		bodyModel[242].setRotationPoint(-2.9F, -5.6F, 3F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box surfboreds
		bodyModel[243].setRotationPoint(17.1F, -5.6F, 3F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 16, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box surfboreds
		bodyModel[244].setRotationPoint(1F, -6.6F, 2F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box surfboreds
		bodyModel[245].setRotationPoint(-3F, -6.6F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box surfboreds
		bodyModel[246].setRotationPoint(17F, -6.6F, 3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box suitcase
		bodyModel[247].setRotationPoint(11.5F, -7.6F, -6.95F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box drink chest
		bodyModel[248].setRotationPoint(7.5F, -6.6F, -6.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box drink chest
		bodyModel[249].setRotationPoint(7.5F, -7.6F, -6F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 8, 3, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[250].setRotationPoint(9.5F, -7.6F, 0.95F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box woody piece
		bodyModel[251].setRotationPoint(-17F, 2.5F, -9.01F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[252].setRotationPoint(-17F, 2.5F, 9.01F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 13, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 256
		bodyModel[253].setRotationPoint(17F, -17F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[254].setRotationPoint(-26.25F, -2F, -9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 8, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[255].setRotationPoint(-26.25F, -2F, 9F);

		bodyModel[256].addShapeBox(0F, -1F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 334 commander beacon
		bodyModel[256].setRotationPoint(-1.1F, -5.25F, -0.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 335
		bodyModel[257].setRotationPoint(-1.1F, -5.25F, -0.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box rear seat reversed
		bodyModel[258].setRotationPoint(15F, 0F, -7F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box hirail pipe
		bodyModel[259].setRotationPoint(18F, 7.5F, 3.5F);
	}
}