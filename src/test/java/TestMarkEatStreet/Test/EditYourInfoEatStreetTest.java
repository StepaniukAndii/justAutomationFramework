package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditYourInfoEatStreetTest extends TestInit{

    SignInBodyPage signin;
    Header header;
    DriverPage driverPage;
    MyAccountPage accountPage;

    @Test
    public void editinfo(){

        signin = new SignInBodyPage(driver);
        header = new Header(driver);
        driverPage = new DriverPage(driver);
        accountPage = new MyAccountPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        header.signinbtn().click();
        signin.signupbtn().click();
        signin.signinbtn().sendKeys("lazarchuk.mark.08@gmail.com");
        signin.passwordinput().sendKeys("Neponimauchiy3414");
        signin.passwordinputagain().sendKeys("Neponimauchiy3414");
        driverPage.gotitbtn().click();
        signin.signupbutton().click();
        sleep(3);
        //  WebElement wait = new WebDriverWait(driver, 10).
          //      until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id,'menu')]")));
        accountPage.myaccountbtn().click();
        accountPage.edityourinfobtn().click();
        accountPage.firstnameinfoinput().sendKeys("Mark");
        accountPage.lastnameinfoinput().sendKeys("Lazarchuk");
        accountPage.phonenumberinfoinput().sendKeys("+381111111111");
        accountPage.settingsdroplist().click();
        accountPage.checkboxrestaurantnotes().click();
        accountPage.saveeditinfo().click();
    }
}
