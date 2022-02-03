package TestMarkEatStreet.Test;

import ClasesToAllUs.TestInit;
import TestMarkEatStreet.Page.Body;
import TestMarkEatStreet.Page.DriverPage;
import TestMarkEatStreet.Page.Header;
import TestMarkEatStreet.Page.SignInBodyPage;
import org.testng.annotations.Test;

public class SignInTestMark extends TestInit{

    SignInBodyPage signin;
    Header header;
    DriverPage driverPage;

    @Test
    public void signinTest(){
        signin = new SignInBodyPage(driver);
        header = new Header(driver);
        driverPage = new DriverPage(driver);

        openUrl("https://qa2.eatstreet.com/");
        header.signinbtn().click();
        signin.signinbtn().sendKeys("lazarchuk.mark.08@gmail.com");
        signin.passwordinput().sendKeys("Neponimauchiy3414");
        driverPage.gotitbtn().click();
        signin.signinbutton().click();
    }
}
