package TestRozetka;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestFilter extends TestInit {
    @Test
    public void testFilterRozetka() {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.productCatalog().click();
        moveMouseToElement(homePageRozetka.getPhoneProductCatalog());
        homePageRozetka.getPhone().click();
        homePageRozetka.getCheckBoxApple().click();
    }
}
