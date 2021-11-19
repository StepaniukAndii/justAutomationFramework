package TestNikita.GlobusTop;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobusPage extends BasePage {

    public GlobusPage(WebDriver driver) {
        super(driver);
    }
    public WebElement searchField(){
        return findElementByXpath("//input[@name='search']");}
    public WebElement backToHomePageWiaLogo(){
        return findElementByXpath("//div[@class=\"wrapper\"]//*[@class='logo']");}
    public WebElement logoClick(){
        return findElementByXpath("//div[@class=\"wrapper\"]//*[@class='logo']");}
    public WebElement catalogClick(){
        return findElementByXpath("//*[contains(@class,'gt-catalog-btn active')]");}

}

