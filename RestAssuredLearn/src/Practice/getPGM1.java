package Practice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import Utilities.GenericMethods;
import Utilities.constants;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getPGM1 
{
	@Test
	public void main() throws IOException 
	{
		GenericMethods GM = new GenericMethods();
		RestAssured.baseURI = GM.getProperties("config.properties","baseURI");
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type","application/json");
		
		//to get Total pages from Response
		
		Response response = httpRequest.request(constants.httpMethods[0],"");
		
		JsonPath jp = response.jsonPath();
		
		String total_pages = jp.get("total_pages").toString();
		
		Assert.assertEquals(total_pages,"2");
		
		System.out.println(response.getBody().asString());
		
		System.out.println(response.getStatusCode());
		
		//Hard assert
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode,constants.statusCode);
	}

}
