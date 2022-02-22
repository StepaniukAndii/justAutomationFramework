package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Footer;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GooglePlayTest extends TestInit{
    Footer footer;
    DriverPage driverPage;
    @Test
    public void googleplay(){
        footer = new Footer(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        footer.googleplaybtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://play.google.com/store/apps/details?id=com.eatstreet.android&hl=en"));
        Assert.assertTrue(driver.getCurrentUrl().contains("play.google.com"));
    }
}
