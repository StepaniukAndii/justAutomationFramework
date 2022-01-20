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

    @Test
    public void gamanec(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonOplata().click();
        sleep(5);
        homePage.getButtonGamanec().click();
        Assert.assertTrue(homePage.isDisplayedPlayMarket());
    }
    @Test
    public void beskoshtovniyPaket(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonBeskoshtovniyPaket().click();
        Assert.assertTrue(homePage.isDisplayedPromo());
    }
   @Test
    public void dogovir(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonDogovir().click();
        Assert.assertTrue(homePage.isDisplayedOsnovniPonyattya());
   }
   @Test
    public void gepon(){
        HomePage homePage = new HomePage(driver);
        openUrl("http://bestline.net.ua/");
        homePage.getButtonGepon().click();
        homePage.getButtonGeponClick().click();
        Assert.assertTrue(homePage.isDisplayedVikipediya());
   }

   @Test
    public void w3school(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.w3schools.com/");
        homePage.getIconHeder().click();
        Assert.assertTrue(homePage.isDisplayed());
   }

   @Test
    public void loginIn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.w3schools.com/");
        homePage.getButtonLoginIn().click();
        homePage.getButtonShow().click();
        homePage.getButtonLogin().click();
        Assert.assertTrue(homePage.isDisplayedForGot());
   }
}
