package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import TestMarkEatStreet.Page.SignInBodyPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPasswordInccorectTest extends TestInit{
    SignInBodyPage signin;
    Header header;
    DriverPage driverPage;
    @Test
    public void signupinncorect(){
        signin = new SignInBodyPage(driver);
        header = new Header(driver);
        driverPage = new DriverPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        header.signinbtn().click();
        signin.signupbtn().click();
        signin.signinbtn().sendKeys("lazarchuk.mark.08@gmail.com");
        signin.passwordinput().sendKeys("TestParol5");
        signin.passwordinputagain().sendKeys("NeTestParol9");
        driverPage.gotitbtn().click();
        signin.signupbutton().click();
        sleep(2);
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@id,'valida')]")).isDisplayed());
    }
}
