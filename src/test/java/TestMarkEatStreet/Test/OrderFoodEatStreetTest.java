package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.*;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderFoodEatStreetTest extends TestInit{

    Header header;
    Body body;
    DriverPage driverPage;
    RestorauntsPage restorauntsPage;
    PizzaCompanyFoodPage pizzaCompanyFoodPage;

    @Test
    public void orderfood(){

        header = new Header(driver);
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        restorauntsPage = new RestorauntsPage(driver);
        pizzaCompanyFoodPage = new PizzaCompanyFoodPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        body.deliveybtn().click();
        body.enteryouraddressinput().sendKeys("Las Vegas NV");
        body.lasvegasselect().click();
//        restorauntsPage.entermyaddressnowbtn().click();
        body.getfedbtn().click();
        driverPage.gotitbtn().click();
        restorauntsPage.ratingbtn().click();
        restorauntsPage.italianfoodselect().click();
        restorauntsPage.pizzacompanyhref().click();
        pizzaCompanyFoodPage.cheesygarlicbreadfood().click();
        pizzaCompanyFoodPage.addfoodbtn().click();
        pizzaCompanyFoodPage.addfoodtocartbtn().click();
        pizzaCompanyFoodPage.caesarsaladfood().click();
        pizzaCompanyFoodPage.ceasarsaladselectsizedroplist().click();
        pizzaCompanyFoodPage.ceasarsaladselectlargesize().click();
        pizzaCompanyFoodPage.ceasarsaladchoiceofdressingitalian().click();
        pizzaCompanyFoodPage.addfoodtocartbtn().click();
        pizzaCompanyFoodPage.cheeseburgerfood().click();
        pizzaCompanyFoodPage.cheeseburgercookstylemediumwell().click();
        pizzaCompanyFoodPage.cheeseburgerchoiceofside().click();
        pizzaCompanyFoodPage.addfoodtocartbtn().click();
        Assert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'widget-body')]")).size()!=0);
    }

}
