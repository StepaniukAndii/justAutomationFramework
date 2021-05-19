package denisFoxtrotTest.mainTest.authTestPageObject;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.mainTest.authTestPageObject.PageObject.LoginPage;
import org.testng.annotations.Test;

public class FLogFPass extends TestInit {

    @Test
    public void fLogFPass () {
        LoginPage loginPage = new LoginPage(driver);
        openUrl("https://www.saucedemo.com/");
        loginPage.getUserNameField().sendKeys("standard_use");
        loginPage.getPasswordField().sendKeys("password");
        loginPage.getLogin().click();
        sleep(2);
    }


}
