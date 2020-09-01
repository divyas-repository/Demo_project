import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.regex.Matcher;

import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class getApiDemo {
	
    
	@Test
	void getApiDemo() {
		
		given()
		    .header("content-Type", "Applicatio/json")
		    .header("Accept", "Applicatio/json")
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200) 
			.body("data.id[1]", equalTo(8)) 
			.body("data.first_name",hasItems("Michael", "Lindsay", "Tobias", "Byron", "George", "Rachel")) 
		    .log().all();
	
	}

}
