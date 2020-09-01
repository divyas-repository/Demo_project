import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Params_APIresponse {
	//@Test
	/*public void getRequest() {
		
		baseURI = "http://localhost:3000";
		
		given()
		.param("id", "2")
		.param("name", "Lead squared")
		.get("/companies")
		.then().statusCode(200).log().all();
		*/
	
	
		//@Test
	/*
	 * public void postRequest() {
	 * 
	 * JSONObject request=new JSONObject();
	 * 
	 * request.put("firstname", "Test"); request.put("lastname", "Malviya");
	 * request.put("companyid", "5"); request.put("id", "5");
	 * 
	 * 
	 * baseURI = "http://localhost:3000";
	 * 
	 * given() .header("Content-type", "Application/json")
	 * .contentType(ContentType.JSON).accept(ContentType.JSON)
	 * .body(request.toJSONString()). when(). post("/users")
	 * .then().statusCode(201).log().all(); }
	 */
	
	//@Test
	/*
	 * public void patchRequest() {
	 * 
	 * JSONObject request=new JSONObject();
	 * 
	 * request.put("lastname", "Prajapat");
	 * 
	 * 
	 * baseURI = "http://localhost:3000";
	 * 
	 * given() .header("Content-type", "Application/json")
	 * .contentType(ContentType.JSON).accept(ContentType.JSON)
	 * .body(request.toJSONString()). when(). patch("/users/5")
	 * .then().statusCode(200).log().all(); }
	 */
	
	/*
	 * @Test public void putRequest() {
	 * 
	 * JSONObject request=new JSONObject();
	 * 
	 * request.put("firstname", "using put"); request.put("lastname", "Malviya");
	 * request.put("companyid", "5to6"); request.put("id", "5to6");
	 * 
	 * 
	 * baseURI = "http://localhost:3000";
	 * 
	 * given() .header("Content-type", "Application/json")
	 * .contentType(ContentType.JSON).accept(ContentType.JSON)
	 * .body(request.toJSONString()). when(). put("/users/5")
	 * .then().statusCode(200).log().all(); }
	 */
	
	
	@Test
	public void deleteRequest() {
		
		baseURI = "http://localhost:3000";
		
		when().
		    delete("/users/5")
		.then().statusCode(200).log().all();
	}
		
		
	}





