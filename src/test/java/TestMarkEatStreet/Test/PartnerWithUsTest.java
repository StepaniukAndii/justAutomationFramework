package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PartnerWithUsTest extends TestInit {
 Header header;
 Body body;
 DriverPage driverPage;
 @Test
    public void partnerTest(){
    header = new Header(driver);
    body = new Body(driver);
    driverPage = new DriverPage(driver);
    openUrl("https://qa2.eatstreet.com/");
    header.partnerBtn().click();
    body.applybtn().click();
    driverPage.applyinyourcitybtn().click();
    driverPage.deliverydriveramesbtn().click();
     Assert.assertTrue(driver.getCurrentUrl().contains("ames-ia"));
 }

}
