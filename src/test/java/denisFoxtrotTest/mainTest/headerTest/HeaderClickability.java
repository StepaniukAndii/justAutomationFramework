package denisFoxtrotTest.mainTest.headerTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.HeaderFoxtrot;
import denisFoxtrotTest.pages.HomePageFoxtrot;
import org.testng.annotations.Test;

public class HeaderClickability extends TestInit {

    @Test
    public void headerClickability() {
        HeaderFoxtrot headerFoxtrot = new HeaderFoxtrot(driver);
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        headerFoxtrot.headerAdClick().click();
        headerFoxtrot.headerDailyProduct().click();
        int size = 0;
        for (int i = 0; i < 3; i++) {
            headerFoxtrot.headerTOPPropSalesAdresses().get(size).click();
            size++;
        }
        headerFoxtrot.headerForCustomers().click();
        driver.navigate().refresh();
        headerFoxtrot.headerContacts().click();
        driver.navigate().refresh();
        if (headerFoxtrot.headerLangUA().isSelected()) {
            headerFoxtrot.headerLangRU().click();
            headerFoxtrot.headerLangUA().click();
        } else {
            headerFoxtrot.headerLangUA().click();
            headerFoxtrot.headerLangRU().click();
        }
        headerFoxtrot.headerAuthPopUp().click();
        headerFoxtrot.popUpClose().get(0).click();
        headerFoxtrot.headerFoxtrot().click();
        headerFoxtrot.headerCompare().click();
        driver.navigate().refresh();
        headerFoxtrot.headerFavorite().click();
        driver.navigate().refresh();
        headerFoxtrot.headerRecieveBonus().click();
        driver.navigate().refresh();
        homePageFoxtrot.checkCart().click();
        driver.navigate().refresh();
        headerFoxtrot.headerBigSales().click();
        headerFoxtrot.headerAllSales().click();
    }
}