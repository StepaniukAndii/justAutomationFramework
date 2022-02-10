package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.*;
import SergKokan.Page.HeaderLinkPPage.Jenskaya;
import SergKokan.Page.HeaderLinkPPage.Mugskaya;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPokupkaMugskogoVzyttya extends TestInit {


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
//        HomePage homePage = new HomePage(driver);
        Mugskaya mugskaya = new Mugskaya(driver);
        Cherevyki cherevyki = new Cherevyki(driver);
        VyborTovara vyborTovara = new VyborTovara(driver);
        DobavitVKorzinu dobavitVKorzinu = new DobavitVKorzinu(driver);
        mugskaya.btnMugskaya().click();
        cherevyki.btnCherevyki().click();
        vyborTovara.btnVyborTovara().get(0).click();
        dobavitVKorzinu.clickKupyty().click();
        Assert.assertTrue(dobavitVKorzinu.tovarVKorzine().isDisplayed());
    }
    @Test
    public void prodolgitPokupki() {
        driver.get("https://prego.ua/");
        Mugskaya mugskaya = new Mugskaya(driver);
        Cherevyki cherevyki = new Cherevyki(driver);
        VyborTovara vyborTovara = new VyborTovara(driver);
        DobavitVKorzinu dobavitVKorzinu = new DobavitVKorzinu(driver);
        DobavitEsheTovarPage dobavitEsheTovar = new DobavitEsheTovarPage(driver);
        DobavitVKorzinu1Page dobavitVKorzinu1 = new DobavitVKorzinu1Page(driver);
        ClickPovernutysDoPokupokPage clickPovernutysDoPokupok = new ClickPovernutysDoPokupokPage(driver);
        VyborTovaraPage vyborTovaraPage1 = new VyborTovaraPage(driver);
        mugskaya.btnMugskaya().click();
        cherevyki.btnCherevyki().click();
        vyborTovara.btnVyborTovara().get(0).click();
        dobavitVKorzinu.clickKupyty().click();
        sleep(5);
        dobavitEsheTovar.getDobavitEsheTovar().click();
        dobavitVKorzinu1.getClickKorzina().click();
        clickPovernutysDoPokupok.getClickPovernutysDoPokupok().click();
        mugskaya.btnMugskaya().click();
        cherevyki.btnCherevyki().click();
        vyborTovaraPage1.btnVyborTovara1().click();
        dobavitVKorzinu.clickKupyty().click();
        Assert.assertTrue(dobavitVKorzinu.tovarVKorzine().isDisplayed());
        Assert.assertTrue(dobavitVKorzinu.tovarVKorzine1().isDisplayed());




    }

}

