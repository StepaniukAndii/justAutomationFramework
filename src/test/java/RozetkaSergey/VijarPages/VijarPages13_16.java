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
        return getElement("//img[@src='/img/close_white-24px.svg']");
    }
    public WebElement goTo3Dtour (){return getElement("//a[@class='3d-tur 3d-tur-select tour']");}
    public WebElement chooseNovokonstantinovskaja (){return getElement("//a[@href='/3d-tur-nk/']");}
    public void clickOnNewTitle () {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
    }
    public List<WebElement> clickOnSecondButtonToEnter(){return  getElements("//div[@style='height: 80px;" +
            " left: -61px; position: absolute; top: -170px; visibility: inherit; width: 120px; " +
            "pointer-events: auto; transform-origin: 50% 50%;']");}
    public List<WebElement> clickOnThirdButtonToEnter (){return  getElements("//div[@style='height: 80px;" +
            " left: -61px; position: absolute; top: -170px; visibility: inherit;" +
            " width: 120px; pointer-events: auto; transform-origin: 50% 50%;']"  );}
    public WebElement clickOnFirstButtonToEnter () {return getElement(
            "//div[@style='height: 80px; left: -61px; position: absolute;" +
                    " top: -170px; visibility: inherit; width: 120px; pointer-events: auto;" +
                    " transform-origin: 50% 50%;']");}
    public WebElement proezd (){return getElement("//button[@class='proezd']");}
    public WebElement closeForeverAbverb (){return getElement("//h4[@data-filial='kyiv']");}
    public List<WebElement> clickOnContact (){return getElements("//a[@href='/contacts/']");}
    public WebElement getMail (){return getElement("//a[@href='mailto:office@viyar.ua']");}
    public WebElement services(){return getElement("//li[@class='item7']");}
    public WebElement cutButton (){return getElement("//a[@href='/catalog/porezka/']");}
    public WebElement clickOnDownload () {return getElement("//a[@class=' priceDownload']");}
    public WebElement xml (){return getElement("//a[@class='xls']");}

}

