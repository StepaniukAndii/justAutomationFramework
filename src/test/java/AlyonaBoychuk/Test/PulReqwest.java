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
}
