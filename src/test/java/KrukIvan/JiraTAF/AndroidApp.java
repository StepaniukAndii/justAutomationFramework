package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AndroidApp extends TestInit {
    @Test
    public void getTheAppAndroid(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.getTheAppAndroid().click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class=\"AHFaub\"]")).isDisplayed());
    }
}
