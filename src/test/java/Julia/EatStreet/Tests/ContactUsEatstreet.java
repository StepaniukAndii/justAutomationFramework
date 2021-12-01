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
        Assert.assertTrue(homePage.getEmailFromContactUs().isDisplayed());
    }

    @Test
    public void contactUsSingIn() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.clickContactUs().click();
        homePage.linkPageContactUs().click();
        Assert.assertTrue(homePage.singIn().isDisplayed());
    }
}
