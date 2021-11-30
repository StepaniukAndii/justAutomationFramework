package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortBy extends TestInit {
    @Test
    public void sortBy(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.writeAddress().sendKeys("new york \n");
        homePage.bTNEnterAddress().click();
        homePage.bTNGetFed().click();
        homePage.sortByBTN().click();
        homePage.sortByARAndOther().get(3).click();
        Assert.assertTrue(homePage.sortByBTN().getText().contains("Sort by: Rating"));
        homePage.sortByBTN().click();
        homePage.sortByARAndOther().get(0).click();
        Assert.assertTrue(homePage.sortByBTN().getText().contains("A-Z"));
        homePage.sortByBTN().click();
        homePage.sortByARAndOther().get(0).click();
        Assert.assertTrue(homePage.sortByBTN().getText().contains("ETA"));
        homePage.sortByBTN().click();
        homePage.sortByARAndOther().get(1).click();
        Assert.assertTrue(homePage.sortByBTN().getText().contains("Distance"));
        homePage.sortByBTN().click();
        homePage.sortByARAndOther().get(3).click();
        Assert.assertTrue(homePage.sortByBTN().getText().contains("Delivery Fee"));;
    }
}
