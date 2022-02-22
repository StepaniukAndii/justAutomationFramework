package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import TestMarkEatStreet.Page.SignInBodyPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInInccorectTest extends TestInit{
    SignInBodyPage signin;
    Header header;
    DriverPage driverPage;
    @Test
    public void signininccorect(){
        signin = new SignInBodyPage(driver);
        header = new Header(driver);
        driverPage = new DriverPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        header.signinbtn().click();
        signin.signinbtn().sendKeys("lazarchuk.mark.08@gmail");
        signin.passwordinput().sendKeys("TestParol5");
        driverPage.gotitbtn().click();
        signin.signinbutton().click();
        sleep(4);
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@class,'alert')]")).isEnabled());
    }
}
