package nasaAPITest;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import properties.PropertiesFile;
import proxyConfiguration.Proxy;

public class APODFunc {
	
	//RestAssured.baseURI = "https://api.nasa.gov";
	
	
	@Test
	public void getAPOD() throws IOException{
		Proxy.setProxy();
		Response response = given().
		queryParam("api_key",PropertiesFile.getProperty("APIKey")).
		
		when().
		get("https://api.nasa.gov/planetary/apod");
		
		//String body = response.getBody().toString();
		System.out.println(response.asString());
	}

}
