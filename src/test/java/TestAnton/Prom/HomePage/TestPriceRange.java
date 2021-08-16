package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPriceRange extends TestInit {

    @Test
    public void testPriceRange(){
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.getSearchHomePage().sendKeys("неокуб\n");
        homePage.getPriceRangeFirstBlock().sendKeys("500");
        homePage.getPriceRangeSecondBlock().sendKeys("700");
        homePage.getPriceRangeOkBtn().click();
        sleep(1);
        for (WebElement element : homePage.getGoodsPrices()) {
            String strProductPrices = element.getText();
            String[] arrayStrPrices = strProductPrices.split(" ", 1);
            arrayStrPrices = strProductPrices.split(" ");
            float price = Float.parseFloat(arrayStrPrices[0]);
            Assert.assertTrue(price >= 500.00);
            Assert.assertTrue(price <= 700.00);
        }
    }
}
