package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MasterWikiPage extends BasePage {
    public MasterWikiPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getStartWizardBtn() {
        return findElementByXpath("//span[contains(@class,'mw-ui-primary')]");
    }

    public WebElement getAboutMyselfBtn() {
        return findElementByXpath("//span[contains(text(),'Я пишу о себе')]");
    }

    public WebElement getSoItGoesMSG() {
        return findElementByXpath("//p[contains(text(),'бесполезным трудом.')]");
    }
}