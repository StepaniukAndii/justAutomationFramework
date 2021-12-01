package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetToKnowUsPage extends BasePage {
    public GetToKnowUsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement promotional(){
        return findElementByXpath("//h2[contains(text(),'Promotional')]");
    }
    public WebElement UWCU(){
        return findElementByXpath("//h2[contains(text(),'UWCU')]");
    }
    public WebElement doRestaurants(){
        return findElementByXpath("//h2[contains(text(),'Do restaurants')]");
    }
    public WebElement howDoIFind(){
        return findElementByXpath("//h2[contains(text(),'How do I find')]");
    }
    public WebElement doINeed(){
        return findElementByXpath("//h2[contains(text(),'Do I need')]");
    }
    public WebElement doesEatStreet(){
        return findElementByXpath("//h2[contains(text(),'Does EatStreet')]");
    }
    public WebElement isEatStreet(){
        return findElementByXpath("//h2[contains(text(),'Is EatStreet')]");
    }
    public WebElement whatIs(){
        return findElementByXpath("//h2[contains(text(),'What is')]");
    }
    public WebElement howDoITell(){
        return findElementByXpath("//h2[contains(text(),'How do I tell')]");
    }
    public WebElement whatDoesTheGreen(){
        return findElementByXpath("//h2[contains(text(),'What does the green')]");
    }
}
