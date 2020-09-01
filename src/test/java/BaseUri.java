import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BaseUri {
	@Test
	public void baseUri() {
		
		baseURI = "http://localhost:3000";
		
		given()
		.get("/companies")
		.then().statusCode(200).log().all();
	}

}
