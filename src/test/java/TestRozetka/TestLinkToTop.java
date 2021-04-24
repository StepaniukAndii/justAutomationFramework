package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLinkToTop extends TestInit {

    @Test
    public void testLinkToTop() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.searchField().sendKeys(homePage.gools);
        pushBtnReturn();
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        homePage.getLinkToTop().isDisplayed();
        homePage.getLinkToTop().click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='link-to-top ng-star-inserted']")).isDisplayed());
    }
}