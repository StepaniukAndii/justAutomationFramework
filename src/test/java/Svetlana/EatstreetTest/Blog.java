package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Blog extends TestInit {
    @Test
    public void blogOpen() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage = new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickBlog().click();
        openUrl("https://blog.eatstreet.com/");
        sleep(3);
        footerPage.clickMenuPage().get(2).click();
    }
}

