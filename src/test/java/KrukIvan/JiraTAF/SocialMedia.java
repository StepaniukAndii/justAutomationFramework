package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SocialMedia extends TestInit {
    @Test
    public void instLink(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.socialMediaInst().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(driver.findElement(By.xpath("//section[@class=\"zwlfE\"]")).isDisplayed());
    }
    @Test
    public void facebookLink(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.socialMediaFacebook().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"_19sz\"]")).isDisplayed());
    }
@Test
    public void twitterLink(){
    HomePage homePage = new HomePage(driver);
    openUrl("https://qa2.eatstreet.com/");
    homePage.clickButtonGotIt().click();
    homePage.socialMediaTwitter().click();
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    Assert.assertTrue(homePage.assertTwitter().isDisplayed());
}
}
