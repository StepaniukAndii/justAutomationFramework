package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DallasRestorauntsPage;
import TestMarkEatStreet.Page.DriverPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DallasRestorauntsEatStreetTest extends TestInit{

Body body;
DriverPage driverPage;
DallasRestorauntsPage dallasRestorauntsPage;
    @Test
    public void dallasrestoraunts(){

        body = new Body(driver);
        driverPage = new DriverPage(driver);
        dallasRestorauntsPage = new DallasRestorauntsPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        body.dallasbtn().click();
        dallasRestorauntsPage.viewallfastfoodoptionsbtn().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("/fast-food-delivery"));
    }
}
