package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.MyAccountPageEatstreet;
import SerhiiBondar.Pages.SingInEatstreetPage;
import SerhiiBondar.Pages.SingUpEatstreetPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMyAccountEatstreet extends TestInit {

    @Test
    public void testChangePassword(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getSignUpLine().click();
        SingUpEatstreetPage singUpEatstreetPage = new SingUpEatstreetPage(driver);
        singUpEatstreetPage.getSingUpEmailField().sendKeys("serhiibondar2@gmail.com");
        singUpEatstreetPage.getPasswordForSignUpField().sendKeys("club2021");
        singUpEatstreetPage.getPasswordAgainField().sendKeys("club2021");
        singUpEatstreetPage.getSignUpBtn().click();
        sleep(6);
        homeEatstreetPage.myAccountBtn().click();
        sleep(5);
        MyAccountPageEatstreet myAccountPageEatstreet = new MyAccountPageEatstreet(driver);
        myAccountPageEatstreet.getChangePasswordBtn().click();
        myAccountPageEatstreet.getCurrentPasswordField().sendKeys("club2021");
        myAccountPageEatstreet.getNewPasswordField().sendKeys("club2022");
        myAccountPageEatstreet.getConfirmNewPasswordField().sendKeys("club2022");
        myAccountPageEatstreet.getUpdatePasswordBtn().click();
        sleep(5);
        myAccountPageEatstreet.getSignOutBtn().click();
        sleep(5);
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2022");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);

        Assert.assertTrue(homeEatstreetPage.getMyAccountBtn().size()>0);
    }
    @Test
    public void testEditYourInfo(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2022");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);
        homeEatstreetPage.myAccountBtn().click();
        MyAccountPageEatstreet myAccountPageEatstreet = new MyAccountPageEatstreet(driver);
        sleep(3);
        myAccountPageEatstreet.getEditInfoBtn().click();
        myAccountPageEatstreet.getFirstNameField().clear();
        myAccountPageEatstreet.getLastNameField().clear();
        myAccountPageEatstreet.getPhoneNumberField().clear();
        myAccountPageEatstreet.getFirstNameField().sendKeys("John");
        myAccountPageEatstreet.getLastNameField().sendKeys("Smith");
        myAccountPageEatstreet.getPhoneNumberField().sendKeys("+380674099999");
        myAccountPageEatstreet.getSaveBtn().click();

        Assert.assertEquals(myAccountPageEatstreet.getUserNameDisplayed().getText(),"John Smith");
    }
    @Test
    public void testAddAddress(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2022");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);
        homeEatstreetPage.myAccountBtn().click();
        MyAccountPageEatstreet myAccountPageEatstreet = new MyAccountPageEatstreet(driver);
        sleep(3);
        myAccountPageEatstreet.getAddAddressBtn().click();
        myAccountPageEatstreet.getStreetAddressField().sendKeys("25 Emery Mill Drive");
        myAccountPageEatstreet.getCityField().sendKeys("Tampa");
        myAccountPageEatstreet.getStateField().sendKeys("Florida");
        myAccountPageEatstreet.getZipField().sendKeys("33620");
        myAccountPageEatstreet.getSaveBtn().click();

        Assert.assertEquals(myAccountPageEatstreet.getCityAndStateString().getText(),"Tampa, FL");
    }
    @Test
    public void testChangeAddress(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getGoItBtn().click();
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2022");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);
        homeEatstreetPage.myAccountBtn().click();
        sleep(2);
        MyAccountPageEatstreet myAccountPageEatstreet = new MyAccountPageEatstreet(driver);
        myAccountPageEatstreet.getEditAddressBtn().click();
        myAccountPageEatstreet.getStreetAddressField().clear();
        myAccountPageEatstreet.getCityField().clear();
        myAccountPageEatstreet.getStateField().clear();
        myAccountPageEatstreet.getZipField().clear();
        myAccountPageEatstreet.getStreetAddressField().sendKeys("3 Terry Mill Rd SE");
        myAccountPageEatstreet.getCityField().sendKeys("Atlanta");
        myAccountPageEatstreet.getStateField().sendKeys("Georgia");
        myAccountPageEatstreet.getZipField().sendKeys("30317");
        myAccountPageEatstreet.getSaveBtn().click();

        Assert.assertEquals(myAccountPageEatstreet.getCityAndStateString().getText(),"Atlanta, GA");
        Assert.assertEquals(myAccountPageEatstreet.getFullStreetAddressString().getText(),"3 Terry Mill Rd SE");
    }

}
