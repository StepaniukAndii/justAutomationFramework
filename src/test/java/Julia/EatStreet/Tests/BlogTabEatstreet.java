package Julia.EatStreet.Tests;

import ClasesToAllUs.TestInit;
import Julia.EatStreet.Pages.BlogEatStreetPage;
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

    @Test
    public void checkBlogPage() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnBlog().click();
        homePage.goToTheSecondWindowTab(driver, 10);
        BlogEatStreetPage blogEatStreetPage = new BlogEatStreetPage(driver);
        blogEatStreetPage.clickLGBTO().get(0).click();
        Assert.assertTrue(blogEatStreetPage.listRestLGBTO().get(0).isDisplayed());
    }

    @Test
    public void selectRestInBlog() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnBlog().click();
        homePage.goToTheSecondWindowTab(driver, 10);
        BlogEatStreetPage blogEatStreetPage = new BlogEatStreetPage(driver);
        blogEatStreetPage.clickLGBTO().get(2).click();
        Assert.assertTrue(blogEatStreetPage.listRestLGBTO().get(5).isDisplayed());
    }

    @Test
    public void selectRestBlog() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.checkAndClousePopUpWindow();
        homePage.btnBlog().click();
        homePage.goToTheSecondWindowTab(driver, 10);
        BlogEatStreetPage blogEatStreetPage = new BlogEatStreetPage(driver);
        blogEatStreetPage.clickLGBTO().get(6).click();
        Assert.assertTrue(blogEatStreetPage.listRestLGBTO().get(4).isDisplayed());
    }
}
