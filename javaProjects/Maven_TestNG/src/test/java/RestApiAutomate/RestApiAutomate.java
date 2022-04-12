package RestApiAutomate;
import org.testng.Reporter;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class RestApiAutomate {
	// you can disable getRequest 
	// 
	@Test(enabled=true)
	public void getRequest() {
		String url = "https://reqres.in/api/users?page=2";
		Response response = RestAssured.get(url);
		System.out.println(response);
		Assert.assertEquals(response.getStatusCode(), 200);
		int total_pages = response.jsonPath().get("total_pages");
		Assert.assertEquals(total_pages, 2);
	}
	
//	@Test(enabled=true)
//	public void postRequest() {
//		//	URL specification, body data, JSON
//		String url = "https://reqres.in/api/users";
//		String contentType = "application/json";
//		String body = "{\r\n"
//				+ "    \"name\": \"morpheus\",\r\n"
//				+ "    \"job\": \"leader\"\r\n"
//				+ "}";
//		// Send post request 
//		Response response = RestAssured.given().
//				contentType(contentType).
//				body(body).
//				when().post(url).then().extract().response();
//		Assert.assertEquals(response.getStatusCode(), 201);
//		String name = response.jsonPath().get("name");
//		Assert.assertEquals(name, "morpheus", "name mismatched");
//		Reporter.log("Found Mismatched Name!", true);
//	}
	
	@Test(enabled=true)
	public void postRequest() {
        String url = "https://reqres.in/api/users"  ;
        String contentType="application/json";
         String bodyData = "{\r\n"
                  + "    \"name\": \"morpheus\",\r\n"
                  + "    \"job\": \"leader\"\r\n"
                  + "}";
         Response response = RestAssured.given(). 
                        contentType(contentType).body(bodyData).
                           when().post(url).
                           then().extract().response();
       Assert.assertEquals(response.getStatusCode(), 201);
        String name=response.jsonPath().get("name");
        Assert.assertEquals(name, "morpheus" , "name mismatch");
        Reporter.log("Found Matched Name!!", true);
        
         }

}
