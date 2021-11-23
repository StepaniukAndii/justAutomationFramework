package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Careers extends TestInit {
    @Test
    public void careers() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage = new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickCareers().click();
        sleep(5);
        footerPage.inputSerchField().sendKeys("Director\n");

        Assert.assertTrue(footerPage.checkSerchField().isDisplayed());
    }

    @Test
    public void careersGetDelivery() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage = new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage = new FooterPage(driver);
        footerPage.clickCareers().click();
        for (int i = 0; i < 4; i++) {
            footerPage.getClickCategories().get(i).click();
            sleep(2);
        }
        footerPage.getClickDelivery().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://eatstreet.com/driver-careers"));
    }
}

