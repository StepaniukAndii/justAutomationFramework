package denisFoxtrotTest.mainTest.authTestPageObject;

import ClasesToAllUs.TestInit;
import denisFoxtrotTest.mainTest.authTestPageObject.PageObject.LoginPage;
import org.testng.annotations.Test;

public class TLogFPass extends TestInit {

    @Test
    public void fLogFPass () {
        openUrl("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserNameField().sendKeys("standard_user");
        loginPage.getPasswordField().sendKeys("password");
        loginPage.getLogin().click();
    }
}