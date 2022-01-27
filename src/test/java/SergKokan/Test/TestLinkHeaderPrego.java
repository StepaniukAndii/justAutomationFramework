package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLinkHeaderPrego extends TestInit {

    @Test
    public void LinkDostavka() {
        HomePage homePage = new HomePage(driver);
        DostavkaPage dostavkaPage = new DostavkaPage(driver);
        homePage.navigatePrego();
        homePage.Dostavka().click();
        Assert.assertTrue(dostavkaPage.isDisplayedTextDostavka());
    }

    @Test
    public void LinkOplata() {
        HomePage homePage = new HomePage(driver);
        OplataPage oplataPage = new OplataPage(driver);
        homePage.navigatePrego();
        homePage.Oplata().click();
        Assert.assertTrue(oplataPage.isDisplayedTextOplata());
    }

    @Test
    public void LinkGarantiaVozvrat() {
        HomePage homePage = new HomePage(driver);
        GarantiaVozvratPage garantiaVozvratPage = new GarantiaVozvratPage(driver);
        homePage.navigatePrego();
        homePage.GarantiaVozvrat().click();
        Assert.assertTrue(garantiaVozvratPage.isDisplayedTexGarantiaVozvrat());

    }

    @Test
    public void LinkNashiMagaziny() {
        HomePage homePage = new HomePage(driver);
        NashiMagazinyPage nashiMagazinyPage = new NashiMagazinyPage(driver);
        homePage.navigatePrego();
        homePage.NashiMagaziny().click();
        Assert.assertTrue(nashiMagazinyPage.isDisplayedNashiMagazinyPage());
    }

    @Test
    public void LinkObrane() {
        HomePage homePage = new HomePage(driver);
        ObranePage obrane = new ObranePage(driver);
        homePage.navigatePrego();
        homePage.Obrane().click();
        Assert.assertTrue(obrane.isDisplayedObrane());
    }

    @Test
    public void LinkPersonallAccount() {
        HomePage homePage = new HomePage(driver);
        PersonallAccount PersonallAccount = new PersonallAccount(driver);
        homePage.navigatePrego();
        homePage.PersonalAccount().click();
        Assert.assertTrue(PersonallAccount.isDisplayedPersonallAccount());
    }

    @Test
    public void LinkNovinki() {
        HomePage homePage = new HomePage(driver);
        Novinki novinki = new Novinki(driver);
        homePage.navigatePrego();
        novinki.btnNovinki().click();
        Assert.assertTrue(novinki.textNovinki().isDisplayed());
    }
    @Test
    public void LinkJenskaya(){
        HomePage homePage = new HomePage(driver);
        Jenskaya jenskaya = new Jenskaya(driver);
        homePage.navigatePrego();
        jenskaya.btnJenskaya().click();
        Assert.assertTrue(jenskaya.textJenskaya().isDisplayed());
    }
    @Test
    public void LinkMugskaya(){
        HomePage homePage = new HomePage(driver);
        Mugskaya mugskaya = new Mugskaya(driver);
        homePage.navigatePrego();
        mugskaya.btnMugskaya().click();
        Assert.assertTrue(mugskaya.textMugskaya().isDisplayed());
    }
    @Test
    public void LinkJinochiSumki(){
        HomePage homePage = new HomePage(driver);
        JinochiSumki jinochiSumki = new JinochiSumki(driver);
        homePage.navigatePrego();
        jinochiSumki.btnJinochiSumki().click();
        Assert.assertTrue(jinochiSumki.textJinochiSumki().isDisplayed());
    }
    @Test
    public void LinkCholovichiSumki(){
        HomePage homePage = new HomePage(driver);
        CholovichiSumki cholovichiSumki = new CholovichiSumki(driver);
        homePage.navigatePrego();
        cholovichiSumki.btnCholovichiSumki().click();
        Assert.assertTrue(cholovichiSumki.textCholovichiSumki().isDisplayed());
    }
    @Test
    public void LinkAcsessuary(){
        HomePage homePage = new HomePage(driver);
        Acsessuary acsessuary = new Acsessuary(driver);
        homePage.navigatePrego();
        acsessuary.btnAcsessuary().click();
        Assert.assertTrue(acsessuary.textAcsessuary().isDisplayed());
    }
    @Test
    public void LinkAkciya(){
        HomePage homePage = new HomePage(driver);
        Akciya akciya = new Akciya(driver);
        homePage.navigatePrego();
        akciya.btnAkciya().click();
        Assert.assertTrue(akciya.textAkciya().isDisplayed());
    }


}

