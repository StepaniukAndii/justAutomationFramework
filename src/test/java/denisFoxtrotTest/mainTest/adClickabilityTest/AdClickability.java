package denisFoxtrotTest.mainTest.adClickabilityTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.HeaderFoxtrot;
import denisFoxtrotTest.pages.HomePageFoxtrot;
import org.testng.annotations.Test;

import java.awt.*;

public class AdClickability extends TestInit {

    @Test
    public void adClickability() throws AWTException {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        HeaderFoxtrot headerFoxtrot = new HeaderFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        headerFoxtrot.headerAdClick().click();
        driver.navigate().back();
        Robot robot = new Robot();
        robot.mouseWheel(32);
        homePageFoxtrot.adPicClick().click();
        driver.navigate().back();
        robot.mouseMove(140, 265);
        sleep(1);
        robot.mouseMove(140, 330);
        headerFoxtrot.headerAdClick().click();
        driver.navigate().back();
        homePageFoxtrot.getSearch().sendKeys("Смартфони\n");
        homePageFoxtrot.adCarouselClick().click();
        driver.navigate().back();
        homePageFoxtrot.adCarouselNext().click();
        homePageFoxtrot.adCarouselClick().click();
    }
}
