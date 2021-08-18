package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testPreplyDenis.pages.HeaderPage;
import testPreplyDenis.pages.LoginPage;

import java.awt.*;

public class AuthTest extends TestInit {

    LoginPage loginPage;
    HeaderPage headerPage;
    Robot robot;

    @Test
    public void authElementsAppearance() throws AWTException {
        loginPage = new LoginPage(driver);
        String openNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        headerPage = new HeaderPage(driver);
        openUrl("https://preply.com/");
        robot = new Robot();
        robot.mouseMove(100, 160);
        sleep(5); //waiting for header appearance
        headerPage.headerButtons().get(5).click();
        //testing login page. There's a captcha, so it's just simple functional testing
        for (int i = 0; i < loginPage.logInWithFacebookOrGoogle().size(); i++) {
            loginPage.logInWithFacebookOrGoogle().get(i).click();
            driver.navigate().back();
        }
        loginPage.emailField().sendKeys("testemail@gmail.com");
        loginPage.passwordField().sendKeys("12345678");
        loginPage.forgotPasswordLink().sendKeys(openNewTab);
        loginPage.rememberMeCheckBox().click();
        loginPage.loginButton().click();
        //testing student sign up page
        loginPage.studentSignUpTransfer().click();
        for (int i = 0; i < loginPage.signUpStudentPage().signUpWithFacebookOrGoogle().size(); i++) {
            loginPage.signUpStudentPage().signUpWithFacebookOrGoogle().get(i).click();
            driver.navigate().back();
        }
        loginPage.emailField().sendKeys("testemail@gmail.com");
        loginPage.passwordField().sendKeys("12345678");
        loginPage.rememberMeCheckBox().click();
        for (int i = 0; i < loginPage.signUpStudentPage().termsAndPolicy().size(); i++) {
            loginPage.signUpStudentPage().termsAndPolicy().get(i).sendKeys(openNewTab);
        }
        loginPage.signUpStudentPage().signUpBtn().click();
        loginPage.signUpStudentPage().logInTransfer().click();
    }
}
