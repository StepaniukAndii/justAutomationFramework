package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BtnCareers extends TestInit {

    @Test
    public void btnCareers() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnCareers().click();
        sleep(5);
        Assert.assertTrue(driver.getCurrentUrl().contains("careers"));

    }
}
