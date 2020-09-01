import java.util.HashMap;
import static io.restassured.RestAssured.*;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteApiDemo {
	@Test
	public void deleteAPIdemo() {
		
		JSONObject request =new JSONObject();
		
		request.put("name", "Divya");
		request.put("job", "Qa");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-type", "Application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()  
		     .delete("https://reqres.in/api/users/2")
		     .then().statusCode(204).log().all();
		
	}

}



