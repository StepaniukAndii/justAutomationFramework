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
        return findElementByXpath("//input[@class='text-filter ng-pristine ng-valid ng-touched']");
    }

}
