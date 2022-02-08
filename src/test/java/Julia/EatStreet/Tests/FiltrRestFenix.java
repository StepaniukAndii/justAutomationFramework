package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrRestFenix extends TestInit {

    @Test
    public void filtrRestFenix() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getAdressInput().sendKeys("Phoenix,AZ");
        homePage.getFedBtn().click();
        homePage.checkAndClouseAdressSearchAttempt();
        homePage.getFedBtn().click();
        homePage.getAllRest().get(1).click();
        Assert.assertTrue(homePage.getBackToPhoenix().isDisplayed());
    }

    @Test
    public void takeOutFiltrRestFenix() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getAdressInput().sendKeys("Pheonix");
        homePage.checkAndClouseAdressSearchAttempt();
        sleep(2);
        homePage.clickTakeOutBtn().click();
        sleep(2);
        homePage.getAllRest().get(0).click();
        Assert.assertTrue(homePage.getBackToPhoenix().isDisplayed());
    }
}
