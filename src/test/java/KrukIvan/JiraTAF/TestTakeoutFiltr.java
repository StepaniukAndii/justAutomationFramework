package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTakeoutFiltr extends TestInit {
    @Test
    public void testTakeoutFiltr(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.writeAddress().sendKeys("new york \n");
        homePage.bTNEnterAddress().click();
        homePage.bTNGetFed().click();
        homePage.filterTakeout().click();
        Assert.assertTrue(homePage.filterTakeoutIsOn().isDisplayed());
    }
}
