package TestRozetka.TestCucumber;

import ClasesToAllUs.TestInit;
import TestRozetka.BaseDate;
import TestRozetka.Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCity extends TestInit {

    @Test
    public void testCity() {
        HomePage homePage = new HomePage(driver);
        openUrl(BaseDate.BASE_URL);
        homePage.getHeaderButton().get(0).click();
        homePage.getButtonCityToggle().click();
        for (WebElement webElement:homePage.getHeaderLocation()) {
            webElement.click();
        }
        homePage.getButtonApplyCity().click();
    }
}