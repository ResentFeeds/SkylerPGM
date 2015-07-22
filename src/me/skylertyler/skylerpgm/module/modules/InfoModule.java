package me.skylertyler.skylerpgm.module.modules;

import java.util.List;

import me.skylertyler.skylerpgm.log.Log;
import me.skylertyler.skylerpgm.map.MapAuthor;
import me.skylertyler.skylerpgm.map.MapContributor;
import me.skylertyler.skylerpgm.map.MapRule;
import me.skylertyler.skylerpgm.module.Module;
import me.skylertyler.skylerpgm.module.ModuleInfo;
import me.skylertyler.skylerpgm.module.builders.InfoModuleBuilder;

@ModuleInfo(name = "info", desc = "description for the map", listener = true,  builder = InfoModuleBuilder.class)
public class InfoModule extends Module{

	
	private String name;
	private String description;
	private List<MapAuthor> authors;
	private List<MapContributor> contributors;
	private List<MapRule> rules;
	

	public InfoModule(String name, String description, List<MapAuthor> authors, List<MapContributor> contributors, List<MapRule> rules) {
		 this.name = name;
		 this.description = description;
		 this.authors = authors;
		 this.contributors = contributors;
		 this.rules = rules;
		 
		 //TESTING here IGNORE 
		 Log.info("name = " + Module.getInfo(InfoModule.class).getInfo().name()); 
		 Log.info("description = " + Module.getInfo(InfoModule.class).getInfo().desc());
	}
	
	public List<MapRule> getRules(){
		return this.rules;
	}
	
	
	public boolean hasRules(){
		return getRules().size() > 0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	
	public List<MapAuthor> getAuthors(){
		return this.authors;
	}
	
	
	public boolean hasContributors(){
		return getContributors().size() > 0;
	}
	
	
	public List<MapContributor> getContributors(){
		return this.contributors;
	}
	
	
	
	public void unload() {
		//todo 
	}

	public void load() {
		// TODO Auto-generated method stub
		
	}
	

}
