package testPreplyDenis.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TutorsPage extends BasePage {
    public TutorsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement readMore() {
        return findElementByXpath("//div [contains(@class,'SubtitleMoreAlignedRight___rQeTJ')]");
    }

    public WebElement languageToLearn() {
        return findElementByXpath("//div [@class='AutocompleteWrap___1bKr1']//input");
    }

    public List<WebElement> selectLanguageToLearn() {
        return findElementsByXpath("//div [contains(@class,'SuggestionItem___3zg9V')]");
    }

    public List<WebElement> particularTutorsFilters() {
        return findElementsByXpath("//div [contains(@class, 'ValueWrapper___2SwOx')]");
    }

    public List<WebElement> tutorCountryCheckboxes() {
        return findElementsByXpath("//label [contains(@class, 'CheckboxLabel-sc-1qurk20-1')]");
    }

    public List<WebElement> chooseTimeForLessons() {
        return findElementsByXpath("//div [contains(@class,'TimeItemBlock___3rIKp')]");
    }

    public List<WebElement> chooseDaysForLessons() {
        return findElementsByXpath("//div [contains(@class, 'DayItem___3Wy11')]");
    }

    public WebElement specialitiesSelect() {
        return findElementByXpath("//div [@data-qa-id='specialties']");
    }

    public List<WebElement> specialitiesCheckboxes() {
        return findElementsByXpath("//span [contains(@class,'CheckboxTitle-sc-1qurk20-3')]");
    }

    public WebElement alsoSpeaksSelect() {
        return findElementByXpath("//div [@data-qa-id='also-speaks-filter']");
    }

    public List<WebElement> alsoSpeaksCheckboxes() {
        return findElementsByXpath("//span [contains(@class, 'CheckboxTitle')]");
    }

    public WebElement nativeSpeakerSelect() {
        return findElementByXpath("//div [@data-qa-id='native-speaker-filter']");
    }

    public WebElement nativeSpeakerOnly() {
        return findElementByXpath("//span [contains(@class, 'CheckboxTitle-sc-1qurk20-3')]");
    }

    public WebElement sortingSelect() {
        return findElementByXpath("//div [@data-qa-id='sort-by-filter']");
    }

    public List<WebElement> sortBy() {
        return findElementsByXpath("//div [contains(@class, 'SortOptionItem___ftvzJ')]");
    }
}
