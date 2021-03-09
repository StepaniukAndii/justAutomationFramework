package TestAmazon.AllTest;

import ClasesToAllUs.TestInit;
import TestAmazon.Pages.HomePage.HomePageAmazon;
import org.testng.annotations.Test;

public class TestSearchField extends TestInit {

    @Test
    public void testSearchField() {
        HomePageAmazon homePageAmazon = new HomePageAmazon(driver);
        openUrl("https://www.amazon.com/");
        homePageAmazon.tapToSearchField().sendKeys("speaker");
        pushBtnReturn();
        homePageAmazon.sortByPrice().click();
        homePageAmazon.clickToPageNumb3().click();
    }
}
