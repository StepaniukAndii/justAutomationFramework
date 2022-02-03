package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckCareeraLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void kashpoDlyRoslin() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.careraFooterLoraShen().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("carera"));
    }
}
