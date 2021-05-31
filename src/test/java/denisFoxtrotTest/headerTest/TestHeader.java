package denisFoxtrotTest.headerTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.foxPages.HeaderPage;
import denisFoxtrotTest.foxPages.HomePageFoxtrot;
import org.testng.annotations.Test;

public class TestHeader extends TestInit {

    @Test
    public void header() {
        HeaderPage headerPage = new HeaderPage(driver);
        HomePageFoxtrot homePageFoxtrot = new HomePageFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        headerPage.foxtrot().click();
        headerPage.productOfDay().click();
        for (int i = 0; i < 3; i++) {
            headerPage.headerButtons().get(i).click();
        }
        int size = 1;
        for (int i = 0; i < 2; i++) {
            headerPage.headerChevrons().get(size).click();
            size++;
            driver.navigate().refresh();
        }
        if (headerPage.language().get(0).isSelected()) {
            headerPage.language().get(1).click();
        } else {
            headerPage.language().get(0).click();
        }
        headerPage.authPopUp().click();
        headerPage.popUpClose().click();
        headerPage.compare().click();
        driver.navigate().refresh();
        headerPage.favorite().click();
        driver.navigate().refresh();
        headerPage.bonus().click();
        driver.navigate().refresh();
        homePageFoxtrot.headerCart().click();
        driver.navigate().refresh();
        if (headerPage.catalogue().isDisplayed()) {
            System.out.println("catalogue is seen.");
        }
        int catalogue = 0;
        for (int i = 0; i <= 5; i++) {
            if (headerPage.catalogueCategories().get(catalogue).isDisplayed()) {
                String text = headerPage.catalogueCategories().get(catalogue).getText();
                System.out.println(text + " is seen");
                catalogue++;
            }
        }
        headerPage.sales().click();
        driver.navigate().refresh();
        headerPage.promo().click();
        driver.navigate().refresh();
    }
}
