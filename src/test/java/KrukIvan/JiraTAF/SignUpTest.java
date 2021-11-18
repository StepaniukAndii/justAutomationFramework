package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends TestInit {
    @Test
    public void testSignUp(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homePage.clickButtonGotIt().click();
        homePage.clickBTNSignInOnHomePage().click();
        homePage.clickTextSignUp().click();
        homePage.enterEmailInSignUp().sendKeys("gawdwa");
        sleep(1);
        homePage.enterPasswordInSignUp().sendKeys("11111111");
        homePage.enterPasswordAgain().sendKeys("11111111");
        sleep(1);
        Assert.assertTrue(homePage.wrongEmailMSG().isDisplayed());
    }
}
