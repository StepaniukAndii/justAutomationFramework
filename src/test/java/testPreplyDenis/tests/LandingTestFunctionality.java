package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testPreplyDenis.pages.LandingPage;

public class LandingTestFunctionality extends TestInit {

    LandingPage landingPage;

    @Test
    public void landingTestFunctionality() {
        landingPage = new LandingPage(driver);
        openUrl("https://preply.com/");
        String openNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        landingPage.preplySearchField().sendKeys("English");
        if (landingPage.closeCookies().isDisplayed())
            landingPage.closeCookies().click();
        landingPage.submitBtn().click();
        driver.navigate().back();
        landingPage.showMore().click();
        for (int i = 0; i < landingPage.languagesTutors().size(); i++) {
            landingPage.languagesTutors().get(i).click();
            driver.navigate().back();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");

        for (int i = 0; i < landingPage.aboutLearningBtns().size(); i++) {
            landingPage.aboutLearningBtns().get(i).sendKeys(openNewTab);
        }
        landingPage.becomeATutorBtn().sendKeys(openNewTab);
        landingPage.howItWorksLink().sendKeys(openNewTab);
        for (int i = 0; i < landingPage.additionalInfo().size(); i++) {
            landingPage.additionalInfo().get(i).sendKeys(openNewTab);
        }
    }
}
