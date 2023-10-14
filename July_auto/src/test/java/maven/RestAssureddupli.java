package maven;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RestAssureddupli {
	CreatePost cp = new CreatePost();

@Test

public void postFuncCreatePost() {
	 
	 cp.setId(10);
	 cp.setTitle("Books");
	 cp.setAuthor("Anwesh");
	 
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
	.delete("http://localhost:3000/posts/1")
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
