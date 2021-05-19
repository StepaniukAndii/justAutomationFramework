package denisFoxtrotTest.mainTest.headerTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.HomePageFoxtrot;
import org.testng.annotations.Test;

public class HeaderClickability extends TestInit {

    @Test
    public void headerClickability() {
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        homePageFoxtrot.adClick().click();
        sleep(1);
        homePageFoxtrot.headerDailyProduct().click();
        sleep(1);
        int size = 0;
        for (int i = 0; i < 3; i++) {
            homePageFoxtrot.headerTOPPropSalesAdresses().get(size).click();
            sleep(1);
            size++;
        }
        homePageFoxtrot.headerForCustomers().click();
        sleep(1);
        driver.navigate().refresh();
        homePageFoxtrot.headerContacts().click();
        sleep(1);
        driver.navigate().refresh();
        if (homePageFoxtrot.headerLangUA().isSelected()) {
            homePageFoxtrot.headerLangRU().click();
            sleep(1);
            homePageFoxtrot.headerLangUA().click();
            sleep(1);
        } else {
            homePageFoxtrot.headerLangUA().click();
            sleep(1);
            homePageFoxtrot.headerLangRU().click();
            sleep(1);
        }
        homePageFoxtrot.headerAuthPopUp().click();
        sleep(1);
        homePageFoxtrot.popUpClose().get(0).click();
        sleep(1);
        homePageFoxtrot.headerFoxtrot().click();
        sleep(1);
        homePageFoxtrot.headerCompare().click();
        sleep(1);
        driver.navigate().refresh();
        homePageFoxtrot.headerFavorite().click();
        sleep(1);
        driver.navigate().refresh();
        homePageFoxtrot.headerRecieveBonus().click();
        sleep(1);
        driver.navigate().refresh();
        homePageFoxtrot.checkCart().click();
        sleep(1);
        driver.navigate().refresh();
        homePageFoxtrot.headerBigSales().click();
        sleep(1);
        homePageFoxtrot.headerAllSales().click();
        sleep(1);
    }
}