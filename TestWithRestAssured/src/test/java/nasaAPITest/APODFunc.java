package nasaAPITest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import properties.PropertiesFile;
import proxyConfiguration.Proxy;

public class APODFunc {
	
	
	@Test
	public void getAPOD() throws IOException{
		Proxy.setProxy();
		RestAssured.baseURI = PropertiesFile.getProperty("baseuri");
		Response response = given().
		queryParam("api_key",PropertiesFile.getProperty("APIKey")).
		
		when().
		get("/planetary/apod");
		
		//String body = response.getBody().toString();
		System.out.println(response.asString());
	}

}
