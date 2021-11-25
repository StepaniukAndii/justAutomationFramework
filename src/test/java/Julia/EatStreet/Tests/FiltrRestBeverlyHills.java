package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrRestBeverlyHills extends TestInit {

    @Test
   public void filtrRestBeverlyHills() {
        HomePage homePage = new  HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getAdressInput().sendKeys("Beverly Hills");
        sleep(5);
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getAllRest().get(0).click();
        sleep(3);
        Assert.assertTrue(homePage.getBackBeverlyHills().isDisplayed());
    }

    @Test
    public void checkRestBeverlyHillsCalifornia() {
        HomePage homePage = new  HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getAdressInput().sendKeys("Beverly Hills");
        sleep(5);
        homePage.getFedBtn().click();
        sleep(3);
        homePage.getAllRest().get(3).click();
        sleep(5);
        homePage.sectionMenu().get(7).click();
        sleep(3);
        homePage.addThisItem().click();
        homePage.addThisItem().click();
        homePage.addThisItem().click();
        homePage.addThisItem().click();
        homePage.btnAddToCard().click();
        Assert.assertTrue(homePage.ecqualsCard().getText().contains("5"));
    }
}
