package selenidelog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	private static final Logger Log = LogManager.getLogger(Runner.class.getName());
	
	public static void main(String[] args) {
		Log.info("тестовый лог");

	}

}
