package TestAnton;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContextMenu extends TestInit {

    @Test
    public void testContextMenu() {
        OniksPage homePage = new OniksPage(driver);
        driver.get("https://oniks.ua");
        homePage.contextMenuOnHomePage().get(10).click();
        homePage.collectionItems().get(0).click();
        Assert.assertEquals(homePage.itemsWithAmethyst().size(), 30);
        homePage.plusSomeItemsBtn().click();
        sleep(1);
        Assert.assertEquals(homePage.itemsWithAmethyst().size(), 60);
    }
}
