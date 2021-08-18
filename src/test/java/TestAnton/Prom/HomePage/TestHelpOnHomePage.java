package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpOnHomePage extends TestInit {

    @Test
    public void testHelpOnHomePage(){
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.getHelpBtnOnHomePage().click();

        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        Assert.assertEquals(homePage.getTextOnHelpPage().getText(), "Чим ми можемо допомогти?");
    }
}
