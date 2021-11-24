package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterPage extends BasePage {

    public FooterPage(WebDriver driver){
        super(driver);
    }
    public WebElement openContactUs(){
        return findElementByXpath("//a[@ui-sref='contact']");
    }
    public WebElement checkOpenContactAs(){
        return findElementByXpath("//h1[@class='page-title page-title--dashed']");
    }
    public WebElement clickCareers(){
        return findElementByXpath("//a[@ui-sref='careers']");
    }
    public WebElement inputSerchField(){
        return findElementByXpath("//input[@type='text']");
    }
    public WebElement checkSerchField(){
        return findElementByXpath("//span[contains(text(),'Director')]");
    }
    public List<WebElement> getClickCategories(){
        return findElementsByXpath("//div[@class='checkbox-filters-container filter-control']//label");
    }
    public WebElement getClickDelivery(){
        return findElementByXpath("//span[contains(text(),'Delivery')]");
    }
    public WebElement clickBlog(){
        return findElementByXpath("//a[contains(text(),'Blog')]");
    }
    public List<WebElement> clickMenuPage(){
        return findElementsByXpath("//ul[@id='menu-default-1']//li");
    }

}
