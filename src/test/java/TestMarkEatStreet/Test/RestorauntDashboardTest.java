package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Footer;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RestorauntDashboardTest extends TestInit{
    Footer footer;
    DriverPage driverPage;
    @Test
    public void restorauntsdashboard(){
        footer = new Footer(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        footer.restorauntsdashboardbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://qa2.eatstreet.com/restaurant-dashboard/signin?next=support"));
        Assert.assertTrue(driver.getCurrentUrl().contains("/restaurant-dashboard/"));
    }
}
