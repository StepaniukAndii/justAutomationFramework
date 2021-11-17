package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingInWithGoogle extends TestInit {

    @Test
    public void singInWithGoogle() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.clickSignInBtn().click();
        homePage.clickSingInWithGoogle().click();
        Assert.assertEquals(homePage.selectAccountWithGoogle().getText(),"Вход");
    }
}