package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.AllRestsPage;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectTheLastPageAndLastRest extends TestInit {

    @Test
    public void selectTheLastPageAndLastRest (){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        homePage.getAddressInput().sendKeys("New York");
        homePage.getFedBtn().click();
        homePage.checkPopup();
        homePage.getFedBtn().click();
        AllRestsPage allRestsPage=new AllRestsPage(driver);
        allRestsPage.getAllPageRests().get(allRestsPage.getAllPageRests().size()-1).click();
        allRestsPage.getAllRests().get(allRestsPage.getAllRests().size()-1).click();
        MenuPage menuPage=new MenuPage(driver);
        Assert.assertTrue(menuPage.checkMenubtn().isDisplayed();
    }
}
