package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiveToWomanLoraShen extends TestInit {

    LandingPageLoraShen landingPageLoraShen;

    @Test
    public void CheckWomanBucket() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.womanGive().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("jenskaya-kollektsiya"));
    }
}
