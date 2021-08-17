package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testPreplyDenis.pages.HeaderPage;

import java.awt.*;

public class HeaderTesElementFunctionality extends TestInit {

    HeaderPage headerPage;
    Robot robot;

    @Test
    public void testHeaderNonRegistered() throws AWTException {
        headerPage = new HeaderPage(driver);
        String openNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        openUrl("https://preply.com/");
        robot = new Robot();
        waitForHeaderAppearance();
        for (int i = 0; i < headerPage.headerButtons().size(); i++) {
            headerPage.headerButtons().get(i).sendKeys(openNewTab);
        }
        headerPage.changeLanguageAndCurrency().click();
        headerPage.selectorsOfLanguageAndCurrency().get(0).click();
        headerPage.selectLanguage().get(0).click();
        waitForHeaderAppearance();
        headerPage.changeLanguageAndCurrency().click();
        headerPage.selectorsOfLanguageAndCurrency().get(1).click();
        headerPage.selectCurrency().get(0).click();
        waitForHeaderAppearance();
        headerPage.headerLogo().click();
    }

    private void waitForHeaderAppearance() {
        robot.mouseMove(100, 160);
        sleep(5); //waiting for header appearance
    }
}
