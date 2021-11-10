package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.SignInPage;
import Svetlana.EatstreetPage.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpNegTestEmailWithout extends TestInit {

    @Test
    public void SignUpNegTestEmailWithout() {
        driver.get("https://eatstreet.com");
        HomePage homePage = new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.pressSignUpLink().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterEmail().sendKeys("prutasvetagmail.com");
        signUpPage.enterPassword().sendKeys("A1234567");
        signUpPage.enterPasswordAgain().sendKeys("A1234567");
        signInPage.pressGoItBtn().click();
        signUpPage.pressSignUpBtn().click();
        sleep(3);
        Assert.assertTrue(signUpPage.checkValidationEmail().isDisplayed());
    }
}
