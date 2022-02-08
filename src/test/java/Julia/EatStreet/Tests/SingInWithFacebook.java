package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingInWithFacebook extends TestInit {
    @Test
    public  void singInWithFacebook () {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.clickSignInBtn().click();
        homePage.clickSingInWithFacebook().click();
        homePage.enterEmailWithFacebook().sendKeys("y.tymoshenko5@gmail.com");
        homePage.enterPassWithFacebook().sendKeys("12554");

        Assert.assertEquals(homePage.getNewToEatstreetText().getText(),"New to EatStreet?");
    }
}
