package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestFilterSlider extends TestInit {

    @Test
    public void testFilterSlider() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.searchField().sendKeys(homePage.gools);
        pushBtnReturn();
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(homePage.getSliderRangeButtonLeft(), 90, 0).perform();
    }
}