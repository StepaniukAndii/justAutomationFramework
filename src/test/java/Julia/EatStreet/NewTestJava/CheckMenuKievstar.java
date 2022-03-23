package Julia.EatStreet.NewTestJava;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.KievstarPage;
import org.openqa.selenium.JavascriptExecutor;
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

    @Test
    public void checkTefoniaKievstar(){
        KievstarPage kievstarPage = new KievstarPage(driver);
        openUrl("https://kyivstar.ua/");
        kievstarPage.buttonSelectCity().click();
        kievstarPage.linkDergavniySektor().click();
        kievstarPage.btnTelefonia().get(2).click();
        kievstarPage.btnVirtualAts().click();
        kievstarPage.btnZamovitySms().click();
        kievstarPage.btnZamovity().click();
        kievstarPage.fieldName().get(0).sendKeys("Mary");
        kievstarPage.fieldName().get(1).sendKeys("mary@gmail.com");
        sleep(3);
        kievstarPage.fieldPhone().click();
        kievstarPage.fieldPhone().sendKeys("250561202");
        kievstarPage.closeWindow().click();

        Assert.assertTrue(kievstarPage.logoAtc().isDisplayed());
        Assert.assertTrue(kievstarPage.btnZamovity().isDisplayed());
    }

    @Test
    public void checkTarifKievstar() {
        KievstarPage kievstarPage = new KievstarPage(driver);
        openUrl("https://kyivstar.ua/");
        kievstarPage.buttonSelectCity().click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");

        kievstarPage.btnPidcluchity().get(2).click();
        kievstarPage.rbtnCoristyetesKievstar().click();
        kievstarPage.btnWantNumber().click();
        kievstarPage.btnFindShop().get(0).click();

        Assert.assertTrue(kievstarPage.linkShopKievstar().isDisplayed());
    }
}