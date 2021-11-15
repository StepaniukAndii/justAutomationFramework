package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends TestInit {

        @Test
        public void checkGetFedBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.enterYourAddressField().sendKeys("NY");
        homePage.getGoItBtn().click();
        homePage.closeModalIfExist();
        homePage.getGetFedBtn().click();
        sleep(5);
        Assert.assertTrue(driver.getCurrentUrl().contains("restaurants"));
    }

}