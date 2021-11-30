package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.GoogleLoginPage;
import TestVanek.EatStreet.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestSignInWithGoogle extends TestInit {
    LoginPage loginPage;
    GoogleLoginPage googleLoginPage;

    @Test
    public void testDignInWothGoogle(){
        openUrl("https://qa2.eatstreet.com/signin");
        loginPage = new LoginPage(driver);
        driver.navigate().refresh();
        loginPage.signInGoogleBtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        googleLoginPage = new GoogleLoginPage(driver);
        Assert.assertTrue(googleLoginPage.signInWithGoogleText().isDisplayed());
    }
}
