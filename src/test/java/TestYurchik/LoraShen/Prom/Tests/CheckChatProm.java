package TestYurchik.LoraShen.Prom.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Prom.Pages.LandingPageProm;
import org.junit.Assert;
import org.testng.annotations.Test;

public class CheckChatProm extends TestInit {
    LandingPageProm landingPageProm;
    @Test
    public void checkChatProm() {
        landingPageProm = new LandingPageProm(driver);
        driver.get("https://prom.ua/");
        landingPageProm.chatButton().click();
        landingPageProm.chatPhoneNumber().sendKeys("+380964928462");
        landingPageProm.chatConfirmButton().click();
        Assert.assertTrue(landingPageProm.chetresendButton().size() > 0);
    }
}
