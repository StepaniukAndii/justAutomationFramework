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

    @Test
    public void filtrRestNY() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getAdressInput().sendKeys("NYC,USA");
        homePage.getFedBtn().click();
        homePage.checkAndClouseAdressSearchAttempt();
        homePage.getFedBtn().click();
        sleep(5);
        homePage.checkAndClousePopUpWindow();
        sleep(5);
        homePage.getbtnFiltrSection().get(45).click();
        homePage.getbtnFiltrSection().get(23).click();
        homePage.getbtnFiltrSection().get(67).click();
        Assert.assertTrue(homePage.getSectionFiltrAllRestInCity().isDisplayed());
    }
}
