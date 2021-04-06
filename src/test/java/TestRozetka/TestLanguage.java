package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePageRozetka;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class TestLanguage extends TestInit {
    @Test
    public void testLanguage() {
        HomePageRozetka homePage = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePage.getLanguageRU().click();
        List<String> list = new LinkedList<>();

        for (WebElement element : homePage.getTextOnPage()) {
            list.add(element.getText());
        }
        for (String str: list) {
            if (str.contains("ы")) {
                Assert.fail();
            }
        }
    }
}
