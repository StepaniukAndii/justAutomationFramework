package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.kohsuke.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.reporters.jq.BasePanel;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPressFedBtn() {
        return findElement("//a[contains(@id, 'find-restaurants')]");
    }

    public WebElement getH1() {
        return findElementByXpath("//h1");
    }

    public WebElement getClickGoItBtn() {
        return findElement("//button[@class='btn']");
    }

    public WebElement getAddressInput() {
        return findElement("//input[contains(@class,'enter')]");
    }

    public WebElement getFedBtn() {
        return findElement("//a[contains(@class,'btn-action')]");
    }

    public WebElement getSignIn() {
        return findElementByXpath("//a[@id='menu-signin']");
    }

    public List<WebElement> getSearchAttempt() {
        return findElementsByXpath("//div[contains(@class,'modal-footer')]/a");
    }

    public WebElement CheckHomePage() {
        return findElementByXpath("//a[@id='menu-my-account']");
    }

    public WebElement checkWebSite() {
        return findElementByXpath("//img[@class='logo-alternate']");
    }

    public WebElement pressRestBtn() {
        return findElementByXpath("//a[contains(text(),'Wausau')]");
    }

    public WebElement returnToHomePage() {
        return findElementByXpath("//img[@class='logo-alternate']");
    }

    public List<WebElement> getCity() {
        return findElementsByXpath("//li[@class='top-cities__item ng-scope']");
    }

    public WebElement getLiveChat() {
        return findElementByXpath("//div[@class='livechat hidden-tablet']");
    }

    public WebElement checkLiveChat() {
        return findElementByXpath("//span[@class='messageText']");
    }

    public WebElement clickAbouAs() {
        return findElementByXpath("//a[@ui-sref='about-us']");
    }

    public WebElement checkAboutAs() {
        return findElementByXpath("//h1[@class='press__section-title text-center']");
    }

    public WebElement enterTextInTheLiveChat() {
        return findElementByXpath("//textarea[@id='liveAgentChatTextArea']");
    }

    public WebElement clickSendBtn() {
        return findElementByXpath("//button[@title='Send']");
    }

    public WebElement checkAnswerBotLiveChat() {
        return findElementByXpath("//span[contains(text(), 'inquiring about')]");
    }
    public WebElement sendRequestLiveChat(){
        return  findElementByXpath("//div[contains(text(),'order issue')]");
    }
    public WebElement clickEndChatBtn(){
        return findElementByXpath("//button[@title='End Chat']");
    }
    public WebElement checkEndChatBtn(){
        return findElementByXpath("//span[contains(@class,'system')]");
    }

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
        }



        public void checkPopup () {
            if (getSearchAttempt().size() > 0) {
                getSearchAttempt().get(1).click();
            }

            }
        }

