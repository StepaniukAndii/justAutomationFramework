package TestAnton.Prom;

import ClasesToAllUs.TestInit;
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
        homePage.signInEnterPasswordField().click();
        homePage.signInEnterPasswordField().sendKeys("123456789");
        homePage.confirmSignInBtn().click();
    }
}
