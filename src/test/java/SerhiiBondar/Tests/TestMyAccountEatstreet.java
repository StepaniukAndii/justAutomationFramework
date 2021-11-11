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
}
