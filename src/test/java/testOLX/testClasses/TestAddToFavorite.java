package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testOLX.pages.FavoritePage;
import testOLX.pages.HomePage;
import testOLX.pages.ProductPage;

import java.awt.*;
import java.util.Random;

public class TestAddToFavorite extends TestInit {

    @Test
    public void addToFavorite() throws AWTException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        FavoritePage favoritePage = new FavoritePage(driver);
        openUrl("https://www.olx.ua/");
        Robot robot = new Robot();
        Random rand = new Random();
        int upperbound = 5;
        int merchAdd = rand.nextInt(upperbound);
        homePage.closeCookies().click();
        homePage.searchHeader().sendKeys("Смартфони\n");
        productPage.addToFavorite().get(merchAdd).click();
        if (homePage.loginAuthClose().isDisplayed()) {
            homePage.loginAuthClose().click();
        }
        merchAdd++;
        productPage.offers().get(merchAdd).click();
        productPage.addToFavoriteInside().click();
        robot.mouseWheel(-30);
        productPage.favoritesInside().click();
        favoritePage.removeFromFavorite().get(0).click();
        favoritePage.clearAllFavorites().click();
        driver.switchTo().alert().accept();
    }
}
