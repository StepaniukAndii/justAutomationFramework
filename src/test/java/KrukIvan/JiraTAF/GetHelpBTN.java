package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class GetHelpBTN extends TestInit {
    @Test
    public void checkBTNGetHelp(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com");
        homePage.clickButtonGotIt().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        homePage.bTNGetHelp().get(0).click();
        sleep(2);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertEquals(2,tabs.size());
    }

}
