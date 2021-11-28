package Julia.EatStreet.Test36_60;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTheApp extends TestInit {

    @Test
    public void getTheApp() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.getTheApp().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("get-the-app"));
    }
}
