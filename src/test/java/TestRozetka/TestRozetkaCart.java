package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.HomePageRozetka;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestRozetkaCart extends TestInit {
    @Test
    public void testRozetkaCart() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua");
        homePageRozetka.searchFild().click();
        homePageRozetka.searchFild().sendKeys("холодильник\n");
        homePageRozetka.getRefrigerator().click();
        homePageRozetka.addCart().click();
        Assert.assertTrue((homePageRozetka.getElement("//a[@class='cart-product__title']")).isDisplayed());
    }
}
