package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.MenuPage;
import TestVanek.EatStreet.Pages.OrderOptionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMinimumPrice extends TestInit {
    MenuPage menuPage;
    OrderOptionsPage orderOptionsPage;

    @Test
    public void testMinimumPrice(){
        menuPage = new MenuPage(driver);
        orderOptionsPage = new OrderOptionsPage(driver);
        openUrl("https://eatstreet.com/new-york-city-ny/restaurants/all-about-indian-food");
        menuPage.menuItem().get(0).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(@id,'confirm')]")));
        orderOptionsPage.addToCartBtn().click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'alert')]")));
        Assert.assertTrue(orderOptionsPage.orderAlert().getText().contains("delivery minimum"));
    }
}
