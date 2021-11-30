package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestOnAppStoreUrl extends TestInit {
    StartPage startPage;
    @Test
    public void testOnAppStoreUrl(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com");
        startPage.gotItBtn().click();
        startPage.appStoreBtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://apps.apple.com/us/app/eatstreet-food-delivery-take-out-app/id664697933");
    }
}
