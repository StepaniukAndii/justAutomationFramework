package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
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
    @Test
    public void ForCostumersPaymentQuestions(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickForCostumers().click();
        footerPage.clickPaymentQuestions().click();

        Assert.assertTrue(footerPage.checkPaymentQuestions().isDisplayed());
    }
    @Test
    public void accessibilityStatement(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickAccessibilityStatement().click();
        footerPage.clickLinknternetAccessibility().click();
        sleep(3);
//        Actions action = new Actions(driver);
//        action.moveToElement(footerPage.clickLinknternetAccessibility(),1,1).click().perform();
//        footerPage.clickLinknternetAccessibility().click();
//        sleep(5);
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(3);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.boia.org/"));
    }
}
