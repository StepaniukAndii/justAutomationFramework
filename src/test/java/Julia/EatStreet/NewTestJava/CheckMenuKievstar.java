package Julia.EatStreet.NewTestJava;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.KievstarPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMenuKievstar extends TestInit {

    @Test
    public void checkLinkMenuKievstar(){
        KievstarPage kievstarPage = new KievstarPage(driver);
        openUrl("https://kyivstar.ua/");

        Assert.assertTrue(kievstarPage.menuLinkTariffs().isDisplayed());
        Assert.assertTrue(kievstarPage.menuLinkHomeInternet().get(0).isDisplayed());
        Assert.assertTrue(kievstarPage.menuLinkTV().get(0).isDisplayed());
        Assert.assertTrue(kievstarPage.menuLink4G().get(0).isDisplayed());
        Assert.assertTrue(kievstarPage.menuLinkForBisssnes().isDisplayed());
    }
}