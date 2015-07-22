package me.skylertyler.skylerpgm.map;

import java.io.File;

public class Map {

	public final File source;

	public Map(File source){
		this.source = source;
	}
	
	public File getSource(){
		return this.source;
	}
}
