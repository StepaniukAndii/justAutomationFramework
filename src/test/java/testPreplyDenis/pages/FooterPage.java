
package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterPage extends BasePage {
    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> sectionsAndSocials() { //1-5 -- sections, 6-9 -- social media
        return findElementsByXpath("//a [contains(@class,'MenuLink___33Mbc')]");
    }

    public List<WebElement> sections() {
        return findElementsByXpath("//button [contains(@class,'MenuButtonLink___3KSH5')]");
    }

    public WebElement supportEmail() {
        return findElement("//a [contains(@class,'MenuLinkBold___3XtcD')]");
    }

    public List<WebElement> downloadAppOnStores() {
        return findElementsByXpath("//img [@loading='lazy']");
    }

    public List<WebElement> typesOfTutors() {
        return findElementsByXpath("//li [contains(@class,'TagLink___z7IkV')]//a");
    }

    public List<WebElement> terms() {
        return findElementsByXpath("//a [contains(@class,'LinkPolicy___bEm-f')]");
    }
}
package testPreplyDenis.pages;public class FooterPage {
}