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
        homePageRozetka.filterGamer().click();
        homePageRozetka.getPhoneProductCatalog().click();
    }
}
