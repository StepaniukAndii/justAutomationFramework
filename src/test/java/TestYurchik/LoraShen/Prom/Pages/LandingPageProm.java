package TestYurchik.LoraShen.Prom.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPageProm extends BasePage {
    public LandingPageProm(WebDriver driver){super(driver);}

    public WebElement regionChooseProm() { return findElementByXpath("//button[contains(@data-qaid,'qa_regions')]");}
    public WebElement searchTownRegionProm() { return findElementByXpath("//input[contains(@data-qaid,'delivery_')]");}
    public List<WebElement> checkRealRegionChange() { return findElementsByXpath("//span[contains(@class, 'Ii')]");}
    public WebElement supportPageProm() { return findElementByXpath("//div[contains(@class, 'kf')]/a[contains(@href, 'help')]");}
    public WebElement specialForYouProm() { return findElementByXpath("//a[contains(@data-qaid, 'special')]");}
    public WebElement vlubleniyePodarkiProm() { return findElementByXpath("//a[contains(@data-qaid, 'android')]");}
    public WebElement iOSbuttonProm() { return findElementByXpath("//a[contains(@data-qaid, 'apple')]");}
    public WebElement huaweiButtonProm() { return findElementByXpath("//a[contains(@data-qaid, 'huawei')]");}
    public WebElement mainSearchInputProm() { return findElementByXpath("//input[contains(@name, 'search')][contains(@class, 'EU')]");}
    public WebElement mainSearchButtonProm() { return findElementByXpath("//button[contains(@type, 'submit')][contains(@class, 'ggtwi')]");}
    public List<WebElement> checkNeocubeCaptionProm() { return findElementsByXpath("//h1[contains(@data-qaid, 'caption')]");}
    public WebElement firstTovarofMultipls() { return findElementByXpath("//input[contains(@data-qaid, 'multi')][contains(@placeholder, 'Nike')]");}
    public WebElement secondTovarofMultipls() { return findElementByXpath("//input[contains(@data-qaid, 'multi')][contains(@placeholder, 'ш')]");}
    public WebElement confirmMultipleProm() { return findElementByXpath("//button[contains(@data-qaid, 'companies')]");}
    public List<WebElement> checkLabelNikeTshirt() { return findElementsByXpath("//div[contains(@data-qaid, 'title')]"); }
    public WebElement checkRULangProm() { return findElementByXpath("//span[contains(@data-qaid, 'ru')]");}
    public List<WebElement> checkActualRuProm() { return findElementsByXpath("//span[contains(@data-qastate, 'active')]");}
    public WebElement checkUALangProm() { return findElementByXpath("//span[contains(@data-qaid, 'ua')]");}
    public List<WebElement> checkActualUAProm() { return findElementsByXpath("//span[contains(@data-qastate, 'active')]");}

}
