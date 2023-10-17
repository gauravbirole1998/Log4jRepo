package com.Utility;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Utility {

	private static final Logger logger = Logger.getLogger(Utility.class);


	public void log() {

		//  String logMessage = String.format("[%s] [%s] [%s]", className, methodName, status);
		logger.log(Level.INFO, "My Log Message");

	}

}
