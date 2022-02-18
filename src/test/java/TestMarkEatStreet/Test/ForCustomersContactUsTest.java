package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.ForCutomersPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForCustomersContactUsTest extends TestInit{
    ForCutomersPage forCutomersPage;
    @Test
    public void cancelorder(){
        forCutomersPage = new ForCutomersPage(driver);
        openUrl("https://eatst.force.com/customers/s/");
        forCutomersPage.contactusbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://eatst.force.com/customers/s/contactsupport"));
        Assert.assertTrue(driver.getCurrentUrl().contains("contactsupport"));
    }
}
