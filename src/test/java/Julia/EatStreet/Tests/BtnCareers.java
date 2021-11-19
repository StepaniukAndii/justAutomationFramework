package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BtnCareers extends TestInit {

    @Test
    public void btnCareers() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnCareers().click();
        sleep(5);
        Assert.assertTrue(driver.getCurrentUrl().contains("careers"));
    }

    @Test
    public void careersAllJob() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnCareers().click();
        sleep(5);
        homePage.btnTech().click();
        sleep(3);
        homePage.btnCreative().click();
        sleep(3);
        homePage.btnCulinary().click();
        sleep(3);
        homePage.btnBusiness().click();
        sleep(3);
        homePage.btnDelivery().click();
        Assert.assertTrue(homePage.allJobs().isDisplayed());
    }
}