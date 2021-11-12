package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectionOfAsianFood extends TestInit {

    @Test
    public void selectionOfAsianFood() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.selectCityDetroyd().click();
        sleep(2);
        homePage.selectAsianCousin().click();
        sleep(3);
        homePage.getAllRest().get(0).click();
        Assert.assertEquals(homePage.getAsianFood().getText(), "Bangladeshi");
    }
}
