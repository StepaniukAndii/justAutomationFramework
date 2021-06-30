package testRozetkaDenis.testClasses;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;
import testRozetkaDenis.pages.FilterPage;

public class TestFilter extends TestInit {

    @Test
    public void filters() {
        FilterPage filterPage = new FilterPage(driver);
        openUrl("https://rozetka.com.ua/");
        filterPage.headerPageFunctions().searchRozetka().sendKeys("Xiaomi redmi\n");
        showAllResults(filterPage);
        checkFilters(filterPage);
        resetFilters(filterPage);
        checklistsCheck(filterPage);
        filterPage.sortView().click();
        changeSortType(filterPage);
    }

    private void changeSortType(FilterPage filterPage) {
        for (int i = 0; i < filterPage.sortingOption().size(); i++) {
            filterPage.selectSorting().click();
            filterPage.sortingOption().get(i).click();
            sleep(1);
            driver.navigate().refresh();
        }
    }

    private void checklistsCheck(FilterPage filterPage) {
        for (int i = 0; i < 5; i++) {
            filterPage.checklistsFilters().get(i).click();
            sleep(1); //for proper work
        }
    }

    private void resetFilters(FilterPage filterPage) {
        filterPage.reset().click();
    }

    private void checkFilters(FilterPage filterPage) {
        for (int i = 0; i < 5; i++) {
            filterPage.filters().get(i).click();
            sleep(1); //for proper page load
        }
    }

    private void showAllResults(FilterPage filterPage) {
        filterPage.allResults().click();
        sleep(1); //for proper page load
    }
}
