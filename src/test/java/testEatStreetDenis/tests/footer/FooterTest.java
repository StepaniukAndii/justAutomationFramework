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

        for (int i = 0; i < footerPage.getFooterSocials().size(); i++) {
            footerPage.getFooterSocials().get(i).sendKeys(footerPage.openNewTab());
        }
        openFooterElementsInRange(0, 6);
        openFooterSpecialElements(7);
        openFooterElementsInRange(8, 9);
        footerPage.getFooterElements().get(10).click();
        openFooterElementsInRange(11, 16);
    }

    private void openFooterElementsInRange(Integer startElement, Integer lastElement) {
        for (int i = startElement; i <= lastElement; i++) {
            footerPage.getFooterElements().get(i).sendKeys(footerPage.openNewTab());
        }
    }

    private void openFooterSpecialElements(Integer element) {
        footerPage.getFooterElements().get(element).click();
        driver.navigate().back();
    }
}
