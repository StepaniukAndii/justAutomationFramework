package TestCocaColaByDmitriyUl;

import ClasesToAllUs.TestInit;
import TestCocaColaByDmitriyUl.Page.HomePage;
import TestCocaColaByDmitriyUl.Page.NavigationBar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestColaHomePage extends TestInit {
    @Test
    public void homePage(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateHomePage();
        homePage.closeCookie();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.coca-cola.ua/");
    }
    @Test
    public void checkNavBar() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateHomePage();
        homePage.closeCookie().click();
        homePage.navigateBar().click();
        NavigationBar navigationBar = new NavigationBar(driver);
        Assert.assertTrue(navigationBar.golovna().isDisplayed());
        Assert.assertTrue(navigationBar.ourBrands().isDisplayed());
        Assert.assertTrue(navigationBar.fun().isDisplayed());
        Assert.assertTrue(navigationBar.liveDrive().isDisplayed());
        Assert.assertTrue(navigationBar.doGood().isDisplayed());
        Assert.assertTrue(navigationBar.getPrizes().isDisplayed());
        Assert.assertTrue(navigationBar.knowUsBetter().isDisplayed());
    }

}
