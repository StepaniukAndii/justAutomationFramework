package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestMenu extends TestInit {
    @Test
    public void testMenu(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.clickButtonGotIt().click();
        homePage.writeAddress().sendKeys("new york \n");
        homePage.bTNEnterAddress().click();
        homePage.bTNGetFed().click();
        homePage.getRestaurant().get(0).click();
        Assert.assertTrue(homePage.addFood().size() > 1);
    }
}
