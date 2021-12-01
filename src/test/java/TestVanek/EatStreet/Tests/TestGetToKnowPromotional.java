package TestVanek.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.EatStreet.Pages.GetToKnowUsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGetToKnowPromotional extends TestInit {
    GetToKnowUsPage getToKnowUsPage;
    @Test
    public void testGetToKnowPromotional(){
        getToKnowUsPage = new GetToKnowUsPage(driver);
        openUrl("https://eatst.force.com/customers/s/topic/0TO2K000000fyBMWAY/get-to-know-us");
        getToKnowUsPage.promotional().click();
        Boolean wait = new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/Promotional"));
        Assert.assertTrue(driver.getCurrentUrl().contains("Promotional"));
    }
}
