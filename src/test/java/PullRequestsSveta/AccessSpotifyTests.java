package PullRequestsSveta;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class AccessSpotifyTests extends TestInit {
    @Test
    public void signUpSpotify() {
        SignUpInPage signUpAndInPages = new SignUpInPage(driver);
        openUrl("https://www.spotify.com/us/");
        sleep(1);
        signUpAndInPages.signUp().click();
        signUpAndInPages.writeYourEmail().sendKeys("svetlana.taran@gmail.com");
        signUpAndInPages.writeYourEmailAgain().sendKeys("svetlana.taran@gmail.com");
        signUpAndInPages.writeYourPassword().sendKeys("password123");
        signUpAndInPages.writeYourName().sendKeys("Svetlana");
        signUpAndInPages.monthOfBirth().sendKeys("October");
        signUpAndInPages.dayOfBirth().sendKeys("20");
        signUpAndInPages.yearOfBirth().sendKeys("1998");
        signUpAndInPages.sex().click();
        signUpAndInPages.confirm().click();
        signUpAndInPages.signUpButton().click();
    }
    @Test
    public void signInSpotify(){
        SignUpInPage signUpAndInPages = new SignUpInPage(driver);
        openUrl("https://www.spotify.com/us/");
        sleep(1);
        signUpAndInPages.logIn().click();
        signUpAndInPages.logInUsername().sendKeys("svetlana.taran629@gmail.com");
        signUpAndInPages.logInPassword().sendKeys("fjskjdowfowkfow");
        signUpAndInPages.logInButton().click();
    }
    @Test
    public void signInWithGoogle(){
        SignUpInPage signUpAndInPages = new SignUpInPage(driver);
        driver.manage().window().maximize();
        openUrl("https://www.spotify.com/us/");
        signUpAndInPages.logIn().click();
        sleep(1);
        signUpAndInPages.ligInWithGoogle().click();
        signUpAndInPages.logInWithGoogleEmail().sendKeys("svetlana.taran629@gmail.com");
    }
}
