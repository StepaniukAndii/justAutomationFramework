package AlyonaBoychuk.Test;
import AlyonaBoychuk.Page.HomePage;
import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.testng.annotations.Test;

public class PulReqwest extends TestInit {
    @Test
    public void checkBestLineKabinet() {
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonKabinet().click();
        Assert.assertTrue(homePage.isDisplayedPlatagi());
        Assert.assertTrue(homePage.isDisplayedPopovnytyRahunok());
        Assert.assertTrue(homePage.isDisplayedTymchasovyyPlatig());
    }

    @Test
    public void checkBestLineButtonTaryfy(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonTaryfy().click();
        homePage.getButtonBagatopoverhivky().click();
        Assert.assertTrue(homePage.isDisplayedBeskoshtovnyiPaket());
    }

    @Test
    public void checkButtonPrivatniySector(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonTaryfy().click();
        homePage.getButtonPrivatniySector().click();
        Assert.assertTrue(homePage.isDisplayedBezlim190());
        Assert.assertTrue(homePage.isDisplayedBezlim260());
        Assert.assertTrue(homePage.isDisplayedBezlim350());

    }

    @Test
    public void checkIPTV(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonIPTV().click();
        homePage.getButtonPorivnyannya().click();
        Assert.assertTrue(homePage.isDisplayed4());

    }

    @Test
    public void checkOplata(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonOplata().click();
        homePage.getButtonZnachennya().click();
        homePage.getButtonClick().click();
        Assert.assertTrue(homePage.isDisplayedOplata());

    }

    @Test
    public void plategiSingIn(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonOplata().click();
        homePage.getButtonSingIn().click();
        Assert.assertTrue(homePage.isDisplayedGo());
    }
}
