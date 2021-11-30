package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestOnPlayMarketUrl extends TestInit {
    StartPage startPage;
    @Test
    public void testOnPlayMarketUrl(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com");
        startPage.gotItBtn().click();
        startPage.playMarketBtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://play.google.com/store/apps/details?id=com.eatstreet.android&hl=en");
    }
}
