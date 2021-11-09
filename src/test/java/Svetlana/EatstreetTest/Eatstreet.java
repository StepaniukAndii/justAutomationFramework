package Svetlana.EatstreetTest;

import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Eatstreet extends TestInit {


    @Test
    public void testOpenCityMedison() {
        driver.get("https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getAddressInput().sendKeys("Medison");
        homePage.getPressFedBtn().click();
        Assert.assertTrue(homePage.getH1().getText().contains("Medison"));
    }

}
