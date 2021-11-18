package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.AllRestsPage;
import Svetlana.EatstreetPage.HomePage;
import Svetlana.EatstreetPage.MenuPage;
import Svetlana.EatstreetPage.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrationPositivTestNY extends TestInit {
    @Test
    public void filtrationPositivTestNY(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getFedBtn().click();
        homePage.getAddressInput().sendKeys("New York");
        homePage.checkPopup();
        homePage.getFedBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.pressGoItBtn().click();
        AllRestsPage allRestsPage=new AllRestsPage(driver);
        allRestsPage.selectCategoryVegetarian().get(0).click();
        MenuPage menuPage=new MenuPage(driver);
        Assert.assertTrue(menuPage.checkVegetarianBtn().isDisplayed());
    }
}


