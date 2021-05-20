package TestRozetkaAndDOU.DOU.PagesDOU;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JobPage extends BasePage {
    public JobPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getButtonsSubhead() {
        // 0 - вакансии 1 - первая работа 2 - тренды 3 - рейтинг 4 - топ50 5 - отзывы 6 - добавить компанию
        return findElementsByXpath("//ul[@class='sub']/li");
    }

    public WebElement getSearch() {
        return findElementByXpath("//input[@name='search']");
    }

    public List<WebElement> getVacancies() {
        return findElementsByXpath("//a[@class='vt']");
    }

    public WebElement getRatingFilterTotalScore() {
        return findElementByXpath("//a[text()='Общий балл']");
    }

    public WebElement getRatingFilterLoyalty() {
        return findElementByXpath("//a[text()='Лояльность']");
    }

    public WebElement getRatingFilterCompensation() {
        return findElementByXpath("//a[text()='Компенсация']");
    }

    public WebElement getRatingFilterWorkingConditions() {
        return findElementByXpath("//a[text()='Условия труда']");
    }

    public WebElement getRatingFilterCareer() {
        return findElementByXpath("//a[text()='Карьера']");
    }

    public WebElement getRatingFilterProject() {
        return findElementByXpath("//a[text()='Проект']");
    }

    public List<WebElement> getRatingFilterTotalScoreNumbers() {
        return findElementsByXpath("//div[@class='score all']");
    }
}