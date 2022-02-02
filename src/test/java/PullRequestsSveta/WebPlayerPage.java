package PullRequestsSveta;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPlayerPage extends BasePage {

    public WebPlayerPage(WebDriver driver) {
        super(driver);
    }

    public WebElement webPlayerButton() {
        return findElementByXpath("//a[contains(@data-ga-action, 'play')]");
    }

    public WebElement searchField() {
        return findElementByXpath("//input[@class='QO9loc33XC50mMRUCIvf Hi9FqPX1LNRRPf31tfA8']");
    }

    public WebElement artist() {
        return findElementByXpath("//div[@class='_gB1lxCfXeR8_Wze5Cx9']");
    }

    public WebElement songVideoClub() {
        return findElementByXpath("//div[@class='h4HgbO_Uu1JYg5UGANeQ wTUruPetkKdWAR1dd6w4']");
    }

    public WebElement album() {
        return findElementByXpath("//div[@class='tsv7E_RBBw6v0XTQlcRo']");
    }

    public WebElement searchButton() {
        return (findElementByXpath("//a[contains(@href, '/search')]"));
    }


    public void selectTheHomeButtonOrWebPlayerButton() {
        if (driver.findElements(By.xpath("//a[contains(@data-ga-action, 'play')]")).size() > 0) {
            webPlayerButton().click();
        } else {
            driver.findElement(By.xpath("//a[@class='link-subtle ATUzFKub89lzvkmvhpyE moDRd9td0KtitPDzR7OJ']")).click();
        }
    }

    public boolean isDisplayedOpenSpotifyCom() {
        return driver.getCurrentUrl().contains("open.spotify.com");
    }

    public boolean isDisplayedHipHopsUkraine() {
        return findElementByXpath("//h1[@dir='auto']").isDisplayed();
    }

    public boolean isDisplayedVideoclub() {
        return findElementByXpath("//h1[text()='Videoclub']").isDisplayed();
    }

    public boolean isDisplayedVideoclubFirstSong() {
        return findElementByXpath("//div[@class='h4HgbO_Uu1JYg5UGANeQ wTUruPetkKdWAR1dd6w4 eRuZMo_HNLjb1IalIeRb']").isDisplayed();
    }
}
