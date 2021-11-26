package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.LoginPage;
import TestVanek.EatStreet.Pages.SignUpPage;
import TestVanek.EatStreet.Pages.StartPage;
import io.cucumber.java.it.Ma;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateNewUser extends TestInit {
    SignUpPage signUpPage;
    StartPage startPage;

    @Test
    public void testCreateNewUser(){
       signUpPage = new SignUpPage(driver);
       String pass = "password"+Math.random();
       openUrl("https://eatstreet.com/create-account?next=~2F");
       signUpPage.emailInput().sendKeys(Math.random()+"@gmail.com");
       signUpPage.passwordInput().sendKeys(pass);
       signUpPage.passwordAgainInput().sendKeys(pass);
       signUpPage.signUpBtn().click();
       startPage = new StartPage(driver);
       sleep(5);
       Assert.assertTrue(startPage.myAccounBtn().getText().contains("My Account"));
    }
}
