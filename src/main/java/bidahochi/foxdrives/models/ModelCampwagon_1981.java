//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pine_Campwagon
// Model Creator: bida
// Created on: 16.02.2025 - 17:37:46
// Last changed on: 16.02.2025 - 17:37:46

package bidahochi.foxdrives.models; //Path where the model is located

import bidahochi.foxdrives.util.BoxName;
import fdfexcraft.tmt_slim.ModelConverter;
import fdfexcraft.tmt_slim.ModelRendererTurbo;

public class ModelCampwagon_1981 extends ModelConverter //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelCampwagon_1981() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[225];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 110, textureX, textureY); // Box 100 hitch ball
		bodyModel[1] = new ModelRendererTurbo(this, 86, 110, textureX, textureY); // Box 101 im gonna hitch ya!
		bodyModel[2] = new ModelRendererTurbo(this, 45, 52, textureX, textureY); // Box 102
		bodyModel[3] = new ModelRendererTurbo(this, 45, 52, textureX, textureY); // Box 103
		bodyModel[4] = new ModelRendererTurbo(this, 53, 51, textureX, textureY); // Box 104 long stock antenna
		bodyModel[5] = new ModelRendererTurbo(this, 77, 105, textureX, textureY); // Box 106 plate
		bodyModel[6] = new ModelRendererTurbo(this, 19, 53, textureX, textureY); // Box 114
		bodyModel[7] = new ModelRendererTurbo(this, 12, 59, textureX, textureY); // Box 115
		bodyModel[8] = new ModelRendererTurbo(this, 5, 26, textureX, textureY); // Box 116
		bodyModel[9] = new ModelRendererTurbo(this, 5, 61, textureX, textureY); // Box 121
		bodyModel[10] = new ModelRendererTurbo(this, 23, 76, textureX, textureY); // Box 122
		bodyModel[11] = new ModelRendererTurbo(this, 21, 66, textureX, textureY); // Box 123
		bodyModel[12] = new ModelRendererTurbo(this, 31, 66, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 23, 66, textureX, textureY); // Box 129
		bodyModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 130
		bodyModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 131
		bodyModel[16] = new ModelRendererTurbo(this, 20, 63, textureX, textureY); // Box 132
		bodyModel[17] = new ModelRendererTurbo(this, 12, 65, textureX, textureY); // Box 133
		bodyModel[18] = new ModelRendererTurbo(this, 5, 67, textureX, textureY); // Box 134
		bodyModel[19] = new ModelRendererTurbo(this, 34, 49, textureX, textureY); // Box 135
		bodyModel[20] = new ModelRendererTurbo(this, 6, 73, textureX, textureY); // Box 136
		bodyModel[21] = new ModelRendererTurbo(this, 6, 80, textureX, textureY); // Box 137
		bodyModel[22] = new ModelRendererTurbo(this, 20, 73, textureX, textureY); // Box 138
		bodyModel[23] = new ModelRendererTurbo(this, 44, 80, textureX, textureY); // Box 139
		bodyModel[24] = new ModelRendererTurbo(this, 44, 71, textureX, textureY); // Box 140
		bodyModel[25] = new ModelRendererTurbo(this, 44, 76, textureX, textureY); // Box 141
		bodyModel[26] = new ModelRendererTurbo(this, 1, 78, textureX, textureY, BoxName.rightTurnLight); // Box 142 front orangelight
		bodyModel[27] = new ModelRendererTurbo(this, 1, 78, textureX, textureY, BoxName.leftTurnLight); // Box 143 front orangelight
		bodyModel[28] = new ModelRendererTurbo(this, 80, 33, textureX, textureY); // Box 144
		bodyModel[29] = new ModelRendererTurbo(this, 38, 33, textureX, textureY); // Box 145
		bodyModel[30] = new ModelRendererTurbo(this, 4, 59, textureX, textureY); // Box 146
		bodyModel[31] = new ModelRendererTurbo(this, 82, 42, textureX, textureY); // Box 147
		bodyModel[32] = new ModelRendererTurbo(this, 96, 52, textureX, textureY); // Box 148
		bodyModel[33] = new ModelRendererTurbo(this, 96, 29, textureX, textureY); // Box 149
		bodyModel[34] = new ModelRendererTurbo(this, 188, 78, textureX, textureY); // Box 149
		bodyModel[35] = new ModelRendererTurbo(this, 122, 81, textureX, textureY); // Box 150
		bodyModel[36] = new ModelRendererTurbo(this, 204, 72, textureX, textureY); // Box 150
		bodyModel[37] = new ModelRendererTurbo(this, 187, 73, textureX, textureY); // Box 151
		bodyModel[38] = new ModelRendererTurbo(this, 86, 36, textureX, textureY); // Box 152
		bodyModel[39] = new ModelRendererTurbo(this, 43, 30, textureX, textureY); // Box 153
		bodyModel[40] = new ModelRendererTurbo(this, 186, 95, textureX, textureY); // Box 154
		bodyModel[41] = new ModelRendererTurbo(this, 69, 30, textureX, textureY); // Box 154
		bodyModel[42] = new ModelRendererTurbo(this, 122, 87, textureX, textureY); // Box 155
		bodyModel[43] = new ModelRendererTurbo(this, 77, 42, textureX, textureY); // Box 155
		bodyModel[44] = new ModelRendererTurbo(this, 122, 71, textureX, textureY); // Box 156
		bodyModel[45] = new ModelRendererTurbo(this, 93, 32, textureX, textureY); // Box 156
		bodyModel[46] = new ModelRendererTurbo(this, 122, 77, textureX, textureY); // Box 157
		bodyModel[47] = new ModelRendererTurbo(this, 93, 46, textureX, textureY); // Box 157
		bodyModel[48] = new ModelRendererTurbo(this, 77, 52, textureX, textureY); // Box 158
		bodyModel[49] = new ModelRendererTurbo(this, 82, 52, textureX, textureY); // Box 159
		bodyModel[50] = new ModelRendererTurbo(this, 96, 63, textureX, textureY); // Box 160
		bodyModel[51] = new ModelRendererTurbo(this, 246, 104, textureX, textureY, "brakeLight"); // Box 162 taillight early
		bodyModel[52] = new ModelRendererTurbo(this, 246, 108, textureX, textureY, BoxName.rightTurnLight); // Box 163 turnlight R early
		bodyModel[53] = new ModelRendererTurbo(this, 1, 91, textureX, textureY); // Box 164 frame bit
		bodyModel[54] = new ModelRendererTurbo(this, 108, 63, textureX, textureY); // Box 165
		bodyModel[55] = new ModelRendererTurbo(this, 159, 55, textureX, textureY); // Box 165
		bodyModel[56] = new ModelRendererTurbo(this, 34, 106, textureX, textureY); // Box 165 driveline
		bodyModel[57] = new ModelRendererTurbo(this, 1, 91, textureX, textureY); // Box 165 frame bit
		bodyModel[58] = new ModelRendererTurbo(this, 164, 55, textureX, textureY); // Box 166
		bodyModel[59] = new ModelRendererTurbo(this, 20, 94, textureX, textureY); // Box 166 boy this geometry sure is exhausting
		bodyModel[60] = new ModelRendererTurbo(this, 171, 55, textureX, textureY); // Box 167
		bodyModel[61] = new ModelRendererTurbo(this, 159, 63, textureX, textureY); // Box 167
		bodyModel[62] = new ModelRendererTurbo(this, 156, 73, textureX, textureY); // Box 168
		bodyModel[63] = new ModelRendererTurbo(this, 164, 63, textureX, textureY); // Box 168
		bodyModel[64] = new ModelRendererTurbo(this, 61, 94, textureX, textureY); // Box 168 fueltank
		bodyModel[65] = new ModelRendererTurbo(this, 171, 63, textureX, textureY); // Box 169
		bodyModel[66] = new ModelRendererTurbo(this, 180, 63, textureX, textureY); // Box 170
		bodyModel[67] = new ModelRendererTurbo(this, 180, 55, textureX, textureY); // Box 170
		bodyModel[68] = new ModelRendererTurbo(this, 148, 41, textureX, textureY); // Box 171
		bodyModel[69] = new ModelRendererTurbo(this, 101, 63, textureX, textureY); // Box 171
		bodyModel[70] = new ModelRendererTurbo(this, 41, 97, textureX, textureY, "ditch"); // Box 171 foglight
		bodyModel[71] = new ModelRendererTurbo(this, 148, 35, textureX, textureY); // Box 172
		bodyModel[72] = new ModelRendererTurbo(this, 97, 26, textureX, textureY); // Box 172 roof rack bit
		bodyModel[73] = new ModelRendererTurbo(this, 41, 97, textureX, textureY, "ditch"); // Box 172 foglight
		bodyModel[74] = new ModelRendererTurbo(this, 97, 26, textureX, textureY); // Box 173 roof rack bit
		bodyModel[75] = new ModelRendererTurbo(this, 149, 49, textureX, textureY); // Box 173
		bodyModel[76] = new ModelRendererTurbo(this, 251, 104, textureX, textureY, "brakeLight"); // Box 173 taillight late
		bodyModel[77] = new ModelRendererTurbo(this, 97, 23, textureX, textureY); // Box 174 roof rack bit
		bodyModel[78] = new ModelRendererTurbo(this, 151, 119, textureX, textureY); // Box 174 spare tire
		bodyModel[79] = new ModelRendererTurbo(this, 251, 108, textureX, textureY, BoxName.leftTurnLight); // Box 174 turnlight L late
		bodyModel[80] = new ModelRendererTurbo(this, 97, 23, textureX, textureY); // Box 175 roof rack bit
		bodyModel[81] = new ModelRendererTurbo(this, 142, 118, textureX, textureY); // Box 175 spare tire
		bodyModel[82] = new ModelRendererTurbo(this, 251, 104, textureX, textureY, "brakeLight"); // Box 175 taillight late
		bodyModel[83] = new ModelRendererTurbo(this, 142, 123, textureX, textureY); // Box 176 spare tire
		bodyModel[84] = new ModelRendererTurbo(this, 143, 77, textureX, textureY, "brakeLight"); // Box 176 taillight center
		bodyModel[85] = new ModelRendererTurbo(this, 251, 108, textureX, textureY, BoxName.rightTurnLight); // Box 176 turnlight R late
		bodyModel[86] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 177 spare tire
		bodyModel[87] = new ModelRendererTurbo(this, 152, 24, textureX, textureY); // Box 177 aftermarket rear antenna
		bodyModel[88] = new ModelRendererTurbo(this, 126, 93, textureX, textureY); // Box 177 window panel
		bodyModel[89] = new ModelRendererTurbo(this, 200, 83, textureX, textureY); // Box 178 rear seats
		bodyModel[90] = new ModelRendererTurbo(this, 149, 24, textureX, textureY); // Box 178 aftermarket rear antenna
		bodyModel[91] = new ModelRendererTurbo(this, 107, 93, textureX, textureY); // Box 178 window panel
		bodyModel[92] = new ModelRendererTurbo(this, 31, 76, textureX, textureY); // Box 179
		bodyModel[93] = new ModelRendererTurbo(this, 12, 54, textureX, textureY); // Box 179 snorkle
		bodyModel[94] = new ModelRendererTurbo(this, 203, 76, textureX, textureY); // Box 179 rear seats
		bodyModel[95] = new ModelRendererTurbo(this, 187, 89, textureX, textureY); // Box 180
		bodyModel[96] = new ModelRendererTurbo(this, 12, 48, textureX, textureY); // Box 180 snorkle
		bodyModel[97] = new ModelRendererTurbo(this, 12, 51, textureX, textureY); // Box 181 snorkle
		bodyModel[98] = new ModelRendererTurbo(this, 204, 62, textureX, textureY); // Box 181
		bodyModel[99] = new ModelRendererTurbo(this, 122, 23, textureX, textureY); // Box 182 roof rack bit
		bodyModel[100] = new ModelRendererTurbo(this, 156, 49, textureX, textureY); // Box 182 tailgate overhang
		bodyModel[101] = new ModelRendererTurbo(this, 158, 43, textureX, textureY); // Box 183 tailgate overhang
		bodyModel[102] = new ModelRendererTurbo(this, 77, 110, textureX, textureY); // Box 183 plate
		bodyModel[103] = new ModelRendererTurbo(this, 158, 43, textureX, textureY); // Box 184 tailgate overhang
		bodyModel[104] = new ModelRendererTurbo(this, 90, 31, textureX, textureY, "ditch"); // Box 185 roof rack light
		bodyModel[105] = new ModelRendererTurbo(this, 20, 97, textureX, textureY); // Box 185 boy this geometry sure is exhausting ahahahaaa kill me
		bodyModel[106] = new ModelRendererTurbo(this, 95, 118, textureX, textureY); // Box 185 policebit
		bodyModel[107] = new ModelRendererTurbo(this, 90, 31, textureX, textureY, "ditch"); // Box 186 roof rack light
		bodyModel[108] = new ModelRendererTurbo(this, 20, 97, textureX, textureY); // Box 186 boy this geometry sure is exhausting
		bodyModel[109] = new ModelRendererTurbo(this, 90, 25, textureX, textureY, "ditch"); // Box 187 roof rack light
		bodyModel[110] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 187 diffarential
		bodyModel[111] = new ModelRendererTurbo(this, 90, 25, textureX, textureY, "ditch"); // Box 188 roof rack light
		bodyModel[112] = new ModelRendererTurbo(this, 1, 101, textureX, textureY); // Box 188 diffarential rear
		bodyModel[113] = new ModelRendererTurbo(this, 77, 115, textureX, textureY); // Box 189 plate 2
		bodyModel[114] = new ModelRendererTurbo(this, 36, 87, textureX, textureY); // Box 19
		bodyModel[115] = new ModelRendererTurbo(this, 187, 16, textureX, textureY); // Box 192 mattress
		bodyModel[116] = new ModelRendererTurbo(this, 1, 70, textureX, textureY); // Box 195 emblem
		bodyModel[117] = new ModelRendererTurbo(this, 37, 50, textureX, textureY, BoxName.leftTurnLight); // Box 201 turnlight L
		bodyModel[118] = new ModelRendererTurbo(this, 37, 50, textureX, textureY, BoxName.rightTurnLight); // Box 201 turnlight R
		bodyModel[119] = new ModelRendererTurbo(this, 86, 101, textureX, textureY); // Box 21
		bodyModel[120] = new ModelRendererTurbo(this, 87, 106, textureX, textureY); // Box 22
		bodyModel[121] = new ModelRendererTurbo(this, 189, 78, textureX, textureY); // Box 226 steeringwhool
		bodyModel[122] = new ModelRendererTurbo(this, 186, 89, textureX, textureY); // Box 227 steering wheel supporter
		bodyModel[123] = new ModelRendererTurbo(this, 127, 89, textureX, textureY); // Box 23
		bodyModel[124] = new ModelRendererTurbo(this, 1, 94, textureX, textureY); // Box 23 axle
		bodyModel[125] = new ModelRendererTurbo(this, 1, 94, textureX, textureY); // Box 23 axle rear
		bodyModel[126] = new ModelRendererTurbo(this, 191, 101, textureX, textureY); // Box 24 regulah bed
		bodyModel[127] = new ModelRendererTurbo(this, 95, 113, textureX, textureY, "ditch"); // Box 247 policebit spotlight
		bodyModel[128] = new ModelRendererTurbo(this, 121, 114, textureX, textureY); // Box 25 regulah bed
		bodyModel[129] = new ModelRendererTurbo(this, 121, 110, textureX, textureY); // Box 26 regulah bed
		bodyModel[130] = new ModelRendererTurbo(this, 180, 101, textureX, textureY); // Box 27 regulah bed
		bodyModel[131] = new ModelRendererTurbo(this, 205, 91, textureX, textureY); // Box 28 regulah bed
		bodyModel[132] = new ModelRendererTurbo(this, 94, 115, textureX, textureY); // Box 29
		bodyModel[133] = new ModelRendererTurbo(this, 205, 99, textureX, textureY); // Box 30 regulah bed
		bodyModel[134] = new ModelRendererTurbo(this, 1, 71, textureX, textureY); // Box 31
		bodyModel[135] = new ModelRendererTurbo(this, 38, 44, textureX, textureY); // Box 34
		bodyModel[136] = new ModelRendererTurbo(this, 235, 85, textureX, textureY); // Box 346 front seat
		bodyModel[137] = new ModelRendererTurbo(this, 238, 78, textureX, textureY); // Box 352 front seat
		bodyModel[138] = new ModelRendererTurbo(this, 5, 42, textureX, textureY); // Box 39
		bodyModel[139] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 41
		bodyModel[140] = new ModelRendererTurbo(this, 191, 95, textureX, textureY); // Box 43 regulah bed
		bodyModel[141] = new ModelRendererTurbo(this, 180, 95, textureX, textureY); // Box 44 regulah bed
		bodyModel[142] = new ModelRendererTurbo(this, 160, 110, textureX, textureY); // Box 45 regulah bed
		bodyModel[143] = new ModelRendererTurbo(this, 160, 114, textureX, textureY); // Box 46
		bodyModel[144] = new ModelRendererTurbo(this, 194, 68, textureX, textureY); // Box 48
		bodyModel[145] = new ModelRendererTurbo(this, 231, 68, textureX, textureY); // Box 49
		bodyModel[146] = new ModelRendererTurbo(this, 243, 63, textureX, textureY); // Box 50
		bodyModel[147] = new ModelRendererTurbo(this, 238, 78, textureX, textureY); // Box 53 front seat
		bodyModel[148] = new ModelRendererTurbo(this, 235, 85, textureX, textureY); // Box 54 front seat
		bodyModel[149] = new ModelRendererTurbo(this, 204, 62, textureX, textureY); // Box 55
		bodyModel[150] = new ModelRendererTurbo(this, 77, 55, textureX, textureY); // Box 56
		bodyModel[151] = new ModelRendererTurbo(this, 82, 55, textureX, textureY); // Box 57
		bodyModel[152] = new ModelRendererTurbo(this, 149, 81, textureX, textureY); // Box 58
		bodyModel[153] = new ModelRendererTurbo(this, 149, 71, textureX, textureY); // Box 59
		bodyModel[154] = new ModelRendererTurbo(this, 31, 51, textureX, textureY, "lamp"); // Box 59 headlight
		bodyModel[155] = new ModelRendererTurbo(this, 31, 51, textureX, textureY, "lamp"); // Box 59 headlight
		bodyModel[156] = new ModelRendererTurbo(this, 54, 28, textureX, textureY); // Box 60
		bodyModel[157] = new ModelRendererTurbo(this, 91, 38, textureX, textureY); // Box 61
		bodyModel[158] = new ModelRendererTurbo(this, 96, 55, textureX, textureY); // Box 63
		bodyModel[159] = new ModelRendererTurbo(this, 154, 81, textureX, textureY); // Box 66
		bodyModel[160] = new ModelRendererTurbo(this, 87, 81, textureX, textureY); // Box 70
		bodyModel[161] = new ModelRendererTurbo(this, 87, 71, textureX, textureY); // Box 72
		bodyModel[162] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 74
		bodyModel[163] = new ModelRendererTurbo(this, 108, 55, textureX, textureY); // Box 74
		bodyModel[164] = new ModelRendererTurbo(this, 160, 118, textureX, textureY); // Box 75 regulah bed
		bodyModel[165] = new ModelRendererTurbo(this, 160, 123, textureX, textureY); // Box 76
		bodyModel[166] = new ModelRendererTurbo(this, 20, 104, textureX, textureY); // Box 83 boy this geometry sure is exhausting
		bodyModel[167] = new ModelRendererTurbo(this, 24, 97, textureX, textureY); // Box 84 boy this geometry sure is exhausting
		bodyModel[168] = new ModelRendererTurbo(this, 20, 101, textureX, textureY); // Box 85 boy this geometry sure is exhausting
		bodyModel[169] = new ModelRendererTurbo(this, 246, 104, textureX, textureY, "brakeLight"); // Box 96 taillight early
		bodyModel[170] = new ModelRendererTurbo(this, 246, 108, textureX, textureY, "leftTurnLight"); // Box 99 turnlight L early
		bodyModel[171] = new ModelRendererTurbo(this, 187, 1, textureX, textureY); // Box 193 mattress 2
		bodyModel[172] = new ModelRendererTurbo(this, 213, 119, textureX, textureY); // Box 281 snowplow shit
		bodyModel[173] = new ModelRendererTurbo(this, 213, 124, textureX, textureY); // Box 282 snowplow shit
		bodyModel[174] = new ModelRendererTurbo(this, 213, 115, textureX, textureY); // Box 196 snowplow shit
		bodyModel[175] = new ModelRendererTurbo(this, 194, 114, textureX, textureY, "cull"); // Box 197 CULL snowplow shit
		bodyModel[176] = new ModelRendererTurbo(this, 208, 116, textureX, textureY); // Box 198 snowplow shit
		bodyModel[177] = new ModelRendererTurbo(this, 233, 112, textureX, textureY); // Box 199 snowplow shit
		bodyModel[178] = new ModelRendererTurbo(this, 191, 114, textureX, textureY, "lamp"); // Box 200 HEADLIGHT snowplow shit
		bodyModel[179] = new ModelRendererTurbo(this, 191, 114, textureX, textureY, "lamp"); // Box 201 HEADLIGHT snowplow shit
		bodyModel[180] = new ModelRendererTurbo(this, 90, 20, textureX, textureY); // Box 203 lightbar frame
		bodyModel[181] = new ModelRendererTurbo(this, 90, 20, textureX, textureY); // Box 204 lightbar frame
		bodyModel[182] = new ModelRendererTurbo(this, 90, 17, textureX, textureY, "prime1"); // Box 206 lightbar glow 1f
		bodyModel[183] = new ModelRendererTurbo(this, 119, 19, textureX, textureY); // Box 207 lightbar support
		bodyModel[184] = new ModelRendererTurbo(this, 90, 17, textureX, textureY, "prime1"); // Box 208 lightbar glow 1r
		bodyModel[185] = new ModelRendererTurbo(this, 101, 17, textureX, textureY, "prime3"); // Box 209 lightbar glow 3f
		bodyModel[186] = new ModelRendererTurbo(this, 101, 17, textureX, textureY, "prime3"); // Box 210 lightbar glow 3r
		bodyModel[187] = new ModelRendererTurbo(this, 86, 90, textureX, textureY); // Box 207 pushbar
		bodyModel[188] = new ModelRendererTurbo(this, 86, 90, textureX, textureY); // Box 208 pushbar
		bodyModel[189] = new ModelRendererTurbo(this, 92, 98, textureX, textureY); // Box 209 pushbar
		bodyModel[190] = new ModelRendererTurbo(this, 107, 89, textureX, textureY); // Box 210 pushbar
		bodyModel[191] = new ModelRendererTurbo(this, 107, 89, textureX, textureY); // Box 211 pushbar
		bodyModel[192] = new ModelRendererTurbo(this, 92, 89, textureX, textureY); // Box 216 pushbar
		bodyModel[193] = new ModelRendererTurbo(this, 93, 92, textureX, textureY); // Box 217 pushbar
		bodyModel[194] = new ModelRendererTurbo(this, 93, 95, textureX, textureY); // Box 218 pushbar
		bodyModel[195] = new ModelRendererTurbo(this, 93, 92, textureX, textureY); // Box 219 pushbar
		bodyModel[196] = new ModelRendererTurbo(this, 93, 95, textureX, textureY); // Box 220 pushbar
		bodyModel[197] = new ModelRendererTurbo(this, 1, 118, textureX, textureY, "wheel front"); // Box 12 Wheel1
		bodyModel[198] = new ModelRendererTurbo(this, 20, 118, textureX, textureY, "wheel front"); // Box 12 Wheel2
		bodyModel[199] = new ModelRendererTurbo(this, 39, 118, textureX, textureY, "wheel"); // Box 12 Wheel3
		bodyModel[200] = new ModelRendererTurbo(this, 58, 118, textureX, textureY, "wheel"); // Box 12 Wheel4
		bodyModel[201] = new ModelRendererTurbo(this, 10, 119, textureX, textureY, "wheel front"); // Box 136 Wheel1
		bodyModel[202] = new ModelRendererTurbo(this, 29, 119, textureX, textureY, "wheel front"); // Box 136 Wheel2
		bodyModel[203] = new ModelRendererTurbo(this, 48, 119, textureX, textureY, "wheel"); // Box 136 Wheel3
		bodyModel[204] = new ModelRendererTurbo(this, 67, 119, textureX, textureY, "wheel"); // Box 136 Wheel4
		bodyModel[205] = new ModelRendererTurbo(this, 1, 111, textureX, textureY, "wheel front"); // Box 17 Wheel1
		bodyModel[206] = new ModelRendererTurbo(this, 20, 111, textureX, textureY, "wheel front"); // Box 17 Wheel2
		bodyModel[207] = new ModelRendererTurbo(this, 39, 111, textureX, textureY, "wheel"); // Box 17 Wheel3
		bodyModel[208] = new ModelRendererTurbo(this, 58, 111, textureX, textureY, "wheel"); // Box 17 Wheel4
		bodyModel[209] = new ModelRendererTurbo(this, 1, 123, textureX, textureY, "wheel front"); // Box 9 Wheel1
		bodyModel[210] = new ModelRendererTurbo(this, 20, 123, textureX, textureY, "wheel front"); // Box 9 Wheel2
		bodyModel[211] = new ModelRendererTurbo(this, 39, 123, textureX, textureY, "wheel"); // Box 9 Wheel3
		bodyModel[212] = new ModelRendererTurbo(this, 58, 123, textureX, textureY, "wheel"); // Box 9 Wheel4
		bodyModel[213] = new ModelRendererTurbo(this, 27, 103, textureX, textureY); // Box 237 runningboard
		bodyModel[214] = new ModelRendererTurbo(this, 27, 103, textureX, textureY); // Box 238 runningboard
		bodyModel[215] = new ModelRendererTurbo(this, 223, 40, textureX, textureY); // Box 239 roof topper
		bodyModel[216] = new ModelRendererTurbo(this, 223, 31, textureX, textureY); // Box 240 roof topper
		bodyModel[217] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 241 roof topper
		bodyModel[218] = new ModelRendererTurbo(this, 202, 40, textureX, textureY); // Box 242 roof topper
		bodyModel[219] = new ModelRendererTurbo(this, 97, 13, textureX, textureY); // Box ski
		bodyModel[220] = new ModelRendererTurbo(this, 90, 13, textureX, textureY); // Box 245 ski
		bodyModel[221] = new ModelRendererTurbo(this, 90, 13, textureX, textureY); // Box 246 ski
		bodyModel[222] = new ModelRendererTurbo(this, 97, 13, textureX, textureY); // Box 247 ski
		bodyModel[223] = new ModelRendererTurbo(this, 134, 13, textureX, textureY); // Box 248 ski holder
		bodyModel[224] = new ModelRendererTurbo(this, 134, 13, textureX, textureY); // Box 249 ski holder

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F); // Box 100 hitch ball
		bodyModel[0].setRotationPoint(27.5F, 5.25F, -0.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 101 im gonna hitch ya!
		bodyModel[1].setRotationPoint(24.5F, 6.25F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[2].setRotationPoint(-4.5F, -3F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 103
		bodyModel[3].setRotationPoint(-4.5F, -3F, 9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 104 long stock antenna
		bodyModel[4].setRotationPoint(-9F, -10.25F, 8.5F);

		bodyModel[5].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 106 plate
		bodyModel[5].setRotationPoint(-16.26F, 7.75F, 2F);
		bodyModel[5].rotateAngleY = -3.14159265F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[6].setRotationPoint(-16F, -0.25F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 115
		bodyModel[7].setRotationPoint(-16F, -0.25F, 4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, -0.75F, 0F, 0F, -2F, 1F, 1F, 1F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 116
		bodyModel[8].setRotationPoint(-15F, -2.25F, 4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		bodyModel[9].setRotationPoint(-16F, -0.25F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 122
		bodyModel[10].setRotationPoint(-16F, -0.25F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 123
		bodyModel[11].setRotationPoint(-16F, 4.75F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[12].setRotationPoint(-16F, -0.25F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F); // Box 129
		bodyModel[13].setRotationPoint(-16F, -0.25F, 4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[14].setRotationPoint(-15.75F, 0.75F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		bodyModel[15].setRotationPoint(-15.75F, 1.75F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[16].setRotationPoint(-16F, 2.75F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 133
		bodyModel[17].setRotationPoint(-16F, 2.75F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.5F, -0.5F, 0F); // Box 134
		bodyModel[18].setRotationPoint(-16F, 2.75F, 4F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Box 135
		bodyModel[19].setRotationPoint(-15.5F, 0.2F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F); // Box 136
		bodyModel[20].setRotationPoint(-16F, 2.75F, 4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[21].setRotationPoint(-16F, 2.75F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[22].setRotationPoint(-16F, 2.75F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, -2F, 18, 1, 2, 0F,0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 1F, 0F, 0.25F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 139
		bodyModel[23].setRotationPoint(-14F, 3.75F, -9F);
		bodyModel[23].rotateAngleY = 1.57079633F;

		bodyModel[24].addShapeBox(0F, 0F, -3F, 18, 1, 3, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[24].setRotationPoint(-15F, 2.75F, -9F);
		bodyModel[24].rotateAngleY = 1.57079633F;

		bodyModel[25].addShapeBox(0F, 0F, -2F, 14, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[25].setRotationPoint(-14.75F, 2.75F, -7F);
		bodyModel[25].rotateAngleY = 1.57079633F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 142 front orangelight
		bodyModel[26].setRotationPoint(-16.01F, 3.75F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 0, 1, 4, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 143 front orangelight
		bodyModel[27].setRotationPoint(-16.01F, 3.75F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-4F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 1F, -3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[28].setRotationPoint(-6F, -7.25F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-3F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 145
		bodyModel[29].setRotationPoint(-6F, -7.25F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 146
		bodyModel[30].setRotationPoint(-15.7F, -0.25F, -0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[31].setRotationPoint(-3.5F, -8.25F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 148
		bodyModel[32].setRotationPoint(-2F, -8.25F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[33].setRotationPoint(-2F, -8.25F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, -2F, 5, 1, 2, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[34].setRotationPoint(-5F, -2.25F, -8F);
		bodyModel[34].rotateAngleY = 1.57079633F;

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[35].setRotationPoint(12F, -1.25F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, -2F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[36].setRotationPoint(-5F, -2.25F, 3F);
		bodyModel[36].rotateAngleY = 1.57079633F;

		bodyModel[37].addBox(0F, 0F, -2F, 6, 1, 2, 0F); // Box 151
		bodyModel[37].setRotationPoint(-5F, -2.25F, -3F);
		bodyModel[37].rotateAngleY = 1.57079633F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[38].setRotationPoint(-3.5F, -8.25F, 3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, -0.5F, 0F, 1F); // Box 153
		bodyModel[39].setRotationPoint(-6.5F, -7.25F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 154
		bodyModel[40].setRotationPoint(26F, 4.75F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F,-3.5F, 0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[41].setRotationPoint(-6.5F, -7.25F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[42].setRotationPoint(21F, 2.75F, -8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[43].setRotationPoint(-3.5F, -8.25F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[44].setRotationPoint(12F, -1.25F, 8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[45].setRotationPoint(-2F, -8.25F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[46].setRotationPoint(21F, 2.75F, 8.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 25, 1, 4, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[47].setRotationPoint(-2F, -8.25F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[48].setRotationPoint(-5F, -1.25F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[49].setRotationPoint(-5F, -1.25F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, 1.55F, 0F, -0.15F, -2F, 0F, 0F, -2F, 0F, 0F, 1.55F, 0F, 0F); // Box 160
		bodyModel[50].setRotationPoint(-3F, -7.25F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162 taillight early
		bodyModel[51].setRotationPoint(24.01F, -0.25F, 8.01F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163 turnlight R early
		bodyModel[52].setRotationPoint(24.01F, 1.75F, 8.01F);

		bodyModel[53].addBox(0F, 0F, 0F, 39, 1, 1, 0F); // Box 164 frame bit
		bodyModel[53].setRotationPoint(-14F, 6F, 4F);

		bodyModel[54].addShapeBox(2F, 0F, -0.5F, 24, 6, 1, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 165
		bodyModel[54].setRotationPoint(-4F, -7.25F, -8.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0.5F, 1, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[55].setRotationPoint(4F, -7.25F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 24, 2, 2, 0F,0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0.5F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 165 driveline
		bodyModel[56].setRotationPoint(-8.75F, 5.75F, -2F);

		bodyModel[57].addBox(0F, 0F, 0F, 39, 1, 1, 0F); // Box 165 frame bit
		bodyModel[57].setRotationPoint(-14F, 6F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0.5F, 2, 6, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 166
		bodyModel[58].setRotationPoint(11F, -7.25F, 7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166 boy this geometry sure is exhausting
		bodyModel[59].setRotationPoint(-6.5F, 6.75F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0.5F, 3, 6, 1, 0F,1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[60].setRotationPoint(21F, -7.25F, 7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0.5F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[61].setRotationPoint(4F, -7.25F, -9.5F);

		bodyModel[62].addShapeBox(0F, 0F, -1F, 14, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[62].setRotationPoint(25F, -7.25F, -7F);
		bodyModel[62].rotateAngleY = 1.57079633F;

		bodyModel[63].addShapeBox(0F, 0F, 0.5F, 2, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[63].setRotationPoint(11F, -7.25F, -9.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 168 fueltank
		bodyModel[64].setRotationPoint(4F, 5.75F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0.5F, 3, 6, 1, 0F,1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 169
		bodyModel[65].setRotationPoint(21F, -7.25F, -9.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0.5F, 1, 6, 1, 0F,1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 170
		bodyModel[66].setRotationPoint(24F, -7.25F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0.5F, 1, 6, 1, 0F,1F, 0F, 1F, -1F, 0F, 1F, -2F, 0F, -1F, 1F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 170
		bodyModel[67].setRotationPoint(24F, -7.25F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[68].setRotationPoint(23F, -8.25F, -3F);

		bodyModel[69].addShapeBox(0F, 0F, -0.5F, 2, 6, 1, 0F,-2F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, -2F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 171
		bodyModel[69].setRotationPoint(-4F, -7.25F, -8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 171 foglight
		bodyModel[70].setRotationPoint(-16.5F, 3F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[71].setRotationPoint(23F, -8.25F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 172 roof rack bit
		bodyModel[72].setRotationPoint(0F, -8.5F, -6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 172 foglight
		bodyModel[73].setRotationPoint(-16.5F, 3F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 173 roof rack bit
		bodyModel[74].setRotationPoint(0F, -8.5F, 5.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[75].setRotationPoint(23F, -8.25F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173 taillight late
		bodyModel[76].setRotationPoint(25.01F, -0.25F, -8.01F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 174 roof rack bit
		bodyModel[77].setRotationPoint(18F, -9.5F, -5.5F);
		bodyModel[77].rotateAngleY = 1.57079633F;

		bodyModel[78].addShapeBox(-1F, -3F, -1F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174 spare tire
		bodyModel[78].setRotationPoint(27F, 0.75F, 3F);
		bodyModel[78].rotateAngleY = -1.57079633F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174 turnlight L late
		bodyModel[79].setRotationPoint(25.01F, 1.75F, -8.01F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 175 roof rack bit
		bodyModel[80].setRotationPoint(10F, -9.5F, -5.5F);
		bodyModel[80].rotateAngleY = 1.57079633F;

		bodyModel[81].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F); // Box 175 spare tire
		bodyModel[81].setRotationPoint(27F, 0.75F, 3F);
		bodyModel[81].rotateAngleY = -1.57079633F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 175 taillight late
		bodyModel[82].setRotationPoint(25.01F, -0.25F, 7.01F);

		bodyModel[83].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 176 spare tire
		bodyModel[83].setRotationPoint(27F, 0.75F, 3F);
		bodyModel[83].rotateAngleY = -1.57079633F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 176 taillight center
		bodyModel[84].setRotationPoint(25F, -2.25F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 176 turnlight R late
		bodyModel[85].setRotationPoint(25.01F, 1.75F, 7.01F);

		bodyModel[86].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 177 spare tire
		bodyModel[86].setRotationPoint(26.5F, 0.75F, 3F);
		bodyModel[86].rotateAngleY = -1.57079633F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 177 aftermarket rear antenna
		bodyModel[87].setRotationPoint(24F, -11.25F, 9F);

		bodyModel[88].addShapeBox(0F, 0F, 0.5F, 8, 6, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 177 window panel
		bodyModel[88].setRotationPoint(13F, -7.25F, -9.5F);

		bodyModel[89].addBox(0F, 0F, -4F, 15, 1, 4, 0F); // Box 178 rear seats
		bodyModel[89].setRotationPoint(8F, 1.75F, -7.5F);
		bodyModel[89].rotateAngleY = 1.57079633F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 178 aftermarket rear antenna
		bodyModel[90].setRotationPoint(24F, -11.25F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0.5F, 8, 6, 1, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 178 window panel
		bodyModel[91].setRotationPoint(13F, -7.25F, 7.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 179
		bodyModel[92].setRotationPoint(-16F, -0.25F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179 snorkle
		bodyModel[93].setRotationPoint(-9F, -1F, 8.25F);

		bodyModel[94].addShapeBox(0F, 0F, -1F, 15, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 179 rear seats
		bodyModel[94].setRotationPoint(12F, -3.25F, -7.5F);
		bodyModel[94].rotateAngleY = 1.57079633F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[95].setRotationPoint(3F, 3.75F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -2F, 4F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F); // Box 180 snorkle
		bodyModel[96].setRotationPoint(-7F, -1F, 8.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 181 snorkle
		bodyModel[97].setRotationPoint(-5F, -6F, 8.25F);

		bodyModel[98].addBox(0F, 0F, -3F, 16, 2, 3, 0F); // Box 181
		bodyModel[98].setRotationPoint(9F, 2.75F, -8F);
		bodyModel[98].rotateAngleY = 1.57079633F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 182 roof rack bit
		bodyModel[99].setRotationPoint(1F, -9.5F, -5.5F);
		bodyModel[99].rotateAngleY = 1.57079633F;

		bodyModel[100].addShapeBox(0F, 0F, -2F, 6, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182 tailgate overhang
		bodyModel[100].setRotationPoint(23F, -8.25F, -3F);
		bodyModel[100].rotateAngleY = 1.57079633F;

		bodyModel[101].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183 tailgate overhang
		bodyModel[101].setRotationPoint(23F, -8.25F, -7F);
		bodyModel[101].rotateAngleY = 1.57079633F;

		bodyModel[102].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 183 plate
		bodyModel[102].setRotationPoint(26.01F, 3.75F, -6.5F);

		bodyModel[103].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0F, 0F, -1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184 tailgate overhang
		bodyModel[103].setRotationPoint(23F, -8.25F, 3F);
		bodyModel[103].rotateAngleY = 1.57079633F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 185 roof rack light
		bodyModel[104].setRotationPoint(0F, -10.25F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F); // Box 185 boy this geometry sure is exhausting ahahahaaa kill me
		bodyModel[105].setRotationPoint(14.5F, 6.75F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 185 policebit
		bodyModel[106].setRotationPoint(-4.75F, -5F, -9.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 roof rack light
		bodyModel[107].setRotationPoint(0F, -10.25F, 3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F); // Box 186 boy this geometry sure is exhausting
		bodyModel[108].setRotationPoint(16.5F, 6.75F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 roof rack light
		bodyModel[109].setRotationPoint(0F, -10.25F, -2.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 187 diffarential
		bodyModel[110].setRotationPoint(-11F, 5.5F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 188 roof rack light
		bodyModel[111].setRotationPoint(0F, -10.25F, 0.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 188 diffarential rear
		bodyModel[112].setRotationPoint(15F, 5.5F, -2F);

		bodyModel[113].addShapeBox(0F, -2F, 0F, 0, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, -2F, -4F); // Box 189 plate 2
		bodyModel[113].setRotationPoint(26.51F, 7.75F, 2.5F);

		bodyModel[114].addShapeBox(0F, 0F, -1F, 18, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 19
		bodyModel[114].setRotationPoint(-14F, 4.75F, -9F);
		bodyModel[114].rotateAngleY = 1.57079633F;

		bodyModel[115].addBox(0F, 0F, 0F, 22, 2, 12, 0F); // Box 192 mattress
		bodyModel[115].setRotationPoint(3F, -11F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 195 emblem
		bodyModel[116].setRotationPoint(-15.76F, 1.25F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 201 turnlight L
		bodyModel[117].setRotationPoint(-15.01F, 0.25F, -9.01F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201 turnlight R
		bodyModel[118].setRotationPoint(-15.01F, 0.25F, 8.01F);

		bodyModel[119].addShapeBox(0F, 0F, -2F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 21
		bodyModel[119].setRotationPoint(-7F, 2.75F, -9F);
		bodyModel[119].rotateAngleY = 1.57079633F;

		bodyModel[120].addShapeBox(0F, 0F, -1F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 22
		bodyModel[120].setRotationPoint(-6F, 4.75F, -9F);
		bodyModel[120].rotateAngleY = 1.57079633F;

		bodyModel[121].addShapeBox(0F, -1.75F, -3.25F, 0, 5, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 226 steeringwhool
		bodyModel[121].setRotationPoint(-2.49F, -1F, -5F);
		bodyModel[121].rotateAngleZ = 0.29670597F;

		bodyModel[122].addBox(-1F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 227 steering wheel supporter
		bodyModel[122].setRotationPoint(-2.5F, -1F, -5F);
		bodyModel[122].rotateAngleZ = 0.29670597F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 17, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		bodyModel[123].setRotationPoint(-5F, 4.75F, -9F);

		bodyModel[124].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle
		bodyModel[124].setRotationPoint(-9.5F, 7F, 0F);

		bodyModel[125].addShapeBox(-1F, -1F, -7F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23 axle rear
		bodyModel[125].setRotationPoint(16.5F, 7F, 0F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 24 regulah bed
		bodyModel[126].setRotationPoint(19F, 2.75F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 policebit spotlight
		bodyModel[127].setRotationPoint(-5.5F, -5F, -9.75F);

		bodyModel[128].addShapeBox(-18F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 25 regulah bed
		bodyModel[128].setRotationPoint(20F, 4.75F, -9F);
		bodyModel[128].rotateAngleY = -1.57079633F;

		bodyModel[129].addShapeBox(-18F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 26 regulah bed
		bodyModel[129].setRotationPoint(12F, 4.75F, -9F);
		bodyModel[129].rotateAngleY = -1.57079633F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 27 regulah bed
		bodyModel[130].setRotationPoint(12F, 2.75F, -9F);

		bodyModel[131].addShapeBox(0F, 0F, -5F, 18, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 28 regulah bed
		bodyModel[131].setRotationPoint(21F, 4.75F, -9F);
		bodyModel[131].rotateAngleY = 1.57079633F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 4, 8, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[132].setRotationPoint(-14F, 2.75F, -4F);

		bodyModel[133].addShapeBox(0F, 0F, -8F, 12, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 30 regulah bed
		bodyModel[133].setRotationPoint(12.5F, 4.75F, -6F);
		bodyModel[133].rotateAngleY = 1.57079633F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,-0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F); // Box 31
		bodyModel[134].setRotationPoint(-16.75F, 4.75F, -8F);

		bodyModel[135].addBox(0F, 0F, 0F, 10, 3, 18, 0F); // Box 34
		bodyModel[135].setRotationPoint(-15F, -0.25F, -9F);

		bodyModel[136].addBox(0F, 0F, -4F, 6, 1, 4, 0F); // Box 346 front seat
		bodyModel[136].setRotationPoint(-1F, 1.75F, -7.5F);
		bodyModel[136].rotateAngleY = 1.57079633F;

		bodyModel[137].addShapeBox(0F, 0F, -1F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 352 front seat
		bodyModel[137].setRotationPoint(3F, -3.25F, -7.5F);
		bodyModel[137].rotateAngleY = 1.57079633F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -2F, 1F, 0F, -0.75F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 1F, 1F, 0F); // Box 39
		bodyModel[138].setRotationPoint(-15F, -2.25F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 1F, 0F); // Box 41
		bodyModel[139].setRotationPoint(-15F, -2.25F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 43 regulah bed
		bodyModel[140].setRotationPoint(19F, 2.75F, 6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 44 regulah bed
		bodyModel[141].setRotationPoint(12F, 2.75F, 6F);

		bodyModel[142].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 45 regulah bed
		bodyModel[142].setRotationPoint(12F, 2.75F, -6F);

		bodyModel[143].addBox(0F, 0F, 0F, 9, 2, 1, 0F); // Box 46
		bodyModel[143].setRotationPoint(12F, 2.75F, 5F);

		bodyModel[144].addBox(0F, 0F, -2F, 16, 1, 2, 0F); // Box 48
		bodyModel[144].setRotationPoint(-5F, -1.25F, -8F);
		bodyModel[144].rotateAngleY = 1.57079633F;

		bodyModel[145].addBox(0F, 0F, 0F, 9, 4, 3, 0F); // Box 49
		bodyModel[145].setRotationPoint(-5F, 0.75F, -1.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[146].setRotationPoint(-5F, -0.25F, -1.5F);

		bodyModel[147].addShapeBox(0F, 0F, -1F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 53 front seat
		bodyModel[147].setRotationPoint(3F, -3.25F, 1.5F);
		bodyModel[147].rotateAngleY = 1.57079633F;

		bodyModel[148].addBox(0F, 0F, -4F, 6, 1, 4, 0F); // Box 54 front seat
		bodyModel[148].setRotationPoint(-1F, 1.75F, 1.5F);
		bodyModel[148].rotateAngleY = 1.57079633F;

		bodyModel[149].addBox(0F, 0F, -3F, 16, 2, 3, 0F); // Box 55
		bodyModel[149].setRotationPoint(0F, 2.75F, -8F);
		bodyModel[149].rotateAngleY = 1.57079633F;

		bodyModel[150].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 56
		bodyModel[150].setRotationPoint(-5F, -0.25F, -9F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 57
		bodyModel[151].setRotationPoint(-5F, -0.25F, 8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[152].setRotationPoint(24F, -1.25F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[153].setRotationPoint(24F, -1.25F, 8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 59 headlight
		bodyModel[154].setRotationPoint(-16F, 0.75F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 59 headlight
		bodyModel[155].setRotationPoint(-16F, 0.75F, 5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[156].setRotationPoint(-6.5F, -7.25F, -3F);

		bodyModel[157].addBox(0F, 0F, 0F, 25, 1, 6, 0F); // Box 61
		bodyModel[157].setRotationPoint(-2F, -8.25F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -1F, 0F, -1F, 1.55F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.55F, 0F, -0.15F); // Box 63
		bodyModel[158].setRotationPoint(-3F, -7.25F, 8F);

		bodyModel[159].addBox(0F, 0F, -1F, 16, 6, 1, 0F); // Box 66
		bodyModel[159].setRotationPoint(25F, -1.25F, -8F);
		bodyModel[159].rotateAngleY = 1.57079633F;

		bodyModel[160].addShapeBox(0F, 0F, -0.5F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[160].setRotationPoint(-4F, -1.25F, -8.5F);

		bodyModel[161].addShapeBox(0F, 0F, -0.5F, 16, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[161].setRotationPoint(-4F, -1.25F, 8.5F);

		bodyModel[162].addShapeBox(0F, 0F, -0.5F, 2, 6, 1, 0F,-2F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, -2F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 74
		bodyModel[162].setRotationPoint(-4F, -7.25F, 8.5F);

		bodyModel[163].addShapeBox(2F, 0F, -0.5F, 24, 6, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 74
		bodyModel[163].setRotationPoint(-4F, -7.25F, 8.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 75 regulah bed
		bodyModel[164].setRotationPoint(13F, 1.75F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 76
		bodyModel[165].setRotationPoint(13F, 1.75F, 5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 83 boy this geometry sure is exhausting
		bodyModel[166].setRotationPoint(24.5F, 6.75F, -6F);

		bodyModel[167].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 84 boy this geometry sure is exhausting
		bodyModel[167].setRotationPoint(18.5F, 6.75F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 85 boy this geometry sure is exhausting
		bodyModel[168].setRotationPoint(23.5F, 6.75F, -5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 96 taillight early
		bodyModel[169].setRotationPoint(24.01F, -0.25F, -9.01F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 99 turnlight L early
		bodyModel[170].setRotationPoint(24.01F, 1.75F, -9.01F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 22, 2, 12, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Box 193 mattress 2
		bodyModel[171].setRotationPoint(4F, -13F, -6F);

		bodyModel[172].addShapeBox(0F, 0F, -1F, 20, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 281 snowplow shit
		bodyModel[172].setRotationPoint(-20F, 4F, -10F);
		bodyModel[172].rotateAngleY = 1.57079633F;

		bodyModel[173].addShapeBox(0F, 0F, -1F, 20, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 282 snowplow shit
		bodyModel[173].setRotationPoint(-21F, 7F, -10F);
		bodyModel[173].rotateAngleY = 1.57079633F;

		bodyModel[174].addShapeBox(0F, 0F, -1F, 20, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, -1F); // Box 196 snowplow shit
		bodyModel[174].setRotationPoint(-21F, 2F, -10F);
		bodyModel[174].rotateAngleY = 1.57079633F;

		bodyModel[175].addBox(0F, 0F, 0F, 3, 7, 6, 0F); // Box 197 CULL snowplow shit
		bodyModel[175].setRotationPoint(-18F, 0F, -3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 198 snowplow shit
		bodyModel[176].setRotationPoint(-19F, 5F, -3F);

		bodyModel[177].addShapeBox(0F, 0F, -1F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199 snowplow shit
		bodyModel[177].setRotationPoint(-18F, -1F, -5F);
		bodyModel[177].rotateAngleY = 1.57079633F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 200 HEADLIGHT snowplow shit
		bodyModel[178].setRotationPoint(-18F, -2.5F, -5F);

		bodyModel[179].addShapeBox(0F, -2.5F, -3.5F, 1, 2, 3, 0F,0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 201 HEADLIGHT snowplow shit
		bodyModel[179].setRotationPoint(-18F, -2.5F, 2F);
		bodyModel[179].rotateAngleX = -3.14159265F;

		bodyModel[180].addShapeBox(0F, 0F, -1F, 13, 1, 1, 0F,0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203 lightbar frame
		bodyModel[180].setRotationPoint(2.5F, -9.5F, -6.5F);
		bodyModel[180].rotateAngleY = 1.57079633F;

		bodyModel[181].addShapeBox(0F, 0F, -1F, 13, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 204 lightbar frame
		bodyModel[181].setRotationPoint(3.5F, -9.5F, -6.5F);
		bodyModel[181].rotateAngleY = 1.57079633F;

		bodyModel[182].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 206 lightbar glow 1f
		bodyModel[182].setRotationPoint(2.5F, -10F, -6F);
		bodyModel[182].rotateAngleY = 1.57079633F;

		bodyModel[183].addShapeBox(0F, 0F, -2F, 4, 1, 2, 0F,0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 207 lightbar support
		bodyModel[183].setRotationPoint(2.5F, -10F, -2F);
		bodyModel[183].rotateAngleY = 1.57079633F;

		bodyModel[184].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 208 lightbar glow 1r
		bodyModel[184].setRotationPoint(3.5F, -10F, -6F);
		bodyModel[184].rotateAngleY = 1.57079633F;

		bodyModel[185].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 209 lightbar glow 3f
		bodyModel[185].setRotationPoint(2.5F, -10F, 2F);
		bodyModel[185].rotateAngleY = 1.57079633F;

		bodyModel[186].addShapeBox(0F, 0F, -1F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 210 lightbar glow 3r
		bodyModel[186].setRotationPoint(3.5F, -10F, 2F);
		bodyModel[186].rotateAngleY = 1.57079633F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 207 pushbar
		bodyModel[187].setRotationPoint(-17.5F, 0F, -4F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 208 pushbar
		bodyModel[188].setRotationPoint(-17.5F, 0F, 3F);

		bodyModel[189].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 209 pushbar
		bodyModel[189].setRotationPoint(-17.5F, 4F, -3F);
		bodyModel[189].rotateAngleY = 1.57079633F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 210 pushbar
		bodyModel[190].setRotationPoint(-16.5F, 6F, -4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F); // Box 211 pushbar
		bodyModel[191].setRotationPoint(-16.5F, 6F, 3F);

		bodyModel[192].addShapeBox(0F, 0F, -1F, 6, 1, 1, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 216 pushbar
		bodyModel[192].setRotationPoint(-17.5F, 0F, -3F);
		bodyModel[192].rotateAngleY = 1.57079633F;

		bodyModel[193].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, 0.9F, 0F, -0.5F, -1.1F, 0F, -0.5F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.9F, 0F, 0F, -1.1F, 0F, 0F, -0.1F); // Box 217 pushbar
		bodyModel[193].setRotationPoint(-17.5F, 0F, 4F);
		bodyModel[193].rotateAngleY = 1.57079633F;

		bodyModel[194].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, 0.9F, 0F, 0F, -1.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0.9F, 0F, -0.5F, -1.1F, 0F, -0.5F, -0.1F); // Box 218 pushbar
		bodyModel[194].setRotationPoint(-17.5F, 4F, 4F);
		bodyModel[194].rotateAngleY = 1.57079633F;

		bodyModel[195].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -1.1F, 0F, 0F, 0.9F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.1F); // Box 219 pushbar
		bodyModel[195].setRotationPoint(-17.5F, 0F, -9F);
		bodyModel[195].rotateAngleY = 1.57079633F;

		bodyModel[196].addShapeBox(0F, 0F, -1F, 5, 1, 1, 0F,0F, 0F, 0.9F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.1F, 0F, -0.5F, 0.9F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -1.1F); // Box 220 pushbar
		bodyModel[196].setRotationPoint(-17.5F, 4F, -9F);
		bodyModel[196].rotateAngleY = 1.57079633F;

		bodyModel[197].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel1
		bodyModel[197].setRotationPoint(-9.5F, 7F, -8F);

		bodyModel[198].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel2
		bodyModel[198].setRotationPoint(-9.5F, 7F, 8F);

		bodyModel[199].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel3
		bodyModel[199].setRotationPoint(16.5F, 7F, -8F);

		bodyModel[200].addShapeBox(1F, -1F, -1F, 2, 2, 2, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 12 Wheel4
		bodyModel[200].setRotationPoint(16.5F, 7F, 8F);

		bodyModel[201].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel1
		bodyModel[201].setRotationPoint(-9.5F, 7F, -8F);

		bodyModel[202].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel2
		bodyModel[202].setRotationPoint(-9.5F, 7F, 8F);

		bodyModel[203].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel3
		bodyModel[203].setRotationPoint(16.5F, 7F, -8F);

		bodyModel[204].addBox(-1F, -3F, -1F, 2, 6, 2, 0F); // Box 136 Wheel4
		bodyModel[204].setRotationPoint(16.5F, 7F, 8F);

		bodyModel[205].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel1
		bodyModel[205].setRotationPoint(-9.5F, 7F, -8F);

		bodyModel[206].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel2
		bodyModel[206].setRotationPoint(-9.5F, 7F, 8F);

		bodyModel[207].addBox(-3F, -3F, -1.01F, 6, 6, 0, 0F); // Box 17 Wheel3
		bodyModel[207].setRotationPoint(16.5F, 7F, -8F);

		bodyModel[208].addBox(-3F, -3F, 1.01F, 6, 6, 0, 0F); // Box 17 Wheel4
		bodyModel[208].setRotationPoint(16.5F, 7F, 8F);

		bodyModel[209].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel1
		bodyModel[209].setRotationPoint(-9.5F, 7F, -8F);

		bodyModel[210].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel2
		bodyModel[210].setRotationPoint(-9.5F, 7F, 8F);

		bodyModel[211].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel3
		bodyModel[211].setRotationPoint(16.5F, 7F, -8F);

		bodyModel[212].addShapeBox(-3F, -1F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 9 Wheel4
		bodyModel[212].setRotationPoint(16.5F, 7F, 8F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 237 runningboard
		bodyModel[213].setRotationPoint(-5F, 6.75F, -9.4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 238 runningboard
		bodyModel[214].setRotationPoint(-5F, 6.75F, 8.4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,-0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 239 roof topper
		bodyModel[215].setRotationPoint(9F, -11F, -3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 10, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 240 roof topper
		bodyModel[216].setRotationPoint(9.5F, -12.5F, -3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 241 roof topper
		bodyModel[217].setRotationPoint(5.5F, -12.5F, -3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, -1.5F, -0.5F); // Box 242 roof topper
		bodyModel[218].setRotationPoint(5.5F, -10.5F, -3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box ski
		bodyModel[219].setRotationPoint(6F, -10F, 3.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F); // Box 245 ski
		bodyModel[220].setRotationPoint(5F, -10F, 3.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.5F); // Box 246 ski
		bodyModel[221].setRotationPoint(5F, -10.7F, 3.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 247 ski
		bodyModel[222].setRotationPoint(6F, -10.7F, 3.5F);

		bodyModel[223].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 248 ski holder
		bodyModel[223].setRotationPoint(9F, -11F, 3.5F);
		bodyModel[223].rotateAngleY = 1.57079633F;

		bodyModel[224].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 249 ski holder
		bodyModel[224].setRotationPoint(17F, -11F, 3.5F);
		bodyModel[224].rotateAngleY = 1.57079633F;
	}
}