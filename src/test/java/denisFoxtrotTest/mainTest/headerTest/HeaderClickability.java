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
        homePageFoxtrot.headerDailyProduct().click();
        int size = 0;
        for (int i = 0; i < 3; i++) {
            homePageFoxtrot.headerTOPPropSalesAdresses().get(size).click();
            size++;
        }
        homePageFoxtrot.headerForCustomers().click();
        driver.navigate().refresh();
        homePageFoxtrot.headerContacts().click();
        driver.navigate().refresh();
        if (homePageFoxtrot.headerLangUA().isSelected()) {
            homePageFoxtrot.headerLangRU().click();
            homePageFoxtrot.headerLangUA().click();
        } else {
            homePageFoxtrot.headerLangUA().click();
            homePageFoxtrot.headerLangRU().click();
        }
        homePageFoxtrot.headerAuthPopUp().click();
        homePageFoxtrot.popUpClose().get(0).click();
        homePageFoxtrot.headerFoxtrot().click();
        homePageFoxtrot.headerCompare().click();
        driver.navigate().refresh();
        homePageFoxtrot.headerFavorite().click();
        driver.navigate().refresh();
        homePageFoxtrot.headerRecieveBonus().click();
        driver.navigate().refresh();
        homePageFoxtrot.checkCart().click();
        driver.navigate().refresh();
        homePageFoxtrot.headerBigSales().click();
        homePageFoxtrot.headerAllSales().click();
    }
}