package Julia.EatStreet.Test36_60;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckNumberInRest extends TestInit {

    @Test
    public void checkNumberInRest() {
        HomePage homePage =new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getAdressInput().sendKeys("Dallas, TX");
        sleep(2);
        homePage.getFedBtn().click();
        sleep(5);
        homePage.checkAndClousePopUpWindow();
        homePage.clickFiltrSection().get(0).click();
        sleep(5);
        homePage.clickFiltrSection().get(1).click();
        sleep(5);
        homePage.clickFiltrSection().get(2).click();
        sleep(5);
        homePage.clickFiltrSection().get(3).click();
        Assert.assertTrue(homePage.activeFiltr().get(0).isDisplayed());
        Assert.assertTrue(homePage.activeFiltr().get(1).isDisplayed());
        Assert.assertTrue(homePage.activeFiltr().get(2).isDisplayed());
        Assert.assertTrue(homePage.activeFiltr().get(3).isDisplayed());
    }

    @Test
    public void checkFiltrationInRest() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getAdressInput().sendKeys("Dallas, TX");
        sleep(2);
        homePage.getFedBtn().click();
        sleep(5);
        homePage.checkAndClousePopUpWindow();
        homePage.clickFiltrSection().get(0).click();
        sleep(5);
        homePage.clickFiltrSection().get(1).click();
        sleep(5);
        homePage.clickFiltrSection().get(2).click();
        sleep(5);
        homePage.clickFiltrSection().get(3).click();
        homePage.closeActiveFiltr().get(0).click();
        sleep(3);
        homePage.closeActiveFiltr().get(1).click();
        sleep(5);
        homePage.closeActiveFiltr().get(0).click();
        sleep(5);
        Assert.assertTrue(homePage.clickFiltrSection().get(0).isDisplayed());
    }
}
