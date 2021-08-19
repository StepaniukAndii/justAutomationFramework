package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ParticularTutorPage extends BasePage {
    public ParticularTutorPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> aboutTutorSections() {
        return findElementsByXpath("//li [contains(@class,'FixedHeaderListItem___1vw9p')]");
    }

    public List<WebElement> moreInfo() {
        return findElementsByXpath("//button [@class='Button_button__qXZ5J Button_m__1KH15 Button_fullWidth__3tf7a']");
    }

    public List<WebElement> resumeDetails() {
        return findElementsByXpath("//li [@class='label___2rmOf']");
    }
    public WebElement bookTrialLessonBtn() {
        return findElementByXpath("//button [@data-qa-id='tp-side-panel-book-lesson-btn']");
    }

    public WebElement messageMeBtn() {
        return findElementByXpath("//button [@data-qa-id='tp-side-panel-send-msg']");
    }

    public WebElement saveToMyListBtn() {
        return findElementByXpath("//div[@class='SideItem___1pINi']//button[@data-qa-id='tp-side-panel-fav-btn']");
    }
}
