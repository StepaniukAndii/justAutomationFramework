package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckGarderobVazLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void GarderobVaz() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.keramikaDD().click();
        landingPageLoraShen.garderobVaz().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("spirit"));
    }
}
