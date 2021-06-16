package testOLX.testClasses;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import testOLX.pages.HomePage;

public class TestFooterCheck extends TestInit {

    @Test
    public void footer() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://www.olx.ua/");
        homePage.closeCookies().click();
        String openNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
        int size = 0;
        for (int i = 0; i < 16; i++) {
            if (homePage.footerButtons().get(size).isDisplayed()) {
                String text = homePage.footerButtons().get(size).getText();
                System.out.println(text + " is displayed.");
                homePage.footerButtons().get(size).sendKeys(openNewTab);
                size++;
            }
        }
        size = 0;
        for (int i = 0; i < 2; i++) {
            if (homePage.footerPolicyButtons().get(size).isDisplayed()) {
                String text = homePage.footerPolicyButtons().get(size).getText();
                System.out.println(text + " is displayed.");
                homePage.footerPolicyButtons().get(size).sendKeys(openNewTab);
                size++;
            } else {
                driver.navigate().back();
                size--;
            }
        }
        if (homePage.partners().isDisplayed()) {
            String text = homePage.partners().getText();
            System.out.println(text + " is displayed.");
            homePage.partners().click();
        }
    }
}
