package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.CustomersPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomersImagePayment extends TestInit {
    CustomersPage customersPage;
    @Test
    public void testCustomersImagePayment(){
        customersPage = new CustomersPage(driver);
        openUrl("https://eatst.force.com/customers/s/");
        customersPage.paymentImg().click();
        Boolean wait = new WebDriverWait(driver,10).until(ExpectedConditions.urlContains("payment"));
        Assert.assertTrue(driver.getCurrentUrl().contains("payment"));
    }
}
