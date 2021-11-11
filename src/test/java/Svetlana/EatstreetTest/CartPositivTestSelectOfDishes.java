package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.*;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CartPositivTestSelectOfDishes extends TestInit {

    @Test
    public void cartPositivTestSelectOfDishes(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getFedBtn().click();
        homePage.getAddressInput().sendKeys("New York");
        homePage.checkPopup();
        homePage.getFedBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.pressGoItBtn().click();
        AllRestsPage allRestsPage=new AllRestsPage(driver);
        allRestsPage.getAllRests().get(0).click();
        MenuPage menuPage=new MenuPage(driver);
        menuPage.selectDishAllAboutIndianFood().get(27).click();
        CartPage cartPage=new CartPage(driver);
        cartPage.pressAddToCart().click();
        Assert.assertTrue(cartPage.checkCart().isDisplayed());
    }
}
