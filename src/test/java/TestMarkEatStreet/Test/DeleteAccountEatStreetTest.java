package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DeleteAccountEatStreetTest extends TestInit{

    SignInBodyPage signin;
    Header header;
    DriverPage driverPage;
    MyAccountPage accountPage;

    @Test
    public void deleteAccount(){

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
        sleep(4);
        accountPage.myaccountbtn().click();
        accountPage.deleteaccountbtn().click();
        accountPage.yestodeleteaccbtn().click();
        accountPage.confirmtodeleteaccbtn().click();
        accountPage.textareawhydeleteacc().sendKeys("Prosto tak");
        accountPage.submittodeleteaccbtn().click();
        Boolean wait = new WebDriverWait(driver, 10).
                until(ExpectedConditions.urlToBe("https://qa2.eatstreet.com/"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa2.eatstreet.com/");
    }
}
