package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePageRozetka;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class TestRozetkaSearch extends TestInit {

    @Test
    public void testRozetkaSearch() {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.searchFild().click();
        homePageRozetka.searchFild().sendKeys(homePageRozetka.gools);
        homePageRozetka.getButtonFild().click();
        List<String> elements = getAttributeCollection(homePageRozetka.getElementsRefrigerator(), "title");
        for (String element : elements) {
            if (!element.contains("Холодильник")) {
                Assert.fail();
            }
        }
    }
}