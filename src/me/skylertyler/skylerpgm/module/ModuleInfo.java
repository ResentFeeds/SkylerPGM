package me.skylertyler.skylerpgm.module;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import me.skylertyler.skylerpgm.module.builder.Builder;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleInfo {

	String name();
	
	String desc();
	
	Class<? extends Module>[] required() default {};
	
	Class<? extends Builder> builder();
	
	
	boolean listener() default true;
	
}
