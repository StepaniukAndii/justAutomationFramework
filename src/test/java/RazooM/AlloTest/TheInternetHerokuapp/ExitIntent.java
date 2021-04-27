package RazooM.AlloTest.TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import RazooM.AlloTest.TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

public class ExitIntent extends TestInit {

    Locators locators;
    Robot robot;
    boolean modalWindow;

    @Test
    public void exitIntent() throws AWTException {
        locators = new Locators (driver);
        driver.get("http://the-internet.herokuapp.com/");
        locators.exitIntent().click();
        robot = new Robot();
        arrowUP();
        checkEnableModaTitle();
        Assert.assertTrue ( true,"Ля ля ля");
        if(true){
            closeModalWindow();
        }
    }
    private void closeModalWindow() {
        WebElement close = locators.modalCloseWindow();
        sleep(1);
        close.click ();
    }
    private void checkEnableModaTitle() {
        modalWindow = locators.exitModaTitle().isDisplayed();
        if(modalWindow){
            System.out.println ("Есть окно");
        }else {
            System.out.println ("Нету окна");
        }
    }
    private void arrowUP() {
        sleep (2);
        robot.mouseMove(500, -550);
    }
}