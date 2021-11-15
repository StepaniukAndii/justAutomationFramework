package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NYRestEatstreet extends TestInit {

    @Test
    public void nYRestEatstreet() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getAdressInput().sendKeys("new york");
        homePage.checkAndClousePopUpWindow();
        homePage.getFedBtn().click();
        sleep(2);
        homePage.getPageNumberList().get(homePage.getPageNumberList().size() -1).click();
        sleep(5);
        homePage.getAllRest().get(0).click();
        Assert.assertTrue(homePage.getRestInNY().isDisplayed());
    }
}
