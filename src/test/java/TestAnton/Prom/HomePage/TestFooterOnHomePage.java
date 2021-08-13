package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFooterOnHomePage extends TestInit {

    @Test
    public void testFooterOnHomePage() {
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        Assert.assertEquals(homePage.getBuyersText().getText(), "Покупцям");
        Assert.assertEquals(homePage.getSellersText().getText(), "Продавцям");
        Assert.assertEquals(homePage.getAboutUsText().getText(), "Про нас");
        Assert.assertEquals(homePage.getPartnersText().getText(), "Партнери");
        homePage.getAndroidAppFooterHomePage().isDisplayed();
        homePage.getAppleAppFooterHomePage().isDisplayed();
        homePage.getHuaweiAppFooterHomePage().isDisplayed();
        homePage.getYoutubeFooterHomePage().isDisplayed();
        homePage.getFacebookFooterHomePage().isDisplayed();
    }
}
