package KrukIvan.JiraTAF;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestInit{
    @Test
    public void testSignIn(){
        HomePage homePage = new HomePage(driver);
        driver.manage().window().fullscreen();
        homePage.clickButtonGotIt().click();
        homePage.inputEmail().sendKeys("tsegse");
        homePage.inputPassword().sendKeys("sges");
        homePage.getSignInBTN().click();
        sleep(3);
        Assert.assertTrue(homePage.getErrorMSG().isDisplayed());
    }
}
