package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.FacebookLoginPage;
import TestVanek.EatStreet.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestSignInWithFacebook extends TestInit {
    LoginPage loginPage;
    FacebookLoginPage facebookLoginPage;
    @Test
    public void testSignInWithFacebook(){
        openUrl("https://qa2.eatstreet.com/signin");
        loginPage = new LoginPage(driver);
        loginPage.signInFacebookBtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        facebookLoginPage = new FacebookLoginPage(driver);
        Assert.assertTrue(facebookLoginPage.getFacebookLoginPage().isDisplayed());
    }
}
