package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPosivTest extends TestInit {

    @Test
    public void SignInPositivTest(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.EnterEmail().sendKeys("prutasveta@gmail.com");
        signInPage.EnterPassword().sendKeys("centik-1234");
        signInPage.pressGoItBtn().click();
        signInPage.pressSignInBtn().click();
        sleep(5);
        Assert.assertTrue(homePage.CheckHomePage().isDisplayed());
    }
}
