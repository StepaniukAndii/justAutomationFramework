package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAromaLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    @Test
    public void DecorPresents() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.podarynkiTab().click();
        landingPageLoraShen.zhidkieDifuzori().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("zhidkie-diffuzoru"));
    }
}
