package RazooM.AlloTest.TestURLClicabls;

import RazooM.AlloTest.Pages.PageHomeAllo;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class ClickScroll extends TestInit {

    PageHomeAllo locators;

    @Test
    public void vCatalogPopularUrlClick() {
        locators = new PageHomeAllo(driver);
        driver.navigate ().to("https://allo.ua");
        clickUrl ();
    }
    private void clickUrl() {
        int number = locators.clickScroll().size();
        for (int i=0;i<number;i++){
            moveMouseToElement(locators.scrollArrowMous ());
            locators.nextButton().click();
            sleep (1);
        }
        for (int i=0;i<number;i++){
            moveMouseToElement(locators.scrollArrowMous ());
            locators.prevButton().click();
            sleep (1);
        }
    }
}