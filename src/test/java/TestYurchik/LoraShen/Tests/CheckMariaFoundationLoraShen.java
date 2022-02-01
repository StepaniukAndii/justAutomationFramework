package TestYurchik.LoraShen.Tests;

import TestAnton.Prom.HomePage.TestAddItemsToCart;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMariaFoundationLoraShen extends TestAddItemsToCart {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void mariaFoundation() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.keramikaDD().click();
        landingPageLoraShen.mariaFoundation().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("mareey"));
    }
}
