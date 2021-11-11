package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.AllRestsPage;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectTheLastRestInArizona extends TestInit {

    @Test
    public void selectTheLastRestInArizona (){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        homePage.getAddressInput().sendKeys("Arizona");
        homePage.getFedBtn().click();
        homePage.checkPopup();
        homePage.getFedBtn().click();
        AllRestsPage allRestsPage=new AllRestsPage(driver);
        allRestsPage.pressLoadMoreBtn().click();
        allRestsPage.getAllRests().get(0).click();
        MenuPage menuPage= new MenuPage(driver);
        Assert.assertTrue(menuPage.checkMenubtn().isDisplayed());
    }
}
