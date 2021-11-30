package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInNegTestPasswordContains7Char extends TestInit {

    @Test
    public void signInNegTestPasswordContains7Char (){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.EnterEmail().sendKeys("prutasveta@gmail.com");
        signInPage.EnterPassword().sendKeys("centik-");
        signInPage.pressGoItBtn().click();
        signInPage.pressSignInBtn().click();
        sleep(5);
        Assert.assertTrue(signInPage.checkValidationPassword().isDisplayed());
    }
}
