package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestInit {

    @Test
    public void homePageTest(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        Assert.assertTrue(homePage.checkWebSite().isDisplayed());
    }
}
