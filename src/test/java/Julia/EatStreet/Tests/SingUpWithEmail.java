package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingUpWithEmail extends TestInit {

    @Test
    public void signUpWithEmail() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.clickSignInBtn().click();
        homePage.clickSignUpLink().click();
        homePage.enterEmailField().sendKeys("y.tymoshenko5@gmail.com");
        homePage.enterPassField().sendKeys("Yli123456");
        homePage.enterPassAgainField().sendKeys("Yli123456");
        homePage.clickSignUpBtn().click();
        Assert.assertTrue(homePage.getTryAnotherPasswordText().isDisplayed());
    }


}
