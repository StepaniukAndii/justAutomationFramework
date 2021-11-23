package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.HomePage;
import AleksandrKharchenko.Pages.SignInPage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWikipedia extends TestInit {

    @Test
    public void testWikipediaSignIn() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getLinkSignInWikipedia().click();
        signInPage.getNameFieldSignInWikipedia().sendKeys("Alex8xela");
        signInPage.getPasswordFieldSignInWikipedia().sendKeys("qwsz1234");
        signInPage.getSignInBtnWikipedia().click();

        Assert.assertTrue(homePage.getNameOfUser().isDisplayed());
    }
}