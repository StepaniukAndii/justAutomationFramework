package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.SingInEatstreetPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginEatstreet extends TestInit {
    @Test
    public void testLogInWithIncorrectCreds(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("blabla@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("1234567");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);

        Assert.assertTrue(singInEatstreetPage.incorrectLogInInformation().isDisplayed());
    }
    @Test
    public void testEmailField(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("blablabla");
        singInEatstreetPage.getPasswordField().click();

        Assert.assertEquals(singInEatstreetPage.enterValidEmailAddressText().getText(),
                "Please enter a valid email address");

    }

}
