package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public static String getProperty(String key) throws IOException{
		FileReader reader = new FileReader(".//src//main//resources//NASATestAPIProperties.properties");
		Properties prop = new Properties();
		prop.load(reader);
		return prop.getProperty(key);
	}

}
