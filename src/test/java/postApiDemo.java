import java.util.HashMap;
import static io.restassured.RestAssured.*;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postApiDemo {
	@Test
	public void PostAPIdemo() {
		
		/*
		 * Map<String, Object> map = new HashMap<String, Object>();
		 */		
		/*
		 * map.put("name", "Divya"); map.put("job", "Qa"); System.out.println(map);
		 */
		
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
		     .post("https://reqres.in/api/users")
		     .then().statusCode(201);
		
	}

}
