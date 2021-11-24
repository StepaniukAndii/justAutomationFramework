package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Driver extends TestInit {
    @Test
    public void driver(){
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickDriver().click();
        footerPage.getClickAddress().click();
        footerPage.getClickCity().get(1).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://eatstreet.com/careers/delivery-driver-ames-ia"));

    }
}
