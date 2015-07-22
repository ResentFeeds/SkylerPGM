package me.skylertyler.skylerpgm.module;

import com.google.common.base.Preconditions;

public class ModuleAbout {

	private Class<? extends Module> module;
	private ModuleInfo info;

	public ModuleAbout(Class<? extends Module> module){
		Preconditions.checkArgument(module.isAnnotationPresent(ModuleInfo.class), "there is no @ModuleInfo annotation present");
		this.info = module.getAnnotation(ModuleInfo.class);
		this.setModule(module);
		
	}
	

	/** setters and getters */
	
	
	public ModuleInfo getInfo(){
		return this.info;
	}
	

	public Class<? extends Module> getModule() {
		return module;
	}

	public void setModule(Class<? extends Module> module) {
		this.module = module;
	}
	
	
}
