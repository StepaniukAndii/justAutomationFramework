package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.*;
import SergKokan.Page.HeaderLinkPPage.Jenskaya;
import SergKokan.Page.HeaderLinkPPage.Mugskaya;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPokupkaVzyttyaPage extends TestInit {


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
    @Test
    public void ShlepkiPage(){
        driver.get("https://prego.ua/");

        HomePage homePage = new HomePage(driver);
        Jenskaya jenskaya = new Jenskaya(driver);
        ShlepkiPage shlepkiPage = new ShlepkiPage(driver);
        VyborTovaraPage vyborTovaraPage = new VyborTovaraPage(driver);
        jenskaya.btnJenskaya().click();
        shlepkiPage.btnShlepki().click();
//        Assert.assertTrue(shlepkiPage.textShlepki().isDisplayed());
        vyborTovaraPage.btnVyborTovara().click();

    }
    @Test
    public void pokupkaMugskihBotinok(){
        driver.get("https://prego.ua/");
        HomePage homePage = new HomePage(driver);
        Mugskaya mugskaya = new Mugskaya(driver);
        Cherevyki cherevyki = new Cherevyki(driver);
        VyborTovara vyborTovara = new VyborTovara(driver);
        DobavitVKorzinu dobavitVKorzinu = new DobavitVKorzinu(driver);
        mugskaya.btnMugskaya().click();
        cherevyki.btnCherevyki().click();
        vyborTovara.qqq().get(0).click();
        dobavitVKorzinu.getDobavitVKorzinu().click();
        Assert.assertTrue(dobavitVKorzinu.tovarVKorzine().isDisplayed());
    }

}

