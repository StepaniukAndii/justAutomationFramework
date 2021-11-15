package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartNegTestMinSum extends TestInit {
    @Test
    public void cartNegTestMinSum(){
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
        sleep(3);
        MenuPage menuPage=new MenuPage(driver);
        menuPage.selectDishAllAboutIndianFood().get(0).click();
        CartPage cartPage=new CartPage(driver);
        cartPage.pressAddToCart().click();
        Assert.assertTrue(cartPage.checkOrderAmount().isDisplayed());
    }
}
