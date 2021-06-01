package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testOLX.pages.HomePage;

import java.awt.*;
import java.util.Random;

public class TestSearch extends TestInit {

    @Test
    public void search() throws AWTException {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.olx.ua/");
        homePage.closeCookies().click();
        homePage.searchHeader().sendKeys("Холодильники\n");
        productCheck();
        homePage.searchInside().sendKeys("хОЛОДИЛЬНИКИ\n\n");
        productCheck();
        homePage.searchInside().sendKeys("Хлодильники\n\n");
        productCheck();
        homePage.searchInside().sendKeys("Х%лодильник\n\n");
        productCheck();
    }

    void productCheck() throws AWTException {
        HomePage homePage = new HomePage(driver);
        Random rand = new Random();
        int upperbound = 4;
        int merchAdd = rand.nextInt(upperbound);
        driver.navigate().refresh();
        Robot robot = new Robot();
        robot.mouseWheel(30);
        sleep(2);
        homePage.topOffers().get(merchAdd).click();
        if (homePage.path().getText().contains("Холодильники")) {
            System.out.println("Required product was found.");
            driver.navigate().back();
            homePage.clearSearch().click();
        } else {
            System.out.println("There's a conflict.");
            driver.navigate().back();
            homePage.clearSearch().click();
        }
    }
}
