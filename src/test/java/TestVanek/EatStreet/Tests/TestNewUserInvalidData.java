package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNewUserInvalidData extends TestInit {
    SignUpPage signUpPage;

    @Test
    public void testNewUserInvalidData(){
        signUpPage = new SignUpPage(driver);
        openUrl("https://eatstreet.com/create-account?next=~2F");
        signUpPage.emailInput().sendKeys("invalid");
        signUpPage.passwordInput().sendKeys("invalid");
        signUpPage.passwordAgainInput().sendKeys("invalid");
        Assert.assertTrue(signUpPage.emailValidationError().getText().contains("Something looks wrong with the entered email"));
        Assert.assertTrue(signUpPage.passwordValidationError().getText().contains("8 character minimum"));
    }
}
