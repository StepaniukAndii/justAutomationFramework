package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSeasonSummerLoraShen extends TestInit {

    LandingPageLoraShen landingPageLoraShen;

    @Test
    public void checkSummerSeason() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.sCollectionSumeer().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("letnyaya-kollektsiya"));
    }
}
