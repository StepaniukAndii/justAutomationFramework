package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.*;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CartNegTestCuponIsIncorrect extends TestInit {

    @Test
    public void cartNegTestCuponIsIncorrect() {
        driver.get("https://eatstreet.com");
        SignInPage signInPage = new SignInPage(driver);
        signInPage.pressGoItBtn().click();
        HomePage homePage = new HomePage(driver);
        homePage.pressRestBtn().click();
        CuisinePage cuisinePage = new CuisinePage(driver);
        cuisinePage.openRestaurants().click();
        AllRestsPage allRestsPage = new AllRestsPage(driver);
        allRestsPage.getTacoRoyale().click();
        sleep(5);
        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectMenuList().get(0).click();
        menuPage.selectADish().get(0).click();
        CartPage cartPage = new CartPage(driver);
        cartPage.pressAddToCart().click();
        cartPage.clickChekout().click();
        Assert.assertTrue(cartPage.checkValidationOrderDetails().isDisplayed());
    }

    @Test
    public void cartNegTestCuponIsIncorrectRoyalDeli() {
        driver.get("https://eatstreet.com");
        SignInPage signInPage = new SignInPage(driver);
        signInPage.pressGoItBtn().click();
        HomePage homePage = new HomePage(driver);
        homePage.pressRestBtn().click();
        CuisinePage cuisinePage = new CuisinePage(driver);
        cuisinePage.openRestaurants().click();
        AllRestsPage allRestsPage = new AllRestsPage(driver);
        allRestsPage.getRoyalDeli().click();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectMenuList().get(0).click();
        menuPage.selectADishRoyalDaly().get(0).click();
        CartPage cartPage = new CartPage(driver);
        cartPage.pressAddToCart().click();
        Assert.assertTrue(cartPage.checkValidationOrderDetails().isDisplayed());

    }
}
