package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RestaurantDashboard extends TestInit {
    @Test
    public void  restaurantDashboardOpened(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickRestaurantDashboard().click();
        footerPage.inputEmailSignIn().sendKeys("prutasveta@gmail.com");
        footerPage.inputPasswordSignIn().sendKeys("12598645221552");
        footerPage.clickSignIn().click();
        sleep(3);
        footerPage.clickForgotPassword().click();
        footerPage.inputNewPassword().sendKeys("00000000");
        footerPage.clickResetPassword().click();

        Assert.assertTrue(footerPage.checkResetPassword().isDisplayed());





    }
}
