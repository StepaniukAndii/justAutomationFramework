package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;

public class FiltersTest extends TestInit {

    LandingContentPage landingContentPage;

    @Test
    public void checkFilters() {
        landingContentPage = new LandingContentPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.acceptCookies().click();
        landingContentPage.searchEatStreet().sendKeys("Seattle\n");
        landingContentPage.enterAddressModalWindowButton().click(); //for closing modal window
        landingContentPage.getFed().click();
        selectFilter(2);
    }

    private void selectFilter(int chosenFilter) {
        landingContentPage.restaurantsPage().filtersCheckboxes().get(chosenFilter).click();
        String selectedFilter = landingContentPage.restaurantsPage().filtersCheckboxes().get(chosenFilter).getText();
        selectedFilter = selectedFilter.replaceAll("[()0-9]", "");
        Assert.assertTrue(selectedFilter.contains(landingContentPage.restaurantsPage().activeFilters().get(0).getText()));
    }
}
