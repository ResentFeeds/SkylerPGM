package me.skylertyler.skylerpgm.module.builders;


import org.w3c.dom.Document;
import org.w3c.dom.Element;

import me.skylertyler.skylerpgm.module.Module;
import me.skylertyler.skylerpgm.module.builder.Builder;
import me.skylertyler.skylerpgm.module.modules.InfoModule;


public class InfoModuleBuilder extends Builder{

     public Module parse(Document doc){
		Element root = doc.getDocumentElement();
		String name = root.getElementsByTagName("name").item(0).getTextContent();
	    String desc = root.getElementsByTagName("description").item(0).getTextContent();
	    return new InfoModule(name, desc, null , null , null);
	}

}
