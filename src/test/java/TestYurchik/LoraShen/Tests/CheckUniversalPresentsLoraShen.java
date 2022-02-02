package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUniversalPresentsLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void checkUniversalPresents() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.podarynkiTab().click();
        landingPageLoraShen.candlesTab().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("svechi"));
    }
}
