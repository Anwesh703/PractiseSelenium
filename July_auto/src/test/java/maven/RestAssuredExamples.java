package maven;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredExamples {
	CreatePost cp = new CreatePost();
@Test
	public void test01()
{//RestAssured.get
//	Response response = get("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/findByPin?pincode=500084&date=20-08-2021");
//	System.out.println(response.asString());
//	System.out.println(response.contentType());
//	System.out.println(response.getContentType());
//	assertEquals(response.statusCode(),200);
//	System.out.println(response.path("sessions[0].name"));
//	//given, when , then
	
//	String name = given().queryParam("pincode","500084").queryParam("date","20-8-2021").
//			pathParams("Key","findByPin").when().get("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/{Key}")
//	.then().contentType(ContentType.JSON).statusCode(200).extract().
//	path("sessions[0].name")
//	;
	
	String name = given().param("pincode","500084").param("date","20-8-2021").
			pathParams("Key","findByPin").when().get("https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/{Key}")
	.then().contentType(ContentType.JSON).statusCode(200).extract().
	path("sessions[0].name")
	;
	assertEquals(name,"Apollo My Home Workplace");
	
}
@Test
public void postFun() {
String s = given()
    .contentType(ContentType.JSON)
	.body("{\"id\": 4,\"title\": \"Anwesh\",\"author\": \"Automation-July\" }")
	.when()
	    .post("http://localhost:3000/posts")
	.then()
	    .contentType(ContentType.JSON)
        .statusCode(201)
        .extract().response().asString();
    System.out.println(s);
}
@Test

 public void postFuncCreatePost() {
	 
	 cp.setId(3);
	 //cp.setTitle("Books");
	 //cp.setAuthor("Anwesh");
	 
	String s = given()
	 .contentType(ContentType.JSON)
	 .body(cp)
	 .log().all()
	 .when()
	 .post("http://localhost:3000/posts")
		.then()
		    .contentType(ContentType.JSON)
	        .statusCode(201)
	        .log().all()
	        .extract().response().asString();
	    System.out.println(s);
 }
@Test

 public void putFun() {
     cp.setId(3);
     cp.setTitle("Auto");
     cp.setAuthor("vaishu");
     
     given()
     .contentType(ContentType.JSON)
     .body(cp)
     .log().all()
     .when()
     .put("http://localhost:3000/posts/3")
		.then()
		    .contentType(ContentType.JSON)
	        .statusCode(200) 
	        .extract().response().asString();
	   
     
 }
@Test

public void deleteFun() {
String s =	when()
	.delete("http://localhost:3000/posts/3")
	.then()
	.contentType(ContentType.JSON)
	.statusCode(200)
	.extract().response().toString();
	System.out.println(s);
}
@Test
public void patchFun() {
cp.setId(2);
cp.setTitle("Anwesh-updated");
given()
.contentType(ContentType.JSON)
.body(cp)
.when()
.patch("http://localhost:3000/posts/2")
	.then()
	    .contentType(ContentType.JSON)
       .statusCode(200);

}
}

