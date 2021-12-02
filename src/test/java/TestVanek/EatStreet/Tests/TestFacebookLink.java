package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestFacebookLink extends TestInit {
    StartPage startPage;
    @Test
    public void testFacebookLink(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.gotItBtn().click();
        startPage.mediaLinks().get(0).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Boolean wait = new WebDriverWait(driver,10).until(ExpectedConditions.urlContains("facebook.com/eatstreetHQ/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com/eatstreetHQ/"));
    }
}
