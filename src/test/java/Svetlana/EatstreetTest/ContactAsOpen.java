package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactAsOpen extends TestInit {
    @Test
    public void  contactAsOpen(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://qa2.eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.openContactUs().click();

        Assert.assertTrue(footerPage.checkOpenContactAs().isDisplayed());
    }
}
