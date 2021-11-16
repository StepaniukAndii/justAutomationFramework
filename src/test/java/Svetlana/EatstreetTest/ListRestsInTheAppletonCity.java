package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.AllRestsPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListRestsInTheAppletonCity extends TestInit {
    @Test
    public void listRestsInTheAppletonCity(){
       driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        homePage.getCity().get(108).click();
        sleep(2);
        AllRestsPage allRestsPage=new AllRestsPage(driver);
        allRestsPage.getOpenCoffeeAndTea().get(5).click();
        sleep(5);
        Assert.assertTrue(allRestsPage.checkCoffeeTea().isDisplayed());
    }
}
