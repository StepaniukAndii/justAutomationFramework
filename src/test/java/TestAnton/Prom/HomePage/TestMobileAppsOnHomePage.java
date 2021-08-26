package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.annotations.Test;

public class TestMobileAppsOnHomePage extends TestInit {

    @Test
    public void testMobileAppsOnHomePage(){
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.getMobileAppBtn().click();
        homePage.getGoogleAppBtn().isDisplayed();
        homePage.getAppleAppBtn().isDisplayed();
    }
}
