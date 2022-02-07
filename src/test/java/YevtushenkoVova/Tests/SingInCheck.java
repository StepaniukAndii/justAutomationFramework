package YevtushenkoVova;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import YevtushenkoVova.Pages.SingIn;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingInCheck extends TestInit {

    @Test

    public void SingInPositive() {
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();
        singIn.inputEmail().sendKeys("vv1808@ukr.net");
        singIn.inputPassword().sendKeys("Qwert@54321");
        singIn.getSignInBTN().click();
        sleep(3);
        Assert.assertTrue(homePage.getMyAccound().isDisplayed());
    }

    @Test
    public void CheckElementsSingIn(){
        HomePage homePage = new HomePage(driver);
        SingIn singIn = new SingIn(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.buttonGotIt().click();
        homePage.openPageSingIn().click();

        Assert.assertTrue(singIn.linkSingUp().isDisplayed());
    }
}
