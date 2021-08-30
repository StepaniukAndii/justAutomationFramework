package TestVanek.Mychords.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.Mychords.Pages.LogInPage;
import TestVanek.Mychords.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogIn extends TestInit {
    StartPage startPage;
    LogInPage logInPage;

    @Test
    public void testLogIn(){
        startPage = new StartPage(driver);
        logInPage = new LogInPage(driver);

        openUrl("https://mychords.net");

        startPage.logInBtn().click();
        logInPage.logInInput().sendKeys("testing@gmail.com");
        logInPage.passInput().sendKeys("testing");
        logInPage.logInBtn().click();
        Assert.assertTrue(startPage.userLogin().getText().contains("testingVanek"));
    }
}
