package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.*;
import SergKokan.Page.HeaderLinkPPage.Jenskaya;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGinocheVzyttyaPage extends TestInit {
    public void openUrl(String site){
        driver.get("https://prego.ua/");

    }
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
}
