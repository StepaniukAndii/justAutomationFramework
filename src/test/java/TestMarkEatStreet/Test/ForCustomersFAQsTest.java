package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.ForCutomersPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForCustomersFAQsTest extends TestInit{
    ForCutomersPage forCutomersPage;
    @Test
    public void faqstest(){
        forCutomersPage = new ForCutomersPage(driver);
        openUrl("https://eatst.force.com/customers/s/");
        forCutomersPage.faqsbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://eatst.force.com/customers/s/topic/0TO2K000000fyDhWAI/faqs"));
        Assert.assertTrue(driver.getCurrentUrl().contains("faqs"));
    }
}
