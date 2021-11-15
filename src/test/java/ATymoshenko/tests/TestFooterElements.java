package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestFooterElements extends TestInit {
    @Test
    public void aboutUsBtn (){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addAboutUsBtn().click();
        sleep(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("about-us"));
    }
    @Test
    public void contactUsBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addContactUsBtn().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("contact"));
    }
    @Test
    public  void careersBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addCareersBtn().click();
        sleep(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("careers"));
    }
    @Test
    public void becomeADriver(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addBecomeADriverBtn().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("driver-careers"));
    }
}
