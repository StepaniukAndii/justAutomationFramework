package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.HomePage;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class TestRozetkaAdvertising extends TestInit {

    @Test
    public void testRozetkaAdvertising() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://rozetka.com.ua");
        homePage.advertisingOnHome().click();
        System.out.println(driver.getCurrentUrl());
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> it = tabs.iterator();
        String tab1 = it.next();
        String tab2 = it.next();
        driver.switchTo().window(tab1);
        driver.close();
        driver.switchTo().window(tab2);
    }
}