package maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JExample {
private static Logger log = LogManager.getLogger(Log4JExample.class.getName());
	public static void main(String[] args) {
	log.info("This is info logger");
	log.debug("Trying for debug");
    log.error("Error is there in log");
    log.fatal("Fatal error in log");
}
}
