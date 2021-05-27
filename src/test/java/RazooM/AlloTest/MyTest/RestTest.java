package RazooM.AlloTest.MyTest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestTest {

    @Test
    public void getUsers(){
        given()
                .baseUri("https://regres.in/api")
                .basePath("/users")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode (200);
    }
}
