package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.*;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCartEatStreetTest extends TestInit{

    Header header;
    Body body;
    DriverPage driverPage;
    RestorauntsPage restorauntsPage;
    FreshKabobFoodPage freshKabobFoodPage;

    @Test
    public void cartfunctional(){

        header = new Header(driver);
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        restorauntsPage = new RestorauntsPage(driver);
        freshKabobFoodPage = new FreshKabobFoodPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        body.takeoutbtn().click();
        body.enteryouraddressinput().sendKeys("Las Vegas NV");
        body.lasvegasselect().click();
        body.getfedbtn().click();
        driverPage.gotitbtn().click();
        restorauntsPage.freshkabobrestoraunt().click();
        freshKabobFoodPage.grilledsalmonfood().click();
        freshKabobFoodPage.addtocartbtn().click();
        freshKabobFoodPage.grilledchickensandwichfood().click();
        freshKabobFoodPage.addtocartbtn().click();
        freshKabobFoodPage.removegrilledchickensandwichbtn().click();
        Assert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'widget-body')]")).size()!=0);
    }
}
