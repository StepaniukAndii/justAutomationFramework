package Julia.EatStreet.Test36_60;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckLogin extends TestInit {

    @Test
    public void checkBaltimoreRest(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getBaltimoreCity().click();
        homePage.getViewAllRestBaltimoreCity().click();

        Assert.assertTrue(homePage.getBaltimoreTitle().isDisplayed());
    }
}
