package SergKokan.Test;

import ClasesToAllUs.TestInit;
import SergKokan.Page.*;
import SergKokan.Page.HeaderLinkPPage.Novinki;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFooter extends TestInit {
    @Test
    public void FooterNovinki(){
        HomePage homePage= new HomePage(driver);
        Novinki novinki = new Novinki(driver);
        VyborTovaraPage vyborTovara = new VyborTovaraPage(driver);
        DobavitVKorzinu dobavitVKorzinu = new DobavitVKorzinu(driver);
    //    VyborTovaraPage vyborTovara = new VyborTovaraPage(driver);
        homePage.navigatePrego();
        novinki.btnNovinki().click();
        vyborTovara.btnVyborTovara().click();
        dobavitVKorzinu.clickKupyty().click();
        Assert.assertTrue(dobavitVKorzinu.tovarVKorzine().isDisplayed());

    }
    @Test
    public void FooterGinocheVzuttya(){
        HomePage homePage = new HomePage(driver);
        GinocheVzuttya ginocheVzuttya = new GinocheVzuttya(driver);
        VyborTovaraPage vyborTovara = new VyborTovaraPage(driver);
        DobavitVKorzinu dobavitVKorzinu = new DobavitVKorzinu(driver);
        homePage.navigatePrego();
        ginocheVzuttya.btnGinocheVzuttya().click();
        vyborTovara.btnVyborTovara().click();
        dobavitVKorzinu.clickKupyty().click();
        Assert.assertTrue(dobavitVKorzinu.tovarVKorzine().isDisplayed());

    }
}
