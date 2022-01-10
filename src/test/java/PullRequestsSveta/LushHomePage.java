package PullRequestsSveta;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LushHomePage extends BasePage {
    public LushHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement searchButton(){
        return (findElementByXpath("//span[@class='search__text']"));}
    public WebElement searchField(){
        return (findElementByXpath("//input[@class='f']"));}

}
