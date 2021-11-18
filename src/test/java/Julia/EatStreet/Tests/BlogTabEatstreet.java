package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTabEatstreet extends TestInit {

    @Test
    public void blogTabEatstreet() {
        HomePage homePage =new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnBlog().click();
        openUrl("https://blog.eatstreet.com/");
        homePage.clickResentPost().click();
        homePage.tabBetterbin().click();
        Assert.assertTrue(homePage.tabBetterbin().isDisplayed());
    }
}
