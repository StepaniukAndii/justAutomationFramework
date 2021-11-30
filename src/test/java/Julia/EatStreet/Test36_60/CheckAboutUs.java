package Julia.EatStreet.Test36_60;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAboutUs extends TestInit {

    @Test
    public void checkAboutUs() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAboutUs().click();
        sleep(3);
        Assert.assertTrue(driver.getCurrentUrl().contains("about-us"));
    }
}
