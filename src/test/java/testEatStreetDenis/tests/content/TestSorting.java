package testEatStreetDenis.tests.content;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.content.LandingContentPage;

import java.util.stream.Stream;

public class TestSorting extends TestInit {

    LandingContentPage landingContentPage;

    @Test
    public void sortingTest() {
        landingContentPage = new LandingContentPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        landingContentPage.searchEatStreet().sendKeys("Seattle\n");
        landingContentPage.enterAddressModalWindowButton().click();
        landingContentPage.getFed().click();
        String firstRestaurant = landingContentPage.restaurantsPage().restaurantName().get(0).getText();
        String comparingRestaurant = landingContentPage.restaurantsPage().restaurantName().get(1).getText();
        compareRestaurantsNames(firstRestaurant, comparingRestaurant);
        landingContentPage.restaurantsPage().selectSortingType().click();
        landingContentPage.restaurantsPage().getSortingType().get(2).click();
        int firstDistance = Integer.parseInt(landingContentPage.restaurantsPage().comparingByDistance().
                get(0).getText().replaceAll("\\D", ""));
        int comparingDistance = Integer.parseInt(landingContentPage.restaurantsPage().comparingByDistance().
                get(1).getText().replaceAll("\\D", ""));
        compareRestaurantsByDistance(firstDistance, comparingDistance);
        landingContentPage.restaurantsPage().selectSortingType().click();
        landingContentPage.restaurantsPage().getSortingType().get(3).click();
        String firstRating = landingContentPage.restaurantsPage().comparingByRating().get(0).getAttribute("title");
        String comparingRating = landingContentPage.restaurantsPage().comparingByRating().get(1).getAttribute("title");
        compareRestaurantsByRating(firstRating, comparingRating);
        landingContentPage.restaurantsPage().selectSortingType().click();
        landingContentPage.restaurantsPage().getSortingType().get(4).click();
    }

    private void compareRestaurantsByRating(String firstRating, String comparingRating) {
        Assert.assertTrue(Float.parseFloat(firstRating) > Float.parseFloat(comparingRating));
    }

    private void compareRestaurantsByDistance(int firstDistance, int comparingDistance) {
        Assert.assertTrue(firstDistance < comparingDistance);
    }

    private void compareRestaurantsNames(String firstRestaurant, String comparingRestaurant) {
        String[] sorted = Stream.of(firstRestaurant, comparingRestaurant).sorted().toArray(String[]::new);
        System.out.println(sorted[0] + " is before " + sorted[1]); //should check this manually
    }

}
