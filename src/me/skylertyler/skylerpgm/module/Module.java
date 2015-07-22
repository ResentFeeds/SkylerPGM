package me.skylertyler.skylerpgm.module;

public abstract class Module {

	public abstract void unload();

	public abstract void load();

	public static ModuleAbout getInfo(Class<? extends Module> clazz) {
		return new ModuleAbout(clazz);
	}
}
