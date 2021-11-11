package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends TestInit {
    @Test
    public void testSignIn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.addSignInBtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
    }
    @Test
    public void testSignUp(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/" + "/create-account?next=~2F");
        homePage.getGoItBtn().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("hihihioijohj89h");
        homePage.addPasswordAgainField().sendKeys(" hihihioijohj89h");
        homePage.addSignUpBtn().click();
        sleep(2);

        Assert.assertTrue(homePage.myAccountIcon().isDisplayed());
    }
}
