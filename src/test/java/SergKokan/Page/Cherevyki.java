package SergKokan.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cherevyki extends BasePage {
    public Cherevyki(WebDriver driver) {
        super(driver);
    }

    public WebElement btnCherevyki() {
        return findElementByXpath("//span[contains(text(), 'ЧОЛОВІЧІ ЧЕРЕВИКИ')]");
    }
    }