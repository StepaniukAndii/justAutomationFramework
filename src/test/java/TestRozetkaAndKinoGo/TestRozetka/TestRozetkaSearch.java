package TestRozetkaAndKinoGo.TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetkaAndKinoGo.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class TestRozetkaSearch extends TestInit {

    @Test
    public void testRozetkaSearch() {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        HomePage homePageRozetka = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.searchField().click();
        homePageRozetka.searchField().sendKeys(homePageRozetka.gools);
        homePageRozetka.getButtonField().click();
        List<String> elements = getAttributeCollection(homePageRozetka.getElementsRefrigerator(), "title");
        for (String element : elements) {
            if (!element.contains("Холодильник")) {
                Assert.fail();
            }
        }
    }
}
