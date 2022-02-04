package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetTheApp extends TestInit {

    @Test
    public void googlePlay() {
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.btnGooglePlay().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        Assert.assertTrue(homePage.googlePlayLinkEatSt().isDisplayed());
    }

    @Test
    public void appStore() {
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.btnAppStory().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        Assert.assertTrue(homePage.appStoryLinkEatSt().isDisplayed());
    }
}
