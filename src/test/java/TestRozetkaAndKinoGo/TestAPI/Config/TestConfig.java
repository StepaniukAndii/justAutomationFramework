package TestRozetkaAndKinoGo.TestAPI.Config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeTest;

public class TestConfig {

    @BeforeTest
    public static void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.basePath = "/app";
        RestAssured.port = 8081;

        RequestSpecification redirectSpecification = new  RequestSpecBuilder()
                .addHeader("Content-Type","application/json")
                .addHeader("Accept","application/json")
                .build();
        RestAssured.requestSpecification = redirectSpecification;

        ResponseSpecification requestSpecification = new ResponseSpecBuilder().expectStatusCode(200).build();
        RestAssured.responseSpecification = requestSpecification;



    }
}
