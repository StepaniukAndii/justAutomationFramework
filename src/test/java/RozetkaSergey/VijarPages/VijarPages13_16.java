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
    public List<WebElement> clickOnSecondButtonToEnter(){return  getElements("clickOnFirstButtonToEnter");}



    public WebElement clickOnFirstButtonToEnter () {return getElement(
            "//div[@style='height: 80px; left: -61px; position: absolute;" +
                    " top: -170px; visibility: inherit; width: 120px; pointer-events: auto;" +
                    " transform-origin: 50% 50%;']");}







}

