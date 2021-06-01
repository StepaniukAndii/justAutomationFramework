package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testOLX.pages.HomePage;
import testOLX.pages.ProductPage;

import java.awt.*;

public class TestAddToFavorite extends TestInit {

    @Test
    public void addToFavorite() throws AWTException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        openUrl("https://www.olx.ua/");
        Robot robot = new Robot();
        homePage.closeCookies().click();
        homePage.searchHeader().sendKeys("Смартфони\n");
        productPage.addToFavorite().click();
        sleep(1);
        homePage.loginAuthClose().click();
        robot.mouseWheel(-30);
        homePage.favoriteActive().click();
    }
}
