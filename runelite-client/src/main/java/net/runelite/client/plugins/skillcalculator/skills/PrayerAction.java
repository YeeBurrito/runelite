/*
 * Copyright (c) 2021, Jordan Atwood <nightfirecat@protonmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.skillcalculator.skills;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.ItemID;

@AllArgsConstructor
@Getter
public enum PrayerAction implements ItemSkillAction
{
	ENSOULED_GOBLIN_HEAD(ItemID.ENSOULED_GOBLIN_HEAD, 1, 130, true),
	ENSOULED_MONKEY_HEAD(ItemID.ENSOULED_MONKEY_HEAD, 1, 182, true),
	ENSOULED_IMP_HEAD(ItemID.ENSOULED_IMP_HEAD, 1, 286, true),
	ENSOULED_MINOTAUR_HEAD(ItemID.ENSOULED_MINOTAUR_HEAD, 1, 364, true),
	ENSOULED_SCORPION_HEAD(ItemID.ENSOULED_SCORPION_HEAD, 1, 454, true),
	ENSOULED_BEAR_HEAD(ItemID.ENSOULED_BEAR_HEAD, 1, 480, true),
	ENSOULED_UNICORN_HEAD(ItemID.ENSOULED_UNICORN_HEAD, 1, 494, true),
	ENSOULED_DOG_HEAD(ItemID.ENSOULED_DOG_HEAD, 1, 520, true),
	ENSOULED_CHAOS_DRUID_HEAD(ItemID.ENSOULED_CHAOS_DRUID_HEAD, 1, 584, true),
	ENSOULED_GIANT_HEAD(ItemID.ENSOULED_GIANT_HEAD, 1, 650, true),
	ENSOULED_OGRE_HEAD(ItemID.ENSOULED_OGRE_HEAD, 1, 716, true),
	ENSOULED_ELF_HEAD(ItemID.ENSOULED_ELF_HEAD, 1, 754, true),
	ENSOULED_TROLL_HEAD(ItemID.ENSOULED_TROLL_HEAD, 1, 780, true),
	ENSOULED_HORROR_HEAD(ItemID.ENSOULED_HORROR_HEAD, 1, 832, true),
	ENSOULED_KALPHITE_HEAD(ItemID.ENSOULED_KALPHITE_HEAD, 1, 884, true),
	ENSOULED_DAGANNOTH_HEAD(ItemID.ENSOULED_DAGANNOTH_HEAD, 1, 936, true),
	ENSOULED_BLOODVELD_HEAD(ItemID.ENSOULED_BLOODVELD_HEAD, 1, 1040, true),
	ENSOULED_TZHAAR_HEAD(ItemID.ENSOULED_TZHAAR_HEAD, 1, 1104, true),
	ENSOULED_DEMON_HEAD(ItemID.ENSOULED_DEMON_HEAD, 1, 1170, true),
	ENSOULED_HELLHOUND_HEAD(ItemID.ENSOULED_HELLHOUND_HEAD, 1, 1200, true),
	ENSOULED_AVIANSIE_HEAD(ItemID.ENSOULED_AVIANSIE_HEAD, 1, 1234, true),
	ENSOULED_ABYSSAL_HEAD(ItemID.ENSOULED_ABYSSAL_HEAD, 1, 1300, true),
	ENSOULED_DRAGON_HEAD(ItemID.ENSOULED_DRAGON_HEAD, 1, 1560, true),
	FIENDISH_ASHES(ItemID.FIENDISH_ASHES, 1, 10, true),
	VILE_ASHES(ItemID.VILE_ASHES, 1, 25, true),
	MALICIOUS_ASHES(ItemID.MALICIOUS_ASHES, 1, 65, true),
	ABYSSAL_ASHES(ItemID.ABYSSAL_ASHES, 1, 85, true),
	INFERNAL_ASHES(ItemID.INFERNAL_ASHES, 1, 110, true),
	BONES(ItemID.BONES, 1, 4.5f, false),
	WOLF_BONES(ItemID.WOLF_BONES, 1, 4.5f, false),
	LOAR_REMAINS(ItemID.LOAR_REMAINS, 1, 33, false),
	BURNT_BONES(ItemID.BURNT_BONES, 1, 4.5f, false),
	MONKEY_BONES(ItemID.MONKEY_BONES, 1, 5, false),
	BAT_BONES(ItemID.BAT_BONES, 1, 5.3f, false),
	JOGRE_BONES(ItemID.JOGRE_BONES, 1, 15, false),
	BIG_BONES(ItemID.BIG_BONES, 1, 15, false),
	ZOGRE_BONES(ItemID.ZOGRE_BONES, 1, 22.5f, false),
	SHAIKAHAN_BONES(ItemID.SHAIKAHAN_BONES, 1, 25, false),
	BABYDRAGON_BONES(ItemID.BABYDRAGON_BONES, 1, 30, false),
	PHRIN_REMAINS(ItemID.PHRIN_REMAINS, 1, 46.5f, false),
	WYRM_BONES(ItemID.WYRM_BONES, 1, 50, false),
	RIYL_REMAINS(ItemID.RIYL_REMAINS, 1, 59.5f, false),
	WYVERN_BONES(ItemID.WYVERN_BONES, 1, 72, false),
	DRAGON_BONES(ItemID.DRAGON_BONES, 1, 72, false),
	DRAKE_BONES(ItemID.DRAKE_BONES, 1, 80, false),
	ASYN_REMAINS(ItemID.ASYN_REMAINS, 1, 82.5f, false),
	FAYRG_BONES(ItemID.FAYRG_BONES, 1, 84, false),
	FIYR_REMAINS(ItemID.FIYR_REMAINS, 1, 84, false),
	LAVA_DRAGON_BONES(ItemID.LAVA_DRAGON_BONES, 1, 85, false),
	RAURG_BONES(ItemID.RAURG_BONES, 1, 96, false),
	HYDRA_BONES(ItemID.HYDRA_BONES, 1, 110, false),
	DAGANNOTH_BONES(ItemID.DAGANNOTH_BONES, 1, 125, false),
	OURG_BONES(ItemID.OURG_BONES, 1, 140, false),
	URIUM_REMAINS(ItemID.URIUM_REMAINS, 1, 120, false),
	GUPPY(ItemID.GUPPY, 1, 4, false),
	CAVEFISH(ItemID.CAVEFISH, 1, 7, false),
	TETRA(ItemID.TETRA, 1, 10, false),
	CATFISH(ItemID.CATFISH, 1, 16, false),
	SUPERIOR_DRAGON_BONES(ItemID.SUPERIOR_DRAGON_BONES, 70, 150, false),
	;

	private final int itemId;
	private final int level;
	private final float xp;
	private final boolean ignoreBonus;
}
