package TestRozetka;

import ClasesToAllUs.TestInit;
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
        List<String> elements = getAllElementsWithAttribute(homePageRozetka.getElementsRefrigerator(),"title");
        boolean result = false;
        for (String element : elements) {
            if (element.contains("Холодильник")) {
               result = true;
            } else {
                result=false;
                break;
            }
        }
        Assert.assertTrue(result);
    }
}
