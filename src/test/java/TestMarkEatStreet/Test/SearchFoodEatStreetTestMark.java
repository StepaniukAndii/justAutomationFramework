package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchFoodEatStreetTestMark extends TestInit{
    Header header;
    Body body;
    DriverPage driverPage;

    @Test
    public void partnerTest() {
        header = new Header(driver);
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        header.partnerBtn().click();
        driverPage.gotitbtn().click();
        body.applybtn().click();
        driverPage.searchfoodname().sendKeys("burger");
        driverPage.enteryouraddressbtn().sendKeys("Las Vegas");
        driverPage.lasvegasbtn().click();
        Boolean wait = new WebDriverWait(driver, 5).
                until(ExpectedConditions.urlToBe("https://qa2.eatstreet.com/las-vegas-nv/restaurants?espPageNumber=1"));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://qa2.eatstreet.com/las-vegas-nv/"));
    }
}
