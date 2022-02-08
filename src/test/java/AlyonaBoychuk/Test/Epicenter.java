package AlyonaBoychuk.Test;

import AlyonaBoychuk.Page.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Epicenter extends TestInit {
    @Test
    public void search(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://epicentrk.ua/");
        homePage.getStringSearch().sendKeys("ваза" + "\n");
        homePage.getLinkVase().click();
        Assert.assertTrue(homePage.getButtonPay());

    }
    @Test
    public void productСatalog(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://epicentrk.ua/");
        homePage.getButtonProductCatalog().click();
        homePage.getButtonfurniture().click();
        homePage.getButtonTable().click();
        Assert.assertTrue(homePage.getButtonHelp());
    }

    @Test
    public void login() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://epicentrk.ua/");
        homePage.getButtonLoginOnSite().click();
        homePage.getButtonpasswordrecovery().click();
        Assert.assertTrue(homePage.getButtonfurther());

    }
    @Test
    public void basket(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://epicentrk.ua/");
        homePage.getButtonBasket().click();
        Assert.assertTrue(homePage.getButtonKiyv());

    }
    @Test
    public void cityChoice() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://epicentrk.ua/");
        homePage.getButtonCityChoice().click();
        homePage.getButtonRepair().click();
        homePage.getButtonGlye().click();
        homePage.getButtonGlyeFORTile().click();
        Assert.assertTrue(homePage.getButtonHardy());


    }
}
