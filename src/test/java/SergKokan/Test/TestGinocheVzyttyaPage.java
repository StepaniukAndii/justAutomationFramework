package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.BosonogkiPage;
import SergKokan.Page.HeaderLinkPPage.Jenskaya;
import SergKokan.Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGinocheVzyttyaPage extends TestInit {
    @Test
    public void BosonogkiPage (){
        HomePage homePage = new HomePage(driver);
        Jenskaya jenskaya = new Jenskaya(driver);
        BosonogkiPage bosonogkiPage = new BosonogkiPage(driver);
        homePage.navigatePrego();
        jenskaya.btnJenskaya().click();
        bosonogkiPage.btnBosonogki().click();
        Assert.assertTrue(bosonogkiPage.TextBosonogki().isDisplayed());

    }
}
