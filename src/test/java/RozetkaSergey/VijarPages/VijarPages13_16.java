package RozetkaSergey.VijarPages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VijarPages13_16 extends BasePage {

    public VijarPages13_16(WebDriver driver) {
        super(driver);
    }
    public void enterToVijar(String site) {
        driver.get(site);
    }
    public WebElement closeAdverb() {
        return findElementByXpath("//img[@src='/img/close_white-24px.svg']");
    }
    public WebElement goTo3Dtour (){return findElementByXpath("//a[@class='3d-tur 3d-tur-select tour']");}
    public WebElement chooseNovokonstantinovskaja (){return findElementByXpath("//a[@href='/3d-tur-nk/']");}
    public void clickOnNewTitle () {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
    }
    public List<WebElement> clickOnSecondButtonToEnter(){return  findElementsByXpath("//div[@style='height: 80px;" +
            " left: -61px; position: absolute; top: -170px; visibility: inherit; width: 120px; " +
            "pointer-events: auto; transform-origin: 50% 50%;']");}
    public List<WebElement> clickOnThirdButtonToEnter (){return  findElementsByXpath("//div[@style='height: 80px;" +
            " left: -61px; position: absolute; top: -170px; visibility: inherit;" +
            " width: 120px; pointer-events: auto; transform-origin: 50% 50%;']"  );}
    public WebElement clickOnFirstButtonToEnter () {return findElementByXpath(
            "//div[@style='height: 80px; left: -61px; position: absolute;" +
                    " top: -170px; visibility: inherit; width: 120px; pointer-events: auto;" +
                    " transform-origin: 50% 50%;']");}
    public WebElement proezd (){return findElementByXpath("//button[@class='proezd']");}
    public WebElement closeForeverAbverb (){return findElementByXpath("//h4[@data-filial='kyiv']");}
    public List<WebElement> clickOnContact (){return findElementsByXpath("//a[@href='/contacts/']");}
    public WebElement getMail (){return findElementByXpath("//a[@href='mailto:office@viyar.ua']");}
    public WebElement services(){return findElementByXpath("//li[@class='item7']");}
    public WebElement cutButton (){return findElementByXpath("//a[@href='/catalog/porezka/']");}
    public WebElement clickOnDownload () {return findElementByXpath("//a[@class=' priceDownload']");}
    public WebElement xml (){return findElementByXpath("//a[@class='xls']");}
}

