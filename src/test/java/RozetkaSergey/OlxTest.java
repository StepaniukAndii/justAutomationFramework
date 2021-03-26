package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import javax.lang.model.element.Element;

public class OlxTest extends TestInit {

    @Test
    public void justTest() {
        entryGoogle();
        googleSearchField().sendKeys("OLX");
        enter();
        sleep(1);
        goToOlx().click();
        sleep(1);
        olxSearchField().sendKeys("Квартира");
        enter();
        sleep(1);
        chooseWithImage().click();
        chooseRubric().click();
        moveMouseToElement(driver.findElement(By.xpath("//a[@id='a-category-1' and @data-name='Недвижимость']")));
        sleep(1);
        moveMouseToElement(driver.findElement(By.xpath("//a[@id='a-category-1' and @data-name='Всё в рубрике Недвижимость']")));
        sleep(1);
        enter();
        sleep(5);
    }

    public void moveMouseToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public WebElement chooseRubric() {
        return getElement("//a[@class='block select category-icon  rel nowrap tdnone overh']");
    }

    public WebElement chooseWithImage() {
        return getElement("//label[@for='photo-only'] [1]");
    }

    public WebElement olxSearchField() {
        return getElement("//input[@id='headerSearch']");
    }

    public WebElement goToOlx() {
        return getElement("//span[text()='Сервис объявлений OLX: сайт объявлений в Украине ...']");    }

    public void entryGoogle() {
        driver.get("https://google.com");
    }

    public WebElement googleSearchField() {
        return driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}