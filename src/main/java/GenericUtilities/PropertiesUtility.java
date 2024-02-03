package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	private Properties property;
	/**
	 * This method is used to initialize 
	 * @param filePath
	 */
	public void propertiesInit(String filePath) {
		FileInputStream fis= null;
		try {
			fis = new FileInputStream(filePath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		 property = new Properties();
		try {
			property.load(fis);
		} catch(IOException e) {
			e.printStackTrace();
		}	
	}
	/**
	 * This method fetches data from properties file based on the key press
	 * as an argument
	 * @param Key
	 * @return
	 */
	public String readFromProperties(String Key) {
		return property.getProperty(Key);
		
	}
}
}
