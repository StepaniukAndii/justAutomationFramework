package TestRozetka;

import ClasesToAllUs.TestInit;
import TestRozetka.Pages.GooglePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFindSite extends TestInit {

    @Test
    public void testFindSite() {
        GooglePage googlePage = new GooglePage(driver);
        googleIt("сковорода");
        boolean flag = true;
        int flagPage=0;
        while (flagPage<8 && flag) {

            for (WebElement element:googlePage.serchLink()) {
                if (element.getAttribute("href").contains("https://rozetka")) {
                    element.click();
                    flag=false;
                    break;
                }
            }
            if (flag) {
                googlePage.nextList().click();
                flagPage++;
            }
        }
        Assert.assertFalse(flag);
    }
}
