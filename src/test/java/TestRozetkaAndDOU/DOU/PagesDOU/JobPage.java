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
        return getElements("//ul[@class='sub']/li");
    }

    public WebElement getSearch() {
        return getElement("//input[@name='search']");
    }

    public List<WebElement> getVacancies() {
        return getElements("//a[@class='vt']");
    }

    public WebElement getRatingFilterTotalScore() {
        return getElement("//a[text()='Общий балл']");
    }

    public WebElement getRatingFilterLoyalty() {
        return getElement("//a[text()='Лояльность']");
    }

    public WebElement getRatingFilterCompensation() {
        return getElement("//a[text()='Компенсация']");
    }

    public WebElement getRatingFilterWorkingConditions() {
        return getElement("//a[text()='Условия труда']");
    }

    public WebElement getRatingFilterCareer() {
        return getElement("//a[text()='Карьера']");
    }

    public WebElement getRatingFilterProject() {
        return getElement("//a[text()='Проект']");
    }

    public List<WebElement> getRatingFilterTotalScoreNumbers() {
        return getElements("//div[@class='score all']");
    }
}