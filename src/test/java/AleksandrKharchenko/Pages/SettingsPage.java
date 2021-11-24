package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage {
    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEditingLink() {
        return findElementByXpath("//div[@id='ooui-php-469']/span");
    }

    public WebElement getFirstCheckboxInEditing() {
        return findElementByXpath("//span[@id='mw-input-wpeditsectiononrightclick']");
    }

    public WebElement getSaveBtn() {
        return findElementByXpath("//span[contains(text(),'Сохранить')]");
    }

    public WebElement getGreySaveBtn() {
        return findElementByXpath("//span[@id='prefcontrol']");
    }
}
