package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrRestCorvallis extends TestInit {

    @Test
    public void filtrRestCorvallis() {
        HomePage homePage =new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getAdressInput().sendKeys("Corvallis");
        sleep(5);
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getAllRest().get(homePage.getAllRest().size() - 5).click();
        sleep(3);
        Assert.assertTrue(homePage.getBackToCorvallis().isDisplayed());
    }
}