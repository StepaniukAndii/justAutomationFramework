package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomePage;
import SerhiiBondar.Pages.SingInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestInit {

    @Test
    public void testLogin1() {
        HomePage homePage = new HomePage(driver);
        openUrl("http://demowebshop.tricentis.com/");
        homePage.getEmailBtn().click();
        SingInPage singInPage = homePage.goToSigInPage();
        singInPage.getEmailField().sendKeys("blablabla@google.com");
        singInPage.getPasswordField().sendKeys("1234567");
        singInPage.getLogInBtn().click();

        Assert.assertTrue(singInPage.invalidLogInMessage().isDisplayed());
    }
}