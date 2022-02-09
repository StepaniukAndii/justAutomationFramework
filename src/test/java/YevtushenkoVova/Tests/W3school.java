package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class W3school extends TestInit {
    @Test

    public void tabs(){
        openUrl("https://www.w3schools.com/");
        HomePage homePage = new HomePage(driver);
        homePage.w3BtnJava().click();
        homePage.w3BtnSubmit().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        homePage.w3BtnHome().click();
        ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
        homePage.w3Website().click();
        ArrayList<String> tabs4 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(3));

        Assert.assertTrue(homePage.w3GetFree().isDisplayed());
    }
}
