package Julia.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
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
    public List<WebElement> getPageNumberList() { return driver.findElements(By.xpath("//ul[@class='pagination__pages']//a")); }
    public List<WebElement> getAllRest() {
        return driver.findElements(By.xpath("//ul[@id='all-rests']/li"));
    }
    public List<WebElement> getSearchAttempt() { return driver.findElements(By.xpath("//a[@id='enter-address-btn']")); }
    public WebElement restName(){
        return  findElement("//h1[contains(@class,'name')]");
    }

    public WebElement clickSignInBtn() { return driver.findElement(By.xpath("//a[@id='menu-signin']")); }
    public WebElement clickSingInWithGoogle() { return  driver.findElement(By.xpath("//div[@id='uniqueid']")); }
    public List<WebElement> selectAccountWithGoogle() { return driver.findElements(By.xpath("//div[@class='WBW9sf']")); }
    public WebElement myAccountText() { return driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")); }
    public WebElement clickSingInWithFacebook() { return driver.findElement(By.xpath("//a[@class='btn btn-facebook btn-facebook__sign-in full-width ng-scope']")); }
    public WebElement enterEmailWithFacebook() { return driver.findElement(By.xpath("//input[@name='email']")); }
    public WebElement enterPassWithFacebook() { return driver.findElement(By.xpath("////input[@id='pass']")); }

    /*public void  checkAndClousePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }*/



    public WebElement selectCityMuncie() { return driver.findElement(By.xpath("//a[contains(text(), 'Muncie, IN').scrollIntoView(false)]")); }
    public WebElement selectCategoryLateNightFood() { return driver.findElement(By.xpath("//li[@class='cuisine-types__item']")); }

    public  WebElement selectRestInCity() { return driver.findElement(By.xpath("//button[@class='cuisine-types__item__button ng-binding']")); }
    public WebElement clickSearchMenu() { return driver.findElement(By.xpath("//input[@placeholder='Search Menu']")); }

    public WebElement checkTextDeluxPizza() { return driver.findElement(By.xpath("//span[contains(text(), 'Deluxe Pizza')]"));   }
}
