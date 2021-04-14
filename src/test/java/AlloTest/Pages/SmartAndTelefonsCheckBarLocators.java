package AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SmartAndTelefonsCheckBarLocators extends BasePage {
    public SmartAndTelefonsCheckBarLocators(WebDriver driver) {
        super (driver);
    }
    public WebElement smartAndTell(){
        return getElement ("//li[@data-id='1516']");
    }
    public WebElement vCatalog(){
        return getElement ("//h1[@class='v-catalog__title']");
    }
    public WebElement popular(){
        return getElement ("//div[@class='accordion__header portal-category__title-wrapper']/h2[text()[contains(.,'Найпопулярніше')]]");
    }
    public WebElement catalog(){
        return getElement ("//div[@class='accordion__header portal-category__title-wrapper']/h2[text()[contains(.,'Каталог')]]");
    }
    public WebElement manufacture(){
        return getElement ("//div[@class='accordion__header portal-category__title-wrapper']/h2[text()[contains(.,'Виробники')]]");
    }
    public WebElement  relatedCategories(){
        return getElement ("//div[@class='accordion__header portal-category__title-wrapper']/h2[text()[contains(.,'Суміжні категорії')]]");
    }
    public List<WebElement> listURLPopular(){
        return getElements ("//a[text()='Смартфони']/parent::li/parent::ul/li");
    }
    public List<WebElement> listURLCatalog(){
        return getElements ("//a[text()='Смартфони і мобільні телефони']/parent::li/parent::ul/li");
    }public List<WebElement> listURLManufakture(){
        return getElements ("//a[text()='Xiaomi']/parent::li/parent::ul/li");
    }
    public List<WebElement> listURLRelatedCategories(){
        return getElements ("//a[text()='Планшети']/parent::li/parent::ul/li");
    }
    public WebElement manufaktureButtonAllGoods(){return  getElement ("//a[text()[contains(.,'Всі виробники')]]");
    }
}