package YevtushenkoVova;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingIn extends TestInit {

    @Test

    public void SingInPositive() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.openPageSingIn().click();
        homePage.inputEmail().sendKeys("vv1808@ukr.net");
        homePage.inputPassword().sendKeys("Qwert@54321");
        homePage.getSignInBTN().click();
        sleep(3);
        Assert.assertTrue(homePage.getMyAccound().isDisplayed());
    }
}
