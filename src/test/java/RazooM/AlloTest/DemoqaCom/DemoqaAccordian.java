package RazooM.AlloTest.DemoqaCom;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class DemoqaAccordian extends TestInit {

    DemoqaLocators locators;

    @Test
    public void demoqaAccordian(){
        locators = new DemoqaLocators (driver);
        driver.get ("https://demoqa.com/");
        locators.demoqaWidgets().click();
        locators.demoqaAccordian().click();
        showOneText();
        showTwoText();
        showFryText();
    }
    private void showFryText() {
        locators.demoqaAccordianFry().click();
    }
    private void showTwoText() {
        locators.demoqaAccordianTwo().click();
    }
    private void showOneText() {
        locators.demoqaAccordianOne().click();
    }
}