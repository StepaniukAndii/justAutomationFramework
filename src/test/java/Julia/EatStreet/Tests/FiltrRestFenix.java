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
        homePage.getAdressInput().sendKeys("fenixs");
        sleep(5);
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getSelectPageRest();
        homePage.getSelect70Rest();
        sleep(3);
        Assert.assertTrue(homePage.getBackToLakewood().isDisplayed());
    }

    @Test
    public void takeOutFiltrRestFenix() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getAdressInput().sendKeys("fenixs");
        sleep(5);
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getSelectPageRest();
        sleep(3);
        homePage.clickTakeOutBtn().click();
        sleep(2);
        homePage.getAllRest().get(0).click();
        sleep(3);
        Assert.assertTrue(homePage.getBackToLakewood().isDisplayed());
    }
}
