package TestAnton;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestSearch extends TestInit {
    @Test
    public void testSearch() {
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.searchField().click();
        homePage.searchFieldLong().sendKeys("Кольцо");
        enter();
        homePage.backOnHomePageButton().click();
    }
}
