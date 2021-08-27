package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.LoginPage;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends TestInit {
    StartPage startPage;
    LoginPage loginPage;

    @Test
    public void signIn() {
        startPage = new StartPage(driver);
        loginPage = new LoginPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.signInBtn().click();
        loginPage.emailInput().sendKeys("lerororororo@gmail.com");
        loginPage.passwordInput().sendKeys("lerororororo");
        loginPage.signInBtn().click();
        Assert.assertTrue(loginPage.modalError().getText().contains("The login information you entered is incorrect."));
    }
}