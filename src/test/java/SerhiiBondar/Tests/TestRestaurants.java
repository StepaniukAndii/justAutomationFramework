package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.RestaurantEatstreetPage;
import SerhiiBondar.Pages.SingInEatstreetPage;
import SerhiiBondar.Pages.SingInPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestRestaurants extends TestInit {


    @Test
    public void testSortOption(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getSortOptions().click();
        restaurantEatstreetPage.getDeliveryFeeBtn().click();

        Assert.assertEquals(restaurantEatstreetPage.getSortByDeliveryFee().getText(),"Sort by: Delivery Fee");
    }
    @Test
    public void testListOfRestInSelectedCity(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);

        Assert.assertEquals(restaurantEatstreetPage.getRestListHeader().getText(),
                "Chicago Restaurants That Deliver & Takeout");
    }
    @Test
    public void testRestCategories(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getAsianFoodBtn().click();
        restaurantEatstreetPage.getBBQFoodBtn().click();

        Assert.assertEquals(restaurantEatstreetPage.getRestListContainer().get(0).getText(),
                "Asian Food");
        Assert.assertEquals(restaurantEatstreetPage.getRestListContainer().get(1).getText(),"BBQ");
    }

    @Test
    public void testRestFilters(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getFilterRating4PlusBtn().click();

        Assert.assertEquals(restaurantEatstreetPage.getRestListContainer().get(0).getText(),"Rating 4+");
    }
    @Test
    public void testRestRating(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        for (int i = 0; i < 50; i++) {
            restaurantEatstreetPage.getRestList().get(i).click();
            sleep(2);
            if (restaurantEatstreetPage.restRatings().size()==1) {
                restaurantEatstreetPage.restRatings().get(0).click();
                break;
            } else {
                driver.navigate().back();
            }   
        }

        Assert.assertTrue(restaurantEatstreetPage.reviewQuantity().getText().contains("Review"));
    }
    @Test
    public void testWorkingHoursLink(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getRestList().get(3).click();
        restaurantEatstreetPage.getHoursLink().click();

        Assert.assertTrue(restaurantEatstreetPage.workingHoursTable().isDisplayed());
    }
    @Test
    public void testRestTakeoutInfo(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getRestList().get(0).click();
        restaurantEatstreetPage.getTakeOutBtn().click();

        Assert.assertTrue(restaurantEatstreetPage.RestInfoList().get(1).getText().contains("Est. Pickup Time"));
        Assert.assertTrue(restaurantEatstreetPage.RestInfoList().get(2).getText().contains("Takeout Minimum"));
    }
    @Test
    public void testRestDeliveryInfo() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getTakeoutRadioBtn().click();
        restaurantEatstreetPage.getRestList().get(0).click();
        restaurantEatstreetPage.getDeliveryBtn().click();

        Assert.assertTrue(restaurantEatstreetPage.RestInfoList().get(1).getText().contains("ETA"));
        Assert.assertTrue(restaurantEatstreetPage.RestInfoList().get(2).getText().contains("Delivery Minimum"));
        Assert.assertTrue(restaurantEatstreetPage.RestInfoList().get(3).getText().contains("Delivery Cost"));
    }
    @Test
    public void testSignInWhenGroupOrder() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getRestList().get(0).click();
        restaurantEatstreetPage.getStartGroupOrderBtn().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://eatstreet.com/signin"));
    }
    @Test
    public void testGroupOrderModalWindow() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getRestList().get(0).click();
        restaurantEatstreetPage.getStartGroupOrderBtn().click();
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2021");
        singInEatstreetPage.getSignInBtn().click();

        Assert.assertTrue(restaurantEatstreetPage.groupOrderModalWindow().isDisplayed());
    }
    @Test
    public void testGroupOrderOnOutOfRangeDistance() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getRestList().get(0).click();
        restaurantEatstreetPage.getStartGroupOrderBtn().click();
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2021");
        singInEatstreetPage.getSignInBtn().click();
        sleep(2);
        Actions action = new Actions(driver);
        action.moveToElement(restaurantEatstreetPage.getDropDownAddressBtn(),10,10).click().perform();
        restaurantEatstreetPage.getInputtedAddress().click();
        restaurantEatstreetPage.getContinueBtn().click();

        Assert.assertEquals(restaurantEatstreetPage.deliveryAddressValidationInfo().getText(),"Out of range");
    }
    @Test
    public void testInviteMembersModalWindowOpening(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getEnterYourAddressLink().sendKeys("Chicago");
        homeEatstreetPage.passModalWindow();
        RestaurantEatstreetPage restaurantEatstreetPage = new RestaurantEatstreetPage(driver);
        restaurantEatstreetPage.getRestList().get(0).click();
        restaurantEatstreetPage.getStartGroupOrderBtn().click();
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2021");
        singInEatstreetPage.getSignInBtn().click();
        restaurantEatstreetPage.getGroupOrderField().clear();
        restaurantEatstreetPage.getGroupOrderField().sendKeys("Weekend Party");
        restaurantEatstreetPage.chooseTakeOutBtn().click();
        restaurantEatstreetPage.splitOrderBtnNo().click();
        restaurantEatstreetPage.getContinueBtn().click();
        sleep(1);

        Assert.assertEquals(restaurantEatstreetPage.membersModalHeader().getText(),"Invite Members");


    }
}
