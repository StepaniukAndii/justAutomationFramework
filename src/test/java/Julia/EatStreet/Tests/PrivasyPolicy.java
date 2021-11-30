package Julia.EatStreet.Tests;
import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PrivasyPolicy extends TestInit {

    @Test
    public void privasyPolicy() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnPrivasyPolicy().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("privacy"));
    }
}
