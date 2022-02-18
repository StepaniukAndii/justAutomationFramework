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
}
