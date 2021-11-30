package Julia.EatStreet.Test36_60;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAboutUs extends TestInit {

    @Test
    public void checkAboutUs() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAboutUs().click();
        sleep(3);
        Assert.assertTrue(driver.getCurrentUrl().contains("about-us"));
    }

    @Test
    public void checkElementsAboutUs() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAboutUs().click();
        sleep(3);
        Assert.assertTrue(homePage.getAdressInput().isDisplayed());
        Assert.assertTrue(homePage.getAdressHeaderInput().isDisplayed());
    }

    @Test
    public void checkElementsMenuAboutUs() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAboutUs().click();
        sleep(3);
        homePage.getMenuLink().get(2).click();
        sleep(3);
        Assert.assertEquals(homePage.btnShowMore().size(), 2);
    }

    @Test
    public void checkConnectAboutUs() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAboutUs().click();
        sleep(3);
        homePage.getMenuLink().get(4).click();
        sleep(3);
        Assert.assertTrue(homePage.connectMenu().get(2).isDisplayed());
    }

    @Test
    public void checkBlogAboutUs() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnAboutUs().click();
        sleep(3);
        homePage.getMenuLinkBlog().get(5).click();
        sleep(3);
        openUrl("https://blog.eatstreet.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("blog"));
    }

}
