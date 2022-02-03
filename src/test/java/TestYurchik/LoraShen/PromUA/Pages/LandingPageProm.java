package TestYurchik.LoraShen.PromUA.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPageProm extends BasePage {
    public LandingPageProm(WebDriver driver){super(driver);}

    public WebElement languageChooseProm() { return findElementByXpath("//button[contains(@data-qaid, 'regions')]"); }
    public WebElement chooseInputPoleProm() { return findElementByXpath("//input[contains(@data-qaid, 'delivery_s')]"); }
    public List<WebElement> checkifKyivProm() { return findElementsByXpath("//span[contains(@class, 'F5Vvy')]"); }
}
