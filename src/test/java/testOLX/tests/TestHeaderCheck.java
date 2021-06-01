package testOLX.tests;

import ClasesToAllUs.TestInit;
import testOLX.pages.HomePage;
import org.testng.annotations.Test;

public class TestHeaderCheck extends TestInit {

    @Test
    public void header() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.olx.ua/");
        homePage.olxLogo().click();
        homePage.changeLang().click();
        homePage.favorite().click();
        homePage.olxLogin().click();
        homePage.newPost().click();
    }
}
