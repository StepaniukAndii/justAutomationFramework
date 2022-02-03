package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import YevtushenkoVova.Pages.SingIn;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingInNoEmail extends TestInit {
    @Test
    public void SingInNoEmail(){
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();
        singIn.inputPassword().sendKeys("Qwert@54321");
        singIn.getSignInBTN().click();
        sleep(2);

        Assert.assertTrue(singIn.emailErrorRequired().isDisplayed());
    }
}
