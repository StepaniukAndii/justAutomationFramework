package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsEatstreet  extends TestInit {

    @Test
    public void contactUsEatstreet() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.clickContactUs().click();
        Assert.assertEquals(homePage.getEmailFromContactUs().getText(),"customer.service@eatstreet.com");

    }
}