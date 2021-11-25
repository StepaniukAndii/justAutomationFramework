package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Support extends TestInit {
    @Test
    public void ForCostumersOpened(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickForCostumers().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://eatst.force.com/customers/s/"));
    }
    @Test
    public void ForCostumersCouponQuestions(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickForCostumers().click();
        footerPage.clickCouponQuestions().click();

        Assert.assertTrue(footerPage.checkCouponQuestions().isDisplayed());
    }
}
