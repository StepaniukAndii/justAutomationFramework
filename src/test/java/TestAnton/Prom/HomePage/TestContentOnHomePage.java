package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContentOnHomePage extends TestInit {

    @Test
    public void testContentOnHomePage() {
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        Assert.assertEquals(homePage.getNowPopularText().getText(), "Зараз популярно");
        Assert.assertEquals(homePage.getSpecialForYouText().getText(), "Спеціально для вас");
        Assert.assertEquals(homePage.getWhatLookingText().getText(), "Що шукають");
    }
}