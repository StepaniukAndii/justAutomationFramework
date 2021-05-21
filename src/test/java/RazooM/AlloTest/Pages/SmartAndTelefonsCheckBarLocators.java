package RazooM.AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SmartAndTelefonsCheckBarLocators extends BasePage {
    public SmartAndTelefonsCheckBarLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement smartAndTell(){
        return findElementByXpath("//li[@data-id='1516']");
    }
    public WebElement vCatalog(){
        return findElementByXpath("//h1[@class='v-catalog__title']");
    }
    public WebElement popular(){
        return findElementByXpath("//div[@class='accordion__header portal-category__title-wrapper']/h2[text()[contains(.,'Найпопулярніше')]]");
    }
    public WebElement catalog(){
        return findElementByXpath("//div[@class='accordion__header portal-category__title-wrapper']/h2[text()[contains(.,'Каталог')]]");
    }
    public WebElement manufacture(){
        return findElementByXpath("//div[@class='accordion__header portal-category__title-wrapper']/h2[text()[contains(.,'Виробники')]]");
    }
    public WebElement  relatedCategories(){
        return findElementByXpath("//div[@class='accordion__header portal-category__title-wrapper']/h2[text()[contains(.,'Суміжні категорії')]]");
    }
    public List<WebElement> listURLPopular(){
        return findElementsByXpath("//a[text()='Смартфони']/parent::li/parent::ul/li/a");
    }
    public List<WebElement> listURLCatalog(){
        return findElementsByXpath("//a[text()='Смартфони і мобільні телефони']/parent::li/parent::ul/li/a");
    }public List<WebElement> listURLManufakture(){
        return findElementsByXpath("//a[text()='Xiaomi']/parent::li/parent::ul/li/a");
    }
    public List<WebElement> listURLRelatedCategories(){
        return findElementsByXpath("//a[text()='Планшети']/parent::li/parent::ul/li/a");
    }
    public WebElement manufaktureButtonAllGoods(){return  findElementByXpath("//a[text()[contains(.,'Всі виробники')]]");
    }
    public WebElement linkPlanshet(){
        return findElementByXpath("//a[text()='Планшети']");
    }
    public WebElement linkSmartClock(){
        return findElementByXpath("//a[text()='Смарт-годинники']");
    }
    public WebElement linkFtnesBraslet(){
        return findElementByXpath("//a[text()='Фітнес-браслети']");
    }
    public WebElement linkFtnesElTrans(){
        return findElementByXpath("//a[text()='Електротранспорт']");
    }
}