package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.*;
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

    @Test
    public void testTransitionToAnArticle() {
        HomePage homePage = new HomePage(driver);
        ArticlePage articlePage = new ArticlePage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getSearchFieldWikipedia().sendKeys("Back to the future\n");
        articlePage.getLinkBackToTheFuture2().click();

        Assert.assertTrue(articlePage.getTextOnFuture2().isDisplayed());
    }

    @Test
    public void testCreateAnArticle() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MasterWikiPage masterWikiPage = new MasterWikiPage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getLinkSignInWikipedia().click();
        signInPage.getNameFieldSignInWikipedia().sendKeys("Alex8xela");
        signInPage.getPasswordFieldSignInWikipedia().sendKeys("qwsz1234");
        signInPage.getSignInBtnWikipedia().click();
        homePage.getCreateArticleBtn().click();
        masterWikiPage.getStartWizardBtn().click();
        masterWikiPage.getAboutMyselfBtn().click();

        Assert.assertTrue(masterWikiPage.getSoItGoesMSG().isDisplayed());
    }

    @Test
    public void testCheckingTheChoiceOfAnotherLanguage() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getUkraineLanguageLink().click();

        Assert.assertTrue(homePage.getTextOnUkraineMSG().isDisplayed());
    }

    @Test
    public void testTheSettingOnWikipedia() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SettingsPage settingsPage = new SettingsPage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getLinkSignInWikipedia().click();
        signInPage.getNameFieldSignInWikipedia().sendKeys("Alex8xela");
        signInPage.getPasswordFieldSignInWikipedia().sendKeys("qwsz1234");
        signInPage.getSignInBtnWikipedia().click();
        homePage.getSettingsLink().click();
        settingsPage.getEditingLink().click();
        settingsPage.getFirstCheckboxInEditing().click();
        settingsPage.getSaveBtn().click();

        Assert.assertTrue(settingsPage.getGreySaveBtn().isDisplayed());
    }
}