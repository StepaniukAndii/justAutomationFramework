package TheInternetHerokuapp.Locators;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Locators extends BasePage {
    public Locators(WebDriver driver) {
        super (driver);
    }
    public WebElement aBTesting(){return getElement ("//a[text()='A/B Testing']");}
    public WebElement abgetText(){return getElement ("//div[@class='example']/p");}
    public WebElement addRemoveElements(){return getElement ("//a[text()='Add/Remove Elements']");}
    public WebElement addButtonElement(){return getElement ("//button[@onclick='addElement()']");}
    public List<WebElement> deleteElemetns(){return getElements ("//div[@id='elements']/button");}
    public WebElement brokenImages(){return getElement ("//a[text()='Broken Images']");}
    public List<WebElement> listBrokenImages(){return getElements ("//div[@class='example']/img");}
    public WebElement checkboxes(){return getElement ("//a[text()='Checkboxes']");}
    public WebElement checkboxesOne(){return getElement ("//input[@type='checkbox'][1]");}
    public WebElement checkboxesTwo(){return getElement ("//input[@type='checkbox'][2]");}
    public List<WebElement> checkboxesList(){return getElements ("//input[@type='checkbox']");}
    public WebElement contextMenu(){return getElement ("//a[text()='Context Menu']");}
    public WebElement fildClick(){return getElement ("//div[@id='hot-spot']");}
    public WebElement dragAndDrop(){return getElement ("//a[text()='Drag and Drop']");}
    public WebElement elementA(){return getElement ("//div[@id='column-a']");}
    public WebElement elementB(){return getElement ("//div[@id='column-b']");}
    public WebElement dropdownList(){return getElement ("//a[text()='Dropdown']");}
    public WebElement dropdownListSelect(){return getElement ("//select[@id='dropdown']");}
    public WebElement dropdownListOptoinOne(){return getElement ("//select[@id='dropdown']/*[text()[contains(.,'Option 1')]]");}
    public WebElement dropdownListOptoinTwo(){return getElement ("//select[@id='dropdown']/*[text()[contains(.,'Option 2')]]");}
    public WebElement dynamicContent(){return getElement ("//a[text()='Dynamic Content']");}
    public WebElement dynamicContentClickLink(){return getElement ("//a[text()='click here']");}
    public WebElement dynamicContentGetText(){return getElement ("//div[@id='content']/div[@class='row'][3]");}
    public WebElement dynamicControls(){return getElement ("//a[text()='Dynamic Controls']");}
    public WebElement dynamicControlsInput(){return findElement ("//form[@id='input-example']/input");}
    public WebElement dynamicControlsButton(){return getElement ("//form[@id='input-example']/button");}
    public WebElement dynamicLoading(){return getElement ("//a[text()='Dynamic Loading']");}
    public WebElement exampleOne (){return getElement ("//a[text()='Example 1: Element on page that is hidden']");}
    public WebElement exampleTwo(){return getElement ("//a[text()='Example 2: Element rendered after the fact']");}
    public WebElement exampleButton(){return getElement ("//div[@id='start']/button");}
    public WebElement exampleResultat(){return findElement ("//div[@id='finish']/h4");}
}