package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testPreplyDenis.pages.HeaderPage;

import java.awt.*;

public class HeaderTestElementAppearance extends TestInit {

    HeaderPage headerPage;
    Robot robot;

    @Test
    public void testHeaderElementAppearance() throws AWTException {
        headerPage = new HeaderPage(driver);
        String openNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        openUrl("https://preply.com/");
        robot = new Robot();
        waitForHeaderAppearance();
        Assert.assertTrue(headerPage.headerLogo().isDisplayed());
        for (int i = 0; i < headerPage.headerButtons().size(); i++) {
            Assert.assertTrue(headerPage.headerButtons().get(i).isDisplayed());
        }
        Assert.assertTrue(headerPage.changeLanguageAndCurrency().isDisplayed());
    }

    private void waitForHeaderAppearance() {
        robot.mouseMove(100, 160);
        sleep(5); //waiting for header appearance
    }
}
