package TestRozetkaAndKinoGo.TestAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class TestAPIrozetka {

    @Test
    public void testAPIrozetka() {
        given().when().get("https://rozetka.ua").then().statusCode(200);
        given().when().get("https://i2.rozetka.ua/goods/22091375/" +
                "samsung_galaxy_a52_8_256gb_lavender_images_22091375773.jpg").then().statusCode(200);
        given().when().get("https://i1.rozetka.ua/images/105/105288.png").then().statusCode(200);
    }
}
