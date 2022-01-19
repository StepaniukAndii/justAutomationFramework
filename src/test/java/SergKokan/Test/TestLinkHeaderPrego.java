package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLinkHeaderPrego extends TestInit {

    @Test
    public void LinkDostavka(){
        HomePage homePage = new HomePage(driver);
        DostavkaPage dostavkaPage = new DostavkaPage(driver);
        homePage.navigatePrego();
        homePage.Dostavka().click();
        Assert.assertTrue(dostavkaPage.isDisplayedTextDostavka());
    }

    @Test
    public void LinkOplata(){
        HomePage homePage = new HomePage(driver);
        OplataPage oplataPage = new OplataPage(driver);
        homePage.navigatePrego();
        homePage.Oplata().click();
        Assert.assertTrue(oplataPage.isDisplayedTextOplata());
    }
    @Test
    public void LinkGarantiaVozvrat(){
        HomePage homePage = new HomePage(driver);
        GarantiaVozvratPage garantiaVozvratPage = new GarantiaVozvratPage(driver);
        homePage.navigatePrego();
        homePage.GarantiaVozvrat().click();
        Assert.assertTrue(garantiaVozvratPage.isDisplayedTexGarantiaVozvrat());

    }
    @Test
    public void LinkNashiMagaziny(){
        HomePage homePage = new HomePage(driver);
        NashiMagazinyPage nashiMagazinyPage = new NashiMagazinyPage(driver);
        homePage.navigatePrego();
        homePage.NashiMagaziny().click();
        Assert.assertTrue(nashiMagazinyPage.isDisplayedNashiMagazinyPage());
    }
}
