package TestAsosByLynn;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogInExistingUser extends TestInit {
    @Test
    public void LogInExistingUser() {
        AsosPages homePage = new AsosPages(driver);
        driver.get("https://www.asos.com/");
        homePage.regIcon().click();
        homePage.logInOrJoin().get(0).click();
        homePage.emailInPutLogInForm().sendKeys("cfwork.lina@gmail.com");
        homePage.passwordInPut().sendKeys("password_anna_98");
        homePage.signInBtn().click();
        Assert.assertFalse(driver.findElements(By.xpath("//div[@class='error-block']")).size()!=0);
        homePage.regIcon().click();
        Assert.assertTrue(homePage.logInGreeting().getText().contains("Hi"));
    }
}
