package DataDriven;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.io.IOException;
import io.restassured.http.ContentType;


public class DataDrivenExample {


	/*
	 * //@DataProvider(name = "Data_provider")
	 * 
	 * public Object[][] dataForPost(){
	 * 
	 * Object[][] data=new Object[2][3];
	 * 
	 * data[0][0] = "User1" ; data[0][1] = "testing1"; data[0][2] = 1;
	 * 
	 * 
	 * data[1][0] = "User1"; data[1][1] = "testing1"; data[1][2] = 1;
	 * 
	 * return data;
	 * 
	 * }
	 * 
	 * } }
	 * 
	 * 
	 * return new Object[][] { {"Divya1", "testing", 1}, {"Divya2", "testing", 2}
	 * 
	 * }; }
	 * 
	 * @Test(dataProvider = "Data_provider") public void datadriven_test(String
	 * firstname, String lastname, int companyid)
	 * 
	 * {
	 * 
	 * JSONObject request=new JSONObject();
	 * 
	 * request.put("firstname", firstname); request.put("lastname", lastname);
	 * request.put("companyid", companyid);
	 * 
	 * 
	 * baseURI = "http://localhost:3000";
	 * 
	 * given() .contentType(ContentType.JSON) .accept(ContentType.JSON)
	 * .header("Content-type", "Application/json") .body(request.toJSONString())
	 * .when() .post("/users") .then() .statusCode(201) .log() .all(); }
	 */



	//@DataProvider(name = "DeleteData")
	public Object[] deleteforAPI() {

		return new Object[] {
				4,5,6,7

		};
	}

	/*
	 * //@Test(dataProvider ="DeleteData") public void deleteRequest(int userid) {
	 * 
	 * baseURI = "http://localhost:3000";
	 * 
	 * when(). delete("/users/"+userid) .then().statusCode(200).log().all(); } }
	 */


	
	
	@Parameters("userid")
	@Test
	public void deleteRequest(int userid) {
        
		System.out.println("Value for userid is"+userid);
		baseURI = "http://localhost:3000";

		when().
		delete("/users/"+userid)
		.then().statusCode(200).log().all();
	}
}











