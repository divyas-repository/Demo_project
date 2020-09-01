import java.util.HashMap;
import static io.restassured.RestAssured.*;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PatchApiDemo {

	@Test
	public void patchApiDemo() {
//Created a json object//	
		JSONObject request =new JSONObject();
//Input parameters//		
		request.put("name", "Divya");
		request.put("job", "Qa");		
//printing the input parameters to check if its going in the json format or not//
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-type", "Application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()  
		     .patch("https://reqres.in/api/users/2")
		     .then().statusCode(200).log().all();
	}

}

