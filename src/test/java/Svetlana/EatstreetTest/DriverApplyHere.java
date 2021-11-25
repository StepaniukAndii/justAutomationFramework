package Svetlana.EatstreetTest;
import ClasesToAllUs.TestInit;
import Svetlana.EatstreetPage.FooterPage;
import Svetlana.EatstreetPage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class DriverApplyHere extends TestInit {
    @Test
    public void driverApplyHere(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openUrl("https://eatstreet.com/");
        HomePage homePage=new HomePage(driver);
        homePage.getClickGoItBtn().click();
        FooterPage footerPage=new FooterPage(driver);
        footerPage.clickDriver().click();
        footerPage.getClickAddress().click();
        footerPage.getClickCity().get(1).click();
        footerPage.clickApplyHere().get(0).click();
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        sleep(10);
        footerPage.inputFerstName().sendKeys("Svetlana");
        footerPage.inputLastName().sendKeys("Putas");
        footerPage.inputEmail().sendKeys("putas@gmail.com");
        footerPage.inputNumber().sendKeys("+152236552656");
        sleep(5);
        footerPage.clickSubmit().click();

        Assert.assertTrue(footerPage.checkFhoneValidation().isDisplayed());
    }
}
