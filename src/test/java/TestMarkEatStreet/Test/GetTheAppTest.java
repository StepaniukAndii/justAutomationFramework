package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTheAppTest extends TestInit{
    Body body;
    DriverPage driverPage;
    @Test
    public void gettheapp(){
        driverPage = new DriverPage(driver);
        body = new Body(driver);
        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        body.gettheappbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://qa2.eatstreet.com/get-the-app"));
        Assert.assertTrue(driver.getCurrentUrl().contains("get-the-app"));
    }
 }

