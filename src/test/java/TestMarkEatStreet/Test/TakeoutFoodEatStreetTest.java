package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.*;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TakeoutFoodEatStreetTest extends TestInit{

    Header header;
    Body body;
    DriverPage driverPage;
    RestorauntsPage restorauntsPage;
    NewYorkPizzaPastaPage newYorkPizzaPastaPage;

    @Test
    public void takeoutfood(){

        header = new Header(driver);
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        restorauntsPage = new RestorauntsPage(driver);
        newYorkPizzaPastaPage = new NewYorkPizzaPastaPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        body.takeoutbtn().click();
        body.enteryouraddressinput().sendKeys("Las Vegas NV");
        body.lasvegasselect().click();
        body.getfedbtn().click();
        driverPage.gotitbtn().click();
        restorauntsPage.ratingbtn().click();
        restorauntsPage.italianfoodselect().click();
        restorauntsPage.newyorkpizzapasta().click();
        newYorkPizzaPastaPage.chickenpizzapackfood().click();
        newYorkPizzaPastaPage.baconpizzatoppingsfullbtn().click();
        newYorkPizzaPastaPage.saucechoiceforwingsbbqbtn().click();
        newYorkPizzaPastaPage.onthesideplaceforsaucebtn().click();
        newYorkPizzaPastaPage.addfoodtothecartbtn().click();
        newYorkPizzaPastaPage.orderaheadfoodbtn().click();
        Assert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'widget-body')]")).size()!=0);
    }
}
