package me.skylertyler.skylerpgm.module.builder;


import org.w3c.dom.Document;

import me.skylertyler.skylerpgm.module.Module;

public abstract class Builder{
	
	public abstract Module parse(Document doc);
}
