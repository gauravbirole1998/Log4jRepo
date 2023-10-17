package com.springlog4jpro.springbootlog4jproject1;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootlog4jproject1Application {

	// create logger object
	public static Logger logger = Logger.getLogger(Springbootlog4jproject1Application.class);

	public static void main(String[] args) {
		//
		//		// Basic configuration
		//
				// Initialize the logging for log 4j
				PropertyConfigurator.configure(System.getProperty("user.dir") + File.separator + "\\src\\main\\resources\\log4j.properties");
		//		
				logger.trace("This is the trace msg"); // trace level
				logger.debug("This is the debug msg"); // debug level
				logger.info("This is the info msg"); // info level
				logger.warn("This is the warn msg"); // warn level
				logger.error("This is the error msg"); // error level
				logger.fatal("This is the fatal msg"); // fatal error
		
				SpringApplication.run(Springbootlog4jproject1Application.class, args);
		//	}

	}
}
