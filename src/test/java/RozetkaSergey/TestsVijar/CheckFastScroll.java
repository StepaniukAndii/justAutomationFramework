package RozetkaSergey.TestsVijar;

import ClasesToAllUs.TestInit;
import RozetkaSergey.HomePageVijar;
import RozetkaSergey.VijarPages.VijarPages5_8;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CheckFastScroll extends TestInit {
    @Test
    public void checkFastScroll(){
        VijarPages5_8 vijarPages5_8 = new VijarPages5_8(driver);
        vijarPages5_8.enterToVijar("https://viyar.ua/");
        vijarPages5_8.closeAdverb().click();
        vijarPages5_8.scrollDown().sendKeys(Keys.PAGE_DOWN);
        sleep(2);
        vijarPages5_8.scrollFastUpButton().click();
        sleep(2);
    }
}
