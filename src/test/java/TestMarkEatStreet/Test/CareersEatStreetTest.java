package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Footer;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CareersEatStreetTest extends TestInit{
    Footer footer;
    DriverPage driverPage;
    @Test
    public void careersfooter(){
        footer = new Footer(driver);
        driverPage = new DriverPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        driverPage.gotitbtn().click();
        footer.careersbtn().click();
        footer.techjobsbtn().click();
        footer.productanalysstbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://qa2.eatstreet.com/careers/product-analyst-diner"));
        Assert.assertTrue(driver.getCurrentUrl().contains("product-analyst-diner"));
    }
}
