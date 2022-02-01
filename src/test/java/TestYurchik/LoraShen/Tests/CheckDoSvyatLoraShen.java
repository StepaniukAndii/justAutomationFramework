package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDoSvyatLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void doSvyatLora() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.podarynkiTab().click();
        landingPageLoraShen.blackFridayLoraShen().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("black-friday"));
    }
}
