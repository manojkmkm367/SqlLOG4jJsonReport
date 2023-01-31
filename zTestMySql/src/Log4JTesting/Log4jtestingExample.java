package Log4JTesting;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
public class Log4jtestingExample {	
	
	static Logger logger = 
			Logger.getLogger((Log4jtestingExample.class));	

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		//	DOMConfigurator.configure("log4j.xml");
		logger.debug("Debug messege");
		logger.info("Info Message");
		logger.warn("Warm Messege");
		logger.error("Error Message");
		logger.fatal("Fatal Message");
			}    }
