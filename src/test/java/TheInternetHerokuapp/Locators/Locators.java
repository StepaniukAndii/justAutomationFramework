package TheInternetHerokuapp.Locators;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Locators extends BasePage {
    public Locators(WebDriver driver) {
        super (driver);
    }
    public WebElement aBTesting(){return getElement("//a[text()='A/B Testing']");}
    public WebElement abgetText(){return getElement("//div[@class='example']/p");}
    public WebElement addRemoveElements(){return getElement("//a[text()='Add/Remove Elements']");}
    public WebElement addButtonElement(){return getElement("//button[@onclick='addElement()']");}
    public List<WebElement> deleteElemetns(){return getElements ("//div[@id='elements']/button");}
    public WebElement brokenImages(){return getElement("//a[text()='Broken Images']");}
    public List<WebElement> listBrokenImages(){return getElements ("//div[@class='example']/img");}
    public WebElement checkboxes(){return getElement("//a[text()='Checkboxes']");}
    public WebElement checkboxesOne(){return getElement("//input[@type='checkbox'][1]");}
    public WebElement checkboxesTwo(){return getElement("//input[@type='checkbox'][2]");}
    public List<WebElement> checkboxesList(){return getElements ("//input[@type='checkbox']");}
    public WebElement contextMenu(){return getElement("//a[text()='Context Menu']");}
    public WebElement fildClick(){return getElement("//div[@id='hot-spot']");}
    public WebElement dragAndDrop(){return getElement("//a[text()='Drag and Drop']");}
    public WebElement elementA(){return getElement("//div[@id='column-a']");}
    public WebElement elementB(){return getElement("//div[@id='column-b']");}
    public WebElement dropdownList(){return getElement("//a[text()='Dropdown']");}
    public WebElement dropdownListSelect(){return getElement("//select[@id='dropdown']");}
    public WebElement dropdownListOptoinOne(){return getElement("//select[@id='dropdown']/*[text()[contains(.,'Option 1')]]");}
    public WebElement dropdownListOptoinTwo(){return getElement("//select[@id='dropdown']/*[text()[contains(.,'Option 2')]]");}
}


