package TestRozetka;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestFilter extends TestInit {
    @Test
    public void testFilterRozetka() {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.productCatalog().click();
        moveMouseToElement(homePageRozetka.filterGamer());
        homePageRozetka.getPhoneProductCatalog().click();
        sleep(5);
        for (int i=3;i<5;i++) {
           homePageRozetka.getAllCheckBox().get(i).click();
        }
    }
}
