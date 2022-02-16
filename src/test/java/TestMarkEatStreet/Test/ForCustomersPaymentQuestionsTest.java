package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.ForCutomersPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForCustomersPaymentQuestionsTest extends TestInit{
    ForCutomersPage forCutomersPage;
    @Test
    public void paymentquestions(){
        forCutomersPage = new ForCutomersPage(driver);
        openUrl("https://eatst.force.com/customers/s/");
        forCutomersPage.paymentquestionsbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://eatst.force.com/customers/s/topic/0TO2K000000fyBWWAY/payment-questions"));
        Assert.assertTrue(driver.getCurrentUrl().contains("payment-questions"));
    }
}
