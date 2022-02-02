package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutCompanyLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void kashpoDlyRoslin() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.aboutCompanyLoraShen().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));
    }
}
