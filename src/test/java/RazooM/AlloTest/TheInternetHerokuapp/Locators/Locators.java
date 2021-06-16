package RazooM.AlloTest.TheInternetHerokuapp.Locators;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Locators extends BasePage {
    public Locators(WebDriver driver) {
        super (driver);
    }
    public WebElement aBTesting() {
        return findElementByXpath("//a[text()='A/B Testing']");
    }
    public WebElement abgetText() {
        return findElementByXpath("//div[@class='example']/p");
    }
    public WebElement addRemoveElements() {
        return findElementByXpath("//a[text()='Add/Remove Elements']");
    }
    public WebElement addButtonElement() {
        return findElementByXpath("//button[@onclick='addElement()']");
    }
    public List<WebElement> deleteElemetns() {
        return findElementsByXpath("//div[@id='elements']/button");
    }
    public WebElement brokenImages() {
        return findElementByXpath("//a[text()='Broken Images']");
    }
    public List<WebElement> listBrokenImages() {
        return findElementsByXpath("//div[@class='example']/img");
    }
    public WebElement checkboxes() {
        return findElementByXpath("//a[text()='Checkboxes']");
    }
    public WebElement checkboxesOne() {
        return findElementByXpath("//input[@type='checkbox'][1]");
    }
    public WebElement checkboxesTwo() {
        return findElementByXpath("//input[@type='checkbox'][2]");
    }
    public List<WebElement> checkboxesList() {
        return findElementsByXpath("//input[@type='checkbox']");
    }
    public WebElement contextMenu() {
        return findElementByXpath("//a[text()='Context Menu']");
    }
    public WebElement fildClick() {
        return findElementByXpath("//div[@id='hot-spot']");
    }
    public WebElement dragAndDrop() {
        return findElementByXpath("//a[text()='Drag and Drop']");
    }
    public WebElement elementA() {
        return findElementByXpath("//div[@id='column-a']");
    }
    public WebElement elementB() {
        return findElementByXpath("//div[@id='column-b']");
    }
    public WebElement dropdownList() {
        return findElementByXpath("//a[text()='Dropdown']");
    }
    public WebElement dropdownListSelect() {
        return findElementByXpath("//select[@id='dropdown']");
    }
    public WebElement dropdownListOptoinOne() {return findElementByXpath("//select[@id='dropdown']/*[text()[contains(.,'Option 1')]]");}
    public WebElement dropdownListOptoinTwo() {return findElementByXpath("//select[@id='dropdown']/*[text()[contains(.,'Option 2')]]");}
    public WebElement dynamicContent() {
        return findElementByXpath("//a[text()='Dynamic Content']");
    }
    public WebElement dynamicContentClickLink() {
        return findElementByXpath("//a[text()='click here']");
    }
    public WebElement dynamicContentGetText() {
        return findElementByXpath("//div[@id='content']/div[@class='row'][3]");
    }
    public WebElement dynamicControls() {
        return findElementByXpath("//a[text()='Dynamic Controls']");
    }
    public WebElement dynamicControlsButton() {
        return findElementByXpath("//form[@id='input-example']/button");
    }
    public WebElement dynamicLoading() {
        return findElementByXpath("//a[text()='Dynamic Loading']");
    }
    public WebElement exampleOne() {return findElementByXpath("//a[text()='Example 1: Element on page that is hidden']");}
    public WebElement exampleButton() {
        return findElementByXpath("//div[@id='start']/button");
    }
    public WebElement exampleResultat() {
        return findElement ("//div[@id='finish']/h4");
    }
    public WebElement entryAd() {
        return findElementByXpath("//a[text()='Entry Ad']");
    }
    public WebElement modalWindow() {
        return findElementByXpath("//div[@id='modal']");
    }
    public WebElement modalCloseWindow() {
        return findElementByXpath("//div[@class='modal-footer']/p");
    }
    public WebElement modalClickHere() {
        return findElementByXpath("//a[@id='restart-ad']");
    }
    public WebElement basicAuth() {
        return findElementByXpath("//a[text()='Basic Auth']");
    }
    public WebElement exitIntent() {
        return findElementByXpath("//a[text()='Exit Intent']");
    }
    public WebElement exitModaTitle() {
        return findElementByXpath("//div[@class='modal-title']/h3");
    }
    public WebElement fileUpload() {
        return findElementByXpath("//a[text()='File Upload']");
    }
    public WebElement fileDownloadFild() {
        return findElement ("//div[@id='drag-drop-upload']");
    }
    public WebElement fileDownloadInput() {
        return findElementByXpath("//input[@id='file-upload']");
    }
    public WebElement fileDownloadSubmit() {
        return findElementByXpath("//input[@id='file-submit']");
    }
    public WebElement formAuthentication() {
        return findElementByXpath("//a[text()='Form Authentication']");
    }
    public WebElement formAuthenticationUseName() {
        return findElementByXpath("//input[@id='username']");
    }
    public WebElement formAuthenticationUsePassword() {
        return findElementByXpath("//input[@id='password']");
    }
    public WebElement formAuthenticationButton() {
        return findElementByXpath("//button[@class='radius']");
    }
    public WebElement formAuthenticationCheck() {
        return findElementByXpath("//div[@id='flash']");
    }
    public WebElement formAuthenticationLogout() {
        return findElementByXpath("//a[@class='button secondary radius']");
    }
    public WebElement horizontalSlider() {
        return findElementByXpath("//a[text()='Horizontal Slider']");
    }
    public WebElement horizontalLain() {
        return findElementByXpath("//input[@type='range']");
    }
    public WebElement hoversTest() {
        return findElementByXpath("//a[text()='Hovers']");
    }
    public List<WebElement> hoversList() {
        return findElementsByXpath("//div[@class='figure']");
    }
    public WebElement multipleWindows () {
        return findElementByXpath("//a[text()='Multiple Windows']");
    }
    public WebElement multipleWindowsButton () {
        return findElementByXpath("//a[text()='Click Here']");
    }
    public WebElement wYSIWYGEditor () {
        return findElementByXpath("//a[text()='WYSIWYG Editor']");
    }
    public WebElement wYSIWYGEditorIframe () {
        return findElementByXpath("//iframe[@id='mce_0_ifr']");
    }
    public WebElement wYSIWYGEditorFildText () {
        return findElementByXpath("//body[@id='tinymce']/p");
    }
    public WebElement wYSIWYGEditorNewFile () {
        return findElementByXpath("//span[text()='File']");
    }
    public WebElement wYSIWYGEditorNewDocument () {
        return findElementByXpath("//div[@class='tox-collection__item-label']");
    }

}