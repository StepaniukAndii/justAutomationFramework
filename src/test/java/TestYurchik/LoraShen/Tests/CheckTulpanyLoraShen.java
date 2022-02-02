package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTulpanyLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;

    @Test
    public void checkTulpany(){
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTulpany().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://lorashen.ua/shop-kollektsiya-tulpanov/");
    }
}
