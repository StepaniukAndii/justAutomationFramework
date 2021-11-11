package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
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
}
