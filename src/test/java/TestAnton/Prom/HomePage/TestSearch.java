package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends TestInit {

    @Test
    public void testSearch() {
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.getSearchHomePage().click();
        homePage.getSearchHomePage().sendKeys("неокуб");
        homePage.getSearchBtn().click();
        Assert.assertEquals(homePage.getNameGoods().getText(), "«неокуб»");
    }
}
