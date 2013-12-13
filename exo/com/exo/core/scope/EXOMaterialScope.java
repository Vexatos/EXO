package com.exo.core.scope;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

public interface EXOMaterialScope{
	public static final EnumArmorMaterial EXO_SUIT_MATERIAL = EnumHelper.addArmorMaterial("exoSuit", 10, new int[]{0, 0, 0, 0}, 0);
}