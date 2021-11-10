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
        homePage.clickBtnLiveChat().click();
        sleep(5);
        homePage.enterMessageLiveChat().sendKeys("Hello!");
        homePage.clickBtnSend();
        Assert.assertEquals(homePage.answerBotLiveChat().getText(),"inquiring about");
    }
}
