package com.exo.core;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Properties;

import com.exo.Exoskeleton;

import cpw.mods.fml.common.Mod;

public enum EXOLocalizationHelper{
	INSTANCE;
	
	private final HashMap<String, Properties> LANGUAGE_MAP = new HashMap<String, Properties>();
	private final String LANG_DIR = "/assets/" + Exoskeleton.class.getAnnotation(Mod.class).modid().toLowerCase() + "/lang";
	
	private EXOLocalizationHelper(){
		this.loadLanguage("en_US");
	}
	
	private void loadLanguage(String lang){
		try{
			InputStream asset = getClass().getResourceAsStream(String.format("%s/%s.properties", this.LANG_DIR, lang));
			
			if(asset == null){
				throw new NullPointerException("Cannot load language: " + String.format("%s/%s.properties", this.LANG_DIR, lang));
			}
			
			InputStreamReader reader = new InputStreamReader(asset);
			Exoskeleton.LOGGER.info("Loading Language: " + String.format("%s/%s.properties", this.LANG_DIR, lang));
			Properties props = new Properties();
			props.load(reader);
			this.LANGUAGE_MAP.put(lang, props);
			reader.close();
		} catch(Exception ex){
			ex.printStackTrace(System.err);
		}
	}
	
	public static String translate(String tag){
		return EXOLocalizationHelper.INSTANCE.translate(tag, EXOSessionData.CURRENT_LANGUAGE);
	}
	
	public String translate(String tag, String lang){
		if(this.LANGUAGE_MAP.containsKey(lang)){
			return this.LANGUAGE_MAP.get(lang).getProperty(tag);
		} else{
			return tag;
		}
	}
}