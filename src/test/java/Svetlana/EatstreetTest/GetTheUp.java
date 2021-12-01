package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.GetTheUpPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class GetTheUp extends TestInit {
    @Test
    public void GetTheUpOpened(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        GetTheUpPage getTheUpPage=new GetTheUpPage(driver);
        getTheUpPage.clickGooglePlay().click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(3);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://play.google.com/store/apps/details?id=com.eatstreet.android&hl=en"));

    }
}