package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SignUpTest extends TestInit {
    @Test
    public void testSignUp(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homePage.clickButtonGotIt().click();
        homePage.clickBTNSignInOnHomePage().click();
        homePage.clickTextSignUp().click();
        homePage.enterEmailInSignUp().sendKeys("gawdwa");
        sleep(1);
        homePage.enterPasswordInSignUp().sendKeys("11111111");
        homePage.enterPasswordAgain().sendKeys("11111111");
        sleep(1);
        Assert.assertTrue(homePage.wrongEmailMSG().isDisplayed());
    }
    @Test
    public void testSignUpWithFacebook(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homePage.clickButtonGotIt().click();
        homePage.clickBTNSignInOnHomePage().click();
        homePage.clickTextSignUp().click();
        homePage.signUpWithFacebook().click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertEquals(2,tabs.size());
    }
    @Test
    public void testSignUpWithGoogle(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homePage.clickButtonGotIt().click();
        homePage.clickBTNSignInOnHomePage().click();
        homePage.clickTextSignUp().click();
        homePage.signUpWithGoogle().click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertEquals(2,tabs.size());
    }
    @Test
    public void testSignUpOnMainPage(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homePage.clickButtonGotIt().click();
        homePage.emailFieldOnMainPage().sendKeys("13awd5@gmaiil.com");
        homePage.signUpBTNOnMainPage().click();
        Assert.assertTrue(homePage.assertSignUpOnMainPage().isDisplayed());
    }
}
