package Julia.EatStreet.NewTestJava;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.KievstarPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMenuKievstar extends TestInit {

    @Test
    public void checkLinkMenuKievstar() {
        KievstarPage kievstarPage = new KievstarPage(driver);
        openUrl("https://kyivstar.ua/");

        Assert.assertTrue(kievstarPage.menuLinkTariffs().isDisplayed());
        Assert.assertTrue(kievstarPage.menuLinkHomeInternet().get(0).isDisplayed());
        Assert.assertTrue(kievstarPage.menuLinkTV().get(0).isDisplayed());
        Assert.assertTrue(kievstarPage.menuLink4G().get(0).isDisplayed());
        Assert.assertTrue(kievstarPage.menuLinkForBisssnes().isDisplayed());
    }


    @Test
    public void checkShopKievstar() {
        KievstarPage kievstarPage = new KievstarPage(driver);
        openUrl("https://kyivstar.ua/");
        kievstarPage.buttonSelectCity().click();
        kievstarPage.menuLink().click();
        ShopKievstarPage shopKievstarPage = new ShopKievstarPage(driver);
        shopKievstarPage.clickLinkPhone().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("phones"));
    }

    @Test
    public  void checTVKievstar(){
        KievstarPage kievstarPage = new KievstarPage(driver);
        openUrl("https://kyivstar.ua/");
        kievstarPage.btnTV().click();
        kievstarPage.btnApp().click();
        kievstarPage.btnSelectTariff().get(0).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("tv"));
    }

}