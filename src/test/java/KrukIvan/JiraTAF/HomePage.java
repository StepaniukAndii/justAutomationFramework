package KrukIvan.JiraTAF;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public List<WebElement> addFood(){
        return findElementsByXpath("//div[@class='is-clickable product-container']");
    }

    public HomePage(WebDriver driver){
        super(driver);
    }
    public WebElement clickButtonGotIt() {
       return findElement("//button[@class='btn']");
    }

    public WebElement inputEmail() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement inputPassword() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getSignInBTN() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }
    public WebElement getErrorMSG(){
        return driver.findElement(By.xpath("//span[contains(text(),'is incorrect.')]"));
    }

    public WebElement clickBTNSignInWithFacebook() {
        return driver.findElement(By.xpath("//a[@class='btn btn-facebook btn-facebook__sign-in full-width ng-scope']"));
    }
    public WebElement writeAddress(){
        return driver.findElement(By.xpath("//input[@class='enter-address__input input-default border-none ng-valid ng-valid-required']"));
    }
    public WebElement searchField(){
        return driver.findElement(By.xpath("//input[@id='search-autocomplete']"));
    }
    public WebElement bTNLoadMoreRestaurants(){
        return driver.findElement(By.xpath("//button[@class='btn btn--orange']"));
    }
    public WebElement bTNEnterAddress(){
      return  findElement("//a[@id='enter-address-btn']");
    }
    public WebElement bTNGetFed(){
        return findElement("//a[@id='find-restaurants']");
    }
    public WebElement assertBTNAddress(){
        return findElement("//a[@id='confirm-modal-btn']");
    }
}
