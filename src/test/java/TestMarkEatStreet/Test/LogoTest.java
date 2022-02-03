package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Header;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoTest extends TestInit {
    Header header;
    @Test
    public void logoTest(){
        header = new Header(driver);
        openUrl("https://qa2.eatstreet.com/signin");
        header.logoBtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://qa2.eatstreet.com/"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa2.eatstreet.com/");
    }
}