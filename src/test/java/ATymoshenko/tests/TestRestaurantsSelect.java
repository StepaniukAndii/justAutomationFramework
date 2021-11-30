package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRestaurantsSelect extends TestInit {
    @Test
    public void selectRestAnyCity() {
    HomePage homePage = new HomePage(driver);
    openUrl("https://eatstreet.com/");
    homePage.getGoItBtn().click();
    homePage.addRestAnyCity().click();

    Assert.assertTrue(driver.getCurrentUrl().contains("phoenix-az"));
    }
    @Test
    public void testChoiceAnyFoodInAnyCity(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addRestAnyCity().click();
        sleep(2);
        homePage.addAnyFoodInAnyCity().get(0).click();//American food

        Assert.assertTrue(driver.getCurrentUrl().contains("american-food-delivery"));
    }
    @Test
    public void testSelectAnyCityInTakingHungryHeadOnAcrossTheNationList() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.getGoItBtn().click();
        sleep(2);
        homePage.addAnyStation().get(0);//AZ
        homePage.addAnyCity().get(0).click();//Phoenix

        Assert.assertTrue(driver.getCurrentUrl().contains("phoenix-az"));
    }
}
