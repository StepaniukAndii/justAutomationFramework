package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import testPreplyDenis.pages.LandingPage;

import java.awt.*;

public class HeaderTestNonRegistered extends TestInit {

    LandingPage landingPage;
    Robot robot;

    @Test
    public void testHeaderNonRegistered() throws AWTException {
        landingPage = new LandingPage(driver);
        String openNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        openUrl("https://preply.com/");
        robot = new Robot();
        waitForHeaderAppearance();
        //testing of appearance
        Assert.assertTrue(landingPage.headerLogo().isDisplayed());
        for (int i = 0; i < landingPage.headerButtons().size(); i++) {
            Assert.assertTrue(landingPage.headerButtons().get(i).isDisplayed());
        }
        Assert.assertTrue(landingPage.changeLanguageAndCurrency().isDisplayed());
        //testing of functionality
        for (int i = 0; i < landingPage.headerButtons().size(); i++) {
            landingPage.headerButtons().get(i).sendKeys(openNewTab);
        }
        landingPage.changeLanguageAndCurrency().click();
        landingPage.selectorsOfLanguageAndCurrency().get(0).click();
        landingPage.selectLanguage().get(0).click();
        waitForHeaderAppearance();
        landingPage.changeLanguageAndCurrency().click();
        landingPage.selectorsOfLanguageAndCurrency().get(1).click();
        landingPage.selectCurrency().get(0).click();
        waitForHeaderAppearance();
        landingPage.headerLogo().click();
    }

    private void waitForHeaderAppearance() {
        robot.mouseMove(100, 160);
        sleep(5); //waiting for header appearance
    }
}
