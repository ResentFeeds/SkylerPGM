package me.skylertyler.skylerpgm.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {

	public static Logger logger = Logger.getLogger("minecraft");

	public static void log(Level level, String msg) {
		logger.log(level, msg);
	}

	public static void severe(String msg) {
		log(Level.SEVERE, msg);
	}

	public static void warning(String msg) {
		log(Level.WARNING, msg);
	}

	public static void info(String msg) {
		log(Level.INFO, msg);
	}
}
