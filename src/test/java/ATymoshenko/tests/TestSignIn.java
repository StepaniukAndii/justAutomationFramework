package ATymoshenko.tests;

import ATymoshenko.pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends TestInit {
    @Test
    public void testSignIn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.addSignInBtnOnHeader().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
    }
    @Test
    public void testSignUp(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/" + "/create-account?next=~2F");
        homePage.getGoItBtn().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("hihihioijohj89h");
        homePage.addPasswordAgainField().sendKeys(" hihihioijohj89h");
        homePage.addSignUpBtnOnPopUpWindow().click();
        sleep(2);

        Assert.assertTrue(homePage.myAccountIcon().isDisplayed());
    }

    @Test
    public void testSignInEnterAccount(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("hihihioijohj89h");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);

        Assert.assertTrue(homePage.myAccountIcon().isDisplayed());
    }

    @Test
    public  void testSignOutBtnOnAccountPage(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("hihihioijohj89h");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(3);
        homePage.addSignOutBtn().click();
        sleep(2);

        Assert.assertTrue(homePage.addSignInBtnOnHeader().isDisplayed());
    }
    @Test
    public void testChangePassword(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.getGoItBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("hihihioijohj89h");
        homePage.addSignInBtnOnPopUpWindow().click();
        sleep(2);
        homePage.myAccountIcon().click();
        sleep(3);
        homePage.addChangePasswordBtnOnMyAccountPage().click();
        homePage.addCurrentPasswordField().sendKeys("hihihioijohj89h");
        homePage.addNewPasswordField().sendKeys("rterterteywyw");
        homePage.addConfirmNewPasswordField().sendKeys("rterterteywyw");
        homePage.addUpdatePasswordBtn().click();
        homePage.addSignOutBtn().click();
        homePage.addSignInBtnOnHeader().click();
        homePage.addEmailField().sendKeys("alextymoshenko81@gmail.com");
        homePage.addPasswordField().sendKeys("rterterteywyw");
        homePage.addSignInBtnOnPopUpWindow().click();

        Assert.assertTrue(homePage.myAccountIcon().isDisplayed());
    }
    @Test
    public  void testEditYourInfoBtn(){
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
        homePage.addEditYourInfoBtn().click();
        homePage.addFirstNameFieldInChangeAccountInfoWindow().sendKeys("Clint");
        homePage.addLastNameFieldInChangeAccountInfoWindow().sendKeys("Eastwood");
        sleep(2);
        homePage.addPhoneNumberFieldInChangeAccountInfoWindow().sendKeys("+1 202 679 45 01");
        homePage.addSaveBtnInChangeAccountInfoWindow().click();

    }
}
