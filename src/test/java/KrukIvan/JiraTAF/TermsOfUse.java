package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TermsOfUse extends TestInit {
    @Test
    public void termsOfUse(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.termsOfUse().click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"widget-header widget-header--checkout\"]")).isDisplayed());
    }
}
