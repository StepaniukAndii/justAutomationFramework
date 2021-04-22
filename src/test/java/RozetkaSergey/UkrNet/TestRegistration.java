package RozetkaSergey.UkrNet;

import ClasesToAllUs.TestInit;
import RozetkaSergey.UkrNetPages.UkrNetPages;
import org.testng.annotations.Test;


public class TestRegistration extends TestInit {
    String login = "grinred69";
    String pass = "23112010uk";

    @Test
    public void testRegistration (){
        UkrNetPages ukrNetPages = new UkrNetPages(driver);
        ukrNetPages.enterToUkrNet("https://www.ukr.net/ua");
        driver.switchTo().frame(getElement("//iframe[@name='mail widget']"));
        ukrNetPages.loginField().sendKeys(login);
        ukrNetPages.passField().sendKeys(pass);
        ukrNetPages.enterToUkrNet().click();
        sleep(1);
    }
}
