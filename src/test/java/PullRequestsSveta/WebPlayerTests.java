package PullRequestsSveta;

import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPlayerTests extends TestInit{
    @Test
    public void webPlayerCheck(){
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.webPlayerButton().click();
        Assert.assertTrue(webPlayer.spotifyPlaylists().get(0).isDisplayed());
    }
    @Test
    public void searchField(){
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.webPlayerButton().click();
        webPlayer.albums().get(1).click();
        Assert.assertTrue(webPlayer.albumName().isDisplayed());
    }
    @Test
    public void findArtist(){
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.webPlayerButton().click();
        webPlayer.searchButton().click();
        webPlayer.searchField().click();
        webPlayer.searchField().sendKeys("Videoclub");
        webPlayer.searchField().click();
        webPlayer.artist().click();
        Assert.assertTrue(webPlayer.videoclubName().isDisplayed());
    }
    @Test
    public void playTheSong(){
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.webPlayerButton().click();
        webPlayer.searchButton().click();
        webPlayer.searchField().click();
        webPlayer.searchField().sendKeys("Videoclub");
        webPlayer.searchField().click();
        webPlayer.artist().click();
        webPlayer.playButton().get(1).click();
        Assert.assertTrue(webPlayer.listenForFree().isDisplayed());
    }
}
