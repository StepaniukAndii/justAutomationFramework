package PullRequestsSveta;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPlayerTests extends TestInit {

    @Test
    public void webPlayerCheck() {
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.selectTheHomeButtonOrWebPlayerButton();

        Assert.assertTrue(webPlayer.isDisplayedOpenSpotifyCom());
    }

    @Test
    public void searchField() {
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.selectTheHomeButtonOrWebPlayerButton();
        webPlayer.album().click();

        Assert.assertTrue(webPlayer.isDisplayedHipHopsUkraine());
    }

    @Test
    public void findArtist() {
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.selectTheHomeButtonOrWebPlayerButton();
        webPlayer.searchButton().click();
        webPlayer.searchField().sendKeys("Videoclub");
        webPlayer.artist().click();

        Assert.assertTrue(webPlayer.isDisplayedVideoclub());
    }

    @Test
    public void playTheSong() {
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.selectTheHomeButtonOrWebPlayerButton();
        webPlayer.searchButton().click();
        webPlayer.searchField().sendKeys("Videoclub");
        webPlayer.artist().click();
        webPlayer.songVideoClub().click();

        Assert.assertTrue(webPlayer.isDisplayedVideoclubFirstSong());
    }
}
