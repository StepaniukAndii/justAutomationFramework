package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class testTwitterLink extends TestInit {
    StartPage startPage;
    @Test
    public void testTwitterLink(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com/");
        startPage.gotItBtn().click();
        startPage.mediaLinks().get(1).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Boolean wait = new WebDriverWait(driver,10).until(ExpectedConditions.urlContains("twitter.com/EatStreet"));
        Assert.assertTrue(driver.getCurrentUrl().contains("twitter.com/EatStreet"));
    }
}
