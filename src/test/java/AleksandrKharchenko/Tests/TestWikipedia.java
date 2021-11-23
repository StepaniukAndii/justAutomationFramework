package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.ArticlePage;
import AleksandrKharchenko.Pages.HomePage;
import AleksandrKharchenko.Pages.SignInPage;
import ClasesToAllUs.TestInit;
import io.cucumber.java.bs.A;
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

    @Test
    public void testTransitionToAnArticle() {
        HomePage homePage = new HomePage(driver);
        ArticlePage articlePage = new ArticlePage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getSearchFieldWikipedia().sendKeys("Back to the future\n");
        articlePage.getLinkBackToTheFuture2().click();

        Assert.assertTrue(articlePage.getTextOnFuture2().isDisplayed());
    }
}