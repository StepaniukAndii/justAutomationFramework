package AlloTest.TestClases;

import AlloTest.Pages.FooterLocators;
import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class FooterHelpCheckUrl extends TestInit {

    FooterLocators locators;

    @Test
    public void footerHelpCheckUrl(){
        locators = new FooterLocators (driver);
        driver.get ("https://allo.ua");
        clickUrl();
    }
    private void clickUrl() {
        locators.helpLinkOne().click();
        locators.helpLinkToo ().click();
        locators.helpLinkTry().click();
        locators.helpLinkFor().click();
        locators.helpLinkFive().click();
    }
}