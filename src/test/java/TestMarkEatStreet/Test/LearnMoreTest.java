package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnMoreTest extends TestInit{
    Body body;
    DriverPage driverPage;
    @Test
    public void learnmore(){
        body = new Body(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        body.learnmorebtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("http://geteatstreet.com/"));
        Assert.assertTrue(driver.getCurrentUrl().contains("geteatstreet"));
    }
}
