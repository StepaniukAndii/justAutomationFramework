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
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("New York");
        homePage.checkAndClouseAdressSearchAttempt();
        homePage.getPageNumberList().get(homePage.getPageNumberList().size() -1).click();
        homePage.getAllRest().get(0).click();
        Assert.assertTrue(homePage.getRestInNY().isDisplayed());
    }

    @Test
    public void filtrRestNY() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("NYC,USA");
        homePage.checkAndClouseAdressSearchAttempt();
        homePage.getbtnFiltrSection().get(45).click();
        homePage.getbtnFiltrSection().get(23).click();
        homePage.getbtnFiltrSection().get(67).click();
        Assert.assertTrue(homePage.getSectionFiltrAllRestInCity().isDisplayed());
    }

    @Test
    public void checkFirstRestInNY() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getAdressInput().sendKeys("NYC,USA");
        sleep(2);
        homePage.checkAndClouseAdressSearchAttempt();
        homePage.getAllRest().get(0).click();
        sleep(2);
        Assert.assertTrue(homePage.fieldSearchMenu().isDisplayed());
        Assert.assertTrue(homePage.h2YourOrder().isDisplayed());

    }
}
