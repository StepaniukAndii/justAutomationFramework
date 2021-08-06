package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTextOnHomePage extends TestInit {
    @Test
    public void testTextOnHomePage() {
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        Assert.assertTrue(homePage.textBlog().getText().contains("Блог"));
        Assert.assertTrue(homePage.textReviews().getText().contains("Отзывы"));
        Assert.assertTrue(homePage.textOnlineJewelryStore().getText().contains("Интернет-магазин ювелирных изделий"));
        Assert.assertTrue(homePage.textSubscribeToOurInstagram().getText().contains("Подписывайтесь на наш Instagram:"));
    }

}
