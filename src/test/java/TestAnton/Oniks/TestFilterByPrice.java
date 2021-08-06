package TestAnton.Oniks;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterByPrice extends TestInit {

    @Test
    public void testFilterByPrice() {
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.contextMenuOnHomePage().get(0).click();
        homePage.priceBaseTo1000().click();
        for (WebElement element : homePage.ringsNewPrice()) {
            String str = element.getText();
            String[] arrayStrPrices = str.split(" ", 1);
            arrayStrPrices = str.split(" ");
            int price = Integer.parseInt(arrayStrPrices[0]);
            Assert.assertTrue(price < 1000);
        }
    }
}
