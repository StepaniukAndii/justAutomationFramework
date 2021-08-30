package TestVanek.Mychords.Tests;

import ClasesToAllUs.TestInit;
import TestVanek.Mychords.Pages.LogInPage;
import TestVanek.Mychords.Pages.SongPage;
import TestVanek.Mychords.Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestComment extends TestInit {
    StartPage startPage;
    LogInPage logInPage;
    SongPage songPage;

    public void logIn(){
        startPage = new StartPage(driver);
        logInPage = new LogInPage(driver);
        openUrl("https://mychords.net");
        startPage.logInBtn().click();
        logInPage.logInInput().sendKeys("testing@gmail.com");
        logInPage.passInput().sendKeys("testing");
        logInPage.logInBtn().click();
    }
    public int randNum(int a){ return (int) (Math.random()*a); } //I make it for random choice songs
    @Test
    public void testComment(){
        startPage = new StartPage(driver);
        songPage = new SongPage(driver);
        logIn();
        sleep(1);
        startPage.songs().get(randNum(startPage.songs().size())).click();
        songPage.commentTextArea().click();
        songPage.commentTextArea().sendKeys("Im program for testing but i'm think what it's bad");
        songPage.commentBtn().click();
        Assert.assertTrue(songPage.commentMessage().get(0).getText().contains("Im program for testing but i'm think what it's bad"));
    }
}
