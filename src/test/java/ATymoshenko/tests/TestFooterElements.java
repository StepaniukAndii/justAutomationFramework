package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

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
}
