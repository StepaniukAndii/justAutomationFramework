package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.SignInPage;
import Svetlana.EatstreetPage.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpNegTestPasswordContains7Char extends TestInit {

    @Test
    public void signUpNegTestPasswordContains7Char(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.pressSignUpLink().click();
        SignUpPage signUpPage=new SignUpPage(driver);
        signUpPage.enterEmail().sendKeys("Prutasveta@gmail.com");
        signUpPage.enterPassword().sendKeys("cent-12");
        signUpPage.enterPasswordAgain().sendKeys("cent-12");
        signInPage.pressGoItBtn().click();
        signUpPage.pressSignUpBtn().click();
        Assert.assertTrue(signUpPage.checkValidationPassword().isDisplayed());
    }
}
