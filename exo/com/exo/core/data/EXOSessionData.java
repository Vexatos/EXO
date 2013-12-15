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