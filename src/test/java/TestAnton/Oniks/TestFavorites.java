package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestFavorites extends TestInit {
    @Test
    public void testFavorites() {
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.searchField().click();
        homePage.searchFieldLong().sendKeys("Кольцо");
        enter();
        homePage.itemsRings().get(1).click();
        homePage.addToFavoriteBtn().click();
        homePage.goToFavoriteBtn().click();
        homePage.deleteFromFavoriteBtn().click();
        homePage.textListEmpty().getText().contains("Список избранных товаров пуст");
    }
}
