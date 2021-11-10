package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDetroitCity extends TestInit {
    @Test
    public void testDetroitCity(){
        openUrl("https://qa2.eatstreet.com/");
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonGotIt().click();
        homePage.clickOnMainPageOnDetroitCity().click();
        sleep(3);
        Assert.assertTrue(homePage.getInformationAboutDetroitRestaurants().isDisplayed());
    }
}
