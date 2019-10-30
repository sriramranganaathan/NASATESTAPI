package proxyConfiguration;

import java.io.IOException;

import properties.PropertiesFile;

public class Proxy {
	public static void setProxy() throws IOException{
		
		System.setProperty("https.proxyHost", PropertiesFile.getProperty("host"));
		System.setProperty("https.proxyPort", PropertiesFile.getProperty("port"));
	}

}
