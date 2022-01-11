package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrivacyPolicy extends TestInit {
    @Test
    public void privacyPolicy() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.bTNPrivacyPolicy().click();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class=\"page-title page-title--dashed\"]")).isDisplayed());
    }
}
