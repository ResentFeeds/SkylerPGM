package me.skylertyler.skylerpgm;

import me.skylertyler.skylerpgm.module.modules.InfoModule;

import org.bukkit.plugin.java.JavaPlugin;

public class SkylerPGM extends JavaPlugin {

	public static SkylerPGM instance;
	
	public void onEnable(){
		instance = this;
		new InfoModule("name", null, null, null, null);
	}
	
	public void onDisable(){
		instance = null;
	}
}
