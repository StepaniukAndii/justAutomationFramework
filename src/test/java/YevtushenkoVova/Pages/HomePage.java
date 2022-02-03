package YevtushenkoVova.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement buttonGotIt() {
        return findElement("//button[@class='btn']");
    }

    public WebElement openPageSingIn() {
        return findElement("//a[@id='menu-signin']");
    }

    public WebElement getMyAccound() {
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));
    }

    public void openQa2HomePage() {
        driver.get("https://qa2.eatstreet.com");
    }

    public WebElement aboutUs() {
        return driver.findElement(By.xpath("//a[@ui-sref='about-us']"));
    }

    public WebElement contactUs() {
        return driver.findElement(By.xpath("//a[@ui-sref='contact']"));
    }

    public WebElement careers() {
        return driver.findElement(By.xpath("//a[@ui-sref='careers']"));
    }

    public WebElement blog() {
        return driver.findElement(By.xpath("//a[@href='http://blog.eatstreet.com/']"));
    }

    public WebElement linkPrivacyPolicy() {
        return driver.findElement(By.xpath("//a[@ui-sref='privacy']"));
    }
    public WebElement privacyText(){
        return driver.findElement(By.xpath("//h2[contains(text(),'Privacy Policy')]"));
    }
    public WebElement linkTermsofUse(){
        return driver.findElement(By.xpath("//a[@href='/terms']"));
    }
    public WebElement termsText(){
        return driver.findElement(By.xpath("//h2[contains(text(),'Terms of Use')]"));
    }
    public WebElement linkRestaurantTerms(){
        return driver.findElement(By.xpath("//a[@ui-sref='restaurant-terms-of-service']"));
    }
    public WebElement merchantTerms(){
        return driver.findElement(By.xpath("//h2[contains(text(),'Merchant Terms')]"));
    }
}

