package AlloTest.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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


}
