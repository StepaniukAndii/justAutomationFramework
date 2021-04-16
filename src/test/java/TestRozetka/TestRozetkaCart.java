package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestRozetkaCart extends TestInit {

    @Test
    public void testRozetkaCart() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.searchField().click();
        homePage.searchField().sendKeys("холодильник\n");
        homePage.getRefrigerator().click();
        homePage.addCart().click();
        Assert.assertTrue((homePage.getElement("//a[@class='cart-product__title']")).isDisplayed());
    }
}
