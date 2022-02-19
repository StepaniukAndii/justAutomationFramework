package TestDenchikEnglishPrime.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageEnglishPrime extends BasePage {


    public LandingPageEnglishPrime(WebDriver driver) {
        super(driver);
    }
    public WebElement navMenuAboutSchoolButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/o-shkole/')]");
    }
    public WebElement navMenuCoursesButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/kursi/')]");
    }
    public WebElement navMenuGuaranteesButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/garantii/')]");
    }
    public WebElement navMenuScheduleButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/raspisanie/')]");
    }
    public WebElement navMenuFreeLessonButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/vvodniy-urok-free/')]");
    }
    public WebElement navMenuSpeakingClubButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'english-speaking-club-kiev/')]");
    }
    public WebElement navMenuContactsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'contact/')]");
    }
    public WebElement aboutSchoolDropDownListMethodButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/metodika/')]");
    }
    public WebElement aboutSchoolDropDownListStudyProgramButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/main-program/')]");
    }
}
