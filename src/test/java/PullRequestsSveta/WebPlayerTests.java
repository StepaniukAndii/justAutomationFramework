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
}
