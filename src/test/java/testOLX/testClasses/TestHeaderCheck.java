package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import testOLX.pages.HomePage;
import org.testng.annotations.Test;

public class TestHeaderCheck extends TestInit {

    @Test
    public void header() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.olx.ua/");
        if(homePage.olxLogo().isDisplayed()) {
            System.out.println("Logo displayed.");
            homePage.olxLogo().click();
        }
        if(homePage.changeLang().isDisplayed()) {
            System.out.println("Language change buttons are displayed.");
            homePage.changeLang().click();
        }
        if(homePage.favorite().isDisplayed()) {
            System.out.println("'Favorite products' button is displayed.");
            homePage.favorite().click();
        }
        if(homePage.olxLogin().isDisplayed()) {
            System.out.println("Login button is displayed.");
            homePage.olxLogin().click();
        }
        if(homePage.newPost().isDisplayed()) {
            System.out.println("'Add new post' button is displayed.");
            homePage.newPost().click();
        }
    }
}
