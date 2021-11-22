package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
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
//    @Test
//    public void testAnyKitchenInAnyCity(){
//        HomePage homePage = new HomePage(driver);
//        openUrl("https://eatstreet.com/");
//        homePage.getGoItBtn().click();
//        homePage.enterYourAddressField().sendKeys("NY");
//        homePage.getGetFedBtn().click();
//        homePage.addOpenNowBtnInRestMenu().click();
//
//        Assert.assertTrue(homePage.openNowSignInRestMenu));
//    }

}
