package testPreplyDenis.tests;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testPreplyDenis.pages.FooterPage;
import org.openqa.selenium.JavascriptExecutor;

public class FooterTestElementsFunctionality extends TestInit {

    FooterPage footerPage;

    @Test
    public void footerTestElementAppearance() {
        footerPage = new FooterPage(driver);
        openUrl("https://preply.com/");
        String openNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");

        for (int i = 0; i < footerPage.sectionsAndSocials().size(); i++) {
            footerPage.sectionsAndSocials().get(i).sendKeys(openNewTab);
        }
        for (int i = 0; i < footerPage.sections().size(); i++) {
            footerPage.sections().get(i).click();
            driver.navigate().back();
        }
        for (int i = 0; i < footerPage.typesOfTutors().size(); i++) {
            footerPage.typesOfTutors().get(i).sendKeys(openNewTab);
        }
        for (int i = 0; i < footerPage.terms().size(); i++) {
            footerPage.terms().get(i).sendKeys(openNewTab);
        }
        for (int i = 0; i < footerPage.downloadAppOnStores().size(); i++) {
            footerPage.downloadAppOnStores().get(i).click();
        }
    }
}
