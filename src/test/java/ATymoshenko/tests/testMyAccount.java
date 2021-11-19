package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testMyAccount extends TestInit {
    @Test
    public void checkRequiredFields(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);
        homePage.addNewAddressBtn().click();
        homePage.addStreetAddressField().sendKeys("Octobers str");
        homePage.addAptSuiteField().sendKeys("123");
        homePage.addBuildingNameField().sendKeys("321");
        homePage.addCityField().sendKeys("NY");
        homePage.addStateField().sendKeys("New York");
        homePage.addZipField().sendKeys("333");
        homePage.addSaveBtnInAddANewAddressWindow().click();
        sleep(2);
        Assert.assertTrue(homePage.getListRequired().size()==0);
    }
//    @Test
//    public void test1RequiredField(){
//        HomePage homePage = new HomePage(driver);
//        openUrl("https://qa2.eatstreet.com/");
//    }
}
