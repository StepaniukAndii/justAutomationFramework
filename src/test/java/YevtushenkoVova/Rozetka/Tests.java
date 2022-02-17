package YevtushenkoVova.Rozetka;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends TestInit {

    @Test
    public void check(){
    HomePage homePage = new HomePage(driver);
    openUrl("https://lpgtech.ua/");
    homePage.input().sendKeys("Хомут \n");
    homePage.homut().click();

    Assert.assertTrue(homePage.isElementPresent("//button[@class=\"btn btn-info add\"]"));
    }

    @Test
    public void invalidEmailPassword(){
        HomePage homePage = new HomePage(driver);
        homePage.openLPG();
        homePage.signIn().click();
        homePage.inputEmail().sendKeys("qwe123@ukr.net");
        homePage.inputPassword().sendKeys("wq4e3r2");
        homePage.btnSignIn().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://lpgtech.ua/admin/login");
    }

    @Test
    public void makeFiltreAC(){
        HomePage homePage = new HomePage(driver);
        homePage.openLPG();
        moveMouseToElement(homePage.tapKomplectGbo());
        homePage.tapKomplect4Pok().click();
        homePage.filtreStag().click();

        Assert.assertTrue(homePage.isElementPresentFilter());
    }

    @Test
    public void errorEmail() {
        HomePage homePage = new HomePage(driver);
        homePage.openLPG();
        homePage.signIn().click();
        homePage.inputPassword().sendKeys("wq4e3r2");
        homePage.btnSignIn().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://lpgtech.ua/admin/login");
    }

    @Test
    public void payMiniKomplect(){
        HomePage homePage = new HomePage(driver);
        homePage.openLPG();
        moveMouseToElement(homePage.tapKomplectGbo());
        homePage.miniKomplect().click();
        homePage.btnPay().get(3).click();
        sleep(2);
        homePage.btnCheckout().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://lpgtech.ua/cart/checkout/");
    }

    @Test
    public void filterForsunki(){
        HomePage homePage = new HomePage(driver);
        homePage.openLPG();
        homePage.forsunki().click();
        homePage.hanaBox().click();
        homePage.selectSort().click();
        homePage.sort20().click();

        Assert.assertTrue(homePage.isElementPresentFilter());
    }

    @Test
    public void fastOrder(){
        HomePage homePage = new HomePage(driver);
        homePage.openLPG();
        homePage.forsunki().click();
        homePage.barracuda().click();
        homePage.fastOrder().click();

        Assert.assertTrue(homePage.windowPhone().isDisplayed());
    }

}
