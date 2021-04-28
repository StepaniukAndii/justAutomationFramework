package RazooM.AlloTest.DemoqaCom;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoqaButtons extends TestInit {

    DemoqaLocators locators;

    @Test
    public void demoqaButtons(){
        locators = new DemoqaLocators (driver);
        driver.get ("https://demoqa.com/");
        locators.demoqaElements().click();
        locators.demoqaBoxButtons().click();
        dablClick();
        rightClick();
        oneClick();
    }
    private void oneClick() {
          locators.demoqaBoxOneClickBtn ().click();
    }
    private void rightClick() {
        Actions action = new Actions(driver).contextClick(locators.demoqaBoxRightClickBtn());
        action.build().perform();
    }
    private void dablClick() {
        WebElement element = locators.demoqaBoxDoubleClickBtn();
        Actions actions =  new Actions (driver);
        actions.doubleClick(element).build().perform();
    }
}