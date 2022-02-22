package YevtushenkoVova.Tests;

import ClasesToAllUs.TestInit;
import YevtushenkoVova.Pages.HomePage;
import YevtushenkoVova.Pages.SanFranciskoRes;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SanFrancisco extends TestInit {

    @Test
    public void restSanFrancisco(){
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.sanFrancisko().click();
        SanFranciskoRes sanFranciskoRes = new SanFranciskoRes(driver);
        sleep(2);
        sanFranciskoRes.listFood().get(1).click();
        sleep(2);

        Assert.assertEquals(sanFranciskoRes.h1().getText(), "San Francisco Restaurants That Deliver & Takeout");
    }

    @Test
    public void restSanDiego(){
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.sanDiego().click();
        sleep(2);
        SanFranciskoRes sanFranciskoRes = new SanFranciskoRes(driver);
        sanFranciskoRes.listFood().get(2).click();
        sleep(2);

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa2.eatstreet.com/san-diego-ca/cuisines/breakfast-delivery-takeout?espPageNumber=1");
    }

    @Test
    public void restSanJose(){
        HomePage homePage = new HomePage(driver);
        homePage.openQa2HomePage();
        homePage.buttonGotIt().click();
        homePage.sanJose().click();
        SanFranciskoRes sanFranciskoRes = new SanFranciskoRes(driver);
        sleep(2);
        sanFranciskoRes.listFood().get(3).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa2.eatstreet.com/sunnyvale-ca/cuisines/burger-delivery-takeout");
    }


}
