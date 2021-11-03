package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private void novigateEatStreet() {
        driver.get("https://eatstreet.com/");
    }

    public WebElement getAdressInput() {
        return driver.findElement(By.xpath("//input[@ng-model='searchParam']"));
    }

    public WebElement getGoItBtn(){
        return driver.findElement(By.xpath("//button[@class='btn']"));
    }

    public WebElement getFedBtn() {
        return driver.findElement((By.xpath("//a[@id='find-restaurants']")));
    }

    public List<WebElement> getPageNumberList() {
        return driver.findElements(By.xpath("//ul[@class='pagination__pages']//a"));
    }
    public List<WebElement> getAllRest() {
        return driver.findElements(By.xpath("//ul[@id='all-rests']/li"));
    }

    //закриває спливаюче вікно, якщо воно є
    public List<WebElement> getSearchAttempt() {

        return driver.findElements(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement restName(){
        return  findElement("//h1[contains(@class,'name')]");
    }
}
