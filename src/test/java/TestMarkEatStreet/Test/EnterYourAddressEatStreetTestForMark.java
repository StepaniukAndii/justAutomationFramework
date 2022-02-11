package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.*;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import org.testng.annotations.Test;

public class EnterYourAddressEatStreetTestForMark extends TestInit {

    Header header;
    Body body;
    DriverPage driverPage;
    RestorauntsPage restorauntsPage;
    PizzaCompanyFoodPage pizzaCompanyFoodPage;

    @Test
    public void enteryouraddres(){

        header = new Header(driver);
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        restorauntsPage = new RestorauntsPage(driver);
        pizzaCompanyFoodPage = new PizzaCompanyFoodPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        body.deliveybtn().click();

        body.enteryouraddressinput().sendKeys("Las Vegas");
        body.getfedbtn().click();
        restorauntsPage.ratingbtn().click();
        restorauntsPage.italianfoodselect().click();
        driverPage.gotitbtn().click();
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
    }
}
