package denisFoxtrotTest.mainTest.footerTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.FooterFoxtrot;
import org.testng.annotations.Test;

import java.awt.*;

public class FooterClickability extends TestInit {

    public void footerClickability() throws AWTException {
        FooterFoxtrot footerFoxtrot = new FooterFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        Robot robot = new Robot();
    }
}
