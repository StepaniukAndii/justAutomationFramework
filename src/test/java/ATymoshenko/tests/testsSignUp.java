package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testsSignUp extends TestInit {
    @Test
    public void checkMyAccountBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        sleep(2);
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);

        Assert.assertTrue(homePage.myAccountIcon().isDisplayed());
    }

    @Test
    public void getMyAccountBtn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        sleep(2);
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("account/info"));
    }
}
