package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OplateLoraShenFooter extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void oplateFooterLoraShen() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.oplateFooterloraShen().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("oplata"));
    }
}
