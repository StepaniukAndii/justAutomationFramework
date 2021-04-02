package TestRozetka;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestAPI {
    @Test
    public void assertUser() {
        given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=2")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .body("data[0].first_name", equalTo("George"));
    }

    @Test
    public void deleteUsers() {
        given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users/2")
                .contentType(ContentType.JSON)
                .when()
                .delete()
                .then()
                .statusCode(204);
    }

    @Test
    public void getUsers() {
        List<String> list = given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users?page=2")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .extract().jsonPath().getList("data.email");
        System.out.println(list);
    }

    @Test
    public void postRequest() {
        HashMap<String,String> stringHashMap = new HashMap<>();
        stringHashMap.put("name", "TestDate");
        stringHashMap.put("age", "24");
        stringHashMap.put("salary", "1100");
        given()
                .when()
                .contentType(ContentType.JSON)
                .body(stringHashMap)
                .post("https://webhook.site/a8f9e01c-3c50-405c-808f-3eca2dffa13f")
                .then()
                .statusCode(200);
    }
}
