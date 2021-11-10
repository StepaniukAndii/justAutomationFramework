package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.SignInPage;
import Svetlana.EatstreetPage.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpNegTestPasswordContains30Char extends TestInit {

    @Test
    public void signUpNegTestEmailContains30Char(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.pressSignUpLink().click();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.enterEmail().sendKeys("Prutasveta@gmail.com");
        signUpPage.enterPassword().sendKeys("centik-1234567891234567912345679123456789");
        signUpPage.enterPasswordAgain().sendKeys("centik-1234567891234567912345679123456789");
        signInPage.pressGoItBtn().click();
        signUpPage.pressSignUpBtn().click();
        Assert.assertTrue(signUpPage.checkValidationEmail().isDisplayed());
    }
}
