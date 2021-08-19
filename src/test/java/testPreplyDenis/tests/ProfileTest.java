package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPreplyDenis.pages.GoogleAuth;
import testPreplyDenis.pages.HeaderPage;
import testPreplyDenis.pages.ProfilePage;

import java.awt.*;

public class ProfileTest extends TestInit {

    GoogleAuth googleAuth;
    HeaderPage headerPage;
    ProfilePage profilePage;
    Robot robot;

    @Test
    public void profileTest() throws AWTException {
        googleAuth = new GoogleAuth(driver);
        headerPage = new HeaderPage(driver);
        profilePage = new ProfilePage(driver);
        openUrl("https://preply.com/");
        robot = new Robot();
        robot.mouseMove(100, 160);
        sleep(5); //waiting for header appearance
        headerPage.headerButtons().get(5).click();
        headerPage.loginPage().logInWithFacebookOrGoogle().get(1).click();
        authWithGoogle("m16a1m416@gmail.com", "tarasShevchenko"); //Testing-only account. Free for use
        sleep(5); //waiting for re-direction
        headerPage.openProfile().click();
        headerPage.settings().click();
        profilePage.messagesBtn().click();
        profilePage.myLessonsBtn().click();
        profilePage.settingsProfileBtn().click();

        Assert.assertTrue(profilePage.accountEditPhoto().isDisplayed());
        Assert.assertTrue(profilePage.accountUploadPhoto().isDisplayed());
        for (int i = 0; i < profilePage.accountUserName().size(); i++) {
            Assert.assertTrue(profilePage.accountUserName().get(i).isDisplayed());
        }
        Assert.assertTrue(profilePage.accountPhone().isDisplayed());
        Assert.assertTrue(profilePage.accountTimezoneSelect().isDisplayed());
        Assert.assertTrue(profilePage.accountSaveBtn().isDisplayed());
        Assert.assertTrue(profilePage.accountDeleteAccBtn().isDisplayed());

        profilePage.settingsSections().get(0).click();

        Assert.assertTrue(profilePage.emailField().isDisplayed());

        profilePage.settingsSections().get(1).click();
        for (int i = 0; i < profilePage.passwordChange().size(); i++) {
            Assert.assertTrue(profilePage.passwordChange().get(i).isDisplayed());
        }
        profilePage.settingsSections().get(2).click();
        profilePage.settingsSections().get(3).click();
        profilePage.settingsSections().get(4).click();
        for (int i = 0; i < profilePage.autoConfirmRadioBtns().size(); i++) {
            Assert.assertTrue(profilePage.autoConfirmRadioBtns().get(i).isDisplayed());
        }
        Assert.assertTrue(profilePage.autoConfirmationSaveBtn().isDisplayed());

        profilePage.settingsSections().get(5).click();

        Assert.assertTrue(profilePage.connectGoogleCalendarBtn().isDisplayed());

        profilePage.settingsSections().get(6).click();
        for (int i = 0; i < profilePage.notificationsCheckboxes().size(); i++) {
            Assert.assertTrue(profilePage.notificationsCheckboxes().get(i).isDisplayed());
        }
        Assert.assertTrue(profilePage.notificationsUnsubscribe().isDisplayed());
    }

    private void authWithGoogle(String email, String password) {
        googleAuth.googleEmail().sendKeys(email);
        googleAuth.next().click();
        googleAuth.googlePassword().sendKeys(password);
        googleAuth.next().click();
    }
}
