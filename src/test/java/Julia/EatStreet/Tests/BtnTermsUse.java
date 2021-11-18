package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BtnTermsUse extends TestInit {

    @Test
    public  void btnTermsUse() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.clickBtnTermsUse().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("terms"));
    }
}
