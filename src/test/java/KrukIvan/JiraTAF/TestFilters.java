package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilters extends TestInit {
    @Test
    public void testFilters(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.writeAddress().sendKeys("new york \n");
        homePage.bTNEnterAddress().click();
        homePage.bTNGetFed().click();
        homePage.addFilters().get(1).click();
        homePage.addFilters().get(2).click();
        homePage.addFilters().get(3).click();
        sleep(3);
        int actualResult = homePage.getList().size() + 1;
        int actualResultFiltersAreVisible = homePage.filtersAreVisible().size();

        Assert.assertEquals(actualResult,3);
        Assert.assertEquals(actualResultFiltersAreVisible,3);
        Assert.assertEquals(actualResult, actualResultFiltersAreVisible);
    }
}
