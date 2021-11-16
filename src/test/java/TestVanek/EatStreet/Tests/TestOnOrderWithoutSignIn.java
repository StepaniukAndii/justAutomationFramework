package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.LoginPage;
import TestVanek.EatStreet.Pages.MenuPage;
import TestVanek.EatStreet.Pages.OrderOptionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnOrderWithoutSignIn extends TestInit {
    MenuPage menuPage;
    OrderOptionsPage orderOptionsPage;
    LoginPage loginPage;

    @Test
    public void testOnOrderWithoutSignIn(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        menuPage = new MenuPage(driver);
        orderOptionsPage = new OrderOptionsPage(driver);
        loginPage = new LoginPage(driver);
        openUrl("https://eatstreet.com/new-york-city-ny/restaurants/lilly-obriens");
        menuPage.menuItem().get(0).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(@id,'confirm')]")));
        orderOptionsPage.addToCartBtn().click();
        sleep(1);
        orderOptionsPage.orderAheadBtn().click();
        Assert.assertTrue(loginPage.emailInput().isDisplayed());
    }
}
