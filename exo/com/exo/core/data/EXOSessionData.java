package com.exo.core.data;

import net.minecraft.entity.player.EntityPlayer;

public final class EXOSessionData{
	private EXOSessionData(){}
	
	/*
	 * General Settings
	 */
	public static String CURRENT_LANGUAGE = "en_US";
	public static boolean RENDER_OVERLAY = true;
	public static boolean BACKTRACK_CACHE = true;
	
	/*
	 * Item IDs
	 */
	public static int BLOCK_ASSEMBLER_ID = 3000;
	public static int BLOCK_CONSTRUCTOR_ID = 3001;
	
	public static int ITEM_CORE_ID = 5000;
	public static int ITEM_SUIT_UNCHARGED_HELM_ID = 5001;
	public static int ITEM_SUIT_UNCHARGED_CHEST_ID = 5002;
	public static int ITEM_SUIT_UNCHARGED_LEGS_ID = 5003;
	public static int ITEM_SUIT_UNCHARGED_BOOTS_ID = 5004;
	public static int ITEM_UPGRADELINK_ID = 5005;
	public static int ITEM_CRAFTING_ID = 5006;
	public static int ITEM_COMPONENT_ID = 5007;
	public static int ITEM_TOOLBOX_ID = 5008;
	public static int ITEM_SUIT_REFLEX_HELM_ID = 5009;
	public static int ITEM_SUIT_REFLEX_CHEST_ID = 5010;
	public static int ITEM_SUIT_REFLEX_LEGS_ID = 5011;
	public static int ITEM_SUIT_REFLEX_BOOTS_ID = 5012;
	public static int ITEM_SUIT_RECON_HELM_ID = 5013;
	public static int ITEM_SUIT_RECON_CHEST_ID = 5014;
	public static int ITEM_SUIT_RECON_LEGS_ID = 5015;
	public static int ITEM_SUIT_RECON_BOOTS_ID = 5016;
	public static int ITEM_SUIT_BERZERK_HELM_ID = 5017;
	public static int ITEM_SUIT_BERZERK_CHEST_ID = 5018;
	public static int ITEM_SUIT_BERZERK_LEGS_ID = 5019;
	public static int ITEM_SUIT_BERZERK_BOOTS_ID = 5020;
	public static int ITEM_SUIT_INFERNO_HELM_ID = 5021;
	public static int ITEM_SUIT_INFERNO_CHEST_ID = 5022;
	public static int ITEM_SUIT_INFERNO_LEGS_ID = 5023;
	public static int ITEM_SUIT_INFERNO_BOOTS_ID = 5024;
	public static int ITEM_SUIT_FRAME_HELM_ID = 5025;
	public static int ITEM_SUIT_FRAME_CHEST_ID = 5026;
	public static int ITEM_SUIT_FRAME_LEGS_ID = 5027;
	public static int ITEM_SUIT_FRAME_BOOTS_ID = 5028;
	
	/*
	 * Backtrack
	 */
	public static BacktrackData BACKTRACK_DATA;
	
	public static final class BacktrackData{
		private final EntityPlayer player;
		
		public BacktrackData(EntityPlayer player){
			this.player = player;
		}
		
		public EntityPlayer getPlayer(){
			return this.player;
		}
	}
}