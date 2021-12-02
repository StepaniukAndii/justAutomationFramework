package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LiveChatOpen extends TestInit {
    @Test
    public void liveChatOpen() {
        driver.get("https://eatstreet.com/");
        HomePage homePage = new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.EnterEmail().sendKeys("prutasveta@gmail.com");
        signInPage.EnterPassword().sendKeys("centik-1234");
        signInPage.pressGoItBtn().click();
        signInPage.pressSignInBtn();
        sleep(5);
        homePage.getLiveChat().click();
        Assert.assertTrue(homePage.checkLiveChat().isDisplayed());
    }

    @Test
    public void checkLiveChatOpen() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getSignIn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.EnterEmail().sendKeys("prutasveta@gmail.com");
        signInPage.EnterPassword().sendKeys("centik-1234");
        signInPage.pressGoItBtn().click();
        signInPage.pressSignInBtn();
        homePage.getLiveChat().click();
        homePage.goToTheSecondWindowTab(driver, 10);
        homePage.enterTextInTheLiveChat().sendKeys("Hello!");
        homePage.clickSendBtn().click();
        sleep(3);
        Assert.assertEquals(homePage.checkAnswerBotLiveChat().getText(), "inquiring about");
    }
    @Test
    public void checkLiveChatSendingRequest(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://qa2.eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.EnterEmail().sendKeys("prutasveta@gmail.com");
        signInPage.EnterPassword().sendKeys("centik-1234");
        signInPage.pressGoItBtn().click();
        signInPage.pressSignInBtn();
        homePage.getLiveChat().click();
        homePage.goToTheSecondWindowTab(driver,10);
        homePage.enterTextInTheLiveChat().sendKeys("Hello!");
        homePage.clickSendBtn().click();
        homePage.sendRequestLiveChat().click();
        homePage.clickEndChatBtn().click();
        Assert.assertTrue(homePage.checkEndChatBtn().isDisplayed());
    }
}

