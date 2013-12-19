package com.exo.lib.helper

import java.io.InputStream
import java.util.HashMap
import java.util.Map
import java.util.Properties
import java.io.InputStreamReader
import com.exo.lib.EXOSessionData

object LocalizationHelper{
  private val LANG_DIR: String = "/assets/exo/lang/";
  private val LANG_MAP: Map[String, Properties] = new HashMap[String, Properties];
  
  this.loadLanguage("en_US");
  
  private def loadLanguage(lang: String){
    val stream: InputStream = getClass().getResourceAsStream(this.LANG_DIR + lang + ".properties");
    val reader: InputStreamReader = new InputStreamReader(stream);
    
    Console.println("Loading Language: " + lang + " (" + this.LANG_DIR + lang + ".properties)");
    
    try{
      if(stream == null || reader == null){
        throw new NullPointerException("Stream is null, couldn't find resource: " + this.LANG_DIR + lang + ".properties");
      }
      
      val props: Properties = new Properties();
      props.load(reader);
      this.LANG_MAP.put(lang, props);
    } catch{
      case e: Exception=>{
        e.printStackTrace(System.err);
      }
    } finally{
      stream.close();
      reader.close();
    }
  }
  
  def translate(tag: String): String={
    return LocalizationHelper.translate(tag, EXOSessionData.CURRENT_LANG);
  }
  
  def translate(tag: String, lang: String): String={
    if(this.LANG_MAP.containsKey(lang)){
      Console.println("Translating: " + tag + "=>" + this.LANG_MAP.get(lang).getProperty(tag) + " (" + lang + ")");
      return this.LANG_MAP.get(lang).getProperty(tag);
    } else{
      Console.println("Couldn't Translate: " + tag + " (" + lang + ")");
      return tag;
    }
  }
}