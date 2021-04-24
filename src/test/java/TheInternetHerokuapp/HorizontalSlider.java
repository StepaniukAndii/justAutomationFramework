package TheInternetHerokuapp;

import ClasesToAllUs.TestInit;
import TheInternetHerokuapp.Locators.Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HorizontalSlider extends TestInit {

    Locators locators;

    @Test
    public void horizontalSlider(){
        locators = new Locators (driver);
        driver.get("http://the-internet.herokuapp.com/");
        locators.horizontalSlider().click();
        sliderMoove();
    }
    private void sliderMoove() {
        WebElement slider = locators.horizontalLain();
        for(int i=0;i<=10;i++){
            slider.sendKeys(Keys.ARROW_RIGHT);
            sleep (1);
        }
    }
}