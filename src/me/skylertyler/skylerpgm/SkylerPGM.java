package me.skylertyler.skylerpgm;

import org.bukkit.plugin.java.JavaPlugin;

public class SkylerPGM extends JavaPlugin {

	public static SkylerPGM instance;
	
	public void onEnable(){
		instance = this;
	}
	
	public void onDisable(){
		instance = null;
	}
}
