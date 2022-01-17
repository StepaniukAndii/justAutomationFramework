package AlyonaBoychuk.Test;

import AlyonaBoychuk.Page.HomePage;
import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TestTwo extends TestInit {
    @Test
    public void getUrllinkedin() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.linkedin.com/feed/");
        homePage.getButtonAgreeAndJoin();
        homePage.getButtonCookiePolicy();
        Assert.assertTrue(homePage.numberOfWindows());
    }

}
