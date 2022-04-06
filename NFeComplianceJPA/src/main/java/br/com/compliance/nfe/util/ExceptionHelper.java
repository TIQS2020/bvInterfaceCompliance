package br.com.compliance.nfe.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionHelper {
	private static Logger log = null;

	public static void error(Exception e) {
		StackTraceElement elem = e.getStackTrace()[0];
		log = LogManager.getLogger(elem.getClassName());

		for (StackTraceElement s : e.getStackTrace())
			log.error("FILE: " + s.getFileName() + " - METODO: " + s.getMethodName() + " - LINHA: " + s.getLineNumber());
	}
}
