package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckRoslinyLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void roslyniLoraShen() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.rasteniyaLoraShen().click();
        landingPageLoraShen.orkhideyaRoslinyLoraShen().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("shop-orkhidei/"));
    }
}
