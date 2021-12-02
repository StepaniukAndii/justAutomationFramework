package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.StartPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForCustomer extends TestInit {
    StartPage startPage;
    @Test
    public void testForCustomer(){
        startPage = new StartPage(driver);
        openUrl("https://eatstreet.com");
        startPage.gotItBtn().click();
        startPage.forCustomerBtn().click();
        Boolean wait = new WebDriverWait(driver,2).until(ExpectedConditions.urlContains("/customers"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://eatst.force.com/customers/s/");
    }
}
