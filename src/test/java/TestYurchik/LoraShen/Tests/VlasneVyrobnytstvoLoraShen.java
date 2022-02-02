package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VlasneVyrobnytstvoLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void VlasneVyrobnytstvo() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.keramikaDD().click();
        landingPageLoraShen.vlastneVyrobnytstvoOrch().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("shop-orkhideynitsa/"));
    }
}
