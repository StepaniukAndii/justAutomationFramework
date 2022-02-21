package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EnterEmailFailTest extends TestInit{
    DriverPage driverPage;
    Body body;
    @Test
    public void enteremailfail(){
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        body.enteremailfailinput().click();
        body.enteremailfailinput().sendKeys("1234");
        body.signupemailfailbtn().click();
        Assert.assertTrue(driver.findElements(By.xpath("//a[contains(@id,'confirm')]")).isEmpty());
    }
}
