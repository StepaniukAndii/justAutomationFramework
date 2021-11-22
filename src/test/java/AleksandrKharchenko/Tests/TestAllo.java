package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAllo extends TestInit {

    @Test
    public void testTheRegistrationFieldPhoneOfTheAlloUa() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://allo.ua/");
        homePage.getLinkSignUp().click();
        homePage.getNameField().sendKeys("Alex");
        homePage.getEmailField().sendKeys("dijosa2551@hobsun.com");
        homePage.getPasswordField().sendKeys("qwer1234");
        homePage.getSignUpBtn().click();

        Assert.assertTrue(homePage.getErrorPhoneMSG().isDisplayed());
    }
}