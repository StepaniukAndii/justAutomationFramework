package TestAnton;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeLanguage extends TestInit {
    
    @Test
    public void testChangeLanguage(){
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.languageWindow().click();
        homePage.textUALanguage().click();
        Assert.assertTrue(homePage.wordCartOnUA().getText().contains("Кошик"));
        homePage.languageWindow().click();
        homePage.textRULanguage().click();
        Assert.assertTrue(homePage.wordCartOnRU().getText().contains("Корзина"));
    }
}
