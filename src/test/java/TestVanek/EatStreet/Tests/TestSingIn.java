package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.LoginPage;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSingIn extends TestInit {
    StartPage startPage;
    LoginPage loginPage;

    @Test
    public void singIn() {
        startPage = new StartPage(driver);
        loginPage = new LoginPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.singInBtn().click();
        loginPage.emailInput().sendKeys("lerororororo@gmail.com");
        loginPage.passwordInput().sendKeys("lerororororo");
        loginPage.singInBtn().click();
        Assert.assertTrue(loginPage.modalError().getText().contains("The login information you entered is incorrect."));
    }
}