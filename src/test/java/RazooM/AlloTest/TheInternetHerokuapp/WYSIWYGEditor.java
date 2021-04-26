package RazooM.AlloTest.TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import RazooM.AlloTest.TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WYSIWYGEditor extends TestInit {

    Locators locators;
    WebElement iframe;

    @Test
    public void wYSIWYGEditor(){
        locators = new Locators (driver);
        driver.get ("http://the-internet.herokuapp.com/");
        locators.wYSIWYGEditor ().click();
        iframe = locators.wYSIWYGEditorIframe ();
        leadTheText();
        exitWithFrame();
        fattyText();
        sleep (3);

    }
    private void exitWithFrame() {
        driver.switchTo().defaultContent();
        sleep(1);
    }
    private void fattyText() {
        locators.wYSIWYGEditorNewFile().click();
        locators.wYSIWYGEditorNewDocument().click();
        driver.switchTo().frame(iframe);
        locators.wYSIWYGEditorFildText().sendKeys(" Рандомный текст два для  теста. ");
    }
    private void leadTheText() {
        driver.switchTo().frame(iframe);
        locators.wYSIWYGEditorFildText().sendKeys(" Рандомный текст для  теста. ");
        exitWithFrame();
    }
}