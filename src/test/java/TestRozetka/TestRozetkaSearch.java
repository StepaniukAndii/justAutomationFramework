package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class TestRozetkaSearch extends TestInit {

    @Test
    public void testRozetkaSearch() {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.searchField().click();
        homePage.searchField().sendKeys(homePage.gools);
        homePage.getButtonFild().click();
        List<String> elements = getAttributeCollection(homePage.getElementsRefrigerator(), "title");
        for (String element : elements) {
            if (!element.contains("Холодильник")) {
                Assert.fail();
            }
        }
    }
}
