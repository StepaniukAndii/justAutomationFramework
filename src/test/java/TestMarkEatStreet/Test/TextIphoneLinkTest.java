package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextIphoneLinkTest extends TestInit{
    DriverPage driverPage;
    Body body;
    @Test
    public void textiphonelink(){
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/get-the-app");
        driverPage.gotitbtn().click();
        body.textiphoneplinkbtn().click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Text iPhone')]")).isEnabled());
    }
}
