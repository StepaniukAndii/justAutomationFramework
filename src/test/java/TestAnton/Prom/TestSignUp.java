package TestAnton.Prom;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class TestSignUp extends TestInit {

    @Test
    public void testSignUp() {
        PromPage homePage = new PromPage(driver);
        driver.get("https://prom.ua/ua/");
        homePage.signUpBtn().click();
        homePage.enterYourNameFirstField().click();
        homePage.enterYourNameFirstField().sendKeys("FirstName LastName");
        homePage.enterEmailFirstField().click();
        homePage.enterEmailFirstField().sendKeys("anton.4uvirov@gmail.com");
        homePage.enterPasswordFirstField().click();
        homePage.enterPasswordFirstField().sendKeys("123456789");
        homePage.clickSubmitFirstBtn().click();
        homePage.deleteProfileBtn().click();
    }
}
