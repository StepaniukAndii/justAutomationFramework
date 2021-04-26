package TestRozetkaAndDOU.TestAPI;

import TestRozetkaAndDOU.TestAPI.Config.Path;
import TestRozetkaAndDOU.TestAPI.Config.TestConfig;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.List;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class TestAPI extends TestConfig {

    @Test()
    public void myFirstTest() {
        given()
                .log().all()
                .when().get(Path.ALL_GAME)
                .then()
                .log().all();
    }

    @Test
    public void getAllGames() {
        given()
                .get(Path.ALL_GAME)
                .then().log().all();
    }

    @Test
    public void createNewGameJson() {
        String createBodyJson = "{\n" +
                "  \"id\": 11,\n" +
                "  \"name\": \"Andi\",\n" +
                "  \"releaseDate\": \"2021-04-16T10:25:00.705Z\",\n" +
                "  \"reviewScore\": 0,\n" +
                "  \"category\": \"sfasf\",\n" +
                "  \"rating\": \"sfa\"\n" +
                "}";
        given()
                .body(createBodyJson)
                .when()
                .post("http://localhost:8081/app/videogames")
                .then();
    }

    @Test
    public void updateJson() {
        String update = "{\n" +
                "  \"id\": 1,\n" +
                "  \"name\": \"string\",\n" +
                "  \"releaseDate\": \"2021-04-16T10:25:00.705Z\",\n" +
                "  \"reviewScore\": 1,\n" +
                "  \"category\": \"stringsasfaFAf\",\n" +
                "  \"rating\": \"st21fassring\"\n" +
                "}";
        given()
                .body(update)
                .when()
                .put("/videogames/1")
                .then();

    }

    @Test
    public void deleteJson() {
        given()
                .when()
                .delete("/videogames/0")
                .then();
    }

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
        HashMap<String, String> stringHashMap = new HashMap<>();
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
