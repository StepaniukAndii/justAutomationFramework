package testEatStreetDenis.tests.footer;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import testEatStreetDenis.pages.footer.FooterPage;

public class FooterTest extends TestInit {

    FooterPage footerPage;

    @Test
    public void footerTest() {
        footerPage = new FooterPage(driver);
        openUrl("https://qa2.eatstreet.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        for (int i = 0; i < footerPage.footerSocials().size(); i++) {
            footerPage.footerSocials().get(i).sendKeys(footerPage.openNewTab());
        }
        footerElements(0, 6);
        footerSpecialElements(7);
        footerElements(8, 9);
        footerPage.footerElements().get(10).click();
        footerElements(11, 16);
    }

    private void footerElements(Integer startElement, Integer lastElement) {
        for (int i = startElement; i <= lastElement; i++) {
            footerPage.footerElements().get(i).sendKeys(footerPage.openNewTab());
        }
    }

    private void footerSpecialElements(Integer element) {
        footerPage.footerElements().get(element).click();
        driver.navigate().back();
    }
}
