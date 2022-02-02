package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDayOfAllLoveLoraShen extends TestInit {

    LandingPageLoraShen landingPageLoraShen;

    @Test
    public void dayOfLove() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.loveDayFlora().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("shop-den-vlyublennyih"));
    }
}
