package PullRequestsSveta;

import ClasesToAllUs.TestInit;
import org.testng.annotations.Test;

public class WebPlayerTests extends TestInit{
    @Test
    public void webPlayerCheck(){
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.webPlayerButton().click();
    }
    @Test
    public void searchField(){
        WebPlayerPage webPlayer = new WebPlayerPage(driver);
        openUrl("https://www.spotify.com/us/");
        webPlayer.webPlayerButton().click();
        webPlayer.album();
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
        webPlayer.songVideoClub().click();
    }
}
