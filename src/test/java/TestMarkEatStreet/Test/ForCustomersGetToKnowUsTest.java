package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.BlogPage;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Footer;
import TestMarkEatStreet.Page.ForCutomersPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForCustomersGetToKnowUsTest extends TestInit{
    ForCutomersPage forCutomersPage;
    Footer footer;
    DriverPage driverPage;
    @Test
    public void gettoknowus(){
        forCutomersPage = new ForCutomersPage(driver);
        footer = new Footer(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        footer.forcustomersbtn().click();
        forCutomersPage.gettoknowusbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://eatst.force.com/customers/s/topic/0TO2K000000fyBMWAY/get-to-know-us"));
        Assert.assertTrue(driver.getCurrentUrl().contains("get-to-know-us"));
    }
}
