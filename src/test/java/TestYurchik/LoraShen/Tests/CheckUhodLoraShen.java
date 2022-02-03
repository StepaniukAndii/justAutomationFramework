package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUhodLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void kashpoDlyRoslin() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.uhodFooterLoraShen().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("rekomendasii-po"));
    }
}
