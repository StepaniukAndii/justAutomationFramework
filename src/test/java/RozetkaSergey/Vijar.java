package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vijar extends TestInit {

    @Test
    public void loginTest() {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToGoogle("https://www.google.com");
        homePageVijar.googleField().sendKeys("Вияр");
        enter();
        homePageVijar.goToVijar().click();
        sleep(1);
        homePageVijar.closeAdverb().click();
        homePageVijar.goToEnter().click();
        homePageVijar.getLogin().sendKeys(homePageVijar.getterLogin());
        homePageVijar.getPass().sendKeys(homePageVijar.getterPass());
        homePageVijar.clickEnter().click();
        sleep(1);
        homePageVijar.closeAdverb().click();
        System.out.println("Sehr gut!");
    }
}

