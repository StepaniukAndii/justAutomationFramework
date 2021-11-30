package Julia.EatStreet.Tests;
import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForCustomers  extends TestInit {

    @Test
    public void forCustomers() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.getForCustomers().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("eatst.force"));
    }
}
