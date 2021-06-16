package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testOLX.pages.HomePage;
import testOLX.pages.ProductPage;

import java.awt.*;
import java.util.Random;

public class TestSearch extends TestInit {

    @Test
    public void search() throws AWTException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        openUrl("https://www.olx.ua/");
        homePage.closeCookies().click();
        homePage.searchHeader().sendKeys("Холодильники\n");
        productCheck();
        productPage.searchInside().sendKeys("хОЛОДИЛЬНИКИ\n\n");
        productCheck();
        productPage.searchInside().sendKeys("Хлодильники\n\n");
        productCheck();
        productPage.searchInside().sendKeys("Х%лодильник\n\n");
        productCheck();
    }

    void productCheck() throws AWTException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        Random rand = new Random();
        int upperbound = 4;
        int merchAdd = rand.nextInt(upperbound);
        driver.navigate().refresh();
        Robot robot = new Robot();
        robot.mouseWheel(30);
        sleep(2);
        productPage.offers().get(merchAdd).click();
        if (productPage.path().getText().contains("Холодильники")) {
            System.out.println("Required product was found.");
            driver.navigate().back();
            productPage.clearSearch().click();
        } else {
            System.out.println("There's a conflict.");
            driver.navigate().back();
            productPage.clearSearch().click();
        }
    }
}
