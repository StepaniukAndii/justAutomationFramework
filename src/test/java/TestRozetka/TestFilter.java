package TestRozetka;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestFilter extends TestInit {
    @Test
    public void testFilterRozetka() {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        driver.manage().window().maximize();
        homePageRozetka.productCatalog().click();
        moveMouseToElement(homePageRozetka.filterGamer());
        homePageRozetka.getPhoneProductCatalog().click();
        sleep(10);
        for (int i=3;i<homePageRozetka.getAllCheckBox().size();i++) {
           homePageRozetka.getAllCheckBox().get(i).click();
        }
    }
}
