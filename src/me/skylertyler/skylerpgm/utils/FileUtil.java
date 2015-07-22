package me.skylertyler.skylerpgm.utils;

import java.io.File;

public class FileUtil {

	/** delete all the children files that contains the same sequence
	 * 
	 * @param dir the directory 
	 * @param sequence the sequence (used for match file names)
	 */
	
	public static void clean(File dir, String sequence) {
		File[] all = dir.listFiles();
		for (File childs : all) {
			if (childs.exists() && childs.isDirectory()) {
				if (childs.getName().contains(sequence)) {
					childs.delete();
				}  
			}
		}
	}
}
