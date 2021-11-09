package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestInit {
    @Test
    public void testSignIn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/signin");
        homePage.clickButtonGotIt().click();
        homePage.inputEmail().sendKeys("tsegse");
        homePage.inputPassword().sendKeys("sges");
        homePage.getSignInBTN().click();
        sleep(3);
        Assert.assertTrue(homePage.getErrorMSG().isDisplayed());
    }

    @Test
    public void testSignInWithFacebook(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/signin");
        homePage.clickButtonGotIt().click();
        homePage.clickBTNSignInWithFacebook().click();
    }
}
