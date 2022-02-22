package YevtushenkoVova.Ukr.Net;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestUkrNet extends TestInit {

    @Test
    public void inputSinoptik(){
        HomePage homePage = new HomePage(driver);
        homePage.openUkrNet();
        homePage.getLeftTabs().linkSinopyik().click();
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        Assert.assertTrue(homePage.getLeftTabs().inputOnSinoptik().isDisplayed());
    }

    @Test
    public void pricePump(){
        HomePage homePage = new HomePage(driver);
        homePage.openUkrNet();
        homePage.getRightTabs().tabCurrency().click();
        homePage.getRightTabs().tabAfisha().click();
        homePage.getRightTabs().tapFuel().click();

        Assert.assertTrue(homePage.getRightTabs().pricePump().isDisplayed());
    }

    @Test
    public void fuelLvov(){
        HomePage homePage = new HomePage(driver);
        homePage.openUkrNet();
        homePage.getRightTabs().tapFuel().click();
        homePage.getRightTabs().cityTap().click();
        homePage.getRightTabs().lvov().click();

        Assert.assertTrue(homePage.getRightTabs().lvovAssert().isDisplayed());
    }

    @Test
    public void golovneLink(){
        HomePage homePage = new HomePage(driver);
        homePage.openUkrNet();
        homePage.golovne().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ukr.net/news/main.html");
    }

    @Test
    public void c(){
        HomePage homePage = new HomePage(driver);
        homePage.openUkrNet();
        homePage.getRightTabs().tabCurrency().click();
        homePage.getRightTabs().tapFuel().click();
        homePage.getRightTabs().cityTap().click();
        homePage.getRightTabs().lvov().click();

        Assert.assertTrue(homePage.getRightTabs().lvovAssert().isDisplayed());
    }
}

