package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testPreplyDenis.pages.HeaderPage;
import testPreplyDenis.pages.LoginPage;

import java.awt.*;

public class SignInAsTutorTest extends TestInit {

    LoginPage loginPage;
    HeaderPage headerPage;
    Robot robot;

    @Test
    public void signInAsTutor() throws AWTException {
        String openNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        headerPage = new HeaderPage(driver);
        loginPage = new LoginPage(driver);
        openUrl("https://preply.com");
        robot = new Robot();
        robot.mouseMove(100, 160);
        sleep(5); //waiting for header appearance
        headerPage.headerButtons().get(5).click();
        loginPage.tutorSignUpTransfer().click();
        loginPage.signUpTutorPage().emailInputField().sendKeys("testemail@gmail.com");
        loginPage.signUpTutorPage().passwordInputField().sendKeys("12345678");
        loginPage.signUpTutorPage().submitBtn().click();
        driver.navigate().refresh();
        for (int i = 0; i < loginPage.signUpTutorPage().continueWithFacebookOrGoogle().size(); i++) {
            loginPage.signUpTutorPage().continueWithFacebookOrGoogle().get(i).click();
            driver.navigate().back();
        }
        for (int i = 0; i < loginPage.signUpTutorPage().termsAndPolicy().size(); i++) {
            loginPage.signUpTutorPage().termsAndPolicy().get(i).sendKeys(openNewTab);
        }
        loginPage.signUpTutorPage().jumpToSignUpBtn().click();
        loginPage.signUpTutorPage().becomeATutorBtn().click();
        for (int i = 0; i < loginPage.signUpTutorPage().supportLinks().size(); i++) {
            loginPage.signUpTutorPage().supportLinks().get(i).sendKeys(openNewTab);
        }
        for (int i = 0; i < loginPage.signUpTutorPage().faqOpen().size(); i++) {
            loginPage.signUpTutorPage().faqOpen().get(i).click();
        }
        loginPage.signUpTutorPage().getStartedBtn().click();
    }
}
