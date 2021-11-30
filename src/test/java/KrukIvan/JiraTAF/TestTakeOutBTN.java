package KrukIvan.JiraTAF;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTakeOutBTN extends TestInit {
    @Test
    public void testTakeOutBTN(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clickButtonGotIt().click();
        homePage.writeAddress().sendKeys("new york \n");
        homePage.bTNEnterAddress().click();
        homePage.bTNTakeOut().click();
        sleep(3);
        driver.findElement(By.xpath("//input[@id='home-checkbox-takeout']")).getAttribute("class").contains("ng-valid-parse");
        homePage.bTNGetFed().click();
        sleep(3);
        Assert.assertTrue(homePage.filterTakeoutIsOn().isDisplayed());
    }
}
