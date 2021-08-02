package TestAnton;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterKindOfDecoration extends TestInit {

    @Test
    public void testFilterKindOfDecoration() {
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.contextMenuOnHomePage().get(10).click();
        homePage.allCollectionBtn().click();
        homePage.filterKindOfDecorationBtn().click();
        homePage.filterBraceletesInCollections().click();
        homePage.showBtn().click();
        Assert.assertEquals(homePage.itemsBracelets().size(), 30);
    }
}
