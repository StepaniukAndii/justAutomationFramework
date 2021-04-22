package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import jdk.internal.org.jline.utils.Display;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestFastButtonToTop extends TestInit {
    @Test
    public void fastButton (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        moveMouseToElement(ukrNetPages.toEndOfTheFirstPage());
        sleep(2);
        ukrNetPages.buttonFastToTop().click();
        sleep(2);
    }
}
