package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LiveChat extends TestInit {

    @Test
    public void livechat() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        sleep(5);
        homePage.clickBtnLiveChat().click();
        homePage.goToTheSecondWindowTab(driver,10);
        sleep(5);
        homePage.enterMessageLiveChat().isDisplayed();
        sleep(5);
        homePage.enterMessageLiveChat().sendKeys("Hello!");
        sleep(5);
        homePage.clickBtnSend().click();
        Assert.assertEquals(homePage.answerBotLiveChat().getText(),"EatStreet Bot");
    }
}
//sendKeys("Hello!");
//Assert.assertEquals(homePage.answerBotLiveChat().getText(),"EatStreet Bot");