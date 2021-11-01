package Svetlana;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGit extends TestInit {



    @Test
    public void openCityMedison(){
        driver.get("https://eatstreet.com");
        Assert.assertEquals("https://eatstreet.com","https://eatstreet.com");
        HomePage homePage=new HomePage(driver);
        homePage.getAddressInput().sendKeys("Medison");
        homePage.getPressFedBtn().click();


    }





















}
