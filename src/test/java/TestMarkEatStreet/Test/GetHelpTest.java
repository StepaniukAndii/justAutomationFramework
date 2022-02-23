package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Footer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetHelpTest extends TestInit{
    Footer footer;
    DriverPage driverPage;
    @Test
    public void gethelp(){
        footer = new Footer(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        footer.footergethelpbtn().click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("support-request"));
    }
}
