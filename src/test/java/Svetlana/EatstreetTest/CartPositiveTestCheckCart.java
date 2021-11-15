package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPositiveTestCheckCart extends TestInit {
    @Test
    public void cartPositiveTestCheckCart(){
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getSignIn().click();
        SignInPage signInPage=new SignInPage(driver);
        signInPage.EnterEmail().sendKeys("prutasveta@gmail.com");
        signInPage.EnterPassword().sendKeys("centik-1234");
        signInPage.pressGoItBtn().click();
        signInPage.pressSignInBtn().click();
        sleep(3);
        homePage.getAddressInput().sendKeys("New York");
        homePage.getFedBtn().click();
        homePage.checkPopup();
        homePage.getFedBtn().click();
        AllRestsPage allRestsPage=new AllRestsPage(driver);
        allRestsPage.getAllRests().get(0).click();
        sleep(3);
        MenuPage menuPage=new MenuPage(driver);
        menuPage.selectDishAllAboutIndianFood().get(0).click();
        sleep(5);
        CartPage cartPage=new CartPage(driver);
        cartPage.pressAddToCart().click();
        menuPage.selectDishAllAboutIndianFood().get(47).click();
        sleep(5);
        menuPage.addQuantity().click();
        menuPage.addQuantity().click();
        cartPage.pressAddToCart().click();
        cartPage.pressOrderAheadBtn().click();
        homePage.returnToHomePage().click();
        cartPage.openCart().click();
        Assert.assertTrue(cartPage.checkCart().isDisplayed());
    }
}

