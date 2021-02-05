package TestRozetka;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestRozetkaSearch extends TestInit {

    @Test
    public void testRozetkaSearch() {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.searchFild().click();
        homePageRozetka.searchFild().sendKeys(homePageRozetka.gools);
        homePageRozetka.getButtonFild().click();
        homePageRozetka.checkCorrectElements();
    }
}
