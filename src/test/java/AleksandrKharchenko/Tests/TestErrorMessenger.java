package AleksandrKharchenko.Tests;
import AleksandrKharchenko.Pages.SignInPage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestErrorMessenger extends TestInit {

    @Test
    public void testCheckErrorNotificationOnSignInPage() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.navigateSignIn();
        signInPage.getEmailField().sendKeys("dhsehaehaegareg");
        signInPage.getPasswordField().sendKeys("dhsehaehaegareg");
        signInPage.closeModal();
        signInPage.getSignInBtn().click();
        sleep(2);
        Assert.assertTrue(signInPage.getErrorMSG().isDisplayed());
    }
}
