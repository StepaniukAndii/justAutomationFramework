package denisFoxtrotTest.footerTest;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.foxPages.FooterPage;
import org.testng.annotations.Test;

public class TestFooter extends TestInit {

    @Test
    public void footer() {
        FooterPage footerPage = new FooterPage(driver);
        openUrl("https://www.foxtrot.com.ua/");
        int size = 1;
        for (int i = 0; i < 33; i++) {
            if (footerPage.footerButtons().get(size).isDisplayed()) {
                String text = footerPage.footerButtons().get(size).getText();
                System.out.println(text + " is displayed.");
                size++;
            }
        }
        if (footerPage.phone().isDisplayed()) {
            String phone = footerPage.phone().getText();
            System.out.println(phone);
        }
        if (footerPage.email().isDisplayed()) {
            String email = footerPage.email().getText();
            System.out.println(email);
        }
    }
}
