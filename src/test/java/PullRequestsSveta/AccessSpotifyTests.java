package PullRequestsSveta;

import ClasesToAllUs.TestInit;
import io.cucumber.java.bs.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessSpotifyTests extends TestInit {

    @Test
    public void signUpSpotify() {
        SignUpInPage signUpAndInPages = new SignUpInPage(driver);
        openUrl("https://www.spotify.com/us/");
        sleep(1);
        signUpAndInPages.choiceOfSignUpOption();
        signUpAndInPages.writeYourEmail().sendKeys("svetlana.taran@gmail.com");
        signUpAndInPages.writeYourEmailAgain().sendKeys("svetlana.taran@gmail.com");
        signUpAndInPages.writeYourPassword().sendKeys("password123");
        signUpAndInPages.writeYourName().sendKeys("Svetlana");
        signUpAndInPages.monthOfBirthTwo().click();
        signUpAndInPages.dayOfBirth().sendKeys("20");
        signUpAndInPages.yearOfBirth().sendKeys("1998");
        signUpAndInPages.sex().click();
        signUpAndInPages.confirm().click();
        signUpAndInPages.signUpButton().click();

        Assert.assertTrue(signUpAndInPages.checkMessageConfirmYouAreNotARobot());
    }

    @Test
    public void signInSpotify() {
        SignUpInPage signUpAndInPages = new SignUpInPage(driver);
        openUrl("https://www.spotify.com/us/");
        sleep(1);
        signUpAndInPages.choiceOfLogInOption();
        signUpAndInPages.logInUsername().sendKeys("svetlana.taran629@gmail.com");
        signUpAndInPages.logInPassword().sendKeys("fjskjdowfowkfow");
        signUpAndInPages.logInButton().click();

        Assert.assertTrue(signUpAndInPages.checkMessageWrongUsernameOrPassword());
    }

    @Test
    public void signInWithGoogle() {
        SignUpInPage signUpAndInPages = new SignUpInPage(driver);
        openUrl("https://www.spotify.com/us/");
        signUpAndInPages.choiceOfLogInOption();
        signUpAndInPages.ligInWithGoogle().click();
        signUpAndInPages.logInWithGoogleEmail().sendKeys("svetlana.taran629@gmail.com");

        Assert.assertTrue(signUpAndInPages.isDisplayedOpenAccountsGoogleCom());
    }
}
