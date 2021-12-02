package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
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
        wailTillElementsAppear("//ul[contains(@class, 'filters-section_checkoxes')]//input[contains(@class, 'ng-not-empty')]", 30, 3);
        int actualResult = homePage.getList().size();
        int actualResultFiltersAreVisible = homePage.filtersAreVisible().size();
        Assert.assertEquals(actualResult,3);
        Assert.assertEquals(actualResultFiltersAreVisible,3);
        Assert.assertEquals(actualResult, actualResultFiltersAreVisible);
    }

    private void wailTillElementsAppear(String locator, int secondsToWait, int elementsNumToWait) {
        for (int i = 0; i < 50; i++) {
            if (driver.findElements(By.xpath(locator))
                    .size() >= elementsNumToWait){
                break;
            }else {
                sleep(1);
            }
        }
    }
    @Test
    public void bTNOrderAhead(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.writeAddress().sendKeys("new york \n");
        homePage.bTNEnterAddress().click();
        homePage.bTNGetFed().click();
        homePage.bTNOrderAhead().click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"active-filters\"]")).isDisplayed());
    }
}
