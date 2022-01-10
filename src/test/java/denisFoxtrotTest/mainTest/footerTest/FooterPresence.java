package denisFoxtrotTest.mainTest.footerTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.pages.FooterFoxtrot;
import org.testng.annotations.Test;

public class FooterPresence extends TestInit {

    @Test
    public void footerClickability() {
        FooterFoxtrot footerFoxtrot = new FooterFoxtrot(driver);
        openUrl("https://www.foxtrot.com.ua/");
        int size = 1;
        String footerText;
        for (int i = 0; i < 33; i++) {
            if (footerFoxtrot.footerButtons().get(size).isDisplayed()) {
                footerText = footerFoxtrot.footerButtons().get(size).getText();
                System.out.println("element " + footerText + " is present.");
            } else {
                footerText = footerFoxtrot.footerButtons().get(size).getText();
                System.out.println("element " + footerText + " isn't present.");
            }
            size++;
        }
    }
}