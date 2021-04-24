package TestRozetkaAndKinoGo.TestCucumber;

import ClasesToAllUs.TestInit;
import TestRozetkaAndKinoGo.BaseDate;
import TestRozetkaAndKinoGo.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCity extends TestInit {

    @Test
    public void testCity() {
        HomePage homePage = new HomePage(driver);
        openUrl(BaseDate.BASE_URL_ROZETKA);
        homePage.getHeaderButton().get(0).click();
        homePage.getButtonCityToggle().click();
        for (WebElement webElement:homePage.getHeaderLocation()) {
            webElement.click();
        }
        homePage.getButtonApplyCity().click();
    }
}