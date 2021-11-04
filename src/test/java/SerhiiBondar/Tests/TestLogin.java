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

    @Test
    public void testLogin2(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://demowebshop.tricentis.com/");
        homePage.getEmailBtn().click();
        SingInPage singInPage = homePage.goToSigInPage();
        singInPage.getEmailField().sendKeys("serhii.bondar2@gmail.com");
        singInPage.getPasswordField().sendKeys("club2021");
        singInPage.getLogInBtn().click();

        Assert.assertTrue(singInPage.getLogOutBtn().size()>0);
    }
}