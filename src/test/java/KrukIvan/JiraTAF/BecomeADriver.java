package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BecomeADriver extends TestInit {
    @Test
    public void becomeADriver(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.becomeADriverLink().get(1).click();
        sleep(3);
        Assert.assertTrue(driver.findElement(By.xpath("//h1[@class=\"header-large margin-bottom-20\"]")).isDisplayed());
    }
}
