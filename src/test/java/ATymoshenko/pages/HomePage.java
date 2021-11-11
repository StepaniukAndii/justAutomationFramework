package ATymoshenko.pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public WebElement addSignInBtnOnHeader() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchAttempt() {
        return driver.findElements(By.xpath("//button[@class='btn']"));
    }
    public WebElement getGoItBtn() {
        return driver.findElement(By.xpath("//button[contains(text(),'Got it')]"));
    }

    public void checkAndClosePopUpWindows() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }

    public WebElement enterYourAddressField(){
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public void closeModalIfExist() {
        if (driver.findElements(By.xpath("//a[@id='enter-address-btn']")).size() > 0) {
            driver.findElements(By.xpath("//a[@id='enter-address-btn']")).get(0).click();
        }
    }

    public WebElement getGetFedBtn() {
        return driver.findElement(By.xpath("//a[contains(text(),'Get Fed')]"));
    }

    public WebElement addSignUpLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
    }

    public WebElement addEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement addPasswordField() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement addPasswordAgainField() {
        return driver.findElement(By.xpath("//input[@id='passwordAgain']"));
    }

    public WebElement addSignUpBtn() {
        return driver.findElement(By.xpath("//button[@id='signup']"));
    }

    public WebElement myAccountIcon() {
        return driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
    }

    public WebElement addSignUpBtnOnPopUpWindow() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }
}