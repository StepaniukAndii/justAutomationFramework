package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class IOSApp extends TestInit {
    @Test
    public void getTheAppIOS(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.getTheAppIOS().click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//header[@class=\"product-header app-header product-header--padded-start\"]")).isDisplayed());
    }
}
