package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextAndroidLinkTest extends TestInit{
    DriverPage driverPage;
    Body body;
    @Test
    public void textandroidlink(){
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/get-the-app");
        driverPage.gotitbtn().click();
        body.textandroinlinkbtn().click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Text And')]")).isEnabled());
    }

}
