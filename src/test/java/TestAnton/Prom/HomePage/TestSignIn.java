package TestAnton.Prom.HomePage;

import ClasesToAllUs.TestInit;
import TestAnton.Prom.PromPage;
import org.testng.annotations.Test;

public class TestSignIn extends TestInit {

    @Test
    public void testSignIn() {
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.signInBtn().click();
        homePage.signInCustomerBtn().click();
        homePage.signInInputField().click();
        homePage.signInInputField().sendKeys("anton.4uvirov@gmail.com");
        homePage.confirmSignInBtn().click();
        homePage.getSignInEnterPasswordField().click();
        homePage.getSignInEnterPasswordField().sendKeys("123456789");
        homePage.confirmSignInBtn().click();
    }
}
