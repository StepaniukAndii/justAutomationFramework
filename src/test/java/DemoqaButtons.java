
import ClasesToAllUs.TestInit;
import RazooM.AlloTest.DemoqaCom.DemoqaLocators;
import org.openqa.selenium.Keys;
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
        locators.demoqaBoxDoubleClickBtn().click();
    }
    private void rightClick() {
        locators.demoqaBoxRightClickBtn().sendKeys(Keys.RIGHT);
    }
    private void dablClick() {
        WebElement element = locators.demoqaBoxDoubleClickBtn();
        Actions actions =new Actions (driver);
        actions.doubleClick(element).build().perform();
    }
}