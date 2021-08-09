package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;

public class RestaurantCountryFilters extends TestInit {

    LandingContentPage landingContentPage;

    @Test
    public void filtersWorkTest() {
        landingContentPage = new LandingContentPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.acceptCookies().click();
        landingContentPage.countriesList().get(115).click(); //Click on Washington. Then choosing Asian Food
        landingContentPage.cuisinesList().get(0).click();
        if (landingContentPage.restaurantsPage().filtersCheckboxes().get(0).getText().contains("Asian Food")) {
            System.out.println("Filters working properly.");
        } else {
            Assert.fail("Filters are mismatching");
        }
    }
}
