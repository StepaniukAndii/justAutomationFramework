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
}
