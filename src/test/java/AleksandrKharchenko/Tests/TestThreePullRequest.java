package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.HomePage;
import AleksandrKharchenko.Pages.RestPage;
import AleksandrKharchenko.Pages.SignInPage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestThreePullRequest extends TestInit {

    @Test
    public void checkTextRestaurantLosAngeles(){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        RestPage restPage = new RestPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.closeModal();
        homePage.getSignInLink().click();
        signInPage.getEmailField().sendKeys("x-o-m@ukr.net");
        signInPage.getPasswordField().sendKeys("qwer1526js");
        signInPage.getSignInBtn().click();
        homePage.getAddressField().sendKeys("Los Angeles");
        homePage.getFedBtn().click();
        homePage.checkAndClosePopUpWindow();
        homePage.getFedBtn().click();

        Assert.assertTrue(restPage.getTextInLosAngelesRestIsDisplayed());
    }
}
