package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePasswordEatStreetTest extends TestInit{

    SignInBodyPage signin;
    Header header;
    DriverPage driverPage;
    MyAccountPage accountPage;

    @Test
    public void changepassword(){

        signin = new SignInBodyPage(driver);
        header = new Header(driver);
        driverPage = new DriverPage(driver);
        accountPage = new MyAccountPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        header.signinbtn().click();
        signin.signinbtn().sendKeys("lazarchuk.mark.08@gmail.com");
        signin.passwordinput().sendKeys("TestParol5");
        driverPage.gotitbtn().click();
        signin.signinbutton().click();
        sleep(5);
        accountPage.myaccountbtn().click();
        accountPage.changepasswordbtn().click();
        accountPage.curentpasswordinput().sendKeys("Neponimauchiy3414");
        accountPage.newpasswordinput().sendKeys("TestParol4");
        accountPage.newpasswordinputconfirm().sendKeys("TestParol4");
        accountPage.updatepasswordbtn().click();
        Assert.assertTrue(accountPage.edityourinfobtn().isEnabled());
    }
}
